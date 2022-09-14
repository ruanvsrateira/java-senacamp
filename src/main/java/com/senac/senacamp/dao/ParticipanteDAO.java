package com.senac.senacamp.dao;

import com.senac.senacamp.model.Participante;
import org.springframework.data.repository.CrudRepository;

public interface ParticipanteDAO extends CrudRepository<Participante, Integer> {
}
