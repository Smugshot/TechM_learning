class Student{
    
    public void PrintInfo(String name){
        System.out.println(name);
        
    }
    public void PrintInfo( int age){
        System.out.println(age);
        
    }
    public void PrintInfo(String name , int age){
        System.out.println(age);
    }

    int add(int a , int b){
        return a+b ;
    }
    
}



public class Day2_Polymorphism {
    public static void main(String[] args) {
        Student app = new Student();
        app.PrintInfo("Parth");
        app.PrintInfo(100000000);
        app.PrintInfo("ParthD", 300);
        System.out.println(app.add(10 , 20));
    }
}
