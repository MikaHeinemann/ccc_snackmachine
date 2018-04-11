
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
			int output = muenzenges-betrag;
			while (output > 0) {
				if(output >= 200) {
					cent200++;
					output -= 200;
				}else if(output>=100) {
					cent100++;
					output -= 100;
				}else if(output>=50) {
					cent50++;
					output -= 50;
				}else if(output>=20) {
					cent20++;
					output -= 20;
				}else if(output>=10) {
					cent10++;
					output -= 10;
				}else if(output>=5) {
					cent5++;
					output -= 5;
				}else if(output>=2) {
					cent2++;
					output -= 2;
				}else if(output>=1) {
					cent1++;
					output -= 1;
				}
			}
			
			System.out.println("CHANGE "+cent1+" "+cent2+" "+cent5+" "+cent10+" "+cent20+" "+cent50+" "+cent100+" "+cent200);
		}else {
			System.out.println("MISSING "+((muenzenges-betrag)*(-1)));
		}
	}

}
