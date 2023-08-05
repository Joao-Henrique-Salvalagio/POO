// Crie  uma classe abstrata com o nome Transportadora. Crie duas classes que herdam Transportadora
// (TransporteNautico e TransporteTerrestre). Crie um método abstrato na classe Transportadora com o
// nome calculaFrete, recebendo dois parâmetros inteiros ( altura e largura ). A transportadora Náutica
// deverá retornar 10% da soma dos dois parâmetros. A transportadora Terrestre deverá retornar 20% da divisão dos
// dois parâmetros. Imprimir no console o resultado instanciando a classe no método main

package Transportadora;

public class TransporteTerrestre extends Transportadora {
    @Override
    public Double CalculaFrete (int Altura, int Largura){
        return (Altura / Largura) * 0.2;
    }
}
