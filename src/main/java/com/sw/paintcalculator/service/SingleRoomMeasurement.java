package com.sw.paintcalculator.service;

import com.sw.paintcalculator.service.BaseRoomMeasurement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SingleRoomMeasurement extends BaseRoomMeasurement {

    private int totalHeight;
    private int totalWidth;


    @Override
    public int getBaseRoomMeasurement() {
        return totalHeight*totalWidth;
    }


}
