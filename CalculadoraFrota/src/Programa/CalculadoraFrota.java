package Programa;

public class CalculadoraFrota {
	
    // Função para calcular o peso total do veículo
    public static double calcularPesoTotal(double pesoChassi, double pesoSemiReboque, double pesoCarroceria, double pesoEquipamentos) {
        return pesoChassi + pesoSemiReboque + pesoCarroceria + pesoEquipamentos;
    }

    // Função para calcular a carga útil do veículo
    public static double calcularCargaUtil(double pesoBrutoTotal, double pesoTotalVeiculo) {
        return pesoBrutoTotal - pesoTotalVeiculo;
    }

    // Função para calcular o número de viagens mensais
    public static double calcularNumViagensMensais(double cargaTotalMes, double capacidadeUtilVeiculo) {
        return cargaTotalMes / capacidadeUtilVeiculo;
    }

    // Função para calcular o tempo total de viagem
    public static double calcularTempoTotalViagem(double tempoIda, double tempoVolta, double tempoCargaDescargaIda, double tempoCargaDescargaVolta) {
        return tempoIda + tempoVolta + tempoCargaDescargaIda + tempoCargaDescargaVolta;
    }

    // Função para calcular o tempo diário de operação
    public static double calcularTempoDiarioOperacao(double numTurnosDiarios, double duracaoTurno) {
        return numTurnosDiarios * duracaoTurno * 60; // Convertendo para minutos
    }

    // Função para calcular o número de viagens de um veículo por dia
    public static double calcularNumViagensDiarias(double tempoDiarioOperacao, double tempoTotalViagem) {
        return tempoDiarioOperacao / tempoTotalViagem;
    }

    // Função para calcular o número total de dias disponíveis por mês
    public static double calcularNumDiasDisponiveisMensais(double numDiasTrabalhados, double numDiasManutencao) {
        return numDiasTrabalhados - numDiasManutencao;
    }

    // Função para calcular o número de viagens mensais de um veículo
    public static double calcularNumViagensMensaisVeiculo(double numViagensDiarias, double numDiasTrabalhados) {
        return numViagensDiarias * numDiasTrabalhados;
    }

    // Função para calcular a frota necessária
    public static double calcularFrotaNecessaria(double numViagensNecessarias, double numViagensMensaisVeiculo) {
        return numViagensNecessarias / numViagensMensaisVeiculo;
    }
}