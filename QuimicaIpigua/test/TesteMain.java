
import Beans.Email;
import Beans.Pessoa;
import Beans.Status;
import Beans.Usuario;
import Fabricas.FabricaBeans;

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
    
    public void addPessoa(){
        Usuario p1 = cria.criaUsuario();
                
        p1.setNomerazãosocial("jose Carlos");
        p1.setApelidofantasia("juninho");
        p1.setCodigo("123");
        p1.setCpfcnpj("38351913812");
        p1.getEmailPrincipal().setEmail("teste@teste");
        p1.setStatus(Status.ATIVO);
        
        System.out.println(p1);
        System.out.println(p1.getEmailPrincipal().getPessoa());
        
        Usuario p2 = cria.criaUsuario();
        p2.setNomerazãosocial("tetset");
        p2.getEmailPrincipal().setEmail("jcsj2010@gmail.com");
        System.out.println(p2.getEmailPrincipal().getEmail());
    }
    
    public static void main(String[] args){        
        new TesteMain().addPessoa();
    }
}
