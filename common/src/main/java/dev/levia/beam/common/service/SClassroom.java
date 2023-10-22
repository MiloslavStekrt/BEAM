package dev.levia.beam.common.service;

import dev.levia.beam.common.dao.RClassroom;
import dev.levia.beam.common.models.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SClassroom extends PrimaryService<Classroom, RClassroom> {
    private final RClassroom repo;
    public SClassroom(RClassroom repo) {
        super(repo);
        this.repo = repo;
    }
}
