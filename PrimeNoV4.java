
public class PrimeNoV4 {

	public static void main(String[] args) {
		
		for(int i=50,k=0;i<=230;i++) {
			
			int num = i;
			
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num % p == 0) counter++;
				
			}//for p
			if(counter == 2) {
				System.out.println(num+"");
				if(++k % 8 == 0) {
					
				}
			}// if counter
		}

	}

}
