//Initialize a character variable in a Java program and:
//•	Print "Alphabet" if the initialized value is an alphabet. 
//•	Print "Digit" if the initialized value is a number. 
//•	Print "Special Character" if the initialized value is anything else.

class ass9 {
    public static void main(String[] args) {

        char ch = '5';   // Initialize the character

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
