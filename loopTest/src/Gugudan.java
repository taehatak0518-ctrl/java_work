public class Gugudan {
    static void main(String[] args) {
        // 구구단 출력
        // ====2단====
        // 2 x 1 =2
        // 2 x 2 = 4
        // ....
        // 2 x 9 = 18
        // ==== 3단 ====
        // 3 x 1 = 3
        // ....
        // 9 x 9 = 81
        for (int i = 2; i <= 9; i++) {
            System.out.println("====" + i + "단 ====");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));

            }
        }
    }
}

