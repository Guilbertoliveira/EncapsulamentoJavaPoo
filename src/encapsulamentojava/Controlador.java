
package encapsulamentojava;


public interface Controlador {  // interface do aplicativo, apenas esses metodos poderá ser acessados
    public abstract void ligar(); // esses metodos sao abstrato (eles sao sobrescritos em ControleRemoto)
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
