package org.usfirst.frc.team2587.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//PWM (Drive Train)
	public static final int 
		leftMotorFront = 20,
		rightMotorFront = 15,
		leftMotorBack = 1,
		rightMotorBack = 14;
	
	public final static int motorPunch = 13;
	public final static int motorTail =11;
	public final static int motorHook= 16;
	public final static int motorHang=17;
	/* PWM */

	public final static int armMotor = 2;//set
	public final static int intakeMotor = 12;//set

	
	/* Pneumatics */
	public final static int brakeSolenoid = 0;
	public final static int intakeSolenoid = 3;
	public final static int shooter1 = 6;//set
	public final static int shooter2 = 7;//set
	public final static int shifter1=1;
	public final static int shifter2 = 2;

	
	
	/* Analog */
	public final static int potentiometer = 0;
	public final static int pressureSensor=1;
	//public final static int LPSensor = 2;
	public final static int LoadedSensor = 3; 
	//public final static int pot1 = 2;
	
	/* Digital */
	public final static int limitSwitchFront = 0;
	public final static int limitSwitchBack = 1;
	
}
