package programmers;

public class java0818 {
      public void main(String[] arg) {
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("========");

	for (int i = 0; i <= 5; i++) {
		for (int j = 0; j <= 5; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	System.out.println("=======");

	for (int i = 5; i > 0; i--) {
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}

	System.out.println("=========");

	for (int i = 2; i <= 9; i++) {
		for(int j = 2; j <=9; j++) {
			System.out.println(i+"x"+j+"="+i*j);
		}
		
	}

//1부터 100까지의 합
int sum = 0;
for(int i=0; i < 5; i++ ) {
    sum += i;
}
System.out.println("sum" + sum);
}
}
