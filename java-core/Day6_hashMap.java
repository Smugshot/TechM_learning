import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day6_hashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> marks = new HashMap<>();

        for(int i = 1 ; i<=8 ; i++){
            System.out.println("Enter student name :");
            String Name = sc.nextLine();

            System.out.println("Enter marks:");
            int Mark = sc.nextInt();
            sc.nextLine();
            marks.put(Name, Mark);
        }

     for(Map.Entry<String , Integer> entry : marks.entrySet()){
        System.out.println(entry.getKey() + "-->" + entry.getValue());
     }

     System.out.print("\n🔍 Search marks for student: ");
        String search = sc.nextLine();

        if (marks.containsKey(search)) {
            System.out.println(search + " scored: " + marks.get(search));
        } else {
            System.out.println("Student not found.");
        }
    }
}
