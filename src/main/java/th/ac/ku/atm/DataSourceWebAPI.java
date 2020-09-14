package th.ac.ku.atm;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceWebAPI implements DataSource{
    @Override
    public Map<Integer, Customer> readCustomers() {
        Map<Integer,Customer> customers = new HashMap<>();

        customers.put(1, new Customer(1,"บอส",1234,1000));
        customers.put(2, new Customer(2,"เจ",2345,2000));
        customers.put(3, new Customer(3,"ปลื้ม",3456,3000));

        return customers;
    }
}
