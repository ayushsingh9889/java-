public class DemoFunction {
    public static void main(String[] args) {
        //Functions in java
        greet();
        greet("Ayush");  //Argument passed to the function
        //int number = getNumber();
        //System.out.println(number);
        //int result = multiply(5, 10);
        System.out.println(getNumber()); // if we want then we here use only function without storing in variable but in that case we lost the value
        //getNumber(); // this will not print anything because we are not storing the value in variable or printing it directly
        System.out.println(multiply(5, 10));


        return; // this is used to exit from the function and it is optional in void function but in non-void function it is mandatory to return a value
    }

    //no input no output
    static void greet(){
        System.out.println("Hello Ayush");
        //return;
    }

    //input no output
    static void greet(String name){   // number of parameter can be anything
        System.out.println("Hello " + name);

    }
    //no input output
    static int getNumber(){
        return 10;
    }

    // input output

    static int multiply(int a, int b){
        return (a * b);
    }
}