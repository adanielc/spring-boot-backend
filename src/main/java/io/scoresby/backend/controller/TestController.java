package io.scoresby.backend.controller;

import io.scoresby.backend.dao.Artist;
import io.scoresby.backend.service.TestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TestController {

    private static final Logger log = LogManager.getLogger(TestController.class);

    @Autowired
    TestService testService;

    @GetMapping("/test")
    String testController() {
        log.info("Test Controller");
        return "controller Test ok";


    }

    @GetMapping("/getArtist")
    List<Artist> getArtist() {
        return testService.getArtist();


    }


}
