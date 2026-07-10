package lab;
class Static {
    
    static int sharedCount = 0;
    int myCount = 0;

    public void addOne() {
        sharedCount++;
        myCount++;
    }

    public static void main(String[] args) {
        Static obj1 = new Static();
        Static obj2 = new Static();

        obj1.addOne(); 
        System.out.println("obj1 -> My Count: " + obj1.myCount + " | Shared Count: " + sharedCount);

        obj2.addOne(); 
        System.out.println("obj2 -> My Count: " + obj2.myCount + " | Shared Count: " + sharedCount);
    } 
}