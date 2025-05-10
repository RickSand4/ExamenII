package com.upiiz.examenii.Services;

import com.upiiz.examenii.Models.OrderLineModelDepartamento;
import com.upiiz.examenii.Repositories.OrderLineDepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderLineDepartamentoService implements OrderLineDepartamentoRepository {

    @Override
    public List<OrderLineModelDepartamento> findAll() {
        return List.of();
    }

    @Override
    public OrderLineModelDepartamento findById(int idDepartamento) {
        return null;
    }

    @Override
    public void save(OrderLineModelDepartamento orderLineModelDepartamento) {

    }

    @Override
    public void delete(int idDepartamento) {

    }

    @Override
    public void update(OrderLineModelDepartamento orderLineModelDepartamento) {

    }
}
