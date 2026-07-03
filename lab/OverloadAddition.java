package lab;
public class OverloadAddition {

    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public int add() {
        return 10 + 25; 
    }

    public static void main(String[] args) {
        OverloadAddition calc = new OverloadAddition();

        System.out.println("Integer sum (15 + 20): " + calc.add(15, 20));
        System.out.println("Float sum (10.5 + 4.2): " + calc.add(10.5f, 4.2f));
        System.out.println("Default sum: " + calc.add());
    }
}