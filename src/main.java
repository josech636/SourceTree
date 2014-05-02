
public class main {

	public static void main(String[] args) {
		Escritor e = new Escritor("testingSourcetree");
		System.out.println(e.getSentences());
		
		int calculadora = e.suma(3, 5);
		
		System.out.println(calculadora);
	}
}
