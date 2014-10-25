/**
 * 
 */
package com.harmeetsingh13.utils;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class CommonEnums {

	public enum ROBOT_TYPE{
		FAMILY("FAMILY"), ARMY("ARMY"), WORK("WORK"), COOK("COOK");
		
		private String robotType;
		private ROBOT_TYPE(String robotType) {
			this.robotType = robotType;
		}
		
		public String getRobotType() {
			return robotType;
		}
	}
}
