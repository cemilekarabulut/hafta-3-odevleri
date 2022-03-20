import java.util.ArrayList;
import java.util.Scanner;

public class Notebook {
    public static Scanner scanner = new Scanner(System.in);
    private Brand brand;
    private int id;
    private String name;
    private double unitPrice;
    private double discountRate;
    private int stock;
    private int storage;
    private double screenSize;
    private int RAM;

    public Notebook(Brand brand, int id, String name, double unitPrice, double discountRate, int stock, int storage, double screenSize, int RAM) {
        this.brand = brand;
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stock = stock;
        this.storage = storage;
        this.screenSize = screenSize;
        this.RAM = RAM;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public static void notebookProcess(ArrayList<Notebook> notebooks) {
        while (true) {

            System.out.println("Notebook İşlemleri Paneli");
            System.out.println("1 - Ürünleri listele");
            System.out.println("2 - Ürün ekle");
            System.out.println("3 - Ürün sil");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> {
                    return;
                }
                case 1 -> printNotebooks(notebooks);
                case 2 -> addNotebook(notebooks);
                case 3 -> deleteNotebook(notebooks);
            }
        }
    }

    private static void deleteNotebook(ArrayList<Notebook> notebooks) {
        System.out.print("Silmek istediğiniz notebook'un id'sini giriniz: ");
        int choice = scanner.nextInt();
        if (choice < notebooks.size()) {
            System.out.println("Yanlış id girdiniz!");
        } else {
            notebooks.remove(choice - 1);
        }
    }

    private static void addNotebook(ArrayList<Notebook> notebooks) {
        System.out.println("Notebook özelliklerini giriniz.");
        System.out.print("Ürün Adı: ");
        String name = scanner.nextLine();
        System.out.print("Birim Fiyatı: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("İndirim Oranı: ");
        double discountRate = scanner.nextDouble();
        System.out.print("Stok: ");
        int stock = scanner.nextInt();
        System.out.print("Depolama: ");
        int storage = scanner.nextInt();
        System.out.print("Ekran Boyutu: ");
        double screenSize = scanner.nextDouble();
        System.out.print("RAM: ");
        int RAM = scanner.nextInt();
        System.out.println("Aşağıdaki markalardan birini seçiniz(1-9): ");
        Brand.printBrands();
        System.out.print("Tercihiniz: ");
        int brandChoice = scanner.nextInt();
        Brand brand = Brand.getBrandById(brandChoice);
        notebooks.add(new Notebook(brand, notebooks.size() + 1, name, unitPrice, discountRate, stock, storage, screenSize, RAM));
    }

    private static void printNotebooks(ArrayList<Notebook> notebooks) {
        System.out.println("Notebook Listesi");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat      | Marka     | Depolama  | Ekran Boyutu | RAM        |");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for (Notebook n : notebooks) {
            System.out.printf("| %-2s | %-30s| %-7s TL | %-10s| %-10s| %-12s | %-10s |\n",
                    n.getId(), n.getName(), n.getUnitPrice(), n.getBrand().getName(),
                    n.getStorage(), n.getScreenSize(), n.getRAM());
        }
    }
}
