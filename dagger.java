public class FactorialCalculator {

    public static void main(String[] args) {
        int number = 5; 
        int result = factrial(number)
        System.out.println("Factor of " + number + " is: " + result)
   
    public static in factor int n) {
        if (n == 0) 
            
        } 
            return
         factorial(n - 1)
    
public class Student {
    private int;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    
}