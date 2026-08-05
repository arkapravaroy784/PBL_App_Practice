//A) Create a class Author with the following information: Member Variables: name (String), email (String), gender (char), Use a parameterized constructor to initialize the variables.
//B) Create a class Book with the following information: Member Variables: name (String), author (Author object), price (double), qtyInStock (int)
//Assumption: Each book is written by exactly one author.
//• Use a parameterized constructor to initialize the variables.
//• Create getters and setters for all member variables. In the main() method:
//• Create a Book object.
//• Print all the details of the book (including the author details).
class Author {

    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor
    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Book {

    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    // Parameterized Constructor
    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}

class TestBook {

    public static void main(String[] args) {

        // Create Author object
        Author author = new Author(
                "J.K. Rowling",
                "jkrowling@gmail.com",
                'F');

        // Create Book object
        Book book = new Book(
                "Harry Potter",
                author,
                599.50,
                25);

        // Print Book Details
        System.out.println("Book Name : " + book.getName());
        System.out.println("Price : " + book.getPrice());
        System.out.println("Quantity : " + book.getQtyInStock());

        // Print Author Details
        System.out.println("Author Name : " + book.getAuthor().getName());
        System.out.println("Author Email : " + book.getAuthor().getEmail());
        System.out.println("Author Gender : " + book.getAuthor().getGender());
    }
}
