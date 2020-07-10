package forEach;

public class Main {

	public static void main(String[] args) {

		String [] vetor = new String[] {"maria", "bob", "alex"};
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		
		System.out.println("-------------------------");
		 for (String nome : vetor) {
			 System.out.println(nome);
		 }
				 
	}

}
