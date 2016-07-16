public class swap {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        a=sc.nextInt();
        b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("swap two numbers"+a+"\t"+b);
    }
}
