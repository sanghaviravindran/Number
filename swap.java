public class swap {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        a=sc.nextInt();
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("swap two numbers"+a+"\t"+b);
    }
}
