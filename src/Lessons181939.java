public class Lessons181939 {
    static public int solution(int a, int b) {
        int lengthA = (int)(Math.log10(a)+1);   // a의 자릿수
        int lengthB = (int)(Math.log10(b)+1);   // b의 자릿수

        int answerA = (int)(a*Math.pow(10,lengthB)+b);
        int answerB = (int)(b*Math.pow(10,lengthA)+a);

        return Math.max(answerA, answerB);
    }

}
