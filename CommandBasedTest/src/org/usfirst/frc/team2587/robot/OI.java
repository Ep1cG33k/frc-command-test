package org.usfirst.frc.team2587.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team2587.robot.commands.ExampleCommand;
import org.usfirst.frc.team2587.robot.utils.GamePad;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	//GamePad logitech = new GamePad(1); //Logitech Gamepad
	GamePad xbox = new GamePad(0); //XBOX Gamepad
	
	/*public GamePad getLogitech(){
		return logitech;
	}*/

	public GamePad getXbox(){
		return xbox;
	}
	
	//private Button b_dpadU = new DPadButton(xbox, GamePad.DPAD_Y, true);
	//private Button b_dpadD = new DPadButton(xbox, GamePad.DPAD_Y, false);
	//private Button b_dpadR = new DPadButton(xbox, GamePad.DPAD_X, true);
	//private Button b_dpadL = new DPadButton(xbox, GamePad.DPAD_X, false);
	private Button b_bumpR = new JoystickButton(xbox, 6);
	private Button b_bumpL = new JoystickButton(xbox, 5);
	public double b_triggerR = xbox.getRawAxis(3);//Right Trigger
	public double b_triggerL = xbox.getRawAxis(2);//left trigger
	private Button b_sBack = new JoystickButton(xbox, 7);
	private Button b_sStar = new JoystickButton(xbox, 8);
	private Button b_btnA = new JoystickButton(xbox, 1);
	private Button b_btnX = new JoystickButton(xbox, 3);
	private Button b_btnB = new JoystickButton(xbox, 2);
	private Button b_btnY = new JoystickButton(xbox, 4);
	private Button b_clicR = new JoystickButton(xbox, 10);
	private Button b_clicL = new JoystickButton(xbox, 9);
	/*
	private Button b2_bumpR = new JoystickButton(logitech, GamePad.BTN_RB);
	private Button b2_bumpL = new JoystickButton(logitech, GamePad.BTN_LB);
	private Button b2_trigR = new JoystickButton(logitech, GamePad.BTN_RT);
	private Button b2_trigL = new JoystickButton(logitech, GamePad.BTN_LT);
	private Button b2_sBack = new JoystickButton(logitech, GamePad.BTN_BACK);
	private Button b2_sStar = new JoystickButton(logitech, GamePad.BTN_START);
	private Button b2_btnA = new JoystickButton(logitech, GamePad.BTN_A);
	private Button b2_btnX = new JoystickButton(logitech, GamePad.BTN_X);
	private Button b2_btnB = new JoystickButton(logitech, GamePad.BTN_B);
	private Button b2_btnY = new JoystickButton(logitech, GamePad.BTN_Y);
	private Button b2_clicR = new JoystickButton(logitech, GamePad.AXISBTN_R);
	private Button b2_clicL = new JoystickButton(logitech, GamePad.AXISBTN_L);
	*/
	
	
	
	public double getJoystickLX(int gamePadNumber){
		if (gamePadNumber == 1){
			//return (logitech.getRawAxis(0));
		} else if (gamePadNumber == 2){
			return (xbox.getRawAxis(0));
		}
		return 0;
	}
	
	public double getJoystickLY(int gamePadNumber){
		if (gamePadNumber == 1){
			//return (logitech.getRawAxis(1));
		} else if (gamePadNumber == 2){
			return (xbox.getRawAxis(1));
		}
		return 0;
	}
	
	public double getJoystickRX(int gamePadNumber){
		if (gamePadNumber == 1){
			//return (logitech.getRawAxis(4));
		} else if (gamePadNumber == 2){
			return (xbox.getRawAxis(4));
		}
		return 0;
	}
	
	public double getJoystickRY(int gamePadNumber){
		if (gamePadNumber == 1){
			//return (logitech.getRawAxis(5));
		} else if (gamePadNumber == 2){
			return (xbox.getRawAxis(5));
		}
		return 0;
	}
}
