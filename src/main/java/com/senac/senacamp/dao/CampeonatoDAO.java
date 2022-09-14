package com.senac.senacamp.dao;

import com.senac.senacamp.model.Campeonato;
import org.springframework.data.repository.CrudRepository;

public interface CampeonatoDAO extends CrudRepository<Campeonato, Integer> {
}
