/*
   Object Oriented Programming System:
   -----------------------------------
   
   data hiding:
   ------------
   
   Encapsulation:
   -------------
   
   
*/

class User
{
	 private String  userName;//null==object
	 private String  password;//null
	 
	 public void setUserName(String  userName){
		this.userName=userName;
	 }
	 
	 public void setPassword(String  password){
		this.password=password;
	 }
	 
	 public String getUserName(){
		return userName;
	 }
	 
	 
	 
	 public String getPassword(){
		 boolean  flag= CheckUser.verifyUserName(userName);
		 if (flag==true)
		 {
			 return password;
		 }
		 else{
			return "inavlid";
		 }
		
	 }
	 
	 void  getUserData(){
		System.out.println("user name ::"+userName +" password ::"+password);
	 }
}

class CheckUser
{
	public static boolean verifyUserName(String userName){
		if (userName.equals("John"))
		{
			return true;
		}
		else if (userName.equals("Raja"))
		{
			return true;
		}
		else{
		  return false;
		}
	}
}

class Employee
{
	void login(User  user){
		String val=user.getPassword();
		if (val=="inavlid")
		{
			System.out.println("invalid user , you cant login");
		}
		else{
		   if (user.getUserName()=="John" && val=="12345")
		    {
			System.out.println("you have logged in successfully");
		    }
		  else{
			System.out.println("Invalid user id and password");
		   }
	   }
	}
}

class DataHidingDemo1
{
	public static void main(String[]  args){
		
		User  user1=new User();
		user1.setUserName("John");
		user1.setPassword("12345");
		user1.getUserData();
		
		Employee e1=new Employee();
		e1.login(user1);
	}
}