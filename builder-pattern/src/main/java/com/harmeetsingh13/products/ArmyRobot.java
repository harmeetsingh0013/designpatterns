/**
 * 
 */
package com.harmeetsingh13.products;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@ToString
public class ArmyRobot {

	@Getter @Setter
	private long id;
	@Getter @Setter
	private boolean traning;
	@Getter @Setter
	private boolean fight;
	@Getter @Setter
	private boolean ammunation;
}
