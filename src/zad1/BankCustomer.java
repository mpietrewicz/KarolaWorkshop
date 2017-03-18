package zad1;

/**
 * Created by Marek on 2017-03-18.
 */
public class BankCustomer {

    private String name;
    private Account konto;

    BankCustomer (Person klient) {
        this.name = klient.name;
    }

    public Account getAccount() {
        return konto;
    }

    void show () {
        System.out.println("Klient: " + name + " stan konta " + " " + konto.stan() + ".");
    }
}
