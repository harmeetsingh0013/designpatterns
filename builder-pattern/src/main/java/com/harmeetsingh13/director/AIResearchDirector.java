/**
 * 
 */
package com.harmeetsingh13.director;

import com.harmeetsingh13.builder.RobotBuilder;
import com.harmeetsingh13.builder.impl.ArmyRobotBuilder;
import com.harmeetsingh13.builder.impl.FamilyRobotBuilder;
import com.harmeetsingh13.builder.impl.WorkRobotBuilder;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class AIResearchDirector {

	public RobotBuilder selectRobotBuilderByType(String robotType) {
		switch (robotType) {
		case "FAMILY":
			return new FamilyRobotBuilder();
		case "ARMY":
			return new ArmyRobotBuilder();
		case "WORK":
			return new WorkRobotBuilder();
		default:
			return null;
		}
	}
}
