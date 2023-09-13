public class BoletimEstudantil {

    public static void main (String [] args) {
        int mediaFinal = 6;
        if (mediaFinal < 6)
            Sytem.out.println("PREPROVADO");
        else if (mediaFinal == 6)
            Sytem.out.println("RECUPERAÇÃO");
        else
            Sytem.out.println("APROVADO");
    }


}