import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat(){};

    public Meat(double weight){
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAmount(){
        double result = getCost() * weight;
        return result;
    }

    public LocalDate getExpiryDate(){
        LocalDate expiry = getManufacturingDate().plusDays(7);
        return expiry;
    }

    public double getRealMoney(){
        double expiryMeat;
        LocalDate expiriday = getExpiryDate();
        LocalDate discountMeat30 = getExpiryDate().minusDays(5);
        LocalDate today = LocalDate.now();

        if (today.isBefore(expiriday)){
            if (today.isAfter(discountMeat30)){
                expiryMeat = getAmount() - (getAmount()*30)/100;
                return expiryMeat;
            } else {
                 expiryMeat= getAmount() - (getAmount()*10)/100;
                return expiryMeat;
            }
        } else {
            System.out.println("OUT OF EXPIRY");
            return expiryMeat = 0;
        }


    }

    @Override
    public String toString() {
        return "Meat{" +super.toString() +
                " ,weight=" + weight +
                "} " ;
    }

}
