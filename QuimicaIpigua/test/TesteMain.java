
import Beans.Email;
import Beans.Pessoa;
import Beans.Status;
import Beans.Usuario;
import Fabricas.FabricaBeans;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simone
 */
public class TesteMain {
    FabricaBeans cria = new FabricaBeans();
    Usuario p1 = cria.criaUsuario();
    public void addPessoa(){
        
                
        p1.setNomerazãosocial("jose Carlos");
        p1.setApelidofantasia("juninho");
        p1.setCodigo("123");
        p1.setCpfcnpj("38351913812");
        //p1.getEmailPrincipal().setEmail("teste@teste");
        p1.setStatus(Status.ATIVO);
        
        System.out.println(p1);
        //System.out.println(p1.getEmailPrincipal().getPessoa());
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        //ss.save(p1.getEmailPrincipal());
        ss.save(p1);
        ss.close();
        System.out.println("ok");
    }
    
    public static void main(String[] args){        
        new TesteMain().addPessoa();
    }
}
