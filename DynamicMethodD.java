class A
{
    void Show()
    {
        System.out.println("Inside Class A");
    }
}
class B extends A
{
    void Show()
    {
        System.out.println("Inside Class B");
    }
}
class C extends B
{
    void Show()
    {
        System.out.println("Inside Class C");
    }
}
class DynamicMethodD 
{
    public static void main(String args[])
    {
        A r; //r is reference of class A
        A a = new A();
        B b = new B();
        C c = new C();
        
        r=b; //r is assigned by b's address
        b.Show(); //It will invoke Show() method of B class
        r=a;
        r.Show(); //It will invoke Show() method of A class
        r=c;
        r.Show(); //It will invoke Show() method of C class
    }    
}
