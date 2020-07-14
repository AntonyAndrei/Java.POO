package stringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posts {
	
	private static SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


	private Date moment;
	private String titulo;
	private String conteudo;
	private int likes;
	
	private List<Comentarios> comentarios = new ArrayList<>();
	
	public Posts() {
		
	}

	public Posts(Date moment, String titulo, String conteudo, int likes) {
		this.moment = moment;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}

	public void adicionarComentario (Comentarios comentario) {
		comentarios.add(comentario);
	}
	
	public void removerComentario (Comentarios comentario) {
		comentarios.remove(comentario);
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(data.format(moment) + "\n");
		sb.append("Comentarios: " + "\n");
		for (Comentarios c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}

		return sb.toString();
	}
	
	
	
}
