package tw.waterballsa.gaas.saboteur.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "tw.waterballsa.gaas.saboteur")
public class SaboteurApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaboteurApplication.class, args);
    }

}
