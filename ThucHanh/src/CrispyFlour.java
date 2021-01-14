import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    private int quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return getQuantity() * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        if (getManufacturingDate().equals(CURRENT_DAY.plusMonths(4))) {
            return getQuantity() * getCost() * 0.05 * 0.2;
        }else if (getManufacturingDate().equals(CURRENT_DAY.plusMonths(2))){
            return getQuantity() * getCost() * 0.05 * 0.4;
        }
        return 0;
    }

    @Override
    public String toString() {
        return
                "CrispyFlour: " + super.toString() +
                "quantity=" + quantity +
                '}';
    }
}
