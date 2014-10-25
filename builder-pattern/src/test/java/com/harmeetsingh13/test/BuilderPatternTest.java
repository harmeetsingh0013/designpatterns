package com.harmeetsingh13.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.harmeetsingh13.builder.RobotBuilder;
import com.harmeetsingh13.builder.impl.ArmyRobotBuilder;
import com.harmeetsingh13.builder.impl.FamilyRobotBuilder;
import com.harmeetsingh13.builder.impl.WorkRobotBuilder;
import com.harmeetsingh13.director.AIResearchDirector;
import com.harmeetsingh13.products.ArmyRobot;
import com.harmeetsingh13.products.FamilyRobot;
import com.harmeetsingh13.products.WorkRobot;
import com.harmeetsingh13.utils.CommonEnums;

public class BuilderPatternTest {

	@Test
	public void armyRobotTest() {
		AIResearchDirector director = new AIResearchDirector();
		RobotBuilder builder = director.selectRobotBuilderByType(CommonEnums.ROBOT_TYPE.ARMY.getRobotType());
		assertThat(builder, notNullValue());
		assertThat(builder, instanceOf(ArmyRobotBuilder.class));
		
		ArmyRobotBuilder armyRobotBuilder = (ArmyRobotBuilder) builder;
		ArmyRobot robot = armyRobotBuilder.getArmyRobot();
		assertThat(robot, is(nullValue()));
		
		armyRobotBuilder.createRobotStructure();
		ArmyRobot robot2 = armyRobotBuilder.getArmyRobot();
		assertThat(robot2.getId(), is(0L));
		
		armyRobotBuilder.initializeRobotProperties();
		ArmyRobot armyRobot = armyRobotBuilder.getArmyRobot();
		assertThat(armyRobot, notNullValue());
	}

	@Test
	public void workRobotTest() {
		AIResearchDirector director = new AIResearchDirector();
		RobotBuilder builder = director.selectRobotBuilderByType(CommonEnums.ROBOT_TYPE.WORK.getRobotType());
		assertThat(builder, notNullValue());
		assertThat(builder, instanceOf(WorkRobotBuilder.class));
		
		WorkRobotBuilder workRobotBuilder = (WorkRobotBuilder) builder;
		WorkRobot robot = workRobotBuilder.getWorkRobot();
		assertThat(robot, is(nullValue()));
		
		workRobotBuilder.createRobotStructure();
		WorkRobot robot2 = workRobotBuilder.getWorkRobot();
		assertThat(robot2.getId(), is(0L));
		
		workRobotBuilder.initializeRobotProperties();
		WorkRobot workRobot = workRobotBuilder.getWorkRobot();
		assertThat(workRobot, notNullValue());
	}
	
	@Test
	public void familyRobotTest() {
		AIResearchDirector director = new AIResearchDirector();
		RobotBuilder builder = director.selectRobotBuilderByType(CommonEnums.ROBOT_TYPE.FAMILY.getRobotType());
		assertThat(builder, notNullValue());
		assertThat(builder, instanceOf(FamilyRobotBuilder.class));
		
		FamilyRobotBuilder familyRobotBuilder = (FamilyRobotBuilder) builder;
		FamilyRobot robot = familyRobotBuilder.getFamilyRobot();
		assertThat(robot, is(nullValue()));
		
		familyRobotBuilder.createRobotStructure();
		FamilyRobot robot2 = familyRobotBuilder.getFamilyRobot();
		assertThat(robot2.getName(), is(nullValue()));
		
		familyRobotBuilder.initializeRobotProperties();
		FamilyRobot familyRobot = familyRobotBuilder.getFamilyRobot();
		assertThat(familyRobot, notNullValue());
	}
	
	@Test
	public void cookRobotTest() {
		AIResearchDirector director = new AIResearchDirector();
		RobotBuilder builder = director.selectRobotBuilderByType(CommonEnums.ROBOT_TYPE.COOK.getRobotType());
		assertThat(builder, is(nullValue()));
	}
}

