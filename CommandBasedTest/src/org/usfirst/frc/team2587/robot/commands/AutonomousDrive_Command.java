package org.usfirst.frc.team2587.robot.commands;

import org.usfirst.frc.team2587.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutonomousDrive_Command extends Command {

	private double speedLeft;
	private double speedRight;
	private int time;
	private long endTime;
	private boolean fin = true;
	
    public AutonomousDrive_Command(double speedLeft, double speedRight, int time) {
    	requires(Robot.driveSubsystem);
    	this.speedLeft = speedLeft;
    	this.speedRight = speedRight;
    	this.time = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	endTime = System.currentTimeMillis() + time;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	for (long i = endTime; i >= System.currentTimeMillis();){
    		Robot.driveSubsystem.tankDrive(-speedLeft, speedRight);
    	}
    	fin = false;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return fin;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveSubsystem.tankDrive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
