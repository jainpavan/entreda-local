package com.smarsh.entreda.sat.controller;

import com.smarsh.entreda.sat.service.SATService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sat")
@Tag(name = "SAT",
        description = "Endpoint to provide SAT information"
)
public class SATController {
    private static final Logger log = LoggerFactory.getLogger(SATController.class);

    private final SATService satService;

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
