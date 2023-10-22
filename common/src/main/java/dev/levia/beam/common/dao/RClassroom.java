package dev.levia.beam.common.dao;

import dev.levia.beam.common.models.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RClassroom extends JpaRepository<Classroom, Long> { }
