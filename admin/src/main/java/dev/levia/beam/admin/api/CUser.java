package dev.levia.beam.admin.api;

import dev.levia.beam.common.dao.RUser;
import dev.levia.beam.common.models.User;
import dev.levia.beam.common.service.SUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/user")
public class CUser extends ApiController<SUser, User, RUser> {
    public CUser(SUser service) { super(service); }
}
