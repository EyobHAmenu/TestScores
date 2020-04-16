import java.util.Arrays;
import java.util.Scanner;

public class testScore {
    public static void main(String[] args){

        int [] score = new int[10];
        int count = 0;
        double sum = 0;
        double max = 0;
        double min = 0;
        double avg = 0;
        Scanner sc = new Scanner(System.in);

        for(int x = 0; x < score.length; x++)
        {
            count++;
            System.out.print("Enter a score " + "(" + count + "/10) : ");
            score [x] = sc.nextInt();
            sum = sum + score[x];

            if (min == 0){
                min = score[x];
            }
            else if (min > score[x]){
                min = score[x];
            }
            if (score[x] > max){
                max = score[x];
            }

        }
        avg = sum/count;
        System.out.println("The highest number is " + max);
        System.out.println("The smallest score is " + min);
        System.out.println("The Average score is " + avg);
        System.out.println("All the Scores are " + Arrays.toString(score));

    }
}
