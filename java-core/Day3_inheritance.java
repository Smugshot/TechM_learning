class Example{
 String name;
 int age;

 void Todispay(){
    System.out.println("Hey!!" + name + "what is your age" + age);
 }
}

class Example2 extends Example{
 void ToInherrited(){
    System.out.println("hey !!!" + name + "Can you tell me your age" + age);
 }
}

public class Day3_inheritance {

    public static void main(String[] args) {
        
        Example2 s = new Example2();
        s.name = "Parth";
        s.age= 500 ;

        s.Todispay();
        s.ToInherrited();
    }
    
}
