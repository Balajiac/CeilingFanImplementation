package com.teacuptechsystems.codechallenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CeilingFanTest {
	
	private CeilingFan fan;

	@BeforeEach
	void setUp() throws Exception {
		fan = new CeilingFan();
	}

	@Test
	void testIncreaseFanSpeed1Time() {
		assertEquals(0, fan.getSpeed());
		fan.increaseFanSpeed();
		assertEquals(1, fan.getSpeed());
	}

	@Test
	void testIncreaseFanSpeed2times() {
		assertEquals(0, fan.getSpeed());
		fan.increaseFanSpeed();
		fan.increaseFanSpeed();
		assertEquals(2, fan.getSpeed());
	}

	@Test
	void testIncreaseFanMaxSpeed() {
		assertEquals(0, fan.getSpeed());
		fan.increaseFanSpeed();
		fan.increaseFanSpeed();
		fan.increaseFanSpeed();
		assertEquals(CeilingFan.MAX_SPEED, fan.getSpeed());
	}

	@Test
	void testIncreaseFanOffSpeed() {
		assertEquals(0, fan.getSpeed());
		fan.increaseFanSpeed();
		fan.increaseFanSpeed();
		fan.increaseFanSpeed();
		fan.increaseFanSpeed();
		assertEquals(0, fan.getSpeed());
	}

	@Test
	void testReverseFanMaxSpeed() {
		assertEquals(0, fan.getSpeed());
		fan.reverseFanSpeed();
		assertEquals(CeilingFan.MAX_SPEED, fan.getSpeed());
	}

	@Test
	void testReverseFanSpeed2Time() {
		assertEquals(0, fan.getSpeed());
		fan.reverseFanSpeed();
		fan.reverseFanSpeed();
		assertEquals(2, fan.getSpeed());
	}

	@Test
	void testReverseFanSpeed3Time() {
		assertEquals(0, fan.getSpeed());
		fan.reverseFanSpeed();
		fan.reverseFanSpeed();
		fan.reverseFanSpeed();
		assertEquals(1, fan.getSpeed());
	}

	@Test
	void testReverseFanOffSpeed() {
		assertEquals(0, fan.getSpeed());
		fan.reverseFanSpeed();
		fan.reverseFanSpeed();
		fan.reverseFanSpeed();
		fan.reverseFanSpeed();
		assertEquals(0, fan.getSpeed());
	}

	@Test
	void testPullOnFanSpeed1Time() {
		assertEquals(0, fan.getSpeed());
		fan.pullFanSpeed(true);
		assertEquals(1, fan.getSpeed());
	}

	@Test
	void testPullOnFanSpeed2Times() {
		assertEquals(0, fan.getSpeed());
		fan.pullFanSpeed(true);
		fan.pullFanSpeed(true);
		assertEquals(2, fan.getSpeed());
	}

	@Test
	void testPullOnFanMaxSpeed() {
		assertEquals(0, fan.getSpeed());
		fan.pullFanSpeed(true);
		fan.pullFanSpeed(true);
		fan.pullFanSpeed(true);
		assertEquals(CeilingFan.MAX_SPEED, fan.getSpeed());
	}

	@Test
	void testPullOnFanOffSpeed() {
		assertEquals(0, fan.getSpeed());
		fan.pullFanSpeed(true);
		fan.pullFanSpeed(true);
		fan.pullFanSpeed(true);
		fan.pullFanSpeed(true);
		assertEquals(0, fan.getSpeed());
	}

	@Test
	void testPullReverseFanSpeed1Time() {
		assertEquals(0, fan.getSpeed());
		fan.pullFanSpeed(false);
		assertEquals(CeilingFan.MAX_SPEED, fan.getSpeed());
	}

	@Test
	void testPullReverseFanSpeed2Times() {
		assertEquals(0, fan.getSpeed());
		fan.pullFanSpeed(false);
		fan.pullFanSpeed(false);
		assertEquals(2, fan.getSpeed());
	}

	@Test
	void testPullReverseFanSpeed3Times() {
		assertEquals(0, fan.getSpeed());
		fan.pullFanSpeed(false);
		fan.pullFanSpeed(false);
		fan.pullFanSpeed(false);
		assertEquals(1, fan.getSpeed());
	}

	@Test
	void testPullReverseFanOffSpeed() {
		assertEquals(0, fan.getSpeed());
		fan.pullFanSpeed(false);
		fan.pullFanSpeed(false);
		fan.pullFanSpeed(false);
		fan.pullFanSpeed(false);
		assertEquals(0, fan.getSpeed());
	}

}
