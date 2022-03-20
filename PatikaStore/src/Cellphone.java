import java.util.ArrayList;
import java.util.Scanner;

public class Cellphone {
    public static Scanner scanner = new Scanner(System.in);
    private Brand brand;
    private int id;
    private String name;
    private double unitPrice;
    private double discountRate;
    private int stock;
    private int storage;
    private double screenSize;
    private int battery;
    private int RAM;
    private String color;

    public Cellphone(Brand brand, int id, String name, double unitPrice, double discountRate, int stock, int storage, double screenSize, int battery, int RAM, String color) {
        this.brand = brand;
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stock = stock;
        this.storage = storage;
        this.screenSize = screenSize;
        this.battery = battery;
        this.RAM = RAM;
        this.color = color;
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

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void cellphoneProcess(ArrayList<Cellphone> cellphones) {
        while (true) {

            System.out.println("Cep Telefonu İşlemleri Paneli");
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
                case 1 -> printCellphones(cellphones);
                case 2 -> addCellphone(cellphones);
                case 3 -> deleteCellphone(cellphones);
            }
        }
    }

    private static void deleteCellphone(ArrayList<Cellphone> cellphones) {
        System.out.print("Silmek istediğiniz telefonun id'sini giriniz: ");
        int choice = scanner.nextInt();
        if (choice < cellphones.size()) {
            System.out.println("Yanlış id girdiniz!");
        } else {
            cellphones.remove(choice - 1);
        }
    }

    private static void addCellphone(ArrayList<Cellphone> cellphones) {
        System.out.println("Telefon özelliklerini giriniz.");
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
        System.out.print("Pil Gücü: ");
        int battery = scanner.nextInt();
        System.out.print("RAM: ");
        int RAM = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Renk: ");
        String color = scanner.nextLine();
        System.out.println("Aşağıdaki markalardan birini seçiniz(1-9): ");
        Brand.printBrands();
        System.out.print("Tercihiniz: ");
        int brandChoice = scanner.nextInt();
        Brand brand = Brand.getBrandById(brandChoice);
        cellphones.add(new Cellphone(brand, cellphones.size() + 1, name, unitPrice, discountRate, stock, storage, screenSize, battery, RAM, color));
    }

    private static void printCellphones(ArrayList<Cellphone> cellphones) {
        System.out.println("Cep Telefonu Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat    | Marka     | Depolama  | Ekran Boyutu  | Stok    | Pil       | RAM       | Renk     |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (Cellphone c : cellphones) {
            System.out.printf("| %-2s | %-30s| %-5s TL | %-10s| %-10s| %-13s | %-7s | %-9s | %-9s | %-8s |\n",
                    c.getId(), c.getName(), c.getUnitPrice(), c.getBrand().getName(),
                    c.getStorage(), c.getScreenSize(), c.getStock(), c.getBattery(), c.getRAM(), c.getColor());
        }
    }
}
