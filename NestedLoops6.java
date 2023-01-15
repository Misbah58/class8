package class8;

import java.util.zip.ZipFile;

public class NestedLoops6 {
    public static void main(String[] args) {
  /* 1 2 3 4 5
    1 2 3 4 5
     1 2 3 4 5
   */
        for (int i =1;i<=3;i++){ //executes the below codes three times
            for (int j = 1; j <=5; j++) {
                System.out.print(j +" ");// prints the value of j from 1 to 5




            }
            System.out.println();




        }
    }
}
