package coffeeshop.concrete;

import coffeeshop.abstracts.BaseCustomerManager;
import coffeeshop.abstracts.CustomerCheckService;
import coffeeshop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer)  {

        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        } else {
            System.out.println(customer.firstName + " : Not a valid person!");
        }
    }

}
