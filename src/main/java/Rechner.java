public class Rechner {
	private Warengruppe kurzwaren = new Warengruppe();
    private Warengruppe buero = new Warengruppe();
    private Warengruppe wolle = new Warengruppe();
    private double rest;
    private double einkaufspreis;
    private double umsatzMonat;
    private double umsatzWoche;
    private double umsatzJahr;
    private double umsatzTag;
   

    void berechne(double ziel, double post, double aufschlagWolle, double aufschlagBuero, double aufschlagKurzware, double anteilWolle, double anteilBuero, double anteilKurzware) {
        rest = ziel - post;
      
		kurzwaren.berechne(rest, anteilKurzware, aufschlagKurzware);
        buero.berechne(rest, anteilBuero, aufschlagBuero);
        wolle.berechne(rest, anteilWolle, aufschlagWolle);
        einkaufspreis = kurzwaren.getEinkauf() + buero.getEinkauf() + wolle.getEinkauf();
        umsatzMonat = kurzwaren.getUmsatzMonat() + buero.getUmsatzMonat() + wolle.getUmsatzMonat();
        umsatzWoche = kurzwaren.getUmsatzWoche() + buero.getUmsatzWoche() + wolle.getUmsatzWoche();
        umsatzJahr = kurzwaren.getUmsatzJahr() + buero.getUmsatzJahr() + wolle.getUmsatzJahr();
        umsatzTag = kurzwaren.getUmsatzTag() + buero.getUmsatzTag() + wolle.getUmsatzJahr();
    }

    public double getRest() {
        return rest;
    }

    public Warengruppe getKurzwaren() {
        return kurzwaren;
    }

    public Warengruppe getBuero() {
        return buero;
    }

    public Warengruppe getWolle() {
        return wolle;
    }

    public double getEinkaufspreis() {
        return einkaufspreis;
    }

    public double getUmsatzMonat() {
        return umsatzMonat;
    }

    public double getUmsatzWoche() {
        return umsatzWoche;
    }

    public double getUmsatzJahr() {
        return umsatzJahr;
    }

    public double getUmsatzTag() {
        return umsatzTag;
    }
}
