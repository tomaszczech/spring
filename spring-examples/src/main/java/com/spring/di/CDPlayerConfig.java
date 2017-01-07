package com.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan
public class CDPlayerConfig {

	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}

	@Bean
	public MediaPlayer cdPlayer(CompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}

	@Bean
	public MediaPlayer anotherCdPlayer(CompactDisc compactDisc){
		return new CDPlayer((compactDisc));
	}
}
