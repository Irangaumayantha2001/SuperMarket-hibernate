package utill;

import entity.Customer;
import entity.Item;
import entity.OrderDetails;
import entity.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private  static  FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        Configuration configuration  = new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Item.class).addAnnotatedClass(Orders.class).addAnnotatedClass(OrderDetails.class);
        sessionFactory =configuration.buildSessionFactory();
    }

    public  static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null)? factoryConfiguration=new FactoryConfiguration() : factoryConfiguration;
    }

    public Session getSession(){
        return  sessionFactory.openSession();
    }
}
