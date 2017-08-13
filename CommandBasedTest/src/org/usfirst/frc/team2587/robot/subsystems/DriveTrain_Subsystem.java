package org.usfirst.frc.team2587.robot.subsystems;

import org.usfirst.frc.team2587.robot.RobotMap;
import org.usfirst.frc.team2587.robot.commands.ArcadeDrive_Command;
import org.usfirst.frc.team2587.robot.commands.TankDrive_Command;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain_Subsystem extends Subsystem {

	RobotDrive DriveTrain;
	CANTalon frontLeft,frontRight,backLeft,backRight;
	//Constructor
	public DriveTrain_Subsystem(){
		frontLeft = new CANTalon(RobotMap.leftMotorFront);
		frontRight = new CANTalon(RobotMap.rightMotorFront);
		backLeft = new CANTalon(RobotMap.leftMotorBack);
		backRight = new CANTalon(RobotMap.rightMotorBack);
		DriveTrain = new RobotDrive(frontLeft, backLeft,
				frontRight, backRight);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void initDefaultCommand() {
        setDefaultCommand(new TankDrive_Command());
    }
	
	public void arcadeDrive(double y, double x){
		//DriveTrain.arcadeDrive(x, -y);
		frontLeft.set(y + x);
		backLeft.set(y + x);
		frontRight.set(y - x);
		backRight.set(y - x);
	}
	
	public void tankDrive(double leftStickY, double rightStickY){
		DriveTrain.tankDrive(leftStickY, rightStickY);
		
	}
	
	public void stop(){
		DriveTrain.drive(0, 0);
	}
    
}

