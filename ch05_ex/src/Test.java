import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //점수를 입력받는다.
        System.out.println("점수입력(0~100)");
        int score = scanner.nextInt();
        // 비교(A, B, C, D,F)
        // 결과 담을 변수 선언
        String result;
        if (score >= 90) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if (score >=70) {
            result = "C";
        } else  if (score >=60) {
            result = "D";
        } else  if (score <=59) {
            result = "F";
            System.out.println("90~100점");
            System.out.println("80~89점");
            System.out.println("70~79점");
            System.out.println("60~69점");
            System.out.println("0~59점");
            System.out.println(result);
            // 점수를 입력 받기
        }
        }
    }

