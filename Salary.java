public class Salary {
    public static void main(String[] args) {
        SalaryClass obj = new SalaryClass();
        obj.setValue(160000);
    }
}
class SalaryClass{
    private float s;
    public void setValue(int sal) {
        s = sal;
        printValue();

    }
    public void printValue() {
        if (s>0 && s<40000){
            System.out.println("Low scale salary");

        }
        else if (s>40000 && s<80000){
            System.out.println("Medium scale salary");
        } else if (s>80000) {
            System.out.println("High scale salary");

        }
        else {
            System.out.println("Wrong input");
        }
    }

}
