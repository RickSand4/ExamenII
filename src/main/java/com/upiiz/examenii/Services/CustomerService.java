package com.upiiz.examenii.Services;

import com.upiiz.examenii.Models.CustomerModel;
import com.upiiz.examenii.Repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements CustomerRepository {


    @Override
    public List<CustomerModel> findAll() {
        return List.of();
    }

    @Override
    public CustomerModel findById(int id) {
        return null;
    }

    @Override
    public CustomerModel save(CustomerModel customer) {
        return null;
    }

    @Override
    public void delete(CustomerModel customer) {

    }

    @Override
    public void update(CustomerModel customer) {

    }
}
