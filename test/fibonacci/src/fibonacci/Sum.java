package fibonacci;

public class Sum {
	
	public static void main(String[] args) {
		
	
		int f= 4000000;
		int sum = 0;
		
		for(int i=1;i<=f;i++) {
			if(i%2==0) {
				
				sum+=i;
				
				sum = i;
				i = sum+i;
				
				
				
				
			}
			
			
		}
		System.out.println(sum);

	
		
	}

}
