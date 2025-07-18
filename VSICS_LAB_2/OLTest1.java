/*
  Polymorphism:
  --------------
   |-one name many forms
   |-same name different behaviour
       |-Compiletime 
	       |-Overloading
		   |-Method Hiding
	   |-Runtime 
	       |-Overriding
  
  
  Overloading:
  -------------
  In C programming:
     sum(int a, int b)
	 sum(float  a, float b)
	 this is not possible
	 
	 In Java:
	 
	 sum(int  a, int  b)
	 sum(int a)
	 sum(float  a, int  b)
	 
	 this is possible
	 overlaoding
	 
	 
	 Compiler---reference
	 
	 ------------------------------------------
*/

class Parent
{
	
}
class Child1 extends Parent
{
	
}

class OLDemo1
{
	void  sum(Parent a){
		System.out.println("Animal");
	}
	
	void  sum(Child1  d){
		System.out.println("Dog");
	}
	
}
class  OLTest1
{
	public static void main(String[] args) 
	{
		OLDemo1  obj1=new OLDemo1();
		Parent   p1=new Child1();
		obj1.sum(p1);
	}
}
