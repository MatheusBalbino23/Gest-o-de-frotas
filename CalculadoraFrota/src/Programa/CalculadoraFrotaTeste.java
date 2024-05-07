package Programa;

import java.util.Scanner;

public class CalculadoraFrotaTeste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("#####");
		System.out.println("DIMENSIONAMENTO DE FROTA");
		System.out.println("#####\n");
		
		// Pedir ao usuário para inserir as informações necessárias
        System.out.println("Informe o peso do chassi do veículo:");
        double pesoChassi = entrada.nextDouble();

        System.out.println("Informe o peso do semi-reboque do veículo:");
        double pesoSemiReboque = entrada.nextDouble();

        System.out.println("Informe o peso da carroceria do veículo:");
        double pesoCarroceria = entrada.nextDouble();

        System.out.println("Informe o peso de outros equipamentos do veículo:");
        double pesoEquipamentos = entrada.nextDouble();

        System.out.println("Informe o peso bruto total (PBT) do veículo:");
        double pesoBrutoTotal = entrada.nextDouble();

        System.out.println("Informe a carga total para o mês:");
        double cargaTotalMes = entrada.nextDouble();

        System.out.println("Informe a distância percorrida na ida (em km):");
        double distanciaIda = entrada.nextDouble();

        System.out.println("Informe a velocidade operacional na ida (em km/h):");
        double velocidadeIda = entrada.nextDouble();

        System.out.println("Informe a distância percorrida na volta (em km):");
        double distanciaVolta = entrada.nextDouble();

        System.out.println("Informe a velocidade operacional na volta (em km/h):");
        double velocidadeVolta = entrada.nextDouble();

        System.out.println("Informe o tempo de carga e descarga na ida (em minutos):");
        double tempoCargaDescargaIda = entrada.nextDouble();

        System.out.println("Informe o tempo de carga e descarga na volta (em minutos):");
        double tempoCargaDescargaVolta = entrada.nextDouble();

        System.out.println("Informe o número de turnos de operação diário:");
        double numTurnosDiarios = entrada.nextDouble();

        System.out.println("Informe a duração de cada turno (em horas):");
        double duracaoTurno = entrada.nextDouble();

        System.out.println("Informe o número de dias trabalhados no mês:");
        double numDiasTrabalhados = entrada.nextDouble();

        System.out.println("Informe o número de dias parados para manutenção por mês:");
        double numDiasManutencao = entrada.nextDouble();

        // Calcular os tempos de ida, volta e total da viagem
        double tempoIda = (distanciaIda / velocidadeIda) * 60; // em minutos
        double tempoVolta = (distanciaVolta / velocidadeVolta) * 60; // em minutos
        double tempoTotalViagem = tempoIda + tempoVolta + tempoCargaDescargaIda + tempoCargaDescargaVolta;

     // Calcular os resultados utilizando as funções da classe CalculadoraFrota
        double pesoTotalVeiculo = CalculadoraFrota.calcularPesoTotal(pesoChassi, pesoSemiReboque, pesoCarroceria, pesoEquipamentos);
        double cargaUtilVeiculo = CalculadoraFrota.calcularCargaUtil(pesoBrutoTotal, pesoTotalVeiculo);
        double numViagensMensais = cargaTotalMes / 30.0; // Média de 30 dias no mês
        double tempoDiarioOperacao = CalculadoraFrota.calcularTempoDiarioOperacao(numTurnosDiarios, duracaoTurno);
        double numViagensDiarias = CalculadoraFrota.calcularNumViagensDiarias(tempoDiarioOperacao, tempoTotalViagem);
        double numDiasDisponiveisMensais = numDiasTrabalhados - numDiasManutencao;
        double numViagensMensaisVeiculo = numViagensDiarias * numDiasDisponiveisMensais;
        double frotaNecessaria = Math.ceil(numViagensMensais / numViagensMensaisVeiculo);

     // Exibir os resultados formatados com duas casas decimais após a vírgula
        System.out.println("\nResultados:");
        System.out.printf("Peso total do veículo: %.2f%n", pesoTotalVeiculo);
        System.out.printf("Carga útil do veículo: %.2f%n", cargaUtilVeiculo);
        System.out.printf("Número de viagens mensais: %.2f%n", numViagensMensais);
        System.out.printf("Tempo total de viagem: %.2f minutos%n", tempoTotalViagem);
        System.out.printf("Tempo diário de operação: %.2f minutos%n", tempoDiarioOperacao);
        System.out.printf("Número de viagens de um veículo por dia: %.2f%n", numViagensDiarias);
        System.out.printf("Número total de dias disponíveis por mês: %.2f%n", numDiasDisponiveisMensais);
        System.out.printf("Número de viagens mensais de um veículo: %.2f%n", numViagensMensaisVeiculo);
        System.out.printf("Frota necessária: %.2f%n", frotaNecessaria);
		
		entrada.close();
	}
}
