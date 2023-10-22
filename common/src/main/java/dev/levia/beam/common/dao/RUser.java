package dev.levia.beam.common.dao;

import dev.levia.beam.common.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUser extends JpaRepository<User, Long> {
}
