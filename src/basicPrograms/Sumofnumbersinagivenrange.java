package basicPrograms;
import java.util.*;

public class Sumofnumbersinagivenrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int start= sc.nextInt();
		int end= sc.nextInt();
		
		int sum=0;
		
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		System.out.println(sum);
		

	}

}
