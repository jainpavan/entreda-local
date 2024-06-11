package com.smarsh.entreda.factors.controller;

import com.smarsh.entreda.factors.service.FactorService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/factor")
@Tag(name = "Factor",
        description = "Endpoint to provide Factor information"
)
public class FactorController {
    private static final Logger log = LoggerFactory.getLogger(FactorController.class);

    private final FactorService factorService;

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
