package Lab1;

public class MyApp {
    public static void main(String[] args) {
        int b = 2;
        int n = 11;
        System.out.println("Program Starting");
        System.out.println("1 + 1 = "+2);
        System.out.println(b+" to power "+n+" = "+ MyLibrary.Power(b,n));
        System.out.println(n+"! = " + MyLibrary.factorial(n));
        System.out.println("Program Ended");
    }
}
