class Demo2
{
	 int  a=10;
	
	void method1(){
		a++;
		System.out.println("value of a="+a);
	}
}
class Exam2 
{
	public static void main(String[] args) 
	{
		Demo2  d1=new Demo2();
		Demo2  d2=new Demo2();
		Demo2  d3=new Demo2();
		d1.method1();
		d1.method1();
		d3.method1();
		d2.method1();
	}
}
