package com.edakas.bookstore.model;
import lombok.*;
import javax.persistence.*;
import java.util.List;
@Table
@Data
@Getter
@Setter
@Builder
@Entity(name="bookOrder") //bu yapıldı çünkü order bir keyword
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    private  String userName;
    @Column
    @ElementCollection(targetClass = Integer.class)
    private List<Integer> bookList;
    private double totalPrice;
}
