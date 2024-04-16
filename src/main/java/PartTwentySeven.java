//Encapsulation
class Hair{
    public static final double pricePerBundle=80.00;
    private String typeOfHair;

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    private int qty;

    public double getPricePerBundle (int qty){
        this.qty=qty;
double price=qty*pricePerBundle;
        return price;
    }
    public String getTypeOfHair() {
        return typeOfHair;
    }

    public void setTypeOfHair(String typeOfHair) {
        this.typeOfHair = typeOfHair;
    }

}
public class PartTwentySeven {
    public static void main(String[] args) {
Hair order1= new Hair();
order1.setTypeOfHair("Curly");
order1.setQty(4);
System.out.println(order1.getPricePerBundle(4));

    }
}
