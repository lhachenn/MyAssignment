public class HighestValue {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 10;
        int highestValue;

        if ( a > b && a > c) {
            highestValue = a;
        } else if (b > a && b > c){
            highestValue=b;
        } else {
            highestValue = c;
        }
        System.out.println("The highest value is: " + highestValue);
    }
}