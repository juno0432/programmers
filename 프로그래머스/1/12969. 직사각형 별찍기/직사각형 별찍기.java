import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
