package com.smarsh.entreda.constant;

import lombok.Getter;

@Getter
public enum Tag {
    DEVICE("Device"),
    PHISHING("Phishing"),
    USER("User"),
    SAT("Sat"),
    DOWNLOAD_APPLET("Download Applet"),
    FACTOR("Factor"),
    RELEASE_NOTE("Release Note");

    private final String tag;

    private Tag(String tag) {
        this.tag = tag;
    }


}
