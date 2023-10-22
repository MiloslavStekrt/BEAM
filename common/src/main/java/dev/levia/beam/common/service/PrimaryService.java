package dev.levia.beam.common.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import dev.levia.beam.common.EntityBuilder;
import dev.levia.beam.common.models.User;
import org.apache.logging.slf4j.Activator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.io.ObjectInputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @param <T> class annotated as Entity
 * @param <R> repository for Entity<T>
 */
public abstract class PrimaryService<T extends EntityBuilder, R extends JpaRepository<T, Long>> {
    private final R repo;
    public PrimaryService(R repo) {
        this.repo = repo;
    }

    public Optional<T> get(Long id) { return repo.findById(id); }
    public T update(T entity) {
        return repo.save(entity);
    }
    public List<T> filter(T entity) { return repo.findAll(Example.of(entity)); }
    public Optional<T> remove(Long id) {
        Optional<T> entity = repo.findById(id);
        repo.deleteById(id);
        return entity;
    }
}
