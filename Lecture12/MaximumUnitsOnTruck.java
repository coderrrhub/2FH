package Lecture12;

import java.util.Arrays;

public class MaximumUnitsOnTruck {
    public static void main(String[] args) {
        int[][] boxTypes = {{1,3}, {2,2}, {3,1}};
        int truckSize = 4;
        int ans = solution(boxTypes, truckSize);
        System.out.println(ans);
    }

    public static int solution(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int totalBox = 0;
        int totalUnits = 0;
        for(int[] ele : boxTypes) {
            int box = ele[0];
            int units = ele[1];

            if(totalBox + box <= truckSize) {
                totalUnits += (box * units);
                totalBox += box;
            } else {
                int remainingBox = truckSize - totalBox;

                totalUnits += remainingBox * units;
                break;
            }
        }

        return totalUnits;
    }
}
