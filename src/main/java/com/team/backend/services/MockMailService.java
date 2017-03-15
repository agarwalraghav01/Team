package com.team.backend.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by raghav on 9/3/17.
 */

public class MockMailService extends AbstractEmailService{
    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(MockMailService.class);

    public void SendGenricEmailMessage(SimpleMailMessage message){
        LOG.debug("the recived mail is {}" , message);
        LOG.info(message.toString());
        LOG.debug("mail sent");
    }

}
