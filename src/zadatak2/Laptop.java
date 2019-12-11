package zadatak2;

public class Laptop extends Racunar {

	private int trajanjeBaterije;
	private double cijenaLaptopa;

	public Laptop(double kolicinaRama, double kapacitetHD, double brzinaProcesora, double dijagonalaMonitora,
			double nabavnaCijena, int trajanjeBaterije) {
		super(kolicinaRama, kapacitetHD, brzinaProcesora, dijagonalaMonitora, nabavnaCijena);

		this.trajanjeBaterije = trajanjeBaterije;
	}

	public int getTrajanjeBaterije() {
		return trajanjeBaterije;
	}

	double izracunajCijenu() {

		return super.izracunajCijenu() + (super.izracunajCijenu() * 15) / 100;
	}

	@Override
	public String toString() {
		return "Laptop: " + super.getKolicinaRama() + " GB, " + super.getKapacitetHD()+ " GB, " +
				super.getBrzinaProcesora() + " GHz, " + super.getDijagonalaMonitora() + " In, " +
				"trajanje baterije " + trajanjeBaterije + ", cijena Laptopa " + this.izracunajCijenu() + "\n";
	}
	
	

}
