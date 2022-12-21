public class StringMethods {
    public static void main(String[] args) {
        // 10 string method:
        String myName = "Bahar Razavi";

        // substring==> gives a part of a srting
        System.out.println(myName.substring(6, 12)); // output:Razavi
        // chartAt ==> gets index and gives the letter
        System.out.println(myName.charAt(0)); //output: B
        // indexOF ==> gets letter and gives index (opposite of char At method)
        System.out.println(myName.indexOf("z"));//output: 8
        //isEmpty ==> shows its the string empty or not
        System.out.println(myName.isEmpty()); //output: false
        // replace ==> replace and changer a part of a sting to another one
        System.out.println(myName.replace("Bahar","Shima"));// output:Shima Razavi
        //startWith ==> it finds that does the string start with those characters or not
        System.out.println(myName.startsWith("Ba")); //output: True
        System.out.println(myName.startsWith("Razavi"));//output: false
        // trim ==>Remove wspace from both sides of a string
        String myNewString = "             Hello, World!            ";
        System.out.println(myNewString.trim()); // output: Hello, World!
        //equalsIgnoreCase ==> This method returns true if the strings are equal, and false if not, without cheaking lower case and upper case differences.
        String myNameUpper = "BAHAR RAZAVI";
        String myNameLower = "bahar razavi";
        System.out.println(myNameUpper.equalsIgnoreCase(myNameLower)); // output: True
        printName();

    }    
    private static void printName() {
        String name = "Bahar Jooon";
        System.out.println(name);
        }
    
}
