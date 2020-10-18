package it.leobia.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/api/test")
    public void test() {
        LOGGER.info("Test");
    }
}
