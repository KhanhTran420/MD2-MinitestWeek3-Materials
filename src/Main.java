import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Material> materials = new ArrayList<>();
        Material botChien1 = new CrispyFlour("bot01", "botChien1", LocalDate.of(2021, 2, 25), 20000, 100);
        Material botChien2 = new CrispyFlour("bot02", "botChien2", LocalDate.of(2021, 9, 29), 30000, 150);
        Material botChien3 = new CrispyFlour("bot03", "botChien3", LocalDate.of(2021, 2, 12), 10000, 140);
        Material botChien4 = new CrispyFlour("bot04", "botChien4", LocalDate.of(2020, 11, 1), 60000, 80);
        Material botChien5 = new CrispyFlour("bot05", "botChien5", LocalDate.of(2021, 4, 3), 40000, 70);

        Material thit1 = new Meat("meat01", "thit1", LocalDate.of(2021, 12, 21), 25000, 20);
        Material thit2 = new Meat("meat02", "thit2", LocalDate.of(2022, 2, 23), 15000, 100);
        Material thit3 = new Meat("meat03", "thit3", LocalDate.of(2021, 9, 1), 155000, 90);
        Material thit4 = new Meat("meat04", "thit4", LocalDate.of(2022, 10, 19), 205000, 50);
        Material thit5 = new Meat("meat05", "thit5", LocalDate.of(2021, 12, 21), 35000, 200);

        materials.add(botChien1);
        materials.add(botChien2);
        materials.add(botChien3);
        materials.add(botChien4);
        materials.add(botChien5);
        materials.add(thit1);
        materials.add(thit2);
        materials.add(thit3);
        materials.add(thit4);
        materials.add(thit5);


        int choice = -1;
        Scanner inputChoice = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả sản phẩm");
            System.out.println("2. Thêm mới sản phẩm Cripsy Flour");
            System.out.println("3. Thêm mới sản phẩm Meat");
            System.out.println("4. Xóa sản phẩm theo tên");
            System.out.println("5. Sửa sản phẩm CrispyFlour");
            System.out.println("6. Sửa sản phẩm Meat");
            System.out.println("7. Tính tiền theo tên sản phẩm nhập vào: ");
            System.out.println("0. Exit");
            choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    Methods.displayMaterials(materials);
                    break;
                case 2:
                    Methods.addProduct(materials, Methods.createNewCrispyFlour());
                    break;
                case 3:
                    Methods.addProduct(materials, Methods.createNewMeat());
                    break;
                case 4:
                    Methods.deleteProduct(materials);
                    break;
                case 5:
                    Methods.editCrispyFlour(materials);
                    break;
                case 6:
                    Methods.editMeat(materials);
                    break;
                case 7:
                    Methods.payProduct(materials);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Bạn chưa nhập lựa chọn!");
            }
        }
    }
}
