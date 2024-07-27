package model;

import interfaces.IAparelhoTelefonico;
import interfaces.INavegadorInternet;
import interfaces.IReprodutorMusical;

public class Iphone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("+1 aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Gravando mensagem");

    }
}
