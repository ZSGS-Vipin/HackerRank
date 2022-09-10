import java.util.Scanner;

public class HackerRank{
    public static void main(String[] args) {
            designPDF();
    }
    public static void designPDF(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the char");
        int[] c = new int[26];
        for(int i = 0; i < 26;i++){
            c[i] = in.nextInt();
        }
        System.out.println("enter the string");
        String word = in.next();
        int maxHeight = 0;
        for(char ch:word.toCharArray() ){
            if(c[ch-'a']>maxHeight)
                maxHeight = c[ch-'a'];
        }
        System.out.println(word.length()*maxHeight);
    }
}