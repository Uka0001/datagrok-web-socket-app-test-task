package com.example.datagrokspringwebapptt.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@RequiredArgsConstructor
public class HelloMessage {

    private String from;

    private String to;

    private String dialog;

    private LocalTime localTime;
}
