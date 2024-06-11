package com.smarsh.entreda.downloadapplet.controller;

import com.smarsh.entreda.downloadapplet.service.DownloadAppletService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/downloadapplet")
@Tag(name = "Download Applet",
        description = "Endpoint to provide Download Applet information"
)
public class DownloadAppletController {
    private static final Logger log = LoggerFactory.getLogger(DownloadAppletController.class);

    private final DownloadAppletService downloadAppletService;

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
