public class Lessons181927 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int lastIdx = num_list.length-1;

        if( num_list[lastIdx] > num_list[lastIdx-1] )
            answer[answer.length-1] = num_list[lastIdx]-num_list[lastIdx-1];
        else
            answer[answer.length-1] = num_list[lastIdx]*2;

        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}
