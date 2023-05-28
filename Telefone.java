public class Telefone implements Celular{
    private int volume;
    private boolean tela;
    private boolean botaoMudo = false;

    public int getVolume() {
        return volume;
    }

    public void vivaVoz(){
        System.out.println("Viva voz ativado. Volume: " + getVolume());
    }

    public void microfoneMudo() {
        setBotaoMudo(!isBotaoMudo());
        System.out.println("Botão de mudo pressionado, ele está: " + isBotaoMudo());
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTela() {
        return tela;
    }

    public void setTela(boolean tela) {
        this.tela = tela;
    }

    public boolean isBotaoMudo() {
        return botaoMudo;
    }

    public void setBotaoMudo(boolean botaoMudo) {
        this.botaoMudo = botaoMudo;
    }

    @Override
    public void aumentarVolume() {
        setVolume(getVolume() + 5);
        System.out.println("Volume da ligação: + " + getVolume());
    }

    @Override
    public void diminuirVolume() {
        setVolume(getVolume() - 5);
        System.out.println("Volume da ligação: + " + getVolume());
    }

    @Override
    public void bloquearTela() {
        setTela(false);
        System.out.println("Tela bloqueado mas a chamada continua");

    }

    @Override
    public void desbloquearTela() {
        setTela(true);
        System.out.println("Tela desbloqueada");
    }
}
