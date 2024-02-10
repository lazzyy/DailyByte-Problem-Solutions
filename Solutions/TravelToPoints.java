import java.util.Scanner;

public class TravelToPoints {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int minTime = 0;
        
        for (int i = 1; i < points.length; i++) {
            int[] currentPoint = points[i];
            int[] previousPoint = points[i - 1];
            
            int dx = Math.abs(currentPoint[0] - previousPoint[0]);
            int dy = Math.abs(currentPoint[1] - previousPoint[1]);
            
            // The time taken to move diagonally is the maximum of dx and dy
            // So, add the maximum of dx and dy to minTime
            minTime += Math.max(dx, dy);
        }
        
        return minTime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int[][] plane = new int[n][2];
        System.out.println("Enter cartesian plane : ");
        for(int i=0;i<n;i++){
            plane[i][0] = sc.nextInt();
            plane[i][1] = sc.nextInt();
        }
        System.out.println("Minimum time required to visit all points is : "+minTimeToVisitAllPoints(plane));
        sc.close();
    }
}