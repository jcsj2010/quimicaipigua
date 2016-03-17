
import Beans.Cliente;
import Beans.Email;
import Beans.Endereco;
import Beans.MateriaPrima;
import Beans.Produto;

import Beans.Status;
import Beans.Usuario;
import Fabricas.FabricaBeans;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
    Cliente cli = new Cliente(p1);
    
    public void addPessoa(){
        
                
        p1.setNomerazãosocial("jose Carlos");
        p1.setApelidofantasia("juninho");
        p1.setCodigo("123");
        p1.setCpfcnpj("38351913812");
        
        Email e= new Email();
        e.setEmail("jcsj2010@gmail.com");
        p1.getEmails().add(e );
        
        Endereco end = new Endereco();
        end.setBairro("oliveira");
        end.setCidade("ipigua");
        p1.getEnderecos().add(end);
        p1.setStatus(Status.ATIVO);
        
        System.out.println(p1);
        //System.out.println(p1.getEmailPrincipal().getPessoa());
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        //ss.save(p1.getEmailPrincipal());
        //ss.saveOrUpdate(e);
        ss.save(p1);
        tx.commit();
        ss.close();
        
        System.out.println("ok");
    }
    public void addCliente(){
        cli.setApelidofantasia("Junior");
        cli.setCodigo("123");
        cli.getAtendente().setApelidofantasia("santana");
        Email mail=new Email();
        mail.setEmail("santana@terra");
        cli.getEmails().add(mail);
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        ss.save(p1);
        ss.save(cli);
        tx.commit();
        ss.close();
        
        System.out.println("ok");
    }
    
    public void addProduto(){
        Produto p = new Produto();
        MateriaPrima mp = new MateriaPrima();
        
        p.setDescricao("ativado ls");
        mp.setDescricao("acido sulfonico");
        
        p.getMateriaprimas().add(mp);
        mp.getProduto().add(p);
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        ss.save(mp);
        ss.save(p);
        tx.commit();
        ss.close();
        
        System.out.println("ok");
    }
    
    public static void main(String[] args){        
        new TesteMain().addProduto();
        //new TesteMain().addCliente();
        
    }
}
