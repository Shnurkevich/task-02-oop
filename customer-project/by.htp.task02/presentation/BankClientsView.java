package by.htp.task02.presentation;

import by.htp.task02.entity.Customer;
import java.util.ArrayList;

public class BankClientsView {

    public void bankClientsView(ArrayList<Customer> customers){

        for (Customer customer : customers){
            System.out.println(customer);
        }
    }

}
