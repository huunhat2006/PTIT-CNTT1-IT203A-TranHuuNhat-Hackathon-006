import java.util.Scanner;
import java.lang.String;

public class De006_1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      1.1  ky tu dau tien khong lap lai
        System.out.println("Moi nhap chuoi:");
        String str = sc.nextLine();

        char checkChar = str.charAt(0);
        int count = -1;
        for (int i = 1; i < str.length(); i++) {
            if (checkChar == str.charAt(i)) {
                count++;
            }
        }
        if (count == -1) {
            System.out.println(str.charAt(0));
        } else {
            System.out.println("_");
        }
    }
}
