package programmers;

public class java0816 {
	//배열의 평균 값 
	class Solution {
	    public double solution(int[] numbers) {
	        int num = 0; // 배열의 합 을 담을 변수 
	        double result = 0;
	        for(int i=0; i <numbers.length; i++) { // 배열의 길이 만큼 반복문을 돌리고 
	            num += numbers[i];  //배열의 합을 구한다.
	        }
	        result = (double) num/numbers.length; // 배열의 합을 배열의 길이만큼 나눈다. 자료형 변환
	        
	        return result;
	    }
	}

}
