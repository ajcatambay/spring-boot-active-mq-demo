package com.bridgingcode.springbootactivemqdemo.consumer.component;

import com.bridgingcode.springbootactivemqdemo.model.SystemMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author AJ Catambay of Bridging Code
 *
 */
@Component
public class MessageConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "bridgingcode-queue")
    public void messageListener(SystemMessage systemMessage) {
        LOGGER.info("Message received! {}", systemMessage);
    }
}
