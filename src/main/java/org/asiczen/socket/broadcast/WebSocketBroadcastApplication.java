package org.asiczen.socket.broadcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebSocketBroadcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSocketBroadcastApplication.class, args);
	}

}
