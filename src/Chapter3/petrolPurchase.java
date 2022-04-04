package Chapter3;
public class petrolPurchase {
    public String Location;
    public String TypeOfPetrol;
    public int quantity;
    public double PerLiter;
    public double PercentageDiscount;
    private double PurchaseAmount;


    public petrolPurchase(String Location, String TypeOfPetrol, int quantity, double perLiter, double percentageDiscount) {
       /*public void setAccout(String Location){*/

        this.Location = Location;
        this.TypeOfPetrol = TypeOfPetrol;
        this.quantity = quantity;
        this.PerLiter = perLiter;
        this.PercentageDiscount = percentageDiscount;

    }

    public String getLocation() {

        return Location;
    }

    public String getTypeOfPetrol() {
        return TypeOfPetrol;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPerLiter() {
        return PerLiter;
    }

    public double getPercentageDiscount() {
        return PercentageDiscount;
    }

    public void setPurchaseAmount(Double PurchaseAmount) {
        this.PurchaseAmount = (int) (PurchaseAmount * quantity / (PerLiter) ) ;
    }

    public double getPurchaseAmount() {
        return PurchaseAmount;
    }
}
