
public class Pattern4 {

	public static void main(String[] args) {
		
		for(int r=1;r<=15;r++) {
			for(int k=1;k<=17;k++) {
		}
		for(int c=1;c<=15;c++) {
				if( (r==1) || (r==15)) {
					System.out.print("*");
				} 
				else {
					if( (c==1) || (c==15)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
		System.out.println();
		}

	}

}
