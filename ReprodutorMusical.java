public class ReprodutorMusical implements Celular{
    private boolean tocando;
    private String musicaSelecionada;
    private int volume;
    private boolean tela;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public void getMusicaSelecionada() {
        System.out.println("Musica selecionada: " + this.musicaSelecionada);
    }

    public void setMusicaSelecionada(String musicaSelecionada) {
        this.musicaSelecionada = musicaSelecionada;
    }

    public void tocar() {
        if (this.tela) {
            this.tocando = true;
            System.out.println("Tocando musica!");
        }
    }

    public void pausar(){
        if (this.tela) {
            this.tocando = false;
            System.out.println("Música pausada!");
        }
    }

    @Override
    public void aumentarVolume() {
            setVolume(getVolume() + 5);
            System.out.println("Volume da mídia: " + getVolume());
    }

    @Override
    public void diminuirVolume() {
            setVolume(getVolume() - 5);
            System.out.println("Volume da mídia: " + getVolume());

    }

    @Override
    public void bloquearTela() {
        this.tela = false;
        System.out.println("Tela bloqueada mas pode continuar tocando musica.");
    }

    @Override
    public void desbloquearTela() {
        this.tela = true;
        System.out.println("Tela desbloqueada.");
    }
}

