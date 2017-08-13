package org.usfirst.frc.team2587.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ForwardHalfSpeed_Commands extends CommandGroup {

    public ForwardHalfSpeed_Commands() {
    	addSequential(new AutonomousDrive_Command(-0.6, -0.6, 3000));
    }
}
