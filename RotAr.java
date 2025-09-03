public class RotAr {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7};
        int n=a.length;
        int k=3;
        int t=a[0];
        for(int i=1;i<n;i++){
            a[i-1]=a[i];
         }
         a[n-1]=t;
         for(int i=0;i<n;i++){
            System.out.println(a[i]);
         }
    }
}
