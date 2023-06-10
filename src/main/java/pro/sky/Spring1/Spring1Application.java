package pro.sky.Spring1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
        System.setProperty("server.servlet.context-path=", "/store");
		SpringApplication.run(Spring1Application.class, args);
	}

}
