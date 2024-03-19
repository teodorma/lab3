package pao.blsalin.smartercalculator;

import pao.blsalin.smartercalculator.calculatorResult.CalculationResult;
import java.util.List;
public class Print {
    public static void printResults(List<CalculationResult> calculationResults) {
        for (CalculationResult result : calculationResults) {
            CalculationRequest request = result.getRequest();
            System.out.println("Operation " + request + " has result " + result.computeResult());
        }
    }
}