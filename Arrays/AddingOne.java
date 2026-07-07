import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> ans = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] =  new int[n];
		for(int i = 0; i<n;i++){
			a[i] = sc.nextInt();
		}
		int carry = 1;
		for(int i = n-1 ; i>=0; i--){
			
				int sum = a[i]+carry;
				ans.add(sum%10);
				carry = sum/10;
		}
				if(carry >0){
					ans.add(carry);
				}
		
				 Collections.reverse(ans);
				 System.out.println(ans);
	
	}
}
