package basicPrograms;
import java.util.*;

public class sumOfNNaturalNumberRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		int sum=0;
		
		sum = getsum(n);
		System.out.println(sum);
	}
	
	public static int getsum(int n) {
		if(n==0)
			return 0;
			
		return n+ getsum(n-1);
		
	}

}
