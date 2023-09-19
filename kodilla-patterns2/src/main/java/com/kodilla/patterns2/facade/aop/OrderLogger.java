package com.kodilla.patterns2.facade.aop;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class OrderLogger {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderLogger.class);

    @Before(value="execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, id)",argNames="order,id")
    public void logOrder(OrderDto order, Long id) {
        LOGGER.info("Request from userId: " + id );
    }
}
