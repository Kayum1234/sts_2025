class InvalidPinNumberException extends Exception
{
	InvalidPinNumberException(String  msg){
		super(msg);
	}
}
class OurException 
{
	public static void main(String[] args) //throws InvalidPinNumberException
	{
		try{
		  throw new InvalidPinNumberException("invalid pin");
		}
		catch(InvalidPinNumberException  e){
			System.out.println(e.getMessage());
		}
	}
}
