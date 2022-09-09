import java.util.*;
public class arrayClass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxHeight=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(max<arr[i])
                max=arr[i];
        }
        if(maxHeight<max)
            System.out.println(max-maxHeight);
        else
            System.out.println("0");
    }
}
