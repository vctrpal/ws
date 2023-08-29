package com.sw.paintcalculator.service;

import com.sw.paintcalculator.controller.Input;
import org.springframework.stereotype.Service;

@Service
public class PaintCalculatorService {


    public int calculatePaintVolume(Input input){

        BaseRoomMeasurement baseRoomMeasurement = new SingleRoomMeasurement(input.getTotalHeight(),input.getTotalWidth());

        baseRoomMeasurement = new RoomMeasurementWithWindow(baseRoomMeasurement,input.getNoOfWindows());

        baseRoomMeasurement = new RoomMeasurementWithDoor(baseRoomMeasurement,input.getNoOfDoors());

        int finalMeasurement = baseRoomMeasurement.getBaseRoomMeasurement();

        double volumeOfPaint =(double) finalMeasurement/400;


        return (int)Math.round(volumeOfPaint);


    }
}
