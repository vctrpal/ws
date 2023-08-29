package com.sw.paintcalculator.service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RoomMeasurementWithDoor extends RoomDecorator{


    BaseRoomMeasurement baseRoomMeasurement;

    int noOfDoors;

    @Override
    public int getBaseRoomMeasurement() {
        return baseRoomMeasurement.getBaseRoomMeasurement()-(noOfDoors*3*7);
    }
}
