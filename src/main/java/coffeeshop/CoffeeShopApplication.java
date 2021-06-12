package coffeeshop;

import coffeeshop.abstracts.BaseCustomerManager;
import coffeeshop.adapters.MernisServiceAdapter;
import coffeeshop.concrete.StarbucksCustomerManager;
import coffeeshop.entities.Customer;
import java.time.LocalDate;

public class CoffeeShopApplication {

    public static void main(String[] args) {

       /* BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(new Customer(1, "Elif", "Karaca", LocalDate.of(1997,1,27), "12312312312"));
*/
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1, "Elif Nur", "Karaca", LocalDate.of(1997,1,27), "111111111"));

    }

}
