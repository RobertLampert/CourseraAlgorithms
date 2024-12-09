import java.util.*;

public class carFueling {
    static int calculateStops(int dist, int fuelMileage, int numStop, int[] stops)
    {   
        int stopCounter = 0;
        int maxDist = stops[0]+fuelMileage;
        int index = 1;
        for(int i = 0 ; i < stops.length - 1; i++){     //check if car can last on fuel between gas stations
            if(stops[i+1] - stops[i] > fuelMileage){
                return -1;
            }
        }
        for(int i = index; i < stops.length; i++){
            if(stops[i]>maxDist){
                stopCounter += 1;
                index = i-1;
                maxDist = stops[index]+fuelMileage;
            }
        }
        return stopCounter;
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int totalDistance = scanner.nextInt();
        int fuelMileage = scanner.nextInt();
        int numStops = scanner.nextInt();
        int[] gasStations = new int[numStops+2];
        gasStations[0] = 0;
        gasStations[numStops+1] = totalDistance;
        for(int i = 1; i <= numStops; i++){
            gasStations[i] = scanner.nextInt();
        }
        System.out.println(calculateStops(totalDistance,fuelMileage, numStops, gasStations));
        scanner.close();
    }
};
