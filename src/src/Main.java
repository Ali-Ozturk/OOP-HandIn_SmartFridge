import items.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date1 = new Date(118, 1, 20);
        milk Milk = new milk(date1);
        Date today = new Date();

        if (Milk.isExpired(today)){
            System.out.println("It is expired.");
        }
    }
}
