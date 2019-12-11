package zadatak6;

public class Mobitel {

	private String proizvodjac;
	private String model;
	private double brzinaProcesora;
	private int brojJezgriProcesora;
	private double kolicinaRamMemorije;
	private double kolicinaMemorije;
	private int brojMegapikselaKamere;
	String[] nizInstaliranihAplikacija = new String[20];

	public Mobitel(String proizvodjac, String model, double brzinaProcesora, int brojJezgriProcesora, 
			double kolicinaRamMemorije, double kolicinaMemorije, int brojMegapikselaKamere) {
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.brzinaProcesora = brzinaProcesora;
		this.brojJezgriProcesora = brojJezgriProcesora;
		this.kolicinaRamMemorije = kolicinaRamMemorije;
		this.kolicinaMemorije = kolicinaMemorije;
		this.brojMegapikselaKamere = brojMegapikselaKamere;
	}

	void ispisiSpecifikaciju() {
		System.out.println(
				this.proizvodjac + " " + this.model + " " + this.brzinaProcesora + " " + this.brojJezgriProcesora + "\n"+
				this.kolicinaRamMemorije + " " + this.kolicinaMemorije + " " + this.brojMegapikselaKamere);
	}

	void instalirajAplikaciju(String imeapl) {
		if (this.nizInstaliranihAplikacija.length > 20) {
			System.out.println("Ne mozete vise od 20 aolikacija instalirati!");
		} else {
			for(int i = 0; i < nizInstaliranihAplikacija.length; i++) {
				if(nizInstaliranihAplikacija[i].equals(null)) {
					nizInstaliranihAplikacija[i] = imeapl;
				}
			}
		}
	}
	
	void obrisiAplikaciju(String imeapl) {
		for(int i = 0; i < nizInstaliranihAplikacija.length; i++) {
			if(nizInstaliranihAplikacija[i].equals(imeapl)) {
				nizInstaliranihAplikacija[i] = null;
			}
		}
	}

}
