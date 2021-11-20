package techmaster.vn.jpaentity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"techmaster.vn.jpaentity.service"})
public class JpaEntityApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaEntityApplication.class, args);
    }

}
