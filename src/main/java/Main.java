public class Main {

    public static void main(String[] args) {

        Cliente caroline = new Cliente();
        caroline.setNome("Caroline Pacheco");

        Conta cc = new contaCorrente(caroline);
        Conta poupanca = new contaPoupanca(caroline);

        cc.depositar(250);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente valquiria = new Cliente();
        valquiria.setNome("Valquiria Santos");

        Conta cVal = new contaCorrente(valquiria);
        Conta uVal = new contaUniveritaria(valquiria);
        cVal.depositar(1500);;
        cVal.transferir(100,uVal);
        cVal.imprimirExtrato();
        uVal.imprimirExtrato();

        Cliente fabio = new Cliente();
        fabio.setNome("Fabio Silva");

        Conta uFabio = new contaUniveritaria(fabio);
        uFabio.depositar(200);
        uFabio.imprimirExtrato();


    }




}
