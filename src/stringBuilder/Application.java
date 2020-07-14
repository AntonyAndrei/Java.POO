package stringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentarios c1 = new Comentarios("Have a nice trip!");
		Comentarios c2 = new Comentarios("Wow that`s awesome!");
		
		Posts p1 = new Posts(data.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand",
				"I`m going to visit this wondeerful country!",
				12);
		
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		System.out.println(p1);
		
		
	}

}
