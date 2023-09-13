public class MinhaClasse{

public static void main (String [] args) {

    String primeiroNome = "Nelis";
    String segundoNome = "Junior";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    Sytem.out.println(nomeCompleto);
}

public static String nomeCompleto(String primeiroNome, String segundoNome){
    return "Nome completo: " + primeiroNome.concat(" ").concat(segundoNome);
}

}