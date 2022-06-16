package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orders {

    @Id
    private String orderId;

    private LocalDate orderDate;
    private LocalTime orderTime;
    private double cost;


}
