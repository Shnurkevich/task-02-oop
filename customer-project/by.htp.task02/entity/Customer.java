package by.htp.task02.entity;

import java.util.Objects;

public class Customer {

    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int creditCard;
    private int bankAccount;

    
    public Customer(int id, String name, String surname, String patronymic, int creditCard, int bankAccount) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.creditCard = creditCard;
        this.bankAccount = bankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return id == customer.id && creditCard == customer.creditCard && bankAccount == customer.bankAccount &&
                Objects.equals(name, customer.name) && Objects.equals(surname, customer.surname) &&
                    Objects.equals(patronymic, customer.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, patronymic, creditCard, bankAccount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", creditCard=" + creditCard +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
