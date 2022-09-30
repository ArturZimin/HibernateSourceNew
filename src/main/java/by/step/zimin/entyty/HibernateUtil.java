package by.step.zimin.entyty;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static SessionFactory sessionFactory;//настройка и работа с сессиями(фабрика сессий)





    static {



Configuration cfg=new Configuration().configure();
       ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();


        try {

            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }



    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}

/**
 * new course of action
 * serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
 *             configuration.getProperties()).build();
 *
 *
 *
 *
 *             StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
 *     .configure("org/hibernate/example/hibernate.cfg.xml")
 *     .build();
 *
 * Metadata metadata = new MetadataSources(standardRegistry)
 *     .addAnnotatedClass(MyEntity.class)
 *     .addAnnotatedClassName("org.hibernate.example.Customer")
 *     .addResource("org/hibernate/example/Order.hbm.xml")
 *     .addResource("org/hibernate/example/Product.orm.xml")
 *     .getMetadataBuilder()
 *     .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
 *     .build();
 *
 * SessionFactory sessionFactory = metadata.getSessionFactoryBuilder()
 *     .applyBeanManager(getBeanManager())
 *     .build();
 **/