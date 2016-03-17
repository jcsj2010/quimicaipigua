
import Beans.Cliente;
import Beans.Email;
import Beans.Embalagem;
import Beans.Endereco;
import Beans.EstoqueProduto;
import Beans.Formula;
import Beans.MateriaPrima;
import Beans.Produto;

import Beans.Status;
import Beans.Usuario;
import Fabricas.FabricaBeans;
import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

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
    List<Formula> fff;

    public void addPessoa() {

        p1.setNomerazãosocial("jose Carlos");
        p1.setApelidofantasia("juninho");
        p1.setCodigo("123");
        p1.setCpfcnpj("38351913812");

        Email e = new Email();
        e.setEmail("jcsj2010@gmail.com");
        p1.getEmails().add(e);

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

    public void addCliente() {
        cli.setApelidofantasia("Junior");
        cli.setCodigo("123");
        cli.getAtendente().setApelidofantasia("santana");
        Email mail = new Email();
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

    public void addProduto() {
        Produto p = new Produto();
        MateriaPrima mp = new MateriaPrima();
        Embalagem emb = new Embalagem();
        emb.setDescricao("bombona plastica 5l");
        Embalagem emb1 = new Embalagem();
        emb1.setDescricao("bombona plastica 25l");
        Embalagem emb2 = new Embalagem();
        emb2.setDescricao("bombona plastica 50l");

        p.setDescricao("ativado ls");
        p.getEmbalagems().add(emb);
        p.getEmbalagems().add(emb1);
        p.getEmbalagems().add(emb2);
        mp.setDescricao("acido sulfonico");

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        ss.save(mp);
        ss.save(emb);
        ss.save(emb1);
        ss.save(emb2);
        ss.save(p);
        tx.commit();
        ss.close();

        System.out.println("ok");
    }

    public void addMP() {
        MateriaPrima mp1 = new MateriaPrima();
        mp1.setDescricao("acido cloridrico");
        MateriaPrima mp2 = new MateriaPrima();
        mp2.setDescricao("acido sulfurico");
        MateriaPrima mp3 = new MateriaPrima();
        mp3.setDescricao("acido fluoridrico");
        MateriaPrima mp4 = new MateriaPrima();
        mp4.setDescricao("renex");
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        ss.save(mp1);
        ss.save(mp2);
        ss.save(mp3);
        ss.save(mp4);
        tx.commit();
        ss.close();

        System.out.println("ok");

    }

    public void addFormula() {
        Formula f = new Formula();

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        Produto pp;
        pp = (Produto) ss.load(Produto.class, 1L);
        MateriaPrima mp = (MateriaPrima) ss.load(MateriaPrima.class, 1L);
        f.setProduto(pp);
        f.setMateriaPrima(mp);
        f.setQuantidade(75.0);

        ss.save(f);
        tx.commit();
        ss.close();
    }

    public void buscaFormula() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        Criteria crit = ss.createCriteria(Formula.class);
        crit.add(Restrictions.like("produto.id", 1L));
        List<Formula> fff = crit.list();

        tx.commit();
        ss.close();

        for (Formula a : fff) {
            System.out.println(a.getMateriaPrima().getDescricao());
        }
    }

    public void addEstoque() {

        EstoqueProduto est;

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session ss = sf.openSession();
        Transaction tx = ss.beginTransaction();
        Produto pp;
        pp = (Produto) ss.load(Produto.class, 1L);
        ss.flush();
        Embalagem mp = (Embalagem) ss.load(Embalagem.class, 1);
        ss.flush();
        est = new EstoqueProduto(pp, mp, 5);
        ss.flush();

        ss.save(est);
        tx.commit();
        ss.close();
    }

    public static void main(String[] args) {
        new TesteMain().addProduto();
        new TesteMain().addEstoque();
        //new TesteMain().addCliente();

    }
}
