package br.com.wm.magalums.scheduler;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.wm.magalums.service.NotificationService;

@Component
public class MagaluTaskScheduler {

    private static final Logger logger = LoggerFactory.getLogger(MagaluTaskScheduler.class);

    @Autowired
    private NotificationService notificationService;

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void checkTasks() {
        var dateTime = LocalDateTime.now();
        logger.info("Running at {}", dateTime);
        notificationService.checkAndSend(dateTime);
    }
    
}