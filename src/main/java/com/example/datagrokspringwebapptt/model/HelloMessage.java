package com.example.datagrokspringwebapptt.model;

import java.time.LocalTime;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class HelloMessage {

    private String from;

    private String to;

    private String dialog;

    private LocalTime localTime;
}
