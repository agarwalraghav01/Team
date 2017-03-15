package com.team.backend.services;

import com.team.web.domain.FeedbackPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by raghav on 9/3/17.
 */


public abstract class AbstractEmailService implements EmailService{

    @Value("${default.to.address}")
    private String defaultToAddress;


    public SimpleMailMessage message(FeedbackPojo feedbackPojo){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(defaultToAddress);
        message.setFrom(feedbackPojo.getEmail());
        message.setSubject("mail from " + feedbackPojo.getFirstName() + "  " + feedbackPojo.getLastName());
        message.setText(feedbackPojo.getFeedback());
        return message;
    }


    public void SendFeedbackEmail(FeedbackPojo feedbackPojo){
        SendGenricEmailMessage(message(feedbackPojo));
    }
}
