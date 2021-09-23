package Business;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class BaseCustomerManager{
	
	public void save (Customer customer) throws NumberFormatException, RemoteException{
		System.out.println("Saved to db : " + customer.getFirstName());
		
	}

}
