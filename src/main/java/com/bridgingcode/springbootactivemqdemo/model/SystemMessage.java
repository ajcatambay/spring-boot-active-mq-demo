package com.bridgingcode.springbootactivemqdemo.model;

import java.io.Serializable;

/**
 *
 * @author AJ Catambay of Bridging Code
 *
 */
public class SystemMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String source;
    private String message;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SystemMessage{" +
                "source='" + source + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
