/*
    Return type :
	-------------
	
	  |-void return type method
	  |-non void return type method
*/

class Customer
{
	String name;
	String address;
	long phone;
	double balance;
	
   Customer getCustomer(Customer obj){
		Customer  c3=new Customer();
		c3.name="raja";
		return c3;
	}
}

class  ReturnDemo1
{
	Customer  c2=null;
	String getCustomerName(Customer obj){
		 c2=obj;
		 return obj.name;
	}
	
	double getBalance(){
		
		return c2.balance;
	}
	
	boolean isActive(){
		
		if (getBalance()>=10000)
		{
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public static void main(String[] args) 
	{
		Customer  c1=new Customer();
		c1.name="Kayum";
		c1.phone=374637465L;
		c1.address="kanpur";
		c1.balance=50000.0;
		
		Customer  c2=c1.getCustomer(c1);
		
		ReturnDemo1 obj=new ReturnDemo1();
		String  s=obj.getCustomerName(c1);
		
		if (obj.isActive())
		{
			System.out.println(s +" your account is active");
		}
		else{
			System.out.println(s +" your account inoperative");
		}
	}
}
