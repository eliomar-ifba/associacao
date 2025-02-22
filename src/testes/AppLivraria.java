package testes;

import modellivraria.Livro;

public class AppLivraria {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Java use a cabeça");
        livro.setValor(100);

        livro.aplicarDesconto(0.1);

        System.out.println("Valor: " + livro.getValor());

    }
}
