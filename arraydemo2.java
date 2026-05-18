public class arraydemo2 {
    public static void main(String[] args) {
        //int [][] marks = new int[3][3];
        // this is also a way to declare and initialize an array
        //marks of 1 row
        // marks[0][0] = 100;
        // marks[0][1] = 90;
        // marks[0][2] = 80;
        // //marks of 2 row
        // marks[1][0] = 70;
        // marks[1][1] = 60;
        // marks[1][2] = 50;
        // //marks of 3 row
        // marks[2][0] = 40;
        // marks[2][1] = 30;
        // marks[2][2] = 20;

        // // we can also use for loop to initialize the array
        // for(int i=0; i<marks.length; i++){
        //     for(int j=0; j<marks[i].length; j++){
        //         System.out.print(marks[i][j] + " ");
        // }
        // System.out.println();

        //multi dimensional array can also be initialized at the time of declaration 
        // different length
        int[][] marks = new int [3][];
        marks[0] = new int[1];
        marks[1] = new int[2];
        marks[2] = new int[3];


        marks[0][0] = 100;
        //marks[0][1] = 90;
        //marks[0][2] = 80;


        marks[1][0] = 70;
        marks[1][1] = 60;
        //marks[1][2] = 50;
        //marks[1][3] = 40;

        
        marks[2][0] = 30;
        marks[2][1] = 20;
        marks[2][2] = 10;
        /* [100, 90]
            * [70, 60]
            * [30, 20, 10]
        */
        for(int i=0; i<marks.length; i++){
            for(int j=0; j<marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
        }         System.out.println();
    }
}
}

