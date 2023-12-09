/**
 * a
 */
public class a {
    public static int pow(int a, int x)
{
    if(x==1)return 1;

    if(x%2==0){
        return pow(a, x/2)*pow(a, x/2);
    }else{
return pow(a, x/2)*pow(a, x/2)*a;
    }
}
    public static void main(String[] args) {
        // int []arr={1,2,3,4,5};
        // int []arr1={2,33,6,11,-5,3};
        // int n=arr.length;
        // int x=arr1.length;
        // for (int i=0;i<n;i++){
        //     for (int j=0;j<x;j++){
        //         if (Math.abs(arr[i])==Math.abs(arr1[j])){
        //             System.out.println(arr[i]);
        //         }
        //     }
        // }
        // int []arr2=new int[n+x];
        // int y=arr2.length;
        // int k=0;
        // for(int z=0;z<y-5;z++){
        
        //     if(z<n-1){
        //         arr2[z]=arr[z];
        //     }
        //     else{
        //         arr2[z]=arr1[k];
        //         k++;
        //     }
        // }

        // for (int i=1;i<y;i++){
        //     // if(arr2[i]==arr2[i-1]){
        //         System.out.println(arr2[i]);
        //     // }
        
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // int z=5;
        // int base=2;
        // // System.out.println(p);
            System.out.println(pow(2,5));
            // int i=1;
            // int pow=1;
            // int p=2;
            // int q=3;
            // while(i<=q){
            //     pow*=p;
            //     i++;
            // }
            // System.out.println(pow);
    }
}