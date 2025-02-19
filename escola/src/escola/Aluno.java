package escola;

public class Aluno {
    private String nome;
    private String ra;
    private double media;
    
    //construtor
    public Aluno(String nome, String ra, double media){
        if(!nome.isEmpty()){
            this.nome = nome;
        }
        if(!ra.isEmpty()){
            this.ra = ra;
        }
        if (media >= 0 && media <= 10){
            this.media =  media;
        }
    }
    
    public boolean aprovado(){
        return this.media >= 6.0;
    }

    public void print() {
        System.out.println("Nome: " + nome + "\n" + "RA: " + ra + "\n" + "Média: " + media + "\n" + "Aprovado: " + (aprovado() ? "Sim" : "Não"));
    }
}
