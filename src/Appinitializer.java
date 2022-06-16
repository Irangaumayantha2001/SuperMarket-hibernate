import entity.Customer;
import entity.Orders;
import javafx.application.Application;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utill.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Appinitializer  {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setCustomerId("C001");
        c1.setCustomerTitle("driver");
        c1.setCustomerName("iranga");
        c1.setCustomerAddress("23 balapitiya ");
        c1.setCustomerCity("nawarathnagoda");
        c1.setCustomerProvince("southern");
        c1.setCustomerPostalCode("80550");

        Orders o1= new Orders();
        o1.setOrderId("OD001");
        o1.setOrderDate("2022-06-06");
        o1.setOrderTime("07:08:20");


        Orders o2= new Orders();
        o2.setOrderId("OD002");
        o2.setOrderDate("2022-06-06");
        o2.setOrderTime("09:08:20");


         ArrayList<Orders> ordersList=new ArrayList<>();
         ordersList.add(o1);
         ordersList.add(o2);

         c1.setOrdersList(ordersList);


        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();


        session.save(c1);
        session.save(o1);
        session.save(o2);

        transaction.commit();
        session.close();


    }
}
