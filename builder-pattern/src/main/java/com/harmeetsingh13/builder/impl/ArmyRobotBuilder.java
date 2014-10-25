/**
 * 
 */
package com.harmeetsingh13.builder.impl;

import com.harmeetsingh13.builder.RobotBuilder;
import com.harmeetsingh13.products.ArmyRobot;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class ArmyRobotBuilder implements RobotBuilder{

	private ArmyRobot armyRobot = null;
	
	@Override
	public void createRobotStructure() {
		armyRobot = new ArmyRobot();
	}

	@Override
	public void initializeRobotProperties() {
		armyRobot.setId(887456);
		armyRobot.setTraning(true);
		armyRobot.setFight(true);
		armyRobot.setAmmunation(true);
	}
	
	public ArmyRobot getArmyRobot() {
		return armyRobot;
	}

}
