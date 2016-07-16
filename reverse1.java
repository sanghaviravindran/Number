public class Numrev {
     public static void main(String args[]){
        int n,rev1,rev2=0,n1;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n1=n;
        while(n1!=0)
        {
            rev1=n1%10;
            rev2=rev2*10+rev1;
            n1=n1/10;
        }
         System.out.println("reverse integer is"+rev2);
     
    }
}
