public class NavegadorInternet implements Celular{

    private int addAba;
    private int volume;


    public void atualizarPagina(){
        System.out.println("Página atualizada!");
    }

    public void exibirPagina(){
        System.out.println("Página sendo exibida!");
    }

    public int getAddAba() {
        return addAba;
    }

    public void setAddAba(int addAba) {
        this.addAba = addAba;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void aumentarVolume() {
            setVolume(getVolume() + 5);
            System.out.println("Volume de mídia: " + getVolume());
    }

    @Override
    public void diminuirVolume() {
            setVolume(getVolume() - 5);
            System.out.println("Volume de mídia: " + getVolume());

    }

    @Override
    public void bloquearTela() {
        System.out.println("Tela bloqueada e navegador pausado ");

    }

    @Override
    public void desbloquearTela() {
        System.out.println("Tela desbloqueada.");

    }
}
