package in.wolf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.wolf.service.MessageService;

@RestController
public class MessageRestController {
	
	@Autowired
	private MessageService messageService;
	
	@GetMapping(path = "/welcome")
	public String getWelcomeMessage() {
		return messageService.getMessage();
		
	}

}
