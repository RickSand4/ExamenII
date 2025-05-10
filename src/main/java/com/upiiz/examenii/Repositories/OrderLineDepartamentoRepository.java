package com.upiiz.examenii.Repositories;

import com.upiiz.examenii.Models.OrderLineModelDepartamento;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface OrderLineDepartamentoRepository {
    List<OrderLineModelDepartamento> findAll();
    OrderLineModelDepartamento findById(int idDepartamento);

    void save(OrderLineModelDepartamento orderLineModelDepartamento);
    void delete(int idDepartamento);
    void update(OrderLineModelDepartamento orderLineModelDepartamento);
}
