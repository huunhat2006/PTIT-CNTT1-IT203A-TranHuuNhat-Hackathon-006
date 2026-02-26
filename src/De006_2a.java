
public class De006_2a {
    public static void main(String[] args) {
//      2.1  tim phan tu da so
        int arr[] = {2, 1, 2, 2, 1, 2};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                     count++;
                }
            }
            if (count > arr.length / 2) {
                System.out.println(arr[i]);
                break;
            }
        }


    }
}
