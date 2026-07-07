import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
	
int a[] = {1,1,1,0,0,0,0};;
int n =     a.length;
int i = 0;
int j = n-1;
while(i<j){
	if(a[i] == 0) i++;
	if(a[j] == 1) j--;
	if(a[i]==1){
		a[i] = 0;
		a[j] = 1;
		i++;
		j--;
	
	}
	}
	System.out.println(Arrays.toString(a));
}
