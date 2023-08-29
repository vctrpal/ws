package com.sw.paintcalculator.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Input {

    private int totalHeight;
    private int totalWidth;
    private int noOfWindows;
    private int noOfDoors;

}
