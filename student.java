// define a class student with data memebers rollno, name, class and member
// print student detiles 

import java.util.*;
class std{
    int rollno;
    String name;
    String klass;
    public void input(){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter rollno: ");
        rollno=obj.nextInt();
        obj.nextLine();
        System.out.print("enter name: ");
        name=obj.nextLine();
        System.out.print("enter class: ");
        klass=obj.nextLine();
    }
    public void display(){
        System.out.println("name: "+name);
        System.out.println("rollno: "+rollno);
        System.out.println("class: "+klass);
    }
   

}

public class student {
    public static void main(String arg[]){
        std s1=new std();
        s1.input();
        s1.display();
        
    }
}
