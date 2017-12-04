package com.wbl.test;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.page.HomePage;
import com.wbl.page.LoginPage;
import com.wbl.page.RegisterPage;

public class RegisterPageTest extends BaseTest{
	
	RegisterPage rp;
	HomePage hm;
		
		@BeforeClass
		public void before(){
		    rp = new RegisterPage(driver);
		    hm.navigateToHomepage();
		    hm.clickCreateAccount();
		}
		
		@Test
		public void testLogin()
		{
			Assert.assertNotNull(rp.register("Anu", "katuri","A@b.com", "test1"));
		}


}
