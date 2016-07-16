public class primecount {
        public static void main(String args[]){

    int i,j,sum=0,k=0,n,m,count=0;
    int[] a=new int[100];
System.out.println("Enter the number");
  Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=2;i<=n;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
{
break;
}

}
if(i==j)
{
a[k]=i;
k++;
count++;
    
}
}
System.out.println("number of times"+count);
}
            
}
