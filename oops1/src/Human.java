public class Human {
    int age;
    int salary;
    String name;
    boolean married;
    static long pop;
    public Human(int age, String name,int salary, boolean married) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.married = married;
        Human.pop+=1;
    }
}
