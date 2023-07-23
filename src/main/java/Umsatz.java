import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

public class Umsatz implements ActionListener {

	private JFrame frmSollUmsatzRechner;
	private JTextField Ziel;
	private JTextField Post;
	private JTextField Rest;
	private JTextField Anteile;
	private JTextField Aufschlag;
	private JTextField Wolle;
	private JTextField Büro;
	private JTextField Kurzware;
	private JTextField Aufschlag_Wolle;
	private JTextField Aufschlag_Büro;
	private JTextField Aufschlag_Kurzware;
	private JTextField Anteile_Wolle;
	private JTextField Anteile_Büro;
	private JTextField Anteile_Kurzware;
	private JTextField Ausgabe_Umsatz_Woche;
	private JTextField Ausgaben_Umsatz_Monat;
	private JTextField Ausgabe_Umsatz_Tag;
	private JTextField Ausgabe_Umsatz_Jahr;
	private JTextField txtUmsatztag;
	private JTextField UmsatzWoche;
	private JTextField UmsatzJahr;
	private JTextField UmsatzMonat;
	private JTextField Zieleingabe;
	private JTextField Post_Eingabe;
	private JTextField Ausgabe_Rest;
	private JTextField Melanie;
	private JTextField Error;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Umsatz window = new Umsatz();
					window.frmSollUmsatzRechner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Umsatz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSollUmsatzRechner = new JFrame();
		frmSollUmsatzRechner.setForeground(new Color(0, 255, 0));
		frmSollUmsatzRechner.setFont(new Font("Arial Black", Font.PLAIN, 12));
		frmSollUmsatzRechner.setTitle("Soll Umsatz Rechner");
		frmSollUmsatzRechner.setResizable(false);
		frmSollUmsatzRechner.getContentPane().setBackground(Color.MAGENTA);
		frmSollUmsatzRechner.getContentPane().setForeground(Color.GRAY);
		frmSollUmsatzRechner.setBounds(100, 100, 606, 374);
		frmSollUmsatzRechner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSollUmsatzRechner.getContentPane().setLayout(null);
		
		Ziel = new JTextField();
		Ziel.setEditable(false);
		Ziel.setForeground(new Color(255, 255, 0));
		Ziel.setHorizontalAlignment(SwingConstants.CENTER);
		Ziel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Ziel.setBackground(new Color(255, 0, 255));
		Ziel.setText("Ziel");
		Ziel.setBounds(10, 34, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Ziel);
		Ziel.setColumns(10);
		
		Post = new JTextField();
		Post.setEditable(false);
		Post.setForeground(new Color(255, 255, 0));
		Post.setHorizontalAlignment(SwingConstants.CENTER);
		Post.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Post.setBackground(new Color(255, 0, 255));
		Post.setText("Post");
		Post.setBounds(10, 65, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Post);
		Post.setColumns(10);
		
		Rest = new JTextField();
		Rest.setEditable(false);
		Rest.setForeground(new Color(255, 255, 0));
		Rest.setHorizontalAlignment(SwingConstants.CENTER);
		Rest.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Rest.setBackground(new Color(255, 0, 255));
		Rest.setText("Rest");
		Rest.setBounds(10, 96, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Rest);
		Rest.setColumns(10);
		
		Anteile = new JTextField();
		Anteile.setEditable(false);
		Anteile.setForeground(new Color(255, 255, 0));
		Anteile.setHorizontalAlignment(SwingConstants.CENTER);
		Anteile.setFont(new Font("Arial Black", Font.BOLD, 12));
		Anteile.setBackground(Color.MAGENTA);
		Anteile.setText("Anteile");
		Anteile.setBounds(482, 11, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Anteile);
		Anteile.setColumns(10);
		
		Aufschlag = new JTextField();
		Aufschlag.setEditable(false);
		Aufschlag.setForeground(new Color(255, 255, 0));
		Aufschlag.setFont(new Font("Arial Black", Font.BOLD, 12));
		Aufschlag.setBackground(Color.MAGENTA);
		Aufschlag.setText("Aufschlag");
		Aufschlag.setBounds(386, 11, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Aufschlag);
		Aufschlag.setColumns(10);
		
		Wolle = new JTextField();
		Wolle.setEditable(false);
		Wolle.setForeground(new Color(255, 255, 0));
		Wolle.setHorizontalAlignment(SwingConstants.CENTER);
		Wolle.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Wolle.setBackground(new Color(255, 0, 255));
		Wolle.setText("Wolle");
		Wolle.setBounds(288, 34, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Wolle);
		Wolle.setColumns(10);
		
		Büro = new JTextField();
		Büro.setEditable(false);
		Büro.setForeground(new Color(255, 255, 0));
		Büro.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Büro.setBackground(new Color(255, 0, 255));
		Büro.setHorizontalAlignment(SwingConstants.CENTER);
		Büro.setText("B\u00FCro");
		Büro.setBounds(288, 65, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Büro);
		Büro.setColumns(10);
		
		Kurzware = new JTextField();
		Kurzware.setEditable(false);
		Kurzware.setForeground(new Color(255, 255, 0));
		Kurzware.setHorizontalAlignment(SwingConstants.CENTER);
		Kurzware.setFont(new Font("Arial Black", Font.PLAIN, 15));
		Kurzware.setBackground(new Color(255, 0, 255));
		Kurzware.setText("Kurzware");
		Kurzware.setBounds(288, 96, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Kurzware);
		Kurzware.setColumns(10);
		
		Aufschlag_Wolle = new JTextField();
		Aufschlag_Wolle.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Aufschlag_Wolle.setBackground(Color.GREEN);
		Aufschlag_Wolle.setBounds(386, 34, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Aufschlag_Wolle);
		Aufschlag_Wolle.setColumns(10);
		
		Aufschlag_Büro = new JTextField();
		Aufschlag_Büro.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Aufschlag_Büro.setBackground(Color.GREEN);
		Aufschlag_Büro.setBounds(386, 65, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Aufschlag_Büro);
		Aufschlag_Büro.setColumns(10);
		
		Aufschlag_Kurzware = new JTextField();
		Aufschlag_Kurzware.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Aufschlag_Kurzware.setBackground(Color.GREEN);
		Aufschlag_Kurzware.setBounds(386, 96, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Aufschlag_Kurzware);
		Aufschlag_Kurzware.setColumns(10);
		
		Anteile_Wolle = new JTextField();
		Anteile_Wolle.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Anteile_Wolle.setBackground(Color.GREEN);
		Anteile_Wolle.setBounds(482, 34, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Anteile_Wolle);
		Anteile_Wolle.setColumns(10);
		
		Anteile_Büro = new JTextField();
		Anteile_Büro.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Anteile_Büro.setBackground(Color.GREEN);
		Anteile_Büro.setBounds(482, 65, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Anteile_Büro);
		Anteile_Büro.setColumns(10);
		
		Anteile_Kurzware = new JTextField();
		Anteile_Kurzware.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Anteile_Kurzware.setBackground(Color.GREEN);
		Anteile_Kurzware.setBounds(482, 96, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Anteile_Kurzware);
		Anteile_Kurzware.setColumns(10);
		
		JButton Berechne = new JButton("Berechne");
		Berechne.setForeground(new Color(0, 0, 0));
		Berechne.setBackground(new Color(0, 255, 0));
		Berechne.setBounds(33, 220, 119, 53);
		Berechne.addActionListener(this);
		frmSollUmsatzRechner.getContentPane().add(Berechne);
		
		Ausgabe_Umsatz_Woche = new JTextField();
		Ausgabe_Umsatz_Woche.setEditable(false);
		Ausgabe_Umsatz_Woche.setForeground(new Color(0, 255, 0));
		Ausgabe_Umsatz_Woche.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Ausgabe_Umsatz_Woche.setHorizontalAlignment(SwingConstants.CENTER);
		Ausgabe_Umsatz_Woche.setBackground(new Color(255, 0, 255));
		Ausgabe_Umsatz_Woche.setBounds(348, 253, 103, 20);
		frmSollUmsatzRechner.getContentPane().add(Ausgabe_Umsatz_Woche);
		Ausgabe_Umsatz_Woche.setColumns(10);
		
		Ausgaben_Umsatz_Monat = new JTextField();
		Ausgaben_Umsatz_Monat.setEditable(false);
		Ausgaben_Umsatz_Monat.setForeground(new Color(0, 255, 0));
		Ausgaben_Umsatz_Monat.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Ausgaben_Umsatz_Monat.setBackground(new Color(255, 0, 255));
		Ausgaben_Umsatz_Monat.setHorizontalAlignment(SwingConstants.CENTER);
		Ausgaben_Umsatz_Monat.setBounds(348, 191, 103, 20);
		frmSollUmsatzRechner.getContentPane().add(Ausgaben_Umsatz_Monat);
		Ausgaben_Umsatz_Monat.setColumns(10);
		
		Ausgabe_Umsatz_Tag = new JTextField();
		Ausgabe_Umsatz_Tag.setEditable(false);
		Ausgabe_Umsatz_Tag.setForeground(new Color(0, 255, 0));
		Ausgabe_Umsatz_Tag.setHorizontalAlignment(SwingConstants.CENTER);
		Ausgabe_Umsatz_Tag.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Ausgabe_Umsatz_Tag.setBackground(new Color(255, 0, 255));
		Ausgabe_Umsatz_Tag.setBounds(348, 284, 103, 20);
		frmSollUmsatzRechner.getContentPane().add(Ausgabe_Umsatz_Tag);
		Ausgabe_Umsatz_Tag.setColumns(10);
		
		Ausgabe_Umsatz_Jahr = new JTextField();
		Ausgabe_Umsatz_Jahr.setEditable(false);
		Ausgabe_Umsatz_Jahr.setForeground(new Color(0, 255, 0));
		Ausgabe_Umsatz_Jahr.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Ausgabe_Umsatz_Jahr.setBackground(new Color(255, 0, 255));
		Ausgabe_Umsatz_Jahr.setHorizontalAlignment(SwingConstants.CENTER);
		Ausgabe_Umsatz_Jahr.setBounds(348, 220, 103, 20);
		frmSollUmsatzRechner.getContentPane().add(Ausgabe_Umsatz_Jahr);
		Ausgabe_Umsatz_Jahr.setColumns(10);
		
		txtUmsatztag = new JTextField();
		txtUmsatztag.setEditable(false);
		txtUmsatztag.setForeground(new Color(255, 255, 0));
		txtUmsatztag.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtUmsatztag.setBackground(new Color(255, 0, 255));
		txtUmsatztag.setHorizontalAlignment(SwingConstants.CENTER);
		txtUmsatztag.setText("Umsatz-Tag");
		txtUmsatztag.setBounds(209, 284, 119, 20);
		frmSollUmsatzRechner.getContentPane().add(txtUmsatztag);
		txtUmsatztag.setColumns(10);
		
		UmsatzWoche = new JTextField();
		UmsatzWoche.setEditable(false);
		UmsatzWoche.setForeground(new Color(255, 255, 0));
		UmsatzWoche.setHorizontalAlignment(SwingConstants.CENTER);
		UmsatzWoche.setFont(new Font("Arial Black", Font.PLAIN, 12));
		UmsatzWoche.setBackground(new Color(255, 0, 255));
		UmsatzWoche.setText("Umsatz-Woche");
		UmsatzWoche.setBounds(209, 253, 119, 20);
		frmSollUmsatzRechner.getContentPane().add(UmsatzWoche);
		UmsatzWoche.setColumns(10);
		
		UmsatzJahr = new JTextField();
		UmsatzJahr.setEditable(false);
		UmsatzJahr.setForeground(new Color(255, 255, 0));
		UmsatzJahr.setHorizontalAlignment(SwingConstants.CENTER);
		UmsatzJahr.setFont(new Font("Arial Black", Font.PLAIN, 12));
		UmsatzJahr.setBackground(new Color(255, 0, 255));
		UmsatzJahr.setText("Umsatz-Jahr");
		UmsatzJahr.setBounds(209, 222, 119, 20);
		frmSollUmsatzRechner.getContentPane().add(UmsatzJahr);
		UmsatzJahr.setColumns(10);
		
		UmsatzMonat = new JTextField();
		UmsatzMonat.setEditable(false);
		UmsatzMonat.setForeground(new Color(255, 255, 0));
		UmsatzMonat.setHorizontalAlignment(SwingConstants.CENTER);
		UmsatzMonat.setFont(new Font("Arial Black", Font.PLAIN, 12));
		UmsatzMonat.setBackground(new Color(255, 0, 255));
		UmsatzMonat.setText("Umsatz-Monat");
		UmsatzMonat.setBounds(209, 191, 119, 20);
		frmSollUmsatzRechner.getContentPane().add(UmsatzMonat);
		UmsatzMonat.setColumns(10);
		
		Zieleingabe = new JTextField();
		Zieleingabe.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Zieleingabe.setBackground(new Color(0, 255, 0));
		Zieleingabe.setForeground(new Color(0, 0, 0));
		Zieleingabe.setBounds(118, 34, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Zieleingabe);
		Zieleingabe.setColumns(10);
		
		Post_Eingabe = new JTextField();
		Post_Eingabe.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Post_Eingabe.setBackground(Color.GREEN);
		Post_Eingabe.setForeground(Color.BLACK);
		Post_Eingabe.setBounds(118, 65, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Post_Eingabe);
		Post_Eingabe.setColumns(10);
		
		Ausgabe_Rest = new JTextField();
		Ausgabe_Rest.setEditable(false);
		Ausgabe_Rest.setForeground(new Color(0, 255, 0));
		Ausgabe_Rest.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Ausgabe_Rest.setBackground(new Color(255, 0, 255));
		Ausgabe_Rest.setBounds(118, 96, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Ausgabe_Rest);
		Ausgabe_Rest.setColumns(10);
		
		Melanie = new JTextField();
		Melanie.setEditable(false);
		Melanie.setBackground(Color.MAGENTA);
		Melanie.setText("Melanie.B\u00FCckner");
		Melanie.setHorizontalAlignment(SwingConstants.LEFT);
		Melanie.setBounds(494, 304, 86, 20);
		frmSollUmsatzRechner.getContentPane().add(Melanie);
		Melanie.setColumns(10);
		
		Error = new JTextField();
		Error.setForeground(new Color(128, 255, 0));
		Error.setHorizontalAlignment(SwingConstants.CENTER);
		Error.setFont(new Font("Arial Black", Font.PLAIN, 16));
		Error.setBackground(new Color(255, 0, 255));
		Error.setEditable(false);
		Error.setBounds(104, 130, 368, 50);
		frmSollUmsatzRechner.getContentPane().add(Error);
		Error.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.calculate();
	}

	private void calculate() {
		
		double ziel = 0;
		double post = 0;
		double aufschlagWolle = 0;
		double aufschlagBuero = 0 ;
		double aufschlagKurzware = 0;
		double anteilWolle = 0;
		double anteilKurzware = 0;
		double anteilBuero = 0;
		
	try {
		
		 ziel = Double.parseDouble(Zieleingabe.getText());
		 post = Double.parseDouble(Post_Eingabe.getText());
		 aufschlagWolle = Double.parseDouble(Aufschlag_Wolle.getText()) / 100.0;
		 aufschlagBuero = Double.parseDouble(Aufschlag_Büro.getText()) / 100.0;
		 aufschlagKurzware = Double.parseDouble(Aufschlag_Kurzware.getText()) / 100.0;
		 anteilWolle = Double.parseDouble(Anteile_Wolle.getText()) / 100.0;
		 anteilKurzware = Double.parseDouble(Anteile_Kurzware.getText()) / 100.0;
		 anteilBuero = Double.parseDouble(Anteile_Büro.getText()) / 100.0;
		
	} catch (NumberFormatException e) {
		Error.setText("Bitte nur Zahlen eingeben");
	}
		
	

		 Rechner rechner = new Rechner();
		 rechner.berechne(ziel, post, aufschlagWolle, aufschlagBuero, aufschlagKurzware, anteilWolle, anteilBuero, anteilKurzware );

        Ausgabe_Rest.setText(""+rechner.getRest());
        Ausgaben_Umsatz_Monat.setText(""+rechner.getUmsatzMonat());
        Ausgabe_Umsatz_Jahr.setText(""+rechner.getUmsatzJahr());
        Ausgabe_Umsatz_Woche.setText(String.format("%5.2f", rechner.getUmsatzWoche()));
        Ausgabe_Umsatz_Tag.setText(String.format("%5.2f", rechner.getUmsatzTag()));
	 
	}
	}

