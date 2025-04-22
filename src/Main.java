import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số tuần");
        int a = scanner.nextInt();

        int month = a / 4;
        System.out.printf("Số tháng tương ứng: %d\n", month);
        System.out.println("Số tuần dư ra: "+ a%4);
    }
}