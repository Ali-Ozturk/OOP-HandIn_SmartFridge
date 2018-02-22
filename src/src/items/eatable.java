package items;

import java.util.Date;

public abstract class eatable implements Item {
    private String name;
    private int size; // I liter
    private Date expDate;

    public eatable(String name, int size, Date expDate) {
        this.name = name;
        this.size = size;
        this.expDate = expDate;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Date getExpDate() {
        return expDate;
    }

    public boolean isExpired(Date thisDate){
        return thisDate.after(expDate);
    }
}
