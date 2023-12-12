package com.example.servermanager;

import com.example.servermanager.enumeration.Status;
import com.example.servermanager.model.Server;
import com.example.servermanager.repo.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServermanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServermanagerApplication.class, args);
    }
//	@Bean
//	CommandLineRunner run(ServerRepository serverRepository){
//		return args -> {
//			serverRepository.save( new Server());
//			serverRepository.save( new Server(null, "192.168.1.33","Fedora Linux","8 GB","Dell PC","http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
//			serverRepository.save( new Server(null, "192.168.1.12","MS Windows 11","8 GB","Web Server","http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
//			serverRepository.save( new Server(null, "192.168.1.67","Red Hat Linux","64GB","Mqil Server","http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
//		};
//	}

}
