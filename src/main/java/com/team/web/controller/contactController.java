package com.team.web.controller;

import com.team.backend.services.EmailService;
import com.team.web.domain.FeedbackPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by raghav on 8/3/17.
 */
@Controller
public class contactController {

    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(contactController.class);

    public static final String FEEDBACK_MODEL_KEY ="feedback";

    private static final String CONTACT_US_VIEW_NAME="contact/contact";

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/contact" , method = RequestMethod.GET)
    public String contactGet(ModelMap model){
        FeedbackPojo feedbackPojo = new FeedbackPojo();
        model.addAttribute(contactController.FEEDBACK_MODEL_KEY, feedbackPojo);
        return contactController.CONTACT_US_VIEW_NAME;
    }

    @RequestMapping(value = "/contact" , method = RequestMethod.POST)
    public String contactPost(@ModelAttribute(FEEDBACK_MODEL_KEY) FeedbackPojo feedbackPojo){
        LOG.debug("feedback pojo content {}" , feedbackPojo);
        emailService.SendFeedbackEmail(feedbackPojo);
        LOG.info("mail sent");
        return contactController.CONTACT_US_VIEW_NAME;
    }


}
