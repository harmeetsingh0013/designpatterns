/**
 * 
 */
package com.harmeetsingh13.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@ToString(callSuper=true)
public class NikeSportsShoes extends Shoes{

	@Getter @Setter
	private boolean softSole = true;
	@Getter @Setter
	private boolean airTechnology = true;
}
