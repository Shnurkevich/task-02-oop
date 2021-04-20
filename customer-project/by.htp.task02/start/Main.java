
package by.htp.task02.start;

import by.htp.task02.entity.BankUser;
import by.htp.task02.entity.Customer;
import by.htp.task02.logic.CustomerLogic;
import by.htp.task02.presentation.BankClientsView;

import java.util.ArrayList;


public class Main {
  
    public static void main(String[] args) {

        BankUser bankUsers = new BankUser();
        BankClientsView view = new BankClientsView();
        CustomerLogic logic = new CustomerLogic();

        //Вывод клиентов банка типа Customer в алфавитном порядке
        ArrayList<Customer> list1;
        list1 = logic.sortAlphabetCustomers(bankUsers.getBankClients());
        view.bankClientsView(list1);

        //Вывод клиентов банка типа Customer с номером кредитной карты в заданном интервале
        ArrayList<Customer> list2;
        list2 = logic.sortCreditCardNum(bankUsers.getBankClients(), 100, 400);
        view.bankClientsView(list2);
      
    }
  
}
