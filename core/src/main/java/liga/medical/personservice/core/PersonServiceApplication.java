package liga.medical.personservice.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.sql.SQLException;

@SpringBootApplication
@ComponentScan(basePackages = {"liga.medical.personservice", "liga.medical.common.service"})
public class PersonServiceApplication {
    public static void main(String[] args) throws SQLException {
        SpringApplication.run(PersonServiceApplication.class, args);
    }
}
