import java.util.Scanner;

public class Day5_Arrray {
    public static void main(String[] args) {
        int[] numbers = {10 ,20, 30, 40 , 50};
        System.out.println(numbers);

        int[] scores = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        for(int n=0 ; n<5; n++){
            scores[n]= scanner.nextInt();
            // System.out.println(scores[n]);
        }
        
         for(int n=0 ; n<5; n++){
            // scores[n]= scanner.nextInt();
            System.out.println(scores[n]);
            System.out.println(numbers[n]);

        }

        scanner.close();
    }
}
