/*
  Has-A relationship
  ------------------
  Polymorphism:
  --------------
  
  Why?===flexibility
  
  How?
  Types?
  
  |-Compiletime polymorphism /static polymorphism / early binding===compiler===>reference
	   |-Overloading
	   |-Method Hiding
	   
  |-Rutime polymorphism  / dynamic polymorphism / late binding===>JVM==>object
      |-Overriding
  
  
*/

class Parent
{
	void drink(){
		System.out.println("We should drink water and milk");
	}
}

class Child extends Parent
{
	void drink(){
		System.out.println("We should drink water , milk and Regular using medicine (RUM)");
	}
}
class  PolymorphismSamjho
{
	public static void main(String[] args) 
	{
		Parent  p1=new Parent();
		Child   c1=new Child();
		
		p1.drink();
		c1.drink();
	}
}
