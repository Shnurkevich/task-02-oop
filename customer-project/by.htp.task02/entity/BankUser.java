package by.htp.task02.entity;

import java.util.ArrayList;
import java.util.Objects;

public class BankUser {

    ArrayList<Customer> bankClients;

    
    //В конструкторе сразу добавляем кастомеров в лист bankClients
    public BankUser(){
        bankClients = new ArrayList<>();
        bankClients.add(new Customer(1, "Alex", "Ivanov", "Vikt", 421, 12));
        bankClients.add(new Customer(2, "Pavel", "Petrov", "Andr", 876, 18));
        bankClients.add(new Customer(3, "Margarita", "Sokolova", "Serg", 383, 23));
        bankClients.add(new Customer(4, "Viktor", "Gorbunov", "Alex", 275, 33));
        bankClients.add(new Customer(5, "Kirill", "Adamov", "Evgen", 886, 44));
    }

    
    public ArrayList<Customer> getBankClients() {
        return bankClients;
    }

    public void setBankClients(ArrayList<Customer> customers) {
        this.bankClients = bankClients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankUser)) return false;
        BankUser user = (BankUser) o;
        return Objects.equals(bankClients, user.bankClients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankClients);
    }

    @Override
    public String toString() {
        return "BankUser{" +
                "bankClients=" + bankClients +
                '}';
    }
    
    
}
