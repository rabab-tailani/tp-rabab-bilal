package ma.mini_projet_hotel;

public class Chambre {

	public int nbrChombreReserver(int[] t) {
		int som=0;
		
		for (int i = 0;i<t.length;i++) {
			if(t[i]==1)
				som++;
			
		}
		return som;
	}
	
	public int nbrChombreLibre(int[] t) {
		int som=0;
		
		for (int i = 0;i<t.length;i++) {
			if(t[i]==0)
				som++;
			
		}
			
		return som;
	}

	public int preChambreLibre(int[] t) {
		int p=0;
		
		for (int i = 0;i<t.length;i++) {
			if(t[i]==0) {
				p=i;
				break;
			}
			
		}
		
		return p;
	}
	
	public int derChambreLibre(int[] t) {
		int p=0;
		
		for (int i =t.length-1;i>0;i--) {
			if(t[i]==0) {
				p=i;
				break;
			}
			
		}
		
		return p;
	}

	public void resChambre(int[] t,int pos) {
		t[pos]=1;
	}

	public void libChambre(int[] t,int pos) {
		t[pos]=0;
	}
	
}
