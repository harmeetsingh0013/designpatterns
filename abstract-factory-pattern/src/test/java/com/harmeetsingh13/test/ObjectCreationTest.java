package com.harmeetsingh13.test;

/** 
 * One can discuss which one of those is easier to read, but once the assert fails, you'll get a good error message from assertThat, 
 * but only a very minimal amount of information from assertTrue. 
 * assertThat will tell you what the assertion was and what you got instead. 
 * assertTrue will only tell you that you got false where you expected true.
 * http://www.objectpartners.com/2013/09/18/the-benefits-of-using-assertthat-over-other-assert-methods-in-unit-tests/
 * http://stackoverflow.com/questions/1701113/why-should-i-use-hamcrest-matcher-and-assertthat-instead-of-traditional-assert
 * */

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import com.harmeetsingh13.abstractfacotry.ShoesFactory;
import com.harmeetsingh13.abstractfacotry.impl.NikeShoesFactory;
import com.harmeetsingh13.abstractfacotry.impl.PumaShoesFactory;
import com.harmeetsingh13.entity.Floaters;
import com.harmeetsingh13.entity.NikeFloaters;
import com.harmeetsingh13.entity.NikeSportsShoes;
import com.harmeetsingh13.entity.PumaFloaters;
import com.harmeetsingh13.entity.PumaSportsShoes;
import com.harmeetsingh13.entity.Shoes;
import com.harmeetsingh13.utility.CommonEnums;

public class ObjectCreationTest {

	@Test
	public void nikeFactoryTest() {
		ShoesFactory factory = ShoesFactory.createShoesFacotry(CommonEnums.BRANDS.NIKE.getBrand());
		assertNotNull(factory);
		assertThat(factory, notNullValue());
		
		assertTrue(factory instanceof NikeShoesFactory);
		assertThat(factory, instanceOf(NikeShoesFactory.class));
		
		assertFalse(factory instanceof PumaShoesFactory);
		assertThat(factory, not(instanceOf(PumaShoesFactory.class)));
		
		Shoes shoes = factory.getSportsShoes();
		assertNotNull(shoes);
		assertThat(shoes, notNullValue());
		
		assertTrue(shoes instanceof NikeSportsShoes);
		assertThat(shoes, instanceOf(NikeSportsShoes.class));
		
		assertFalse(shoes instanceof PumaSportsShoes);
		assertThat(shoes, not(instanceOf(PumaSportsShoes.class)));
		
		Floaters floaters = factory.getFloaters();
		assertNotNull(floaters);
		assertThat(floaters, notNullValue());
		
		assertTrue(floaters instanceof NikeFloaters);
		assertThat(floaters, instanceOf(NikeFloaters.class));
		
		assertFalse(floaters instanceof PumaFloaters);
		assertThat(floaters, not(instanceOf(PumaFloaters.class)));
	}

	@Test
	public void pumaFactoryTest(){
		ShoesFactory factory = ShoesFactory.createShoesFacotry(CommonEnums.BRANDS.PUMA.getBrand());
		assertNotNull(factory);
		assertThat(factory, notNullValue());
		
		assertTrue(factory instanceof PumaShoesFactory);
		assertThat(factory, instanceOf(PumaShoesFactory.class));
		
		assertFalse(factory instanceof NikeShoesFactory);
		assertThat(factory, not(instanceOf(NikeShoesFactory.class)));
		
		Shoes shoes = factory.getSportsShoes();
		assertNotNull(shoes);
		assertThat(shoes, notNullValue());
		
		assertTrue(shoes instanceof PumaSportsShoes);
		assertThat(shoes, instanceOf(PumaSportsShoes.class));
		
		assertFalse(shoes instanceof NikeSportsShoes);
		assertThat(shoes, not(instanceOf(NikeSportsShoes.class)));
		
		Floaters floaters = factory.getFloaters();
		assertNotNull(floaters);
		assertThat(floaters, notNullValue());
		
		assertTrue(floaters instanceof PumaFloaters);
		assertThat(floaters, instanceOf(PumaFloaters.class));
		
		assertFalse(floaters instanceof NikeFloaters);
		assertThat(floaters, not(instanceOf(NikeFloaters.class)));
	}
}
