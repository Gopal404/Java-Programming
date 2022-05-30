class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Inside Class A "+i);
        }
        System.out.println("Exiting from A");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Inside Class B "+i);
        }
        System.out.println("Exiting from B");
    }
}
class ThreadDemo {
    public static void main(String[] args) {
        A obj=new A();
        B obj2=new B();

        obj.start();
        obj2.start();

    }
    
}
