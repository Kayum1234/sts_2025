
class InheritanceDemo2 extends InheritanceDemo2
{
	
	public static void main(String[] args) 
	{
		InheritanceDemo2  obj=new InheritanceDemo2();
		InheritanceDemo2  obj1=new InheritanceDemo2();
		//int  a=obj.sum();
		//System.out.println(a);
		
		int   b=obj.hashCode();
		System.out.println(b);
		
		Class  name=obj.getClass();
		System.out.println(name);
		
		String  s=obj.toString();
		System.out.println(s);
		
		boolean  x=obj.equals(obj1);
		
		System.out.println(x);
		
	}
}
