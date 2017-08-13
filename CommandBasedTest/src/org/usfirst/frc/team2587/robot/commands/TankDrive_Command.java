package org.usfirst.frc.team2587.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2587.robot.Robot;

/**
 *
 */
public class TankDrive_Command extends Command {

    public TankDrive_Command() {
        requires(Robot.driveSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveSubsystem.tankDrive(-Robot.oi.getJoystickLY(2), Robot.oi.getJoystickRY(2));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
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
