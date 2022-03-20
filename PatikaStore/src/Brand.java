import java.util.TreeSet;

public class Brand {
    private int id;
    private String name;

    public Brand(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static TreeSet<Brand> getBrands() {
        TreeSet<Brand> brands = new TreeSet<>(new OrderBrandComparator());
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Casper"));
        brands.add(new Brand("Asus"));
        brands.add(new Brand("HP"));
        brands.add(new Brand("Xiaomi"));
        brands.add(new Brand("Monster"));
        int i = 0;
        for (Brand b : brands) {
            i++;
            b.setId(i);
        }
        return brands;
    }

    public static Brand getBrandById(int id) {
        for (Brand b : Brand.getBrands()) {
            if (id == b.getId())
                return b;
        }
        return null;
    }

    public static void printBrands() {
        System.out.println("Markalarımız");
        System.out.println("--------------");
        for (Brand b : getBrands()) {
            System.out.println("- " + b.name);
        }
    }
}
