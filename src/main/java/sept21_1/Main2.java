package sept21_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public ArrayList<String> solution(String[] str) {
        ArrayList<String> result = new ArrayList<>();

        // String 타입에 문자배열 메소드가 있다

        for (String x : str) {
            char[] c = x.toCharArray();
            int lt = 0, rt = x.length() - 1; // lt = 왼쪽 맨 끝 문자, rt = 오른쪽 맨 끝 문자
            while (lt < rt) {
                // abcd 를 받았다고 했을 때
                // lt[0] = a; rt[3] = d
                // tmp = a;
                // c[0] = c[rt] = d
                // c[0] = d = tmp;
                // c[3] = tmp = d;

                // 문자열 good
                // lt = g , rt = d;
                char tmp = c[lt];
                System.out.println("1번 여기서 템프의 값은 ? : "+  tmp);
                c[lt] = c[rt]; // 절차지향적으로 읽어 내려오기때문에 // 여기서 c[rt]의 값을 c[lt] 값으로 변경
                System.out.println("2번 여기서 템프의 값은 ? :" + tmp);
                c[rt] = tmp; // 헷갈렸던건 c[rt]의 값을 c[lt] 값 변경으로 tmp도 값이 바뀌는 줄 알았는데 아니였다. 즉, c[0] = s 일때 값을 그대로 tmp가 저장해서 c[rt]로 넣어준다.
                System.out.println("3번 여기서 c[rt]의 값은 ? :" + c[rt]);

                lt++;
                rt--;
            }
            String tmp = String.valueOf(c); // 일반적으로 인스턴스(객체). <- 으로해서 메서드를 참조하지만, valueOf는 스태틱이라서 클래스. <-으로 접근가능하다
            result.add(tmp);
        }
        return result;
    }

    public static void main(String[] args) {

        Main2 main2 = new Main2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for (String x : main2.solution(str)) {
            System.out.println(x);
        }

    }
}
