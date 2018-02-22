package items;

import java.util.Date;

public class chicken extends eatable {
    public static final String NAME = "Chicken";

    public chicken(Date expDate) {
        super(NAME, 1, expDate);
    }
}
