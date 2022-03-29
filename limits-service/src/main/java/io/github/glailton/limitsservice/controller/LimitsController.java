package io.github.glailton.limitsservice.controller;

import io.github.glailton.limitsservice.config.Config;
import io.github.glailton.limitsservice.models.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    private final Config config;

    public LimitsController(Config config) {
        this.config = config;
    }

    @GetMapping("/limits")
    public Limits getLimits(){
        return new Limits(config.getMinimum(), config.getMaximum());
    }
}
