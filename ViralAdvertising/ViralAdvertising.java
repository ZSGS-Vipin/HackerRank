package hackerrank;

public class ViralAdvertising {
    public static void main(String[] args) {
        System.out.println(viral(3));
    }

    public static int viral(int n) {
        int sum = 0;
        int i;
        int recipients = 5;//initial value
        int liked = 0;
        for (i = 0; i < n; i++) {
            liked = Math.floorDiv(recipients, 2);
            sum = sum + liked;
            recipients = liked*3;
        }
        return sum;
    }
}


