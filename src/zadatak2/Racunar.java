package zadatak2;

public class Racunar {
	
	private double kolicinaRama;
	private double kapacitetHD;
	private double brzinaProcesora;
	private double dijagonalaMonitora;
	private double nabavnaCijena;
	
	public Racunar(double kolicinaRama, double kapacitetHD, double brzinaProcesora, 
			double dijagonalaMonitora, double nabavnaCijena) {
		this.kolicinaRama = kolicinaRama;
		this.kapacitetHD = kapacitetHD;
		this.brzinaProcesora = brzinaProcesora;
		this.dijagonalaMonitora = dijagonalaMonitora;
		this.nabavnaCijena = nabavnaCijena;
	}
	
	double izracunajCijenu() {
		return this.nabavnaCijena + (this.nabavnaCijena*10)/100;
	}

	public double getKolicinaRama() {
		return kolicinaRama;
	}

	public double getKapacitetHD() {
		return kapacitetHD;
	}

	public double getBrzinaProcesora() {
		return brzinaProcesora;
	}

	public double getDijagonalaMonitora() {
		return dijagonalaMonitora;
	}

	@Override
	public String toString() {
		return "Racunar: " + kolicinaRama + " GB, kapacitet: " + kapacitetHD + " GB, brzinaProcesora: "
				+ brzinaProcesora + " GHz, dijagonalaMonitora: " + dijagonalaMonitora + " In, nabavnaCijena "
				+ nabavnaCijena	+ " KM";
	}
	
	

}
