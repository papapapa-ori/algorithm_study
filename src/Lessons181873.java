public class Lessons181873 {
    public static String solution(String my_string, String alp) {
        String answer = "";
        String upperAlp = alp.toUpperCase();

        char[] chArr = my_string.toCharArray();
        char chAlp = alp.charAt(0);

        for(char ch : chArr) {
            if( ch == chAlp )
                answer = answer.concat(upperAlp);
            else
                answer = answer.concat(ch + "");
        }
        return answer;
    }

    public static void main(String[] args) {
        solution("programmers", "m");
    }
}
