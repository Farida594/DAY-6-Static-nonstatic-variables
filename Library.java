public class Library{
public static String libraryName;
public String bookTitle;

public static void main(String[] args){
libraryName="Central Library";
System.out.println("LibraryName:" +Library.libraryName);
Library lib=new Library();
lib.bookTitle="The Alchemist";
System.out.println("Book Title:" +lib.bookTitle);
}
}
