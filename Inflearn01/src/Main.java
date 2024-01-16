import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static String solution(String str) {
        String ans = "";
        char[] charArr = str.toCharArray();
        for(int i = 0; i < charArr.length; i++) {
            char c = charArr[i];
            if(Character.isLowerCase(c)) {
                ans += Character.toUpperCase(c);
            }else {
                ans += Character.toLowerCase(c);
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        System.out.println(solution(str));

    }
}
