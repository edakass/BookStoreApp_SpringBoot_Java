package com.edakas.bookstore.services;


import com.edakas.bookstore.model.Book;
import com.edakas.bookstore.model.Order;

import com.edakas.bookstore.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class OrderService {

    private final Logger logger = LoggerFactory.getLogger(OrderService.class);
    private final BookService bookService;
    private  final OrderRepository orderRepository;

    public  OrderService(BookService bookService, OrderRepository orderRepository){
        this.bookService=bookService;
        this.orderRepository = orderRepository;
    }
    public Order putAnOrder(List<Integer>bookIdList,String userName){
        //bu bana gelen bookIdlist in vt de var mı bakmam lazım
        //bunu kontrol etmek için ise
        List<Optional<Book>> bookList=bookIdList.stream().
                map(bookService::findBookById).collect(Collectors.toList());

        Double totalPrice=bookList.stream()
                .map(optionalBook -> optionalBook.map(Book::getPrice).orElse(0.0))
                .reduce(0.0,Double::sum);

        Order order= Order.builder()
                .bookList(bookIdList)
                .totalPrice(totalPrice)
                .userName(userName)
                .build();
        return  orderRepository.save(order);

    }
    public  List<Order> getAllOrders(){
        return  orderRepository.findAll();
    }


}
