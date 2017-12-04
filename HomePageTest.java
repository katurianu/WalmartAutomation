package com.wbl.test;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.page.HomePage;

public class HomePageTest extends BaseTest {

HomePage hm;
	
	@BeforeClass
	public void before(){
	  hm = new HomePage(driver);
	}
	
	@Test
	public void testNavLinks()
	{
		Assert.assertEquals(5,hm.headerNavLinks());
	}
	
	@Test
	public void testSearchBox()
	{
		//System.out.println(hm.searchBox());
		Assert.assertEquals("hp laptop - Walmart.com",hm.searchBox());
	}
}
