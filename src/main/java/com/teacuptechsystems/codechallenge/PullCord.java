package com.teacuptechsystems.codechallenge;

public class PullCord {
	
	private final CeilingFan fan;
	private final boolean isClockwise;

	public PullCord(CeilingFan fan, boolean isClockwise) {
		this.fan = fan;
		this.isClockwise = isClockwise;
	}
	
	public void triggerFanSpeed() {
		if(isClockwise) {
			fan.increaseFanSpeed();
		} else {
			fan.reverseFanSpeed();
		}
	}

}
