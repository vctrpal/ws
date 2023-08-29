package com.sw.paintcalculator;

import com.sw.paintcalculator.controller.Input;
import com.sw.paintcalculator.service.PaintCalculatorService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

@SpringBootTest
class PaintcalculatorApplicationTests {

	@Autowired
	PaintCalculatorService paintCalculatorService;

	@Test
	void calculatePaintVolumeTest() {

		Input input = new Input(10,44,1,3);
        assertEquals(1,paintCalculatorService.calculatePaintVolume(input));


	}

}
