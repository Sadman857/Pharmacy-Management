package Entity;

public class Tablet extends Medicine {
    private int stripSize; // number per strip

    public Tablet() {
        super();
        System.out.println("E-Tablet");
    }

    public Tablet(String id, String name, double price, double quantity, String expiryDate, int stripSize) {
        super(id, name, price, quantity, expiryDate);
        System.out.println("P-Tablet");
        setStripSize(stripSize);
    }

    public void setStripSize(int stripSize) {
        if (stripSize > 0) {
            this.stripSize = stripSize;
        } else {
            System.out.println("Invalid Strip Size");
        }
    }
    public int getStripSize() { 
        return stripSize; 
    }

  
    public void displayDetails() {
        System.out.println("---------------");
        System.out.println("Tablet Id: " + getId());
        System.out.println("Name     : " + getName());
        System.out.println("Price    : " + getPrice());
        System.out.println("Quantity : " + getQuantity());
        System.out.println("Expiry   : " + getExpiryDate());
        System.out.println("Strip Size: " + stripSize);
        System.out.println("---------------");
    }
     

    public String toFileString() {
       
        return getId() + "," + getName()+ "," + getPrice() + "," + getQuantity() + "," + getExpiryDate()+ ",Tablet," + getStripSize();
    }


    
  
    public String toString() {
        return "Tablet[" +
                "Id=" + getId() +
                ", Name=" + getName() +
                ", Price=" + getPrice() +
                ", Quantity=" + getQuantity() +
                ", Expiry=" + getExpiryDate() +
                ", StripSize=" + stripSize +
                "]";
    }
}