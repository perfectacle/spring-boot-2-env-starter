package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Profile("test")
public class TestOrderService implements OrderService {
    @Value("${val}")
    private String val;

    @Value("${val2}")
    private String val2;

    @Override
    public void order() {
        log.info(val);
        log.info(val2);
    }
}
