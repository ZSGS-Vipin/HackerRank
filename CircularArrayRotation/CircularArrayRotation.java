package hackerrank;

import java.util.Arrays;
import java.util.Scanner;
class CircularArrayRotation{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++ ){
            array[i] = scan.nextInt();
        }
        int rotation = scan.nextInt();
        int m  = scan.nextInt();
        int[] query = new int[m];
        for(int i = 0; i < m; i++){
            query[i] = scan.nextInt();
        }
        circular(array,rotation,query);

    }
    static void circular(int[] input , int rotation, int[] query){
        rotation = rotation % input.length;
        int size = input.length-1;
        reverse(input, 0, size);
        reverse(input, 0, rotation-1);
        reverse(input, rotation, size);

        int[] res = new int[query.length];
        for(int i = 0; i < query.length;i++ ){
            res[i] = input[query[i]];
        }
        System.out.println(Arrays.toString(res));
    }
    static void reverse(int[] array, int starting, int ending ){
        while(starting<ending){
            int temp = array[starting];
            array[starting] = array[ending];
            array[ending] = temp;
            starting++;
            ending--;
        }
    }
}
