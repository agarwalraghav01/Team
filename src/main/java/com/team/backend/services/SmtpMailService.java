package com.team.backend.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by raghav on 9/3/17.
 */
public class SmtpMailService extends AbstractEmailService {

    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(SmtpMailService.class);

    @Autowired
    private MailSender mailSender;

    public void SendGenricEmailMessage(SimpleMailMessage message){
        LOG.debug("the recived mail is {}" , message);
        mailSender.send(message);
        LOG.debug("mail sent");
    }


}
