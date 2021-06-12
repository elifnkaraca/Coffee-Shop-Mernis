package coffeeshop.abstracts;

import coffeeshop.entities.Customer;

public interface CustomerCheckService {

    boolean checkIfRealPerson(Customer customer);

}
