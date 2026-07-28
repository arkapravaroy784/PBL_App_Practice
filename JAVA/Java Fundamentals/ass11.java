// Initialize a character variable with an alphabet in a Java program.
//• If the character is in lowercase, convert it to uppercase and display it in the format: a->A
//• If the character is in uppercase, convert it to lowercase and display it in the format: A->a
class ass11 {
    public static void main(String[] args) {

        char ch = 'a';   // Initialize the character

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
