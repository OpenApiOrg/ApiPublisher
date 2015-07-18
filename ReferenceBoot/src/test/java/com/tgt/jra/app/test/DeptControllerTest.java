package com.tgt.jra.app.test;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.tcs.opi.app.ReferenceApp;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ReferenceApp.class)
//@ContextConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class DeptControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    
	private DefaultMockMvcBuilder mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext);
	}

	@Test
	public void testGetDept() throws Exception {
		mvc.build().perform(MockMvcRequestBuilders.get("/api/depts/dept").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Here are your depts!")));
	}
	
}
