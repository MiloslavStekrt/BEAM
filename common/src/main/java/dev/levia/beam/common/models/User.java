package dev.levia.beam.common.models;

import dev.levia.beam.common.EntityBuilder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Entity
@Table(name = User.NAME)
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User extends EntityBuilder  {
    @Transient
    public final static String NAME = "beam_user";
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String name;
    private String authIP;
    private String password;
    @ManyToMany
    private List<Lessons> lessons;
    @ManyToMany
    private List<Classroom> classrooms;

    public User(String email, String name, String authIP, String password) {
        this.email = email;
        this.name = name;
        this.authIP = authIP;
        this.password = password;
        this.lessons = new ArrayList<>();
        this.classrooms = new ArrayList<>();
    }
}
