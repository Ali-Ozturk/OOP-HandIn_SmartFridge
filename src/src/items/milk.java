package items;

import java.util.Date;

public class milk extends drinkable {
    public static final String NAME = "Milk";

    public milk(Date expDate) {
        super(NAME, 1, expDate);
    }
}