public class Professor extends Pessoa{
    private double salario;
    private double hora;
    private double valor_hora;
    private double totalsalario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public double calcularSalario(){
        totalsalario = salario * hora;
        return totalsalario;
    }

}
