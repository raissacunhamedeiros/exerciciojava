public class funcionario {
    protected String nome;
    protected int nasc;
    protected double salario;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNasc(int nasc){
        this.nasc= nasc;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }
    public int getNasc(){
        return nasc;
    }

    public double getSalario() {
        return salario;
    }
}
