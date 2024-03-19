public class Livro {

    String autor;
    Editora editora;
    boolean capa;
    double preco = 15;
    String dercricao ;
    String resumo;
    String titulo;
    TipoDeCapaEnum tipoCapa;
    void exibir(){
        System.out.println("Detalhes do livro:"+dercricao);
        System.out.println("Titulo:"+ titulo);
        System.out.println("Resumo:"+resumo);
        System.out.println("Valor:"+preco);
        System.out.println("Autor:"+autor);
        System.out.println("Editora"+editora);
        System.out.println("Tipo de capa:"+ tipoCapa);
        System.out.println("Sinopse:"+resumo);
        editora.exibir();
        System.out.println("Taxa de envio:"+getTaxadeEnvio());

    }
    double getTaxadeEnvio(){
        return preco*0.05;
    }


}


