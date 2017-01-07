package com.spring.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by czecht on 2017-01-06.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

	@Autowired
	private CompactDisc compactDisc;

	@Autowired
	private MediaPlayer cdPlayer;

	@Test
	public void compactDiscShouldNotBeNull(){
		assertNotNull(compactDisc);
		compactDisc.play();
	}

	@Test
	public void shouldPlayMediaPlayer(){
		assertNotNull(cdPlayer);
		cdPlayer.play();
	}
}
