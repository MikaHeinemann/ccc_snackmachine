
public class Level2 {

	public static void main(String[] args) {
		int betrag = Integer.parseInt(args[0]);
		int anzahlMuenzen = Integer.parseInt(args[1]);
		int muenzenges = 0;
		for(int m = 0; m<anzahlMuenzen;m++) {
			int offset = 2;
			muenzenges += Integer.parseInt(args[offset+m]);
		}
		int cent1 = 0;
		int cent2 = 0;
		int cent5 = 0;
		int cent10 = 0;
		int cent20 = 0;
		int cent50 = 0;
		int cent100 = 0;
		int cent200 = 0;
		if (muenzenges-betrag>= 0) {
			
			
			
			
			System.out.println("CHANGE "+(muenzenges-betrag));
		}else {
			System.out.println("MISSING "+((muenzenges-betrag)*(-1)));
		}
	}

}
