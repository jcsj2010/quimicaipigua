/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import Beans.Cargo;
import Beans.Cliente;
import Beans.Email;
import Beans.Embalagem;
import Beans.Endereco;
import Beans.EstoqueProduto;
import Beans.Formula;
import Beans.MateriaPrima;
import Beans.Pessoa;
import Beans.Produto;
import Beans.Status;
import Beans.Telefone;
import Beans.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Simone
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory;
     
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            // loads configuration and mappings
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Usuario.class);
            configuration.addAnnotatedClass(Cargo.class);
            configuration.addAnnotatedClass(Cliente.class);
            configuration.addAnnotatedClass(Email.class);
            configuration.addAnnotatedClass(Endereco.class);
            configuration.addAnnotatedClass(Status.class);
            configuration.addAnnotatedClass(Telefone.class);
            configuration.addAnnotatedClass(Pessoa.class);
            configuration.addAnnotatedClass(Produto.class);
            configuration.addAnnotatedClass(MateriaPrima.class);
            configuration.addAnnotatedClass(Formula.class);
            configuration.addAnnotatedClass(Embalagem.class);
            configuration.addAnnotatedClass(EstoqueProduto.class);
            ServiceRegistry serviceRegistry
                = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
             
            // builds a session factory from the service registry
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
        }
         
        return sessionFactory;
    }
    
    
}
