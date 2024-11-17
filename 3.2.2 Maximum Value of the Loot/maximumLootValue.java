import java.util.*;

public class maximumLootValue {
    static double calculateLoot(int numCompounds, int backWeight, int[] weights, double[][] unitCost)
    {   
        Arrays.sort(unitCost, Comparator.comparingDouble(o -> o[0]));
        double lootValue = 0.0;
        int unitIndex = numCompounds-1;
        int weightIndex = (int)unitCost[unitIndex][1];
        while(backWeight > 0){
            if(weights[weightIndex]>=backWeight){
                lootValue = lootValue+backWeight*unitCost[unitIndex][0];
                return lootValue;
            }else{
                lootValue = lootValue+weights[weightIndex]*unitCost[unitIndex][0];
                backWeight = backWeight - weights[weightIndex];
                if(unitIndex-1<0){
                    return lootValue;
                }
                else{
                    unitIndex = unitIndex-1;
                    weightIndex=(int)unitCost[unitIndex][1];    
                }
            }
        }
        return lootValue;
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int numCompounds = scanner.nextInt();
        int sackWeight = scanner.nextInt();
        double[][] compoundUnitCost = new double[numCompounds][2];
        int[] weights = new int[numCompounds];
        for(int i = 0; i < numCompounds; i++){
            int cost = scanner.nextInt();
            int weight = scanner.nextInt();
            compoundUnitCost[i][0] = (double)cost/(double)weight;
            compoundUnitCost[i][1] = i; 
            weights[i] = weight;
        }
        System.out.printf("%.4f%n", calculateLoot(numCompounds, sackWeight,weights, compoundUnitCost));
        scanner.close();
    }
};
