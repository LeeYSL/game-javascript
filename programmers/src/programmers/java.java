package programmers;

public class java {
	// 두 수의 나머지 구하기
	class Solution1 {
		public int solution(int num1, int num2) {
			int answer = 0;
			answer = num1 % num2;
			return answer;
		}
	}

	// 두 수의 차 구하기
	class Solution2 {
		public int solution(int num1, int num2) {
			int answer = 0;
			answer = num1 - num2;
			return answer;
		}
	}

	// 두 수의 곱 구하기
	class Solution3 {
		public int solution(int num1, int num2) {
			int answer = 0;
			answer = num1 * num2;
			return answer;
		}

	}
	//숫자 비교하기 (오류 : 메인도 메서드여서 메소드 안에 쓸 수 없음)
	class Solution4{     
	    public void main (String[] args) { 
	        
	       int result = solution(2,3);

	    }
	      public int solution(int num1,int num2) {
	            if(num1 == num2) {
	                return  1;
	            }else
	               return  -1;
	        
	    }    
	    }
	//삼항연산자로 풀이(return 쓰기)
	class Solutio5 {
	    public void main(String[] args) {
	        int result = solution(2,3);
	    }
	    public int solution(int num1, int num2) {
	      int  result = (num1==num2)?1:-1;
	        return result;
	    }
	}
	//몫 구하기
	class Solution6 {
	    public void main(String[] args) {
	        int result = solution(10,5);
	    }
	    public int solution(int num1, int num2) {
	        int result = num1 / num2;
	        return result;
	}
	}
//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
	class Solution7 {
	    public String solution(int num) {    
	 
	       String result = null;
	        if(num%2 == 0) {
	            result = "Even";
	        }else if(num%2 != 0) {
	             result = "Odd";
	        }
	        return result;
	    }
	}

}
