package Server;


public class Candidato {
	private String nome; //nome del candidato
	private String cognome; //cognome del candidato
	private int numeroDiVoti; //numero totale di voti ricevuti dai votanti
	private String provincia; /*variabile predisposta per eventuali votazioni per provincia 
	ps:può essere anche chiamata nazione o regione in base ai cambiamenti di importanza 
	oppure può essere più generico come nome in base al fatto se facciamo più tipi di votazione
	oppure di un'unico tipo*/

	public Candidato(String nome,String cognome, String provincia) {
		this.nome=nome;
		this.cognome=cognome;
		this.numeroDiVoti=0;
		this.provincia=provincia;
	}
	
	public boolean AggiungiVoto(int massimoVoti) {
		if(massimoVoti>this.numeroDiVoti) {
			this.numeroDiVoti++;
			return true;
		}else {
			return false;
		}
	}
	
	public void AzzeraNumVoti() {
		this.numeroDiVoti=0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public int getNumeroDiVoti() {
		return numeroDiVoti;
	}
	
	public void setNumeroDiVoti(int numeroDiVoti) {
		this.numeroDiVoti = numeroDiVoti;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}
