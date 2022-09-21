package sept21_1;


// 4. 단어 뒤집기
//설명
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

//입력
//첫 줄에 자연수 N(3<=N<=20)이 주어집니다.

//두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

//출력
//N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

// 예시 입력
//3
//good
//Time
//Big

// 예시 출력
//doog
//emiT
//giB

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> result = new ArrayList<>();

        for (String x : str) {
        String temp = new StringBuilder(x).reverse().toString();
        result.add(temp);
        }
        return result;
    }
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        //첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
        // 뒤집을 단어 갯수 정하기
        int n = kb.nextInt();
        // 위에 입력받은 변수 n을 동적 배열로 활용
        // 동적 배열 만들기
        // 자바에서는 배열의 칸 수를 정해야 한다.
        String[] str = new String[n];

        //두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
        // 아름답다! 반복문은 0으로 초기화한 i로부터 n만큼 돌린다
        for (int i = 0; i < n; i++) {
            // 입력 함수로 받은 단어들을 str 배열에 넣는다
            str[i] = kb.next();
        }
        for (String x : T.solution(n, str)) { // T.solution(n, str) = 뒤집힌 단어로 바뀌어야한다.
            System.out.println(x);
        }
    }

}
