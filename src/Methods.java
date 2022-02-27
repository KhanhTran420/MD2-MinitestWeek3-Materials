import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

        public static void displayMaterials(ArrayList<Material> arr) {
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }
        }

        public static void addProduct(ArrayList<Material> arr, Material element) {
            arr.add(element);
        }

    public static CrispyFlour createNewCrispyFlour() {
        Scanner inputIDFlour = new Scanner(System.in);
        System.out.println("Nhập ID của sản phẩm");
        String id = inputIDFlour.nextLine();

        Scanner inputNameFlour = new Scanner(System.in);
        System.out.println("Nhập tên của sản phẩm");
        String name = inputNameFlour.nextLine();

        Scanner inputDayFlour = new Scanner(System.in);
        System.out.println("Nhập ngày sản xuất: ");
        int day = inputDayFlour.nextInt();

        Scanner inputMonthFlour = new Scanner(System.in);
        System.out.println("Nhập tháng sản xuất: ");
        int month = inputMonthFlour.nextInt();

        Scanner inputYearFlour = new Scanner(System.in);
        System.out.println("Nhập năm sản xuất: ");
        int year = inputYearFlour.nextInt();

        Scanner inputCostFlour = new Scanner(System.in);
        System.out.println("Nhập đơn giá của sản phẩm: ");
        int cost = inputCostFlour.nextInt();

        Scanner inputQuantityFlour = new Scanner(System.in);
        System.out.println("Nhập số lượng của sản phẩm: ");
        int quantity = inputQuantityFlour.nextInt();

        CrispyFlour newProduct = new CrispyFlour(id, name, LocalDate.of(year, month, day), cost, quantity);
        return newProduct;
    }

    public static Meat createNewMeat() {
        Scanner inputIdMeat = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm: ");
        String id = inputIdMeat.nextLine();

        Scanner inputNameMeat = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        String name = inputNameMeat.nextLine();

        Scanner inputDayMeat = new Scanner(System.in);
        System.out.println("Nhập ngày sản xuất: ");
        int day = inputDayMeat.nextInt();

        Scanner inputMonthMeat = new Scanner(System.in);
        System.out.println("Nhập tháng sản xuất: ");
        int month = inputMonthMeat.nextInt();

        Scanner inputYearMeat = new Scanner(System.in);
        System.out.println("Nhập năm sản xuất: ");
        int year = inputYearMeat.nextInt();

        Scanner inputCostMeat = new Scanner(System.in);
        System.out.println("Nhập giá của sản phẩm: ");
        int cost = inputCostMeat.nextInt();

        Scanner inputWeightMeat = new Scanner(System.in);
        System.out.println("Nhập khối lượng sản phẩm");
        double weight = inputWeightMeat.nextDouble();

        Meat newProduct = new Meat(id, name, LocalDate.of(year, month, day), cost, weight);
        return newProduct;
    }

    public static void deleteProduct(ArrayList<Material> arr) {
        Scanner inputNameProcduct = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm muốn xóa: ");
        String name = inputNameProcduct.nextLine();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(name)) {
                arr.remove(i);
            }
        }
    }


}
