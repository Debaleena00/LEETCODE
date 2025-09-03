public class MulR {
    public static void main(String[] args) {
        int a[]={1,2,-3,4,-5,6,-7};
        int n=a.length;
        int k=2;
        for(int i=0;i<k;i++){
            int f,j;
            f=a[0];
            for(j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[j]=f;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }    
}
