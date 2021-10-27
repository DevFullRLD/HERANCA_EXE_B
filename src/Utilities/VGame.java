package Utilities;

import javax.swing.*;

public class VGame extends Jogo{
    private String paisDeOrigem, modelo = "";

    public VGame(String nomeJogo, String categoria, String fornecedor, String genero, float preco, String paisDeOrigem, String modelo) {
        super(nomeJogo, categoria, fornecedor, genero, preco);
        this.modelo = modelo;
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void  exibirVGame(){
        JOptionPane.showMessageDialog(null,"Nome do Jogo: "+ getNomeJogo() + "\n" +
                                                                    "Genero: "+ getGenero()+ "\n"+
                                                                    "Modelo do Jogo: " + getModelo()+ "\n"+
                                                                    "Pais de Origem: " + getPaisDeOrigem()+ "\n"+
                                                                    "Fornecedor: " + getFornecedor() + "\n" +
                                                                    "Preço: R$" + getPreco());
    }
}
