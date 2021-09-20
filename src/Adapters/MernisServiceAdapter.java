package Adapters;

import java.rmi.RemoteException;

import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

	// KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

	KPSPublicSoap kpsPublic;

	// KPSPublicSoapProxy enjekte edilecek
	public MernisServiceAdapter(KPSPublicSoap kpsPublic) {
		this.kpsPublic = kpsPublic;
	}

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),
				customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth);
		if (result == true) {
			System.out.println("Basarili");
			return true;

		} else {
			System.out.println("Basarisiz");
			return false;
		}
	}

}
