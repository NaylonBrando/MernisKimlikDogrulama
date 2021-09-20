import java.rmi.RemoteException;

import Adapters.MernisServiceAdapter;
import Business.StarbucksCustomerManager;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
	StarbucksCustomerManager starbucksCustomerManager = 
			new StarbucksCustomerManager(new MernisServiceAdapter(new KPSPublicSoapProxy()));
	
	Customer customer1 = new Customer(1,"Ethan Rohat","Orange",1997,"666");
	
	starbucksCustomerManager.save(customer1);

	}

}
