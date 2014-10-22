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
public class NikeFloaters extends Floaters{

	@Getter @Setter
	private double width;
	@Getter @Setter
	private boolean lights = true;
}
