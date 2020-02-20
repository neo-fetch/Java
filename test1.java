/**
 * test1
 */
public class test1 {

    public static void main(String[] args) {
        int[] oned = {1,2,3,4,9,8,7,6,5,0};
        int[][] twod = {{1,2,3,4},{1,2,3,4,9,8,7,6,5,0}};
        int[][][] threed = {{{1,2,3,4},{4,3,2,1}},{{1,2,3,4,9,8,7,6,5,0}}};
        System.out.println("one dimention:");
        for (int i = 0; i < oned.length; i++) {
            System.out.print("   " + oned[i]);
        }
        System.out.println("\n");
        System.out.println("for each:");
        for (int is : oned) {
            System.out.print("  " + is);
        }
        System.out.println("\n");
        System.out.println("\ntwod");
        for (int i = 0; i < 2; i++) {
            System.out.println("\n");
            if(i==0)
            for (int j = 0; j < twod[i].length; j++) {
                System.out.print("  " + twod[i][j]);
            }
            else
            for (int j = 0; j < twod[i].length; j++) {
                
                System.out.print("  " + twod[i][j]);
            }
        }

        System.out.println("\nfor each\n");

        for (int is : twod[0]) {
            System.out.print("  " + is);
        }
        System.out.println("\n");
        for (int js : twod[1]) {
            System.out.print("  " + js);
        }
        System.out.println("\n");
        System.out.println("\nthree-d");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("\n");
                if (i == 1 && j == 0) {
                    for (int j2 = 0; j2 < threed[i][j].length; j2++) {
                        System.out.print("  "+threed[i][j][j2]);
                    }
                }
                if(i == 1 && j == 2 )
                break;
                if (i == 0 && j == 0) {
                    for (int j2 = 0; j2 < threed[i][j].length; j2++) {
                        System.out.print("  "+threed[i][j][j2]);
                    }
                }
                if (i == 0 && j == 1) {
                    for (int j2 = 0; j2 < threed[i][j].length; j2++) {
                        System.out.print("  "+threed[i][j][j2]);
                    }
                }

            }
           
        }

        System.out.println("\n\nfor each:");
        for (int is : threed[0][0]) {
            System.out.print(" " + is);   
        }
        System.out.println("\n");    
        for (int is : threed[0][1]) {
            System.out.print(" " + is);   
        }
        System.out.println("\n");
        for (int is : threed[1][0]) {
            System.out.print(" " + is);   
        }

    }
}