/*
    We can acheive poly in 2 ways:
	  |-compiletime | early binding | static poly ---compiler --->based on reference--Parent  p1
	      |-Overloading
		  |-Method Hiding
		  
	  |-runtime     | late binding  | dynamic poly --JVM     ---->based object--new Child()
	      |-Overriding
	  
	
	  
	  Overloading:
	  -------------
	  
	  In C programming Language:
	  
	  multiplyTwo(int a,int  b)
	  multiplyThree(int a,int  b,int  c)
	  
	  In Java:
	  
	  multiply(int a,int  b)
	  multiply(int a,int  b,int  c)
	  multiply(float  a,double  b)
	  
	  
	  byte-->short-->int-->long--->float--->double
	  char---------->int
*/

class Calculator
{
	
	  void multiply(int a,int  b,int  c){
		
	  }
	  double multiply(float  a,double  b){
		 return a*b;
	  }
	  
	  void sum(float  a, int  b){
		 System.out.println("float--int");
	  }
	  void sum(int  a, float  b){
		 System.out.println("int-float");
	  }
}
class  OLDemo3
{
	public static void main(String[] args) 
	{
		Calculator  c1=new Calculator();
		c1.sum(1,2.0f);
		c1.sum(1.0f,2);
		
		System.out.println("int-float");
		System.out.println(10+20);
		System.out.println(10>20);
		System.out.println(c1);
		System.out.println(10.03);
	}
}
