import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private double quantity;

    public CrispyFlour() {

    }

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        double result = quantity * getCost();
        return result;
    }

    public LocalDate getExpiryDate() {
        LocalDate expiry = getManufacturingDate().plusYears(1);
        return expiry;
    }

//    public double getRealMoney() {
//        LocalDate expiriday = getExpiryDate();
//        LocalDate today = LocalDate.now();
//        LocalDate disCount40 = getExpiryDate().minusMonths(2);
//        LocalDate disCount20 = getExpiryDate().minusMonths(4);
//
//        double realMoney;
//
//        if (today.isBefore(expiriday)) {
//            if (today.isAfter(disCount20)) {
//                if (today.isAfter(disCount40)) {
//                    realMoney = getAmount() - (getAmount() * 40) / 100;
//                    return realMoney;
//                } else {
//                    realMoney = getAmount() - (getAmount() * 20) / 100;
//                    return realMoney;
//                }
//            } else {
//                realMoney = getAmount() - (getAmount() * 5) / 100;
//                return realMoney;
//            }
//        }
//        else {
//            System.out.println("Out of Expiry");
//            return realMoney = 0;
//        }
//    }

    public double getRealMoney() {
        LocalDate today = LocalDate.now();
        LocalDate expiry = getExpiryDate();
        double realMoney = 0;
        if(today.plusMonths(2).isAfter(expiry) || today.plusMonths(2).isEqual(expiry)) {
            realMoney = getAmount() - getAmount()/100*40;
        } else if (today.plusMonths(4).isAfter(expiry) || today.plusMonths(4).isEqual(expiry) && today.plusMonths(2).isBefore(expiry) ) {
            realMoney = getAmount() - getAmount()/100*20;
        } else if (today.plusMonths(4).isBefore(expiry)) {
            realMoney = getAmount() - getAmount()/100*5;
        }
        return realMoney;
    }

    @Override
    public String toString() {
        return "CrispyFlour{" + super.toString() +
                "quantity=" + quantity +
                "} "  ;
    }
}
