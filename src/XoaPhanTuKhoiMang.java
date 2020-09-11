import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,3,5,6,7,7,8,7};
        System.out.println("nhap phan tu can xoa");
        int x = sc.nextInt();
        int index = 0;

        for (int i = 0; i< arr.length; i++){
            if (x == arr[i]){
                for (int j=i; j<arr.length-1;j++){

                    arr[j] = arr[j+1];
                }
                arr[arr.length-1]=0;
                i--;
            }
        }
        for (int i = 0; i< arr.length;i++) {
            System.out.print(arr[i]);
        }

    }
}
