package com.sw.paintcalculator.service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RoomMeasurementWithWindow extends RoomDecorator{

    BaseRoomMeasurement baseRoomMeasurement;

    int noOfWindows;

    @Override
    public int getBaseRoomMeasurement() {
        return baseRoomMeasurement.getBaseRoomMeasurement()-(noOfWindows*3*5);
    }
}
