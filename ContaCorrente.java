public class ContaCorrente extends Conta{


    // Construtor

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    // Metodos
    @Override
    public void imprimeExtrato(){
        System.out.println("<==========> Extrato CC <==========>");
        super.extratoConta();
    }

}


