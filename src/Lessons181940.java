public class Lessons181940 {
    public String solution(String my_string, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < k; i++)
            answer = sb.append(my_string).toString();

        return answer;
    }

}
