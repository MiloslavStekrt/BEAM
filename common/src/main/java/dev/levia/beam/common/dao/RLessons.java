package dev.levia.beam.common.dao;

import dev.levia.beam.common.models.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RLessons extends JpaRepository<Lessons, Long> { }
