public class gerente extends funcionario{
    private String projeto;

    public void setProjeto(String projeto){
        this.projeto= projeto;
    }
    public String getProjeto(){
        return projeto;
    }

    public void informarProjeto(){
        System.out.println(getProjeto());

    }
}
