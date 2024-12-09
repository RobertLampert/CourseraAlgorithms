import java.util.*;

public class collectingSignatures {
    static int lineBreaks(int numSegments, int lineCounter, long[][] segments, int indexLastLine, ArrayList<Long>coordinates){
        for(int i = indexLastLine; i < numSegments; i++){
            if(segments[i][0] > segments[indexLastLine][1]){
            //System.out.println("Found break!");
            indexLastLine = i;
            if(!coordinates.contains(segments[i-1][1])){
                lineCounter += 1;
                coordinates.add(segments[i-1][1]);
            }
            lineBreaks(numSegments, lineCounter, segments, indexLastLine, coordinates);
            break;
            }else if(i+1 == numSegments){
                coordinates.add(segments[i][1]);
                indexLastLine = numSegments;
                System.out.println(lineCounter);
                break;
            }
            if(segments[i][0] == segments[i][1] && !coordinates.contains(segments[i][0])){
                coordinates.add(segments[i][1]);
                lineCounter += 1;
                indexLastLine = i;
            }
        }
        return indexLastLine;
    }

    static void calculateCoordinates(long[][] segments, int numSegments)
    {   
        int lineCounter = 1;
        int indexLastLine = 0;
        ArrayList<Long> coordinates = new ArrayList<Long>();
        /*while(indexLastLine < numSegments){
            lineBreaks(numSegments, lineCounter, segments, indexLastLine, coordinates);
        }*/
        lineBreaks(numSegments, lineCounter, segments, indexLastLine, coordinates);
        for(int j = 0; j < coordinates.size();j++){
            System.out.println(coordinates.get(j));
        }
        
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int numSegments = scanner.nextInt();
        long[][] segments = new long[numSegments][2];
        for(int i = 0; i < numSegments; i++){
            segments[i][0] = scanner.nextLong();
            segments[i][1] = scanner.nextLong();
        }
        Arrays.sort(segments, (a,b) -> Long.compare(a[0],b[0]));
        System.out.println(Arrays.deepToString(segments));
        calculateCoordinates(segments,numSegments);
        scanner.close();
    }
};
