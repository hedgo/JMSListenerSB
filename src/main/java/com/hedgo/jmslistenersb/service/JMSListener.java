package com.hedgo.jmslistenersb.service;

import com.hedgo.model.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JMSListener {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @JmsListener(destination = "queue01", containerFactory = "myQuequeFactory")
    public void receiveQueue01(Email email) {
        logger.info("1 .Received on queue01 [" + email + "]");
    }


    @JmsListener(destination = "topic01", containerFactory = "myTopicFactory")
    public void receiveTopic01(Email email) {
        logger.info("2 .Received on topic01 [" + email + "]");
    }

}
