public class Lessons181873_3 {
    public static String solution(String my_string, String alp) {
        String upperAlp = alp.toUpperCase();
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            String curStr = my_string.charAt(i) + "";
            if( alp.equals(curStr) )
                answer = answer.concat(upperAlp);
            else
                answer = answer.concat(curStr);
        }
        return answer;
    }

    public static void main(String[] args) {
        solution("programmers", "p");

    }

}
