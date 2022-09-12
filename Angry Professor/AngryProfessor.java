package hackerrank;

public class AngryProfessor {
    public static void main(String[] args) {
        String ans = angryProfessor();
        System.out.println(ans);
    }
    public static String angryProfessor() {
        int minCount = 0;
        int maxCount = 0;
        int noOfTimes = 2;
        int professorExpectation = 3;
        int n = 4;
        int[] arrayInput = {-1,-3,4,2};
        for(int j = 0; j < noOfTimes;j++){
        for(int i = 0; i < n;i++){
            if(arrayInput[i]<=0){
                minCount++;
            }
            if(arrayInput[i]>0)
                maxCount++;
        }
        }
        if(maxCount==professorExpectation||maxCount>professorExpectation){
            return "NO";
        }
        return "YES";
    }
    }


