package com.tgt.jra.app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tcs.opi.app.ReferenceApp;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReferenceApp.class)
@WebAppConfiguration
public class Demo2ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
