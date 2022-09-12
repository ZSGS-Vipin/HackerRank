public class UtopianTree {
    public static void main(String[] args) {
       int ans =  utopianTree(3);
        System.out.println(ans);
    }
    public static int utopianTree(int n) {
        int maxHeight = 1;
        if(n==0)
            return maxHeight;
        for(int i = 1; i <=n;i++){
            if(i%2!=0)
                maxHeight *= 2;
            else
                maxHeight+=1;
        }
        // Write your code here
        return maxHeight;

    }

}

