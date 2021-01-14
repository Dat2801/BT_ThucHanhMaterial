import java.time.LocalDate;

public class Meat extends  Material implements Discount{
    private double weight;

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

    @Override
    public double getAmount() {
        return getCost() * getWeight();
    }

    @Override
    public void getExpiryDate() {
        getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        if (getManufacturingDate().equals(CURRENT_DAY.plusDays(5))){
            return getCost()  * getWeight() * 0.1 * 0.3;
        }
        if (getManufacturingDate().equals(CURRENT_DAY.plusDays(3))){
            return getCost()  * getWeight() * 0.1 * 0.5;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Meat{" + super.toString() +
                "weight=" + weight +
                '}';
    }
}
