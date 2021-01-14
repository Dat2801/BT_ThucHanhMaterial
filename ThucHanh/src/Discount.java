import java.time.LocalDate;

public interface Discount {
     public static final LocalDate CURRENT_DAY = LocalDate.now();
     public abstract double getRealMoney();
}
