package zad1;

/**
 * Created by Marek on 2017-03-18.
 */
public class Account {
    private float balance; // zamiana na float
    private static double oprocentowanie;

    public Account () {
    }

    public float stan () { // zamiana na float
        return balance;
    }

    public void deposit (int wplata) {
        if(wplata < 0) {
            System.out.println("Nieprawidłowa wartość wpłaty");
        }
        else {
            balance += wplata;
        }
    }

    void withdraw (int wyplata) {
        if(wyplata < 0) {
            System.out.println("Nieprawidłowa wartość wypłaty");
        }
        else {
            if(balance >= wyplata) {
                balance -= wyplata;
            }
            else {
                System.out.println("Za mało srodkow na koncie.");
            }
        }
    }

    void transfer (Account konto1, int przelew) {
        withdraw(przelew);
        konto1.deposit(przelew);
    }

    public static void setInterestRate (double stopa) {
        oprocentowanie = stopa;
    }

    void addInterest () {
        balance = (int) (balance*(1+oprocentowanie/100));
    }
}
