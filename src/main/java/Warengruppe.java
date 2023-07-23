public class Warengruppe {
	
	 private double umsatzMonat;
	    private double umsatzJahr;
	    private double umsatzWoche;
	    private double umsatzTag;
	    private double gewinn;
	    private double einkauf;
	    private double verkauf;

	    public void berechne(double ziel, double anteil, double aufschlag) {
	        gewinn = ziel * anteil;
	        einkauf = gewinn / aufschlag;
	        verkauf = einkauf + gewinn;
	        berechneUmsatz(verkauf);
	    }

	    private void berechneUmsatz (double umsatzMonat) {
	        umsatzJahr = umsatzMonat * 12;
	        umsatzWoche = umsatzJahr / 52;
	        umsatzTag = umsatzJahr / 365;
	        this.umsatzMonat = umsatzMonat;
	    }

	    public double getGewinn() {
	        return gewinn;
	    }

	    public double getEinkauf() {
	        return einkauf;
	    }

	    public double getVerkauf() {
	        return verkauf;
	    }

	    public double getUmsatzMonat() {
	        return umsatzMonat;
	    }

	    public double getUmsatzJahr() {
	        return umsatzJahr;
	    }

	    public double getUmsatzWoche() {
	        return umsatzWoche;
	    }

	    public double getUmsatzTag() {
	        return umsatzTag;
	    }
	}
