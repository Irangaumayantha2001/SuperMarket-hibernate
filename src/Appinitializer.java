import entity.Customer;
import entity.Item;
import entity.OrderDetails;
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

     /*   Customer c1 = new Customer();
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
        */




//         ArrayList<Orders> ordersList=new ArrayList<>();
//         ordersList.add(o1);
//         ordersList.add(o2);
//
//         c1.setOrdersList(ordersList);



    /*    Item i1 = new Item();
        i1.setItemCode("I001");
        i1.setDescription("meat");
        i1.setPackSize("1kg");
        i1.setQtyOnHand(5);
        i1.setUnitPrice(500.00);

        OrderDetails od1 = new OrderDetails();
        od1.setOrderDetailId("OD001");
        od1.setOrderQty(1);
        od1.setDiscount(50.00);

        OrderDetails od2 = new OrderDetails();
        od2.setOrderDetailId("OD002");
        od2.setOrderQty(1);
        od2.setDiscount(50.00);

        ArrayList<OrderDetails> ordersList=new ArrayList<>();
        ordersList.add(od1);
        ordersList.add(od2);
        i1.setOrdersList(ordersList);*/


        Orders o1= new Orders();
        o1.setOrderId("OD001");
        o1.setOrderDate("2022-06-06");
        o1.setOrderTime("07:08:20");


        OrderDetails od1 = new OrderDetails();
        od1.setOrderDetailId("OD001");
        od1.setOrderQty(1);
        od1.setDiscount(50.00);

        OrderDetails od2 = new OrderDetails();
        od2.setOrderDetailId("OD002");
        od2.setOrderQty(1);
        od2.setDiscount(50.00);

        List<OrderDetails> itemList = new ArrayList<>();
        itemList.add(od1);
        itemList.add(od2);
        o1.setItemList(itemList);


        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();


//        session.save(c1);
//        session.save(o1);
//        session.save(o2);

//        session.save(i1);
//        session.save(od1);
//        session.save(od2);

            session.save(o1);
            session.save(od1);
            session.save(od2);

        transaction.commit();
        session.close();


    }
}
