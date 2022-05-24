public class ContaPoupanca extends  Conta{

    // Construtor

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    // Metodos
    @Override
    public void imprimeExtrato(){
        System.out.println("<==========> Extrato CP <==========>");
        super.extratoConta();
    }
}
