package dev.levia.beam.admin.api;

import dev.levia.beam.common.dao.RLessons;
import dev.levia.beam.common.models.Lessons;
import dev.levia.beam.common.service.SLessons;
import org.springframework.stereotype.Controller;

@Controller
public class CLesson extends ApiController<SLessons, Lessons, RLessons>{
    public CLesson(SLessons service) { super(service); }
}
