package Utilities;

import javax.swing.*;

public class JG_Cartas extends  Jogo {
    private int qtdCartas = 0;

    public JG_Cartas(String nomeJogo, String categoria, String fornecedor, String genero, float preco, int qtdCartas) {
        super(nomeJogo, categoria, fornecedor, genero, preco);
        this.qtdCartas = qtdCartas;
    }

    public int getQtdCartas() {
        return qtdCartas;
    }

    public void setQtdCartas(int qtdCartas) {
        this.qtdCartas = qtdCartas;
    }

   public void  exibirCartas(){
       JOptionPane.showMessageDialog(null,"Nome do Jogo: "+ getNomeJogo() + "\n" +
                                                                 "Categoria: "+ getCategoria()+ "\n" +
                                                                 "Genero: "+ getGenero()+ "\n"+
                                                                 "Quantidade de Cartas: " + getQtdCartas()+ "\n"+
                                                                 "Fornecedor: " + getFornecedor() + "\n" +
                                                                 "Preço: R$" + getPreco());
   }
}
