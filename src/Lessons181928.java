public class Lessons181928 {
    public int solution(int[] num_list) {
        int answer;
        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();
        for(int curNum : num_list) {
            // 짝수인가?
            if( curNum% 2 == 0 )
                evenSb.append(curNum);
            else
                oddSb.append(curNum);
        }

        answer = Integer.parseInt(evenSb.toString()) + Integer.parseInt(oddSb.toString());

        return answer;
    }
}
