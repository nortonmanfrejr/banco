public class teste {

    public static void main(String[] args){

        Cliente nfilho = new Cliente();
        nfilho.setNome("Norton Domingues Manfré Filho");


        Conta cc = new ContaCorrente(nfilho);
        cc.depositar(3000);
        Conta cp = new ContaPoupanca(nfilho);
        cc.transferir(1792, cp);

        cc.imprimeExtrato();
        cp.imprimeExtrato();
    }
}
