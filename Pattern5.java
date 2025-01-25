
public class Pattern5 {

	public static void main(String[] args) {
		int v=0;
		for(int r = 1;r<=4;r++) {
			for(int c=1;c<=r;c++) {
				if( c==1) {
					if((r+c) % 2 == 0) {
						System.out.print("1 ");
					}
					else {
						System.out.print("0" );
					}
				}// c
			}
		}
		
	}

}
