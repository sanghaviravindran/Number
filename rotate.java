public class positive {
    public static void main(String[] args) {
      int[] a={1,2,3,4,5};
      int i,k=3,j,t,k1=1;
      for(i=0;i<=k;i++)
      {
          t=a[0];
          for(j=0;j<4;j++)
          {
          a[j]=a[j+1];
          }
          a[j]=t;
      }
      for(i=0;i<5;i++)
            System.out.println(""+a[i]);
          
   
    }}