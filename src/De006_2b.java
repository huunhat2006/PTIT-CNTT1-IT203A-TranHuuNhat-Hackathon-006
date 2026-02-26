public class De006_2b {
    public static void main(String[] args) {
        //      2.2  tich cac phan tu ngoai tru chinh no
        int arrA[] = {1, 2, 3, 4};
        int arrB[] = new int[arrA.length];

//        for (int i = 0; i < arrA.length; i++) {
//            int number = 1;
//            if (i == 0) {
//                for (int j = 1; j< arrA.length; j++) {
//                    number*=arrA[j];
//                }
//                arrB[i] = number;
//            } else if(i == arrA.length - 1) {
//                for (int j = 0; j< arrA.length - 1; j++) {
//                    number*=arrA[j];
//                }
//                arrB[i] = number;
//            } else {
//                for (int j = 0; j < i; j++) {
//                    number*=arrA[j];
//                }
//                for (int j = arrA.length; j > i ; j--) {
//                    number*=arrA[j];
//                }
//                arrB[i] = number;
//            }
//        }

        for (int i = 0; i < arrA.length; i++) {
            int mul = 1;
            for (int j = 0; j < arrA.length; j++) {
                if (i == j) continue;
                mul*=arrA[j];
            }
            arrB[i] = mul;
        }
        for (int i = 0; i < arrB.length; i++) {
            System.out.println(arrB[i]);
        }
    }
}

