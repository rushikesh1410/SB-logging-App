package in.wolf.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	
	Logger logger = LoggerFactory.getLogger(MessageService.class);
	public String getMessage() {
		logger.trace("this is trace message");
		logger.debug("this is debug msg");
		logger.info("getWelcomeMessage()-- started");
		String msg = "Hello to the logging";
		
		logger.info("getWelcomeMessage()-- ended");
		logger.warn("this warn msg");
		logger.error("this is error msg");
		return msg;
		
	}

}
