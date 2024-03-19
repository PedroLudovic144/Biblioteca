public class TesteReferencias {
    public static void main(String[] args) {
        Livro livroA = new Livro();

        livroA.titulo = "Teste de referencia";
        System.out.println("Livro A :" +livroA.titulo);

        Livro livroB = livroA;
        System.out.println("Livro B:" + livroB.titulo);

        livroB.titulo = "Teste de referencia II";
        System.out.println("Livro B::" + livroB.titulo);

        System.out.println("Livro A"+livroA.titulo);

        System.out.println(livroA);
        System.out.println(livroB);
    }
}
/*
* main + Enter = public static void main(String[] args) {

} */
