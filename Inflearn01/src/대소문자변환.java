import java.util.*;

public class 대소문자변환 {
    public static String solution(String str) {
        String answer = "";

        //String을 문자배열로 바꾸기
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            }else {
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}
