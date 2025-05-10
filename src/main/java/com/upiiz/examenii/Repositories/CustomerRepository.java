package com.upiiz.examenii.Repositories;

import com.upiiz.examenii.Models.CustomerModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository {
    List<CustomerModel> findAll();
    CustomerModel findById(int id);
    CustomerModel save(CustomerModel customer);
    void delete(CustomerModel customer);
    void update(CustomerModel customer);
}
