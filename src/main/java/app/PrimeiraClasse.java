package app; 

public class PrimeiraClasse {
    public static void main (String [] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setIdade(19);

        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());

    }
}