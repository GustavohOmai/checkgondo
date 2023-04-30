package br.com.fiap.model;

import java.time.LocalDate;

public class Viagem {
    LocalDate data;
    double valor;
    String origem;
    String destino;
    double distancia;
    Pessoa pessoa;
    Veiculo veiculo;

    public Viagem() {
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
        setValor();
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    private void setValor() {
        this.valor = distancia * 2.3;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return
                "data: " + data + "\n\n"+
                "valor: " + valor +"\n\n"+
                "origem: " + origem +"\n\n"+
                "destino: " + destino +"\n\n"+
                "Placa do Carro: " + veiculo.getPlaca()+"\n\n"+
                "Modelo do Carro: " + veiculo.getModelo()+"\n\n"+
                "Nome do Motorista: " + veiculo.getMotorista().getNome()+"\n\n"+
                "Celular do Motorista: " + veiculo.getMotorista().getCelular()+"\n\n"+
                "Categoria do Motorista: " + veiculo.getMotorista().getCategoria();


    }

}
