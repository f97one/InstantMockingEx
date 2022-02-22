package net.formula97.ex.java.instantmockingex.web;

import net.formula97.ex.java.instantmockingex.domain.TimeNotification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;

@RestController
public class MainController {
    @GetMapping("/")
    public TimeNotification notifyTime() {
        return new TimeNotification(Date.from(Instant.now()));
    }
}
