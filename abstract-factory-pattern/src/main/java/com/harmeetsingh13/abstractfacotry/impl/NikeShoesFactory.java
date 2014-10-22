/**
 * 
 */
package com.harmeetsingh13.abstractfacotry.impl;

import com.harmeetsingh13.abstractfacotry.ShoesFactory;
import com.harmeetsingh13.entity.Floaters;
import com.harmeetsingh13.entity.NikeFloaters;
import com.harmeetsingh13.entity.NikeSportsShoes;
import com.harmeetsingh13.entity.Shoes;

/**
 * @author Harmeet Singh(Taara)
 *
 */
public class NikeShoesFactory implements ShoesFactory{

	@Override
	public Shoes getSportsShoes() {
		return new NikeSportsShoes();
	}

	@Override
	public Floaters getFloaters() {
		return new NikeFloaters();
	}
}
