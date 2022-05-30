class Overload {
    Overload()
    {
        System.out.println("Iside Default Constructor");
    }
    Overload(int a)
    {
        System.out.println("Squre of A is: "+(a*a));
    }
    Overload(int a, int b)
    {
        System.out.println("Addition of A & B is: "+(a+b));
    }
    void show()
    {
        System.out.println("Iside Non-Parameterized Function");
    }
    void show(int a)
    {
        System.out.println("Squre of A is: "+(a*a));
    }
    void show(int a,int b)
    {
        System.out.println("Addition of A & B is: "+(a+b));
    }
    
    public static void main(String[] args) {
        Overload ob= new Overload();
        Overload ob1= new Overload(5);
        Overload ob2= new Overload(5,5);
        ob.show();
        ob.show(5);
        ob.show(5,5);
        
    }   
}
