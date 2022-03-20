import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cellphone> cellphones = new ArrayList<>();
        ArrayList<Notebook> notebooks = new ArrayList<>();

        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> {
                    System.out.println("Yine bekleriz!");
                    return;
                }
                case 1 ->Notebook.notebookProcess(notebooks);
                case 2 -> Cellphone.cellphoneProcess(cellphones);
                case 3 -> Brand.printBrands();
            }
        }
    }
}
