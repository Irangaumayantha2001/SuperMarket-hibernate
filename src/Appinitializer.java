import entity.Customer;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utill.FactoryConfiguration;

public class Appinitializer  {

    public static void main(String[] args) {

        Customer c1 = new Customer();



        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();


        transaction.commit();



        session.close();


    }
}
