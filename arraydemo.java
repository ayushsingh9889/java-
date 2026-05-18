public class arraydemo{
    public static void main(String[] args) {
        //int [] rollnumber = {1,2,3,4,5}; . this is also a way to declare and initialize an array  
        int rollnumber[] = new int[3];
        //
        //101,102,103
        //rollnumber[0] = 101;
        //rollnumber[1] = 102;
        //rollnumber[2] = 103;
        //system.out.println(rollnumber[0]);
        //system.out.println(rollnumber[1]);
        //system.out.println(rollnumber[2]);
        //system.out.println(rollnums.length); . this will give us the length of the array
        //we can also use for loop to initialize the array
        //to print all the elements of an array we can use for loop
        int x = 101;
        for(int i=0; i<rollnumber.length; i++){
            rollnumber[i] = x;
            x++;
        }
        for(int i=0; i<rollnumber.length; i++){
            System.out.println(rollnumber[i]);
        }
}
}