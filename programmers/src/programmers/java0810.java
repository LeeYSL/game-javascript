package programmers;

public class java0810 {
	/*  정수를 문자열로 바꾸기
	 *   
	 * String.valueOf() : null 이라는 문자열로 처리한다.
	 *    -> null을 문자열 자체로 처리해야 되는 상황에서는 String.valueOf() 로 사용해야 됨.
	 *    
	 * Integer.toString : Null PointerException으로 오류 처리를 한다.
	 * 
	 *  Integer.parseInt() : String 타입을 int 형으로 바꾸어 준다.문자열이 숫자로만 이루어져 있어야 한다.
	 */

	public class Solution1 { 
		//자릿수 더하기
	    public int solution(int n) {
	      int result = 0; // result 값을 0으로 초기화
	        String s = Integer.toString(n); // n을 Intege.toString(); 를 통해 문자열로 바꾼다.
	        
	        for(int i =0; i < s.length(); i++) { 
	            result += Integer.parseInt(s.substring(i,i+1)); // 다시 int 형으로 바꾸어준다.
	            
	        }

	        return result;
	    }
	}
	class Solution2 {
		// 문자형 숫자로 바꿔보기
	    public int solution(String s) {
	        int result = 0;
	        result = Integer.parseInt(s);
	        
	        return result;
	    }
	}
}