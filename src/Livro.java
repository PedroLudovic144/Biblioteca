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
        System.out.println("editora.exibir();");
        System.out.println("Taxa de envio:"+getTaxadeEnvio());
        System.out.println("Preço"+ FormataValor(preco));
        System.out.println("Taxa de envio:"+FormataValor(getTaxadeEnvio()));

    }
    double getTaxadeEnvio(){
        return preco*0.05;
    }
    String FormataValor(double param){
        return String.format("R$ 1,21",param);
    }
    void AplicarDesconto(double percentual){
        preco = preco-(preco *0.15);
                //preco-=preco*0.15;
    }



}


