package exam.codereading.q1;

public class VersionNumber {
	private int major ;
	private int minor ;

	public VersionNumber ( int major ) {
		System.out.println( "C" ) ;
		this.major = major ;
		this.minor = 1 ;
	}

	public String toString() {
		String version = " v " + major + " . " + minor ;
		System.out.println ( "S : " + version ) ;
		return version ;
	}

	boolean isEquivalent (VersionNumber other ) {
		String instance = this.toString ( ) ;
		return instance.equals( other.toString ( ) ) ;
	}

	public void minorBump ( ) {
		System.out.println ( "L: " + this ) ;
		minor = minor + 1 ;
	}

	public void majorBump ( ) {
		System . out . println ( "B" ) ;
		major = major + 1 ;
		minor = 0 ;
	}
}
