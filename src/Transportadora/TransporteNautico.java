package Transportadora;

public class TransporteNautico extends Transportadora{
    @Override
    public Double CalculaFrete (int Altura, int Largura){
        return (Largura + Altura) * 0.1;
    }
}
