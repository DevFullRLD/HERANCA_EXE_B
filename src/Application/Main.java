package Application;

import Utilities.JG_Cartas;
import Utilities.JG_Tabuleiro;
import Utilities.VGame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opera = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de jogo a ser cadastrado:" + "\n" +
                                                                 "1 - Jogo de Cartas" + "\n" +
                                                                 "2 - Jogo de Tabuleiro" + "\n" +
                                                                 "3 - Video Game"));


        switch (opera){
            case 1:{
                //ENTRADA DE DADOS
                String nome  = JOptionPane.showInputDialog("Digite o Nome do jogo");
                String categ  = JOptionPane.showInputDialog("Digite a Categoria do jogo");
                String genero  = (JOptionPane.showInputDialog("Digite o Genero do jogo"));
                int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de cartas"));
                String Fornecedor  = JOptionPane.showInputDialog("Digite o Fornecedor do jogo");
                float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o Preço do jogo:"));
                JG_Cartas JGcartas = new JG_Cartas(nome, categ, Fornecedor, genero, preco, qtd);

                //ATRIBUINDO OS VALORES
                JGcartas.setNomeJogo(nome);
                JGcartas.setCategoria(categ);
                JGcartas.setGenero(genero);
                JGcartas.setQtdCartas(qtd);
                JGcartas.setFornecedor(Fornecedor);
                JGcartas.setPreco(preco);

                //EXIBIR DADOS
                JGcartas.exibirCartas();
                break;
            }
            case 2:{
                //ENTRADA DE DADOS
                String nome  = JOptionPane.showInputDialog("Digite o Nome do jogo");
                String categ  = JOptionPane.showInputDialog("Digite a Categoria do jogo");
                String genero  = (JOptionPane.showInputDialog("Digite o Genero do jogo"));
                int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de peças"));
                String Fornecedor  = JOptionPane.showInputDialog("Digite o Fornecedor do jogo");
                float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o Preço do jogo:"));
                JG_Tabuleiro JGtabuleiro = new JG_Tabuleiro(nome, categ, Fornecedor, genero, preco, qtd);

                //ATRIBUINDO OS VALORES
                JGtabuleiro.setNomeJogo(nome);
                JGtabuleiro.setCategoria(categ);
                JGtabuleiro.setGenero(genero);
                JGtabuleiro.setQtdPecas(qtd);
                JGtabuleiro.setFornecedor(Fornecedor);
                JGtabuleiro.setPreco(preco);

                //EXIBIR DADOS
                JGtabuleiro.exibirTabuleiro();
                break;
            }
            case 3:{
                //ENTRADA DE DADOS
                String nome      = JOptionPane.showInputDialog("Digite o Nome do jogo");
                String categ     = null;
                String genero    = JOptionPane.showInputDialog("Digite o Genero do jogo");
                String Modelo    = JOptionPane.showInputDialog("Digite o Modelo do jogo");
                String psOrigem  = JOptionPane.showInputDialog("Digite o Pais Origem do jogo");
                String Fornecedor  = JOptionPane.showInputDialog("Digite o Fornecedor do jogo");
                float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o Preço do jogo:"));
                VGame videoGame = new VGame(nome, categ, Fornecedor, genero, preco, psOrigem, Modelo);

                //ATRIBUINDO OS VALORES
                videoGame.setNomeJogo(nome);
                videoGame.setGenero(genero);
                videoGame.setPaisDeOrigem(psOrigem);
                videoGame.setModelo(Modelo);
                videoGame.setFornecedor(Fornecedor);
                videoGame.setPreco(preco);

                //EXIBIR DADOS
                videoGame.exibirVGame();
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null,"Opção invalida, execute o programa novamente!");
            }
        }
    }
}
