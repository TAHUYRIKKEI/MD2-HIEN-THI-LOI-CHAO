import java.util.Scanner;

public class Taocachinh {
    public static void main(String[] args) {
        int chieuDai, chieuRong;
        Scanner taohinh = new Scanner(System.in);
        System.out.println("nhap chieu dai");
        chieuDai = taohinh.nextInt();
        System.out.println("nhap chieu rong");
        chieuRong = taohinh.nextInt();
        for (int i = 0; i <chieuDai ; i++) {
            for (int j = 0; j <chieuRong; j++) {
                System.out.println(" * ");

            }
            System.out.println(" * ");

        }

    }
}
