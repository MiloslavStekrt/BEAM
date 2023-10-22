package dev.levia.beam.common.models;

import dev.levia.beam.common.EntityBuilder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = Classroom.NAME)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Classroom extends EntityBuilder {
        @Transient
        public final static String NAME = "classroom";

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String timeSheet;
        private String description;

        @ManyToOne
        private User teacher;

        @ManyToMany
        private List<User> students;

        @ManyToMany
        private List<Lessons> lessons;

        public Classroom(String title, String timeSheet, String description) {
                this.title = title;
                this.timeSheet = timeSheet;
                this.description = description;
        }
}
