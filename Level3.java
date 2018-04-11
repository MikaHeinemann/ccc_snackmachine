
public class Level3 {

	public static void main(String[] args) {
		char[] temp1 = args[0].toCharArray();
		int zahl1=0;
		String szahl2;
		int zahl2;
		int feldgroeﬂe;
		int zahl3=0;
		String szahl4;
		int zahl4;
		for (int i= 65; i<91;i++) {
			if(temp1[0] == i) {
				zahl1 = i-64;
			}
		}
		if (temp1.length==3) {
			szahl2 = new String(temp1);
			zahl2 = Integer.parseInt(szahl2.substring(1));
		}else {
			szahl2 = new String(temp1);
			zahl2 = Integer.parseInt(szahl2.substring(1));
		}
		feldgroeﬂe = zahl1 * zahl2;					
		
		char[] temp2 = args[(feldgroeﬂe+1)].toCharArray();
		for (int i= 65; i<91;i++) {
			if(temp2[0] == i) {
				zahl3 = i-64;
			}
		}
		if (temp2.length==3) {
			szahl4 = new String(temp2);
			zahl4 = Integer.parseInt(szahl4.substring(1));
		}else {
			szahl4 = new String(temp2);
			zahl4 = Integer.parseInt(szahl4.substring(1));
		}
		int zahl = (zahl3*zahl4)+1;
		
		int betrag = Integer.parseInt(args[zahl]);
		int anzahlMuenzen = Integer.parseInt(args[(feldgroeﬂe+2)]);
		int muenzenges = 0;
		
		for(int m = 0; m<anzahlMuenzen;m++) {
			int offset = 2;
			muenzenges += Integer.parseInt(args[offset+m+feldgroeﬂe+1]);
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
