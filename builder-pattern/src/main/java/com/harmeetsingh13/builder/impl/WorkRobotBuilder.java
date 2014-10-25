/**
 * 
 */
package com.harmeetsingh13.builder.impl;

import com.harmeetsingh13.builder.RobotBuilder;
import com.harmeetsingh13.products.WorkRobot;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class WorkRobotBuilder implements RobotBuilder{

	private WorkRobot workRobot = null;
	
	@Override
	public void createRobotStructure() {
		workRobot = new WorkRobot();
	}

	@Override
	public void initializeRobotProperties() {
		workRobot.setId(74147);
		workRobot.setCrain(true);
		workRobot.setHeavyLoadPickup(true);
		workRobot.setHorsePower(407);
	}
	
	public WorkRobot getWorkRobot() {
		return workRobot;
	}

}
