package dzmann.agencia.agenciaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AgenciaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgenciaConfigServerApplication.class, args);
	}

}
