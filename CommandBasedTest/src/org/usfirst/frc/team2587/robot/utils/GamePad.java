package org.usfirst.frc.team2587.robot.utils;

import edu.wpi.first.wpilibj.Joystick;

public class GamePad extends Joystick{
	public GamePad(int port) {
		super(port);
	}
	
	/***** MODE D CONFIGURATION *****/ 
	// Axis
	public static final int AXIS_LX = 0;
	public static final int AXIS_LY = 1;
	public static final int AXIS_RX = 2;
	public static final int AXIS_RY = 3;
	public static final int DPAD_X = 4;
	public static final int DPAD_Y = 5;
	// Buttons
	public static final int BTN_X = 1;
	public static final int BTN_A = 2;
	public static final int BTN_B = 3;
	public static final int BTN_Y = 4;

	public static final int BTN_LB = 5;
	public static final int BTN_LT = 7;
	public static final int BTN_RB = 6;
	public static final int BTN_RT = 8;

	public static final int BTN_BACK = 9;
	public static final int BTN_START = 10;
	
	public static final int AXISBTN_L = 11;
	public static final int AXISBTN_R = 12;
	
}
