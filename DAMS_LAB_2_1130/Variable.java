/*
   class ClassName{
       
	   //data==========?
	   //methods=======?
   
   }
   
   data=
   
   datatype  dataName;
   
   datatype  dataName=value;
   
   datatype variableName;
   
   ================================
   
   variable:===?
   
   Why?
   Type of variable
   ----------------
   
   Primitive------byte , short , int , long , float , double , boolean , char
   
   Non primitive  Student , Customer , Test ,  int[]  , String , String[] 
   
   long accountNumber;
   String bankName;
   String customerNamel
   double balance;
   long tollFreeNumber;
   int  pinNumber;
   
   
   
   ====================
   purpose and position:
   ----------------------
   static
   non static (instance)
   local
   
   --------------------------------------
   
   problem????
   
   
   
*/







class Employee
{
	static int  employeeId;
	static String employeeName;
	static String companyName;
}
class Variable
{

	public static void main(String[]  args){
		Employee  e1=new Employee();
		Employee  e2=new Employee();
		Employee  e3=new Employee();
		
		e1.employeeId=101;
		e1.employeeName="Raja";
		e1.companyName="TCS";
		
		System.out.println("Employee e1 data");
		System.out.println("id="+e1.employeeId);
		System.out.println("name="+e1.employeeName);
		System.out.println("company name="+e1.companyName);
		
		System.out.println("Employee e2 data");
		System.out.println("id="+e2.employeeId);
		System.out.println("name="+e2.employeeName);
		System.out.println("company name="+e2.companyName);
		
		System.out.println("Employee e3 data");
		System.out.println("id="+e3.employeeId);
		System.out.println("name="+e3.employeeName);
		System.out.println("company name="+e3.companyName);
		 
	}
	
}