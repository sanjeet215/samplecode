package org.asiczen.socket.broadcast.controller;

import org.asiczen.socket.broadcast.controller.model.ScoreCard;
import org.asiczen.socket.broadcast.model.jsoenExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class SocketController {

	@Autowired
	SimpMessagingTemplate messageTemplate;

	@MessageMapping("/scorecard")
	@SendTo("/topic/livescore")
	public ScoreCard getScoreCard(ScoreCard score) throws InterruptedException {
		Thread.sleep(2000);
		return score;
	}
	
	
	@MessageMapping("/scorecard-1")
	@SendTo("/topic/asiczen")
	public ScoreCard getScoreCardpost(ScoreCard score) throws InterruptedException {
		Thread.sleep(2000);
		return score;
	}

	@Scheduled(fixedDelay = 10000)
	public void sendWebSocketUpdate() throws InterruptedException {
		log.info("publishing messsage to server");
		System.out.println("working......");
		this.messageTemplate.convertAndSend("/topic/livescore", new ScoreCard("100", "101", "India", "ODISHA"));
		
		this.messageTemplate.convertAndSend("/topic/asiczen" , new jsoenExample("Some example message"));
	}

	
	
}
