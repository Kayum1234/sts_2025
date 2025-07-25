package com.dams.app;
import com.dams.vehicle.*;
import com.dams.factory.VehicleFactory;
class AbstractioApp 
{
	public static void main(String[] args) 
	{
		Vehicle  obj=VehicleFactory.getVehicleObject(args[0]);
		
		try{
		obj.getTotalNumberOfWheels();
		obj.getTotalNumberOfAirBags();
		obj.tankCapacity();
		}catch(NullPointerException e){
			System.out.println(args[0] +" this type of object is not available in our factory");
		}
		
	}
}
/*
   Abstraction:-  
   
   hide the internal implementations and just high light the set of services.
*/