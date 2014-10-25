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
public class WorkRobot {

	@Getter @Setter
	private long id;
	@Getter @Setter
	private boolean crain;
	@Getter @Setter
	private boolean heavyLoadPickup;
	@Getter @Setter
	private int horsePower;
}
