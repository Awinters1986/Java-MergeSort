/*  Date:           06/22/2020
 *  Filename:       PS3Name.java
 */

public class PS3Name {
	
	public static void main(String[] args) {
		PS3Name Name = new PS3Name();
		
		int n = 10;
	}
	
	//O(n^3) & Omega(lgn)
	public void run(int n) {
		if((n/2) > 1) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					for(int k = 0; k < n; k++) {
						System.out.println("Winters");
					}
				}
			}
		} else {
			for (int i = 0; i < n/2; i++) {
				System.out.println("Winters");
			}
		}
		
	}
	
	//Theta(nlgn)
	public void run2(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.println("Winters");
			}
		}		
	}
	
	//O(2^n) & Omega(n^2lgn)
	public void run3(int n) {
		if(n > 1) {
			System.out.println("Winters");
			run(n-1);
		} else {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					for(int k = 0; k < n/2; k++) {
						System.out.println("Winters");
					}
				}
			}
			
		}
			
	}

}
