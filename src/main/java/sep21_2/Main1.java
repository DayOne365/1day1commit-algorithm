package sep21_2;

//5. 특정 문자 뒤집기
//        설명
//        영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//        특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
//        입력
//        첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
//        출력
//        첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
//예시 입력 1
//        a#b!GE*T@S
//예시 출력 1
//        S#T!EG*b@a

// 문자 뒤집기에서 업그레이드 버전인뎁...
// 특수문자와 알파벳을 어떻게 구분하게 만드는거지 ?


import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public String solution(String solution) {
        String result;

            char[] c = solution.toCharArray();
            // 탐색할 인덱스 설정, 맨 왼쪽 0으로, 맨 오른쪽은 c 문자배열 변수 - 1, length는 1부터 시작 / 인덱스는 0부터 시작 / 그래서 -1
            int lt =0, rt = solution.length() -1;

            while (lt < rt) {
                if (!Character.isAlphabetic(c[lt])) {
                    lt++;
                } else if (!Character.isAlphabetic(c[rt])) {
                    rt--;

                }else{
                    char temp = c[lt];
                    c[lt] = c[rt];
                    c[rt] = temp;

                    lt++;
                    rt--;
                }
            }
            result = String.valueOf(c);
            return result;
    }


    public static void main(String[] args) {
        Main1 main = new Main1();
        Scanner sb = new Scanner(System.in);
        String str = sb.next();;

        System.out.println(main.solution(str));

    }
}
