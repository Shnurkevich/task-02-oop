package by.htp.task02.logic;

import by.htp.task02.entity.Customer;

import java.util.ArrayList;


public class CustomerLogic {


    //Метод сортирует массив обьектов Customer по именам в алфавитном порядке
    public ArrayList<Customer> sortAlphabetCustomers(ArrayList<Customer> customers){

        CustomerNameComparator comparator = new CustomerNameComparator();
        customers.sort(comparator);
        return customers;

    }


    //Метод ищет обьекты Customer с номером карты в интервале от a до b
    public ArrayList<Customer> sortCreditCardNum(ArrayList<Customer> customers, int intervalA, int intervalB){

        ArrayList<Customer> sortedByCreditCard = new ArrayList<>();

        for (Customer customer : customers){
            if(customer.getCreditCard() > intervalA && customer.getCreditCard() < intervalB){
                sortedByCreditCard.add(customer);
            }
        }
        return sortedByCreditCard;
    }


}
