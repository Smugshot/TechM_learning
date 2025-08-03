/*reverse the input array*/ 

import java.util.Scanner;

// public class Practise_Array1 {

//     public static void main(String[] args) {
//         int[] nums = new int[5];
//         Scanner scanner = new Scanner(System.in); 
//         for(int i = 0 ; i<5 ; i++){
//             nums[i] = scanner.nextInt();
//         }
        
//         System.out.println("Revers array is:");
//         for(int z = nums.length - 1  ; z>=0 ; z--){
//             System.out.println(nums[z] + " ");
//         } 
//     }
// }


/*Find the larger number than  given number in array */

public class Practise_Array1 {

    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in); 
        for(int i = 0 ; i<5 ; i++){
            nums[i] = sc.nextInt();
        }
        
        int no = sc.nextInt();
        int count =0;
        for(int x = 0 ; x<5 ; x++){
            if(nums[x] > no){
                count++;
            }
        }

        System.out.println(count);

    }
}
