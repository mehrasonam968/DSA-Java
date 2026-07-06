import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int a[] = { 6,8,1,2,4,9,0};
		int n = a.length;
		int d =3;
		reverse(a, 0, d-1);
				reverse(a, d, n-1);
					reverse(a, 0, n-1);
					System.out.println(Arrays.toString(a));
	}
	public static   void reverse(int arr[] ,int i , int j){
		while(i<j){
			int temp =arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
			i++;
			j--;
			
		}
		
	}
