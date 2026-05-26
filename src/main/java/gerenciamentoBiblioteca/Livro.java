/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamentoBiblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Livro {
    private String isbn;
    private String titulo;
    private List<Autor> autores;
    private int anoPublicacao;
    private String editora;
    private String genero;
    private int quantidadeDisponivel;

    public Livro(String isbn, String titulo, int anoPublicacao, String editora, String genero, int quantidadeDisponivel) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = new ArrayList();
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.genero = genero;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
    
    
    
}
