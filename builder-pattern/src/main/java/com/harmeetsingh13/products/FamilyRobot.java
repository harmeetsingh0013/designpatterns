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
public class FamilyRobot {
	
	@Getter @Setter
	private String name;
	@Getter @Setter
	private boolean body;
	@Getter @Setter
	private boolean washing;
	@Getter @Setter
	private boolean playing;
}
