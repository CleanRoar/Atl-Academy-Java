package CostomerStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("Kenan", 500.0));
        list.add(new Customer("Ali", 150.0));
        list.add(new Customer("Veli", 200.0));

        Stream<Customer> test = list.stream()
                .filter(x -> x.getCustomerDebit() > 350)
                .map(x -> new Customer(x.getCustomerName(),x.getCustomerDebit()*1.5));

        List<Customer> updatedList = test.toList();
        System.out.println(updatedList);


    }
}