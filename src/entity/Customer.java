package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

    @Id
    private String customerId;
    private String customerTitle;
    private String customerName;
    private String customerAddress;
    private String customerCity;
    private String customerProvince;
    private String customerPostalCode;

    @OneToMany(mappedBy = "customer")
    private List<Orders> ordersList=new ArrayList<>();

}
