package mrcnbsb.controllers;

import mrcnbsb.services.PersonServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestLogController {

    private final Logger logger = LoggerFactory.getLogger(TestLogController.class.getName());

    @GetMapping("/test")
    public String testLog(){
        logger.debug("This is in an DEBUG log");
        logger.info("This is in an INFO log");
        logger.warn("This is in an WARM log");
        logger.error("This is in an ERROR log");
        return "Logs generated successfully!";
    }
}
