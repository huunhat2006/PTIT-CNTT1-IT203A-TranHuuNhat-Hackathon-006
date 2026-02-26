
public class De006_3 {
    public static void main(String[] args) {
//        3 phan loai mau sac
        int arr[] = {2, 0, 2, 1, 1, 0};

        if (arr !=null && arr.length> 1) {
            int low = 0;
            int mid = 0;
            int high = arr.length- 1;

            while (mid <=high) {
                if (arr[mid] == 0) {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                } else if (arr[mid] ==1) {
                    mid++;
                } else if (arr[mid] == 2) {
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }
            }
        }

        for (int i =0; i <arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}