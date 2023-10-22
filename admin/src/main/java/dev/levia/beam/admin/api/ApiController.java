package dev.levia.beam.admin.api;

import dev.levia.beam.common.EntityBuilder;
import dev.levia.beam.common.service.PrimaryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.List;

/**
 * @param <S> service of Entity
 * @param <T> specified Entity
 * @param <R> repository of Entity
 */
public class ApiController<S extends PrimaryService<T, R>, T extends EntityBuilder, R extends JpaRepository<T, Long>> {
    private final S service;
    public ApiController(S service) {
        this.service = service;
    }
    @GetMapping("/get")
    @ResponseBody
    public Optional<T> get(@Param("id") Long id) {
        return service.get(id);
    }
    @GetMapping("/filter")
    @ResponseBody
    public List<T> filter(@RequestBody T entity) {
        return service.filter(entity);
    }
    @DeleteMapping("/del")
    @ResponseBody
    public Optional<T> remove(@Param("id") Long id) {
        return service.remove(id);
    }

    @PutMapping(
            value = "/update",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public T update(@RequestBody T entity) {
        return service.update(entity);
    }
}
