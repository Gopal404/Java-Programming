class fig
{
    double l,b;
    fig(double l1, double b1)
    {
        l=l1;
        b=b1;
    }
    double Area()
    {
        System.out.print("No Area Assigned:");
        return 0.0;
    }
}
class rect extends fig
{
    rect(double l1,double l2)
    {
        super(l1,l2);
    }
    double Area()
    {
        double a;
        a=l*b;
        return a;
    }
}
class MethodOverriding
{
    public static void main(String args[])
    {
        fig f;
        fig ob= new fig(5,2);
        rect ob2 = new rect(5,3);
        f=ob2;

        double ans;
        ans=ob2.Area();
        System.out.println(ans);
    }
}