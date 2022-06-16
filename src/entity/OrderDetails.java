package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetails {

    @Id
    private String orderDetailId;

    private int orderQty;
    private double discount;

    @ManyToOne
    private Item item;

    @ManyToOne
    private Orders order;
}
