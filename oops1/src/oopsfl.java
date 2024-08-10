//class pen{
// String color;
// String type;
// public void write()
// {
//     System.out.println("writing something");
//     public void getcolor()
//     {
//         System.out.println(this.color);//which object accesed this func assigns color accordingly
//     }
// }
class Shape
{
 String color;
}
class Triangle extends Shape
{


}
  class Student
{
int age;
String name;
public void info()
{
    System.out.println(this.age);
    System.out.println(this.name);
}
Student(){
    System.out.println("constr present");
}
Student(int age,String name)
{
 this.age=age;
 this.name=name;
}
Student(Student s2)
{
this.name= s2.name;
this.age=s2.age;
}
}

public class oopsfl {
    public static void main(String[] args) {
//        pen pen1 = new pen();//creating object
//        pen1.color = "blue";
//        pen1.type = "gel";
//        pen1.write();
//        pen pen2 = new pen();
//        pen2.color = "black";
//        pen2.type = "gel";
//        pen2.write();
//  Student s1=new Student();
//// s1.age=23;
//// s1.name="adn";
//   s1(23,"adn");
//   Student s2=new Student(s1);
// s1.info();
        Triangle t1=new Triangle();
        t1.color="red";//means it has inheritd properties
    }
    }
