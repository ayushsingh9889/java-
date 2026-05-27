public class DemoFuntion2 {
    public static void main(String[] args) {
        //Function overloading
        //Function overloading is a feature in java that allows us to have more than one function with the same name but different parameters. It is also known as method overloading. The main advantage of function overloading is that it increases the readability of the code and it also allows us to use 
        //the same function name for different purposes. For example, we can have a function to add two numbers and another function to add three numbers with the same name but different parameters.
        int x = add(5, 10);
            int y = add(5, 10, 15);
            System.out.println("The sum of 5 and 10 is: " + x);
            System.out.println("The sum of 5, 10 and 15 is: " + y);
    }
    static int add(int a, int b){
        return (a + b);
    }
    static int add(int a, int b, int c){
    return (a + b + c);
    }
}

