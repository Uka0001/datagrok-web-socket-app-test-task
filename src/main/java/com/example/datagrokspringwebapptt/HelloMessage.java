package com.example.datagrokspringwebapptt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@RequiredArgsConstructor
public class HelloMessage {

    private String name;

    private String dialog;

    private LocalTime localTime;
}
