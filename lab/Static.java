class Static{
    int rollno;
    String name;

    static String college = "SJU";
    public static void main (String[] args) {
        Static S1 = new Static();
        Static S2 = new Static();
        Static S3 = new Static();

        S1.rollno = 111;
        S1.name = "John";

        S2.rollno = 222;
        S2.name = "Arya";

        S3.rollno = 333;
        S3.name = "Sansa";

        System.out.println("Initial");
        S1.display();
        S2.display();
        S3.display();

        S1.college = "MIT";
        System.out.println("After modifying static variable (college)");
        S1.display();
        S2.display();
        S3.display();
    }

    void display(){
        System.out.println("Register Number:"+ rollno + " | Name:" + name + " | College:" + college);
    }
}