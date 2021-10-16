package com.edakas.bookstore.model;
import lombok.*;
import javax.persistence.*;
//Veritabanı tablosu olduğunu belirtmek için;
@Table
//lambok'lar
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    //data'yı repository de işleyeceğiz
    //primarykey olduğunu id ile belirtiyoruz
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //ctrl+space yapıldığında GenerationType.AUTO geliyor.
    private Integer id;
    private String name;
    private  String author;
    private Double price;
    private Integer stock;
}
