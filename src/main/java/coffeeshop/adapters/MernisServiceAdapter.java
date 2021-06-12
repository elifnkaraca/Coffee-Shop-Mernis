package coffeeshop.adapters;

import coffeeshop.abstracts.CustomerCheckService;
import coffeeshop.entities.Customer;
import mernis.JNRKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {

        JNRKPSPublicSoap publicSoap = new JNRKPSPublicSoap();
        try {
            return publicSoap.TCKimlikNoDogrula(Long.valueOf(customer.nationalityId), customer.firstName.toUpperCase(),
                    customer.lastName.toUpperCase(), customer.dateOfBirth.getDayOfYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
