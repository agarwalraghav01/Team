package com.team.web.i18n;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Created by raghav on 24/2/17.
 */
@Service
public class I18NService {
    
    
    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(I18NService.class);
    @Autowired
    private MessageSource messageSource;

    /* Returns a message for the the given message id and the default locale in the session context
    @param messageId  the key of the message resource file
     */

    public String getMessage(String messageId){
        LOG.info("returning i18n text for the messageId{}" , messageId);
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId , locale);
    }

    public String getMessage(String messageId ,  Locale locale){
        return messageSource.getMessage(messageId,null,locale);
    }
}
