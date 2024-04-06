package service;

import model.Order;

import java.util.List;

public interface IOrderService {
    List<Order> findAll();

    void add(Order newOrder);

    void update();

    Order findById(Long id);

}
