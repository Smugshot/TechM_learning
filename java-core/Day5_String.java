import java.util.Scanner;

public class Day5_String {
    
    public static void main(String[] args) {
        String name = "Elon Musk";
    
        Scanner sc = new Scanner(System.in);
        String Name2 = sc.nextLine();
        // String Name2 = sc.next();   The diffrence is that next() take only one word as input and nextline() take complete line as input with space 
        
        System.out.println(name);
        System.out.println(Name2);
        


        // String methods:-

        System.out.println(Name2.charAt(4));
        System.out.println(Name2.length());
        System.out.println(Name2.substring(0,7));
        System.out.println(Name2.contains("arth"));
        System.out.println(Name2.toUpperCase());
        System.out.println(Name2.replace( "a", "xx"));

    }
    
}
