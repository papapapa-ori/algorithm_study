public class Lessons181928_2 {
    public int solution(int[] num_list) {
        int answer;
        int evenSum = 0, oddSum = 0;
        for(int num : num_list) {
            // 짝수인 경우
            if( num % 2 == 0 ) {
                evenSum *= 10;
                evenSum += num;
            }
            // 홀수인 경우
            else {
                oddSum *= 10;
                oddSum += num;
            }
        }

        answer = evenSum + oddSum;
        return answer;
    }
}
