package com.team.backend.services;

import com.team.web.domain.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by raghav on 9/3/17.
 */
public interface EmailService {

    public void SendFeedbackEmail(FeedbackPojo feedbackPojo);

    public void SendGenricEmailMessage(SimpleMailMessage message);
}
