import java.util.Scanner;

public class codeup1010 {
    /**
     * 1010 : [기초-입출력] 정수 1개 입력받아 그대로 출력하기(설명)
     * 2019. 12. 15
     * sjh
     * **/

    public static void main(String arg[]) {

        /**
         정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후
         변수에 저장되어 있는 값을 그대로 출력해보자.

         예시
         int main()
         {
         int n;
         scanf("%d", &n);
         printf("%d", n);

         return 0;
         }

         와 같은 형태로 가능하다.
         */

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());

        System.out.println(a);

    }
}
