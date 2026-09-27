import java.util.*;
class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int temp[] = new int[size];   
        int count = 0;
        // Remove
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[count] = arr[i];
                count++;
            }
        }
        // Print
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }
        sc.close();
    }
}