package Business;

import java.rmi.RemoteException;

import Adapters.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " kiþisi veritabanýna kaydedildi!");
		}
		else {
			System.out.println();
		}
		

	}

}
