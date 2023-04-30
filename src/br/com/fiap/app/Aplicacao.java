package br.com.fiap.app;
import br.com.fiap.model.Pessoa;
import br.com.fiap.model.Motorista;
import br.com.fiap.model.Veiculo;
import br.com.fiap.model.Viagem;

import javax.swing.*;
import java.time.LocalDate;
import java.util.*;

//Breno Tosi Barros
//Gustavo Henrique Omai da Silva RM96059
//Matheus Gonçalves Sant'Ana RM 96166

public class Aplicacao {
    public static void main(String[] args) {
        
        final int max=7;
        
        Motorista[] motoristas= new Motorista[max];
        Veiculo[] veiculos = new Veiculo[max];
        Pessoa[] pessoas = new Pessoa[max];

//------------------------------------------------------------------------------------------------------------------

        motoristas[0] = new Motorista("ViniJava", "123456789", "999999999", "123456789", "UberX");
        motoristas[1] = new Motorista("Matheus", "987654321", "888888888", "987654321", "UberConfort");
        motoristas[2] = new Motorista("DuGondo", "123456789", "777777777", "123456789", "UberBlack");
        motoristas[3] = new Motorista("Enayad", "987654321", "666666666", "987654321", "UberX");
        motoristas[4] = new Motorista("ViniInvest", "123456789", "555555555", "123456789", "UberX");
        motoristas[5] = new Motorista("Gapenna", "987654321", "444444444", "987654321", "UberBlack");
        motoristas[6] = new Motorista("Omai", "123456789", "333333333", "123456789", "UberX");

//------------------------------------------------------------------------------------------------------------------

        veiculos[0] = new Veiculo("ABC1234", "Fusca", "Volkswagen", 1970, motoristas[0]);
        veiculos[1] = new Veiculo("DEF5678", "GolBolinha", "Volkswagen", 2010, motoristas[1]);
        veiculos[2] = new Veiculo("GHI9012", "Ferrari", "Ferrari", 2019, motoristas[2]);
        veiculos[3] = new Veiculo("JKL3456", "Golfão", "Volkswagen", 1970, motoristas[3]);
        veiculos[4] = new Veiculo("MNO7890", "GolQuadrado", "Volkswagen", 2010, motoristas[4]);
        veiculos[5] = new Veiculo("PQR1234", "Tesla model X", "Tesla", 2019, motoristas[5]);
        veiculos[6] = new Veiculo("STU5678", "Uno Com Escada", "Fiat", 1970, motoristas[6]);

//------------------------------------------------------------------------------------------------------------------

        pessoas [0] = new Pessoa("Kleber", "123456789", "999999999");
        pessoas [1] = new Pessoa("Joao", "123456789", "999999999");
        pessoas [2] = new Pessoa("Maria", "123456789", "999999999");
        pessoas [3] = new Pessoa("Jose", "123456789", "999999999");
        pessoas [4] = new Pessoa("Pedro", "123456789", "999999999");
        pessoas [5] = new Pessoa("Paulo", "123456789", "999999999");
        pessoas [6] = new Pessoa("Lucas", "123456789", "999999999");

//------------------------------------------------------------------------------------------------------------------

        embaralhar(veiculos);

        Queue<Pessoa> esperaQueue = new LinkedList<>();
        Queue<Veiculo> veiculosQueue = new LinkedList<>();
        for (Veiculo veiculo:
                veiculos) {
            veiculosQueue.add(veiculo);
        }
        for (Pessoa pessoa:
             pessoas) {
            esperaQueue.add(pessoa);

            Viagem proxViagem = solicitaViagem(esperaQueue, veiculosQueue);
            if (proxViagem == null) {
                continue;
            }
            String dadosViagem= proxViagem.toString();
            JOptionPane.showMessageDialog(null, dadosViagem, "Dados da Viagem", JOptionPane.INFORMATION_MESSAGE);
        }


    }

    public static Viagem solicitaViagem( Queue<Pessoa> esperaQueue, Queue<Veiculo> veiculosQueue){
        Viagem viagem = new Viagem();
        LocalDate localDate = LocalDate.now();

        String origem = JOptionPane.showInputDialog(null, "Digite a origem da viagem: ");
        viagem.setOrigem(origem);
        String destino = JOptionPane.showInputDialog(null, "Digite o Destino da viagem: ");
        viagem.setDestino(destino);
        double distancia = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a Distância da viagem: "));
        viagem.setDistancia(distancia);
        viagem.setData(localDate);
        viagem.setPessoa(esperaQueue.poll());

        int opcao = JOptionPane.showConfirmDialog(null, "Confirmar Corrida", "Confirmação de Corrida", JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog (null, "Corrida Confirmada", "Obrigado por escolher a Uber", JOptionPane.INFORMATION_MESSAGE);
            viagem.setVeiculo(veiculosQueue.poll());
            return viagem;
        } else {
            JOptionPane.showMessageDialog(null, "Corrida Recusada", "alerta", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public static void embaralhar(Veiculo[] array){
        List<Object> lista = Arrays.asList(array);
        Collections.shuffle(lista);
        lista.toArray(array);
    }
}
