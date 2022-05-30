import java.util.Scanner;

class fact1 {
    void GetFact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println(f);
    }
}

class Fact {
    public static void main(String args[]) {
        fact1 obj = new fact1();
        int n;
        System.out.print("Enter Any Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        obj.GetFact(n);
        sc.close();
    }
}