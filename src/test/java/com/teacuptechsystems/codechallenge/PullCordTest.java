package com.teacuptechsystems.codechallenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PullCordTest {

	private PullCord pullOnCord;
	private PullCord reverseCord;
	private CeilingFan fan;

	@BeforeEach
	void setUp() throws Exception {
		fan = new CeilingFan();
		pullOnCord = new PullCord(fan, true);
		reverseCord = new PullCord(fan, false);
	}

	@Test
	void testIncreaseFanSpeed1Time() {
		assertEquals(0, fan.getSpeed());
		pullOnCord.triggerFanSpeed();
		assertEquals(1, fan.getSpeed());
	}

	@Test
	void testIncreaseFanSpeed2times() {
		assertEquals(0, fan.getSpeed());
		pullOnCord.triggerFanSpeed();
		pullOnCord.triggerFanSpeed();
		assertEquals(2, fan.getSpeed());
	}

	@Test
	void testIncreaseFanMaxSpeed() {
		assertEquals(0, fan.getSpeed());
		pullOnCord.triggerFanSpeed();
		pullOnCord.triggerFanSpeed();
		pullOnCord.triggerFanSpeed();
		assertEquals(CeilingFan.MAX_SPEED, fan.getSpeed());
	}

	@Test
	void testIncreaseFanOffSpeed() {
		assertEquals(0, fan.getSpeed());
		pullOnCord.triggerFanSpeed();
		pullOnCord.triggerFanSpeed();
		pullOnCord.triggerFanSpeed();
		pullOnCord.triggerFanSpeed();
		assertEquals(0, fan.getSpeed());
	}

	@Test
	void testReverseFanMaxSpeed() {
		assertEquals(0, fan.getSpeed());
		reverseCord.triggerFanSpeed();
		assertEquals(CeilingFan.MAX_SPEED, fan.getSpeed());
	}

	@Test
	void testReverseFanSpeed2Time() {
		assertEquals(0, fan.getSpeed());
		reverseCord.triggerFanSpeed();
		reverseCord.triggerFanSpeed();
		assertEquals(2, fan.getSpeed());
	}

	@Test
	void testReverseFanSpeed3Time() {
		assertEquals(0, fan.getSpeed());
		reverseCord.triggerFanSpeed();
		reverseCord.triggerFanSpeed();
		reverseCord.triggerFanSpeed();
		assertEquals(1, fan.getSpeed());
	}

	@Test
	void testReverseFanOffSpeed() {
		assertEquals(0, fan.getSpeed());
		reverseCord.triggerFanSpeed();
		reverseCord.triggerFanSpeed();
		reverseCord.triggerFanSpeed();
		reverseCord.triggerFanSpeed();
		assertEquals(0, fan.getSpeed());
	}
}
