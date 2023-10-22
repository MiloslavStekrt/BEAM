package dev.levia.beam.admin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan (basePackages = {"dev.levia.beam"})
@EntityScan(basePackages = {"dev.levia.beam.common"})
@EnableJpaRepositories(basePackages = {"dev.levia.beam.common"})
@EnableAutoConfiguration
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class);
    }
}