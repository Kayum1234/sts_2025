/*
   Overriding:
   -----------
   public>protected>default>private
   
*/
class Parent
{
	 static void drink(){
		System.out.println("We should drink water and milk");
	  }
}

class Child1 extends Parent
{
	static void drink(){
		System.out.println("We should drink water , milk and cold drink" );
	 }
	
}

class Child2 extends Parent
{
	 static void drink(){
		System.out.println("We should drink water , milk and RUM" );
	 }
	
}

class  OverDemo1
{
	public static void main(String[] args) 
	{
		Parent p1=null;
		
		if (args[0].equals("1"))
		{
			p1=new Child1();
		}
		else if (args[0].equals("2"))
		{
			p1=new Child2();
		}
		else{
			p1=null;
		}
		p1.drink();
	}
}
