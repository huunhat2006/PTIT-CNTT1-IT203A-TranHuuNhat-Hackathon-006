import java.util.Scanner;

public class De006_1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.2 Chuan hoa chuoi ho ten
        System.out.println("Moi nhap chuoi:");
        String str =sc.nextLine();

        String[] words =str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String firstLetter =word.substring(0, 1).toUpperCase();
                String remainingLetters = word.substring(1).toLowerCase();
                result.append(firstLetter).append(remainingLetters).append(" ");
            }
        }
        String finalString =result.toString().trim();

        System.out.println(finalString);

    }
}