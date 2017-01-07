package com.spring.di;

import org.springframework.stereotype.Component;

/**
 * Created by czecht on 2017-01-06.
 */
//@Component
public class SgtPeppers implements CompactDisc {

	@Override
	public void play() {
		System.out.println("Gram SgtPeppers");
	}
}
