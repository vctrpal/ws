package com.sw.paintcalculator.controller;

import com.sw.paintcalculator.service.PaintCalculatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class PaintCalculateController {

   private PaintCalculatorService paintCalculatorService;

    public PaintCalculateController(PaintCalculatorService paintCalculatorService) {
        this.paintCalculatorService = paintCalculatorService;
    }

    @PostMapping("/paintvolume")
    public Map<String,String> paintCalculator(@RequestBody Input input){

        Map<String,String> responseMap = new HashMap<>();
        responseMap.put("paintvolumerequired",paintCalculatorService.calculatePaintVolume(input)+" Gallon");

        return responseMap;
    }
}
