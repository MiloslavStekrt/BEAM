package dev.levia.beam.common.service;

import dev.levia.beam.common.dao.RLessons;
import dev.levia.beam.common.models.Lessons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SLessons extends PrimaryService<Lessons, RLessons> {
    private RLessons repo;

    public SLessons(RLessons repo) {
        super(repo);
        this.repo = repo;
    }
}
