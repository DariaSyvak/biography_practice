public class Book {

    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
    Create a custom constructor that will take 3 args and defines the Book object
    Define Book class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here
    //YOUR CODE HERE
//    public static final String askBookName="What is the book name?";
//    public static final String askGenre="What is genre of the book?";
//    public static final String askPages="How many pages does book have?";
    public Book(String name,String genre,int totalPage){
      this.name=name;
      this.genre=genre;
      this.totalPage=totalPage;

    }



    //Define instance variables here
    //YOUR CODE HERE
    String name;
    String genre;
    int totalPage;


    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }
}
