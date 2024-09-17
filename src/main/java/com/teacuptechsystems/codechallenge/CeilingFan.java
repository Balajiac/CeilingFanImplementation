package com.teacuptechsystems.codechallenge;

public class CeilingFan {

	public static final short MAX_SPEED = 3;
	
	private short speed;
	
	private final PullCord pullOnCord;
	private final PullCord reverseCord;

	public CeilingFan() {
		pullOnCord = new PullCord(this, true);
		reverseCord = new PullCord(this, false);
	}
	
	protected void increaseFanSpeed() {
		speed ++;
		if(speed > MAX_SPEED) {
			speed = 0;
		}
	}
	
	protected void reverseFanSpeed() {
		speed --;
		if(speed < 0) {
			speed = MAX_SPEED;
		}
	}
	
	public void pullFanSpeed(boolean isClockwise) {
		if(isClockwise) {
			pullOnCord.triggerFanSpeed();
		} else {
			reverseCord.triggerFanSpeed();
		}
	}
	
	public short getSpeed() {
		return speed;
	}

}
