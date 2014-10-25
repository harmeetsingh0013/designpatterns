/**
 * 
 */
package com.harmeetsingh13.builder.impl;

import com.harmeetsingh13.builder.RobotBuilder;
import com.harmeetsingh13.products.FamilyRobot;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class FamilyRobotBuilder implements RobotBuilder{
	
	private FamilyRobot familyRobot = null;
	
	@Override
	public void createRobotStructure() {
		familyRobot = new FamilyRobot();
	}
	
	@Override
	public void initializeRobotProperties() {
		familyRobot.setName("James");
		familyRobot.setPlaying(true);
		familyRobot.setBody(true);
		familyRobot.setPlaying(true);
	}

	public FamilyRobot getFamilyRobot(){
		return familyRobot;
	}

}
