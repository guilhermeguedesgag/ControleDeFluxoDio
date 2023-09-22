public class ParametrosInvalidosException extends Exception {
    // vocẽ deverá colocar o extends Exception para invocar o construtor dessa biblioteca, chamado "super"
    public ParametrosInvalidosException(String mensagem) {
        // aqui ele está avisando que  ParametrosInvalidosException terá um objeto de nome "mensagem"
        // do tipo "String"

        super(mensagem);
        // a palavra "super" é um contrutor da extensão Exception que você chamou acima(através do extends Exception)




    }
}
