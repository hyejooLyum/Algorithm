import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int arr[] = new int[n];
		int ans = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt(); //동전의 가치 입력받기
		}
		
		while(a!=0) { //돈이 0이 될때까지
			int chk = 0;
			for(int i= arr.length-1;i>=0;i--) { //가장 뒤가 제일 가치가 높으니까 거꾸로 돌린다
				if(arr[i]<=a) { // 지금 금액(a)보다 작으면
					chk=i; //지금 이 돈의 가치가 들어가겠구나! => 값을 넣어준다
					break; 
				}
			}
				ans += a / arr[chk]; // 그 돈의 가치로 나눈 몫을 ans 에 더하기
				a = a % arr[chk]; // 그돈의 가치로 최대한 넣은 뒤 남은 금액 넣기
                // 다시 while문이 돈다
			
		}
	
		System.out.println(ans);
	}
}