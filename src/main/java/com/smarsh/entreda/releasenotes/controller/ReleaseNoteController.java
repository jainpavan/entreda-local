package com.smarsh.entreda.releasenotes.controller;

import com.smarsh.entreda.releasenotes.service.ReleaseNoteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/releasenote")
@Tag(name = "Release Notes",
        description = "Endpoint to provide Release notes information"
)
public class ReleaseNoteController {
    private static final Logger log = LoggerFactory.getLogger(ReleaseNoteController.class);

    private final ReleaseNoteService releaseNoteService;

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
