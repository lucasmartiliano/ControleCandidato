public class App {
    public static void main(String[] args) throws Exception {
        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2200.0);
    }
    static void analisarCandidato(Double SalarioPretendido){
        double salarioBase = 2000.0;

        if(SalarioPretendido > salarioBase) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(SalarioPretendido == salarioBase){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDAR OUTROS CANDIDATOS");
        }
    }
}
