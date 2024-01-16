import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class 문장속단어 {

    public static String solution(String sentence) {
        String ans = "";
        int max = Integer.MIN_VALUE;

        String[] s = sentence.split(" ");
        for(String x : s) {
            int len = x.length();
            if(len > max) {
                max = len;
                ans = x;
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        System.out.println(solution(sentence));
    }
}
