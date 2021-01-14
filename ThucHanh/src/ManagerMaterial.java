import java.util.ArrayList;

public class ManagerMaterial {
    ArrayList<Material> materialList = new ArrayList<>();
    private Material material;

    public void add(Material material) {
        materialList.add(material);
    }

    public void show() {
        if (material instanceof CrispyFlour) {
            System.out.println(material.toString());
        } else if (material instanceof Meat) {
            System.out.println(material.toString());
        }
    }

    public ArrayList<Material> billCrispyFlour(Material crispyFlour) {
            crispyFlour.getAmount();
        return materialList;
    }

    public void billMeat(Material meat){
        meat.getAmount();
    }
}
