import java.util.Scanner;

public class Day5_String {
    
    public static void main(String[] args) {
        String name = "Elon Musk";
        String name2 = new String("Elon Musk");
        String Name1 = "Elon Musk";

        
        Scanner sc = new Scanner(System.in);
        String Name2 = sc.nextLine();
        // String Name2 = sc.next();   The diffrence is that next() take only one word as input and nextline() take complete line as input with space 
        
        System.out.println(name);
        System.out.println(Name2);
        
        System.out.println(Name1 == name);          // true (same pool)
        System.out.println(Name1 == name2);         // false (different object)
        System.out.println(Name1.equals(name2));    // true (content check)

        
        
        

        // String methods:-

        System.out.println(Name2.charAt(4));
        System.out.println(Name2.length());
        System.out.println(Name2.substring(0,7));
        System.out.println(Name2.contains("arth"));
        System.out.println(Name2.toUpperCase());
        System.out.println(Name2.replace( "a", "xx"));

        for(int i = 0; i < Name2.length() ; i++){
            System.out.println(Name2.charAt(i));
        }

    }
    
}
