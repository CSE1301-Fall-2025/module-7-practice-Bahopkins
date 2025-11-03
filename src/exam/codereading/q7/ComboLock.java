package exam.codereading.q7;

public class ComboLock {
	private final int[] secret;
	private int numTries;
	private int maxTries;
	private int[] recentTry;
	
	public ComboLock( int[] secret , int maxTries ) {
		System.out.println("C") ;
		this.secret = secret ;
		this.maxTries = maxTries ;
		this.numTries = 0 ;
		this.recentTry = new int[ secret.length ] ; // all zero
	}
	
	public String toString() {
		String ans = "#" + this.numTries;
		for( int i =0; i < recentTry.length ; i++ ) {
			ans = ans + " " + recentTry [ i ] ;
		}
		return ans ;
	}
	
	public boolean trySoln ( int [] guess ) {
		numTries = numTries + 1 ;
		System.out.println ( "T: " + numTries + " / " + maxTries ) ;
		recentTry = guess ;
		if( numTries > maxTries ) {
			System.out.println("X") ;
			return false;
		}
		for(int i=0; i < secret.length ; i++ ) {
			if (secret[i] != guess[i] ) {
				System.out.println("F") ;
				return false ;
			}
		}
		System.out.println("G");
		return true;
	}
}
