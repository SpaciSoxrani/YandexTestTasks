package org.example;

public class Gradient {
    public void ResultSum(Integer W, Integer H){
        //sum in rows
        int sumOneRow = 0;
        for(int rowNumber = 1; rowNumber <= H; rowNumber++){
            for(int elementNumber = 1; elementNumber<= W; elementNumber++){
                sumOneRow+=rowNumber*elementNumber*(W - elementNumber + 1)*(H-rowNumber+1);
            }
            System.out.print(sumOneRow + " " );
            sumOneRow = 0;
        }
        System.out.println();

        //sum in columns
        int sumOneColumn = 0;
        for(int columnNumber = 1; columnNumber <= W; columnNumber++){
            for(int rowNumber = 1; rowNumber<= H; rowNumber++){
                sumOneColumn+=rowNumber*columnNumber*(H-rowNumber+1)*(W-columnNumber+1);
            }
            System.out.print(sumOneColumn + " " );
            sumOneColumn = 0;
        }

    }
}
