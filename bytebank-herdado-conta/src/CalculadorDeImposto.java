public class CalculadorDeImposto {

    private double TotalImposto;

    public void calculaImposto(Tributavel classeTributavel)    {
        //A linha abaixo calcula o total de imposto das classesTributaveis
         TotalImposto += classeTributavel.getValorImposto();
    }

    public double getTotalImposto() {
        return TotalImposto;
    }
}
