package dev.levia.beam.common.service;

import dev.levia.beam.common.dao.RUser;
import dev.levia.beam.common.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SUser extends PrimaryService<User, RUser> {
    private RUser repo;

    public SUser(RUser repo) {
        super(repo);
        this.repo = repo;
    }
}
