import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
			System.out.println("enter the elements");
			for(int i = 0; i<n;i++){
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			for(int i = 0; i<n-1; i+=2){
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
    System.out.println("wave arrays");
			for(int x:a){
				System.out.println(x+ " ");
			}
		
		
	}
}
