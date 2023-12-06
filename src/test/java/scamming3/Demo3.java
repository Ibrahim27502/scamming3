package scamming3;

import org.testng.annotations.Test;

public class Demo3 {
	
	@Test(priority = 4)
	
 public void welcomemsg()
 {
 
 System.out.println("welcoming all");
		
		
	}

	@Test(dependsOnMethods= ("welcomemsg"))
		public void goodmorning()
		
		{
			System.out.println("good morning all");
	}
	@Test(priority = 2)
	public void whatisyourname()
	
	{
		System.out.println("my name is ibrahim");
		
	}
	@Test(priority = 1, enabled= false)
	public void whatisyourhobby()
	{
		System.out.println("my hobby is playing songs");
	}
	}

