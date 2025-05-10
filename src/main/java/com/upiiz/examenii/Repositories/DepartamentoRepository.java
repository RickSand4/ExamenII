package com.upiiz.examenii.Repositories;

import com.upiiz.examenii.Models.DepartamentoModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoRepository {
    //Menú
    //Todos los metodos Crud
    List<DepartamentoModel> findAll();
    DepartamentoModel findById(int idDepartamento);
    void save(DepartamentoModel departamento);
    void delete(int idDepartamento);
    void update(DepartamentoModel departamento);
}
