
class GDemo
{
    void show()
    {
        System.out.println("Hello World");
    }
}
class Garbage {
    public static void main(String[] args) 
    {
        GDemo ob1 = new GDemo();
        {
            GDemo ob2 = new GDemo();
            ob2.show();
            System.out.println("Ob2 is Valid Here");
        }
        System.out.println("Ob2 is Invalid Here");
        ob1.show();
        // ob2.show();  
    }
}