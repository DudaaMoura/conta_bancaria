public class Programa {
    
    public static void main(String[]dudinha){
            Conta minhaConta;
            minhaConta = new Conta();
            minhaConta.numero = 1;
            minhaConta.titular = "Duda Moura";
            minhaConta.saldo = 789;

            Conta minhaConta2;
            minhaConta2 = new Conta();
            minhaConta2.numero = 2;
            minhaConta2.titular = "Dorica Gomes";
            minhaConta2.saldo = 1220;

        
        System.out.println(minhaConta.numero);
        System.out.println(minhaConta.titular);
        System.out.println(minhaConta.saldo);

        System.out.println("\n");

        System.out.println(minhaConta2.numero);
        System.out.println(minhaConta2.titular);
        System.out.println(minhaConta2.saldo);



    }
}
