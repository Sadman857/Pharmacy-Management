package Entity;

public class Syrup extends Medicine {
    private double volume; // in milliliters (ml)

    public Syrup() {
        super();
        System.out.println("E-Syrup");
    }

    public Syrup(String id, String name, double price, double quantity, String expiryDate, double volume) {
        super(id, name, price, quantity, expiryDate);
        System.out.println("P-Syrup");
        setVolume(volume);
    }

    public void setVolume(double volume) {
        if (volume > 0) {
            this.volume = volume;
        } else {
            System.out.println("Invalid volume");
        }
    }

    public double getVolume() {
        return volume;
    }

    
    public void displayDetails() {
        System.out.println("---------------");
        System.out.println("Syrup Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Expiry Date: " + getExpiryDate());
        System.out.println("Volume: " + volume + " ml");
          System.out.println("----------------");
    }


 public String toFileString() {
  
        return getId() + "," + getName()+ "," + getPrice() + "," + getQuantity() + "," + getExpiryDate()+ ",Syrup," + getVolume();
    }

    
    public String toString() {
        return "Syrup[" +
                "Id=" + getId() +
                ", Name=" + getName() +
                ", Price=" + getPrice() +
                ", Quantity=" + getQuantity() +
                ", Expiry=" + getExpiryDate() +
                ", Volume=" + volume + " ml" +
                "]";
    }
}