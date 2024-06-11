package com.smarsh.entreda.phishing.controller;

import com.smarsh.entreda.phishing.service.PhishingService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/phishing")
@Tag(name = "Phishing",
        description = "Endpoint to provide Phishing information"
)
public class PhishingController {
    private static final Logger log = LoggerFactory.getLogger(PhishingController.class);

    private final PhishingService phishingService;

    @GetMapping("/")
    public String getEndPoint() {
        return "done";
    }

    @PostMapping("/")
    public String postEndPoint(@RequestBody String body) {
        return "done";
    }

    @PutMapping("/")
    public String putEndPoint() {
        return "done";
    }

    @DeleteMapping("/")
    public String deleteEndPoint() {
        return "done";
    }
}
