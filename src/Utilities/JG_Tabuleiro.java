package Utilities;

import javax.swing.*;

public class JG_Tabuleiro extends Jogo{
    private int qtdPecas = 0;

    public JG_Tabuleiro(String nomeJogo, String categoria, String fornecedor, String genero, float preco, int qtdPecas) {
        super(nomeJogo, categoria, fornecedor, genero, preco);
        this.qtdPecas = qtdPecas;
    }

    public int getQtdPecas() {
        return qtdPecas;
    }

    public void setQtdPecas(int qtdPecas) {
        this.qtdPecas = qtdPecas;
    }

    public void  exibirTabuleiro(){
        JOptionPane.showMessageDialog(null,"Nome do Jogo: "+ getNomeJogo() + "\n" +
                                                                    "Categoria: "+ getCategoria()+ "\n" +
                                                                    "Genero: "+ getGenero()+ "\n"+
                                                                    "Quantidade de Peças: " + getQtdPecas()+ "\n"+
                                                                    "Fornecedor: " + getFornecedor() + "\n" +
                                                                    "Preço: R$" + getPreco());
    }
}
