class MultiStat {
    static char ch;
    static{
        System.out.println("1st Static block");
        ch='*';
    }
    static{
        System.out.println("2nd Static Block");
        ch='@';
    }
    static void display()
    {
        System.out.println("Ch= "+ch);
    }
    public static void main(String[] args) {
        display();
    }
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                