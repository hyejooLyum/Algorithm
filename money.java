import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int arr[] = new int[n];
		int ans = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		while(a!=0) { //돈이 0이 될때까지
			int chk = 0;
			for(int i= arr.length-1;i>=0;i--) { 
				if(arr[i]<=a) { 
					chk=i; 
					break; 
				}
			}
				ans += a / arr[chk]; 
				a = a % arr[chk];
                // 다시 while문이 돈다
			
		}
	
		System.out.println(ans);
	}
}
