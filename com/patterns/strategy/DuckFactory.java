package com.patterns.strategy;

public class DuckFactory {


	 public static Duck createDuck(String duckType)
	 {
		 if(duckType.equalsIgnoreCase("Mallard"))
		 {  
             return new MallardDuck();   
	     }
		 else if (duckType == "RedHead")
		 {  
             return new RedHeadDuck();   
	     }
		 else if (duckType == "Decoy")
		 {  
             return new DecoyDuck();   
	     }
		 else if (duckType == "Rubber")
		 {  
             return new RubberDuck();   
	     }
		return null;
 
		
	}

}
