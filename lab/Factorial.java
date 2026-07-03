package lab;
class Factoria {
    public static void main(String[] args) {
        System.out.println("List of factorials from 1 to 10:");
        
        for (int i = 1; i <= 10; i++) {
            int n = i;
            long factorial = 1; 
            
            while (n > 0) {
                factorial = factorial * n;
                n--;
            }
            System.out.println("Factorial of " + i + " = " + factorial);
        }
    }
}