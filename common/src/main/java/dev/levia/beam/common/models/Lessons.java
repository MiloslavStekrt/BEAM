package dev.levia.beam.common.models;

import dev.levia.beam.common.EntityBuilder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = Lessons.NAME)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Lessons extends EntityBuilder {
    @Transient
    public final static String NAME = "lessons";
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String timeSheet;

    @ManyToMany
    private List<Classroom> rooms;

    @ManyToOne
    private User teacher;

    @ManyToMany
    private List<User> student;
}
