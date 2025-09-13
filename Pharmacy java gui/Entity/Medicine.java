package Entity;

public abstract class Medicine{
private String id ;
private String name;
private double price;
private double quantity;
private String expiryDate;

public Medicine(){
    System.out.println("E-Medicine");
}
public Medicine (String id,String name,double price,double quantity, String expiryDate){
        System.out.println("P-Medicine");
        setId(id);
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        setExpiryDate(expiryDate);
    }
    public void setId(String id){
        if (id.length()>=4) {
            this.id=id;
            }
        else{
            System.out.println("Invalid Medicine ID");
        }
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        if (!name.isEmpty()) {
            this .name = name;
        } else {
            System.out.println("Invalid Name");
        }
    }
    public String getName(){
        return name;
    }
    public void setPrice(double price){
        if (price >=0) {
            this.price =price;
        } else {
            System.out.println("Invalid Price");
        }

    }
     public double  getPrice(){
        return price;
     }
       public void setQuantity(double quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public double getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity += quantity;
        }
    }

    public void sellQuantity(int quantity) {
        if (quantity > 0 && quantity <= this.quantity) {
            this.quantity -= quantity;
        }
    }
   public void setExpiryDate(String expiryDate){
    if (!expiryDate.isEmpty()) {
        this.expiryDate=expiryDate;
    } else {
        System.out.println("Invalid ExpiryDate");
    }
   }
public String getExpiryDate(){
    return expiryDate;
}
public abstract void displayDetails();
public abstract String toString();
public abstract String toFileString();
}