import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ManagerMaterial managerMaterial = new ManagerMaterial();

        Material crispyFlour0 = new CrispyFlour("1", "Bột chiên 1", LocalDate.parse("2021-11-11"), 10000, 3);
        Material crispyFlour1 = new CrispyFlour("2", "Bột chiên 2", LocalDate.parse("2021-01-22"), 20000, 3);
        Material crispyFlour2 = new CrispyFlour("3", "Bột chiên 3", LocalDate.parse("2020-12-12"), 30000, 3);
        Material crispyFlour3 = new CrispyFlour("4", "Bột chiên 4", LocalDate.parse("2021-11-11"), 40000, 3);
        Material crispyFlour4 = new CrispyFlour("5", "Bột chiên 5", LocalDate.parse("2021-01-01"), 50000, 3);

        Material meat1 = new Meat("1", "Thịt 1", LocalDate.parse("2020-01-12"), 10000, 10);
        Material meat2 = new Meat("2", "Thịt 2", LocalDate.parse("2020-12-12"), 20000, 10);
        Material meat3 = new Meat("3", "Thịt 3", LocalDate.parse("2020-10-12"), 30000, 10);
        Material meat4 = new Meat("4", "Thịt 4", LocalDate.parse("2020-05-12"), 40000, 10);
        Material meat5 = new Meat("5", "Thịt 5", LocalDate.parse("2020-03-12"), 50000, 10);

        managerMaterial.add(crispyFlour0);
        managerMaterial.add(crispyFlour1);
        managerMaterial.add(crispyFlour2);
        managerMaterial.add(crispyFlour3);
        managerMaterial.add(crispyFlour4);
        managerMaterial.add(meat1);
        managerMaterial.add(meat2);
        managerMaterial.add(meat3);
        managerMaterial.add(meat4);
        managerMaterial.add(meat5);
        managerMaterial.show();
        System.out.println(managerMaterial.billCrispyFlour(crispyFlour0));
    }
}
