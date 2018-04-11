
public class Level1 {

	public static void main(String[] args) {
		int betrag = Integer.parseInt(args[0]);
		int anzahlMuenzen = Integer.parseInt(args[1]);
		int[] muenzen = new int[anzahlMuenzen];
		int muenzenges = 0;
		for(int m = 0; m<anzahlMuenzen;m++) {
			int offset = 2;
			muenzenges += Integer.parseInt(args[offset+m]);
		}
		System.out.println(muenzenges-betrag);
	}

}
