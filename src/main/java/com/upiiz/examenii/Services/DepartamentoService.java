package com.upiiz.examenii.Services;

import com.upiiz.examenii.Models.DepartamentoModel;
import com.upiiz.examenii.Repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Service
public class DepartamentoService implements DepartamentoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<DepartamentoModel> findAll() {
        return jdbcTemplate.query("SELECT * FROM departamentos", new BeanPropertyRowMapper<>(DepartamentoModel.class));
    }

    @Override
    public DepartamentoModel findById(int idDepartamento) {
        return jdbcTemplate.query("SELECT * FROM departamentos WHERE idDepartamento=?",
                new BeanPropertyRowMapper<>(DepartamentoModel.class),idDepartamento)
                .stream().findFirst().orElse(new DepartamentoModel());
    }

    @Override
    public void save(DepartamentoModel departamento) {
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(
                    "INSERT INTO departamentos(nombre, ubicacion) VALUES (?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, departamento.getNombre());
            ps.setString(2, departamento.getUbicacion());
            return ps;
        }, keyHolder);

        if (keyHolder.getKey() != null) {
            departamento.setIdDepartamento(keyHolder.getKey().intValue());
        }
    }
    @Override
    public void delete(int idDepartamento) {
    jdbcTemplate.update("DELETE FROM departamentos WHERE idDepartamento=?",idDepartamento);
    }

    @Override
    public void update(DepartamentoModel departamento) {
        jdbcTemplate.update("UPDATE departamentos SET nombre=?, ubicacion=? WHERE idDepartamento =?",
                departamento.getNombre(), departamento.getUbicacion(), departamento.getIdDepartamento());
    }
}
