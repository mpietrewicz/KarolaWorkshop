package zad1;

/**
 * Created by Marek on 2017-03-18.
 */
public class BankCustomer {

//    private String name; // do usunięcie - nie wykorzystujesz
    public Account konto;
    public Person klient;

    BankCustomer (Person klient) {
//        this.name = klient.name; // trochę to bez sensu po co powielać imie klienta?
        this.klient = klient; // lepiej zapisać obiekt klient ;)
        this.konto = new Account(); // tworząc klienta zakladamy od razu jemu konto
    }

    public Account getAccount() {
        return konto; // zwracasz coś pustego - coś co zadeklarowałaś ale go nie wypełniłaś
    }

    void show () {
        System.out.println("Klient: " + klient.name + " stan konta " + " " + konto.stan() + ".");
    }
}
