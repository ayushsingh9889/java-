public class Stringdemo {
    public static void main(String[] args) {
        String name = "Ayush";
        String lastname = "Singh";
        System.out.println(name + " " + lastname);
        System.out.println(fullName(name, lastname)); //Ayush singh
        // System.out.println(name);
        // // we can also create a string using new keyword
        // String name2 = new String("Ayush");
        // System.out.println(name2);
        // // we can also create a string using char array
        // char[] name3 = {'A', 'y', 'u', 's', 'h'};
        // String name4 = new String(name3);
        // System.out.println(name4);
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
