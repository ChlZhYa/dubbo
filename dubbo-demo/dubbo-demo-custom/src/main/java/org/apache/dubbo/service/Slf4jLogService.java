package org.apache.dubbo.service;

public class Slf4jLogService implements LogService {
    @Override
    public void log() {
        System.out.println("slf4j -> print");
    }
}
