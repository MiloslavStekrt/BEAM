package dev.levia.beam.common;

import dev.levia.beam.common.models.User;
import lombok.NoArgsConstructor;
import org.springframework.core.serializer.Deserializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
public abstract class EntityBuilder implements Serializable, Deserializer {
    public static List<String> build() {
        return null;
    }

    @Override
    public EntityBuilder deserialize(InputStream inputStream) {
        try {
            return (EntityBuilder) ((ObjectInputStream) inputStream).readObject();
        } catch (IOException e) {
            System.out.println("io Stream is incorrectly supposedly to be ObjectInputStream "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found "+e.getMessage());
        }
        return null;
    }
}
