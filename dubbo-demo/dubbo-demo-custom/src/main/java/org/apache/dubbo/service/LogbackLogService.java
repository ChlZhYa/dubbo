package org.apache.dubbo.service;

public class LogbackLogService implements LogService {
    @Override
    public void log() {
        System.out.println("logback -> print");
    }
}
