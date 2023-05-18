package com.educandoweb.coursespringboot.services;

import com.educandoweb.coursespringboot.entities.Order;
import com.educandoweb.coursespringboot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order fndById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
