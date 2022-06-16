package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orders {

    @Id
    private String orderId;

    private String orderDate;
    private String orderTime;
    private double cost;

    @ManyToOne
    private Customer customer;


}
