public class programador {
    private String linguagem;

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void informarLinguagem(){
        System.out.println(getLinguagem());
    }
}
