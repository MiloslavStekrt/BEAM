package dev.levia.beam.admin.api;

import dev.levia.beam.common.dao.RClassroom;
import dev.levia.beam.common.models.Classroom;
import dev.levia.beam.common.service.SClassroom;

public class CClassroom extends ApiController<SClassroom, Classroom, RClassroom>{
    public CClassroom(SClassroom service) { super(service); }
}
