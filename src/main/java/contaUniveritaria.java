public class contaUniveritaria extends Conta {


    public contaUniveritaria(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void imprimirExtrato() {

        System.out.println("=== Extrato de uma Conta Universitária ===");
        super.imprimirInfosComuns();
    }
}
