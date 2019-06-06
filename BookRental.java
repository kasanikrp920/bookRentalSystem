package com.trimindtech.training.day08BookRental;

import java.sql.SQLOutput;
import java.util.*;

import static java.lang.System.exit;

public class BookRental {
    public int enterOption;
    private static Catalog catalog = new Catalog();
    private static Borrower borrower=new Borrower();
    private static Scanner sc = new Scanner(System.in);


    public static void printOptions() {


        System.out.println("*******Welcome to BookRental System*********");
        System.out.println("*************************************************");
        System.out.println(" [1] Add book to catalog\n" +
                "[2] List of Books in the catalog\n" +
                "[3] Delete book from catalog\n" +
                "[4]  search a book\n" +
                "[5] Rent a Book\n" +
                "[6] Return a book\n" +
                "[7] Print out Borrower List\n" +
                "[8] Exit the program\n");
        System.out.println("enter any option");
    }

    public static void main(String[] args) {

        printOptions();
        int ch = sc.nextInt();
        Catalog c = new Catalog();
        do {


            switch (ch) {
                case 1:

                    addBooks();

                    break;
                case 2:

                    printBookDetails();

                    break;
                case 3:

                   deleteBook();

                    break;
                case 4:
                  searchBook();

                    break;
                case 5:
                    catalog.rentBook();
                    break;
                case 6:catalog.returnBook();
                    break;
                case 7:
                    printBorrowerList();
                    break;
                case 8:exit(0);
                        break;
                case 9:writeBookData();
                       break;
                default:
                    System.out.println("enter an valid option");
                    System.out.println("");

            }

            printOptions();
            ch = sc.nextInt();
           /* if (ch == 8){
                saveDataToFile();
            }*/
        } while (ch != 8);

    }

   /* private static void loadData() {
        FileUtil fileUtil = new FileUtil("catalog.tx");
        List<String> bookString = fileUtil.readLinesFromFile();
        String[] bookProperties = bookString.get(0).split("\\t");;
         Book bk = new Book();
        bk.setAuthorName(bookProperties[0]);

        catalog.addBook(bk);
    }*/

    /* private static void saveDataToFile() {
         //save catalog info
         // convert catalog to string
         // for each book,
         // save borrower info
         List<String>
         for(Book book:catalog.getAllBooks()){
             String bookString = book.getTitle()+"\t"+book.getAuthorNameName();


         }
        // FileUtil.save();
     }
 */
    private static void printBookDetails() {
        System.out.println(catalog.getAllBooks().toString());
    }


    public static void printBorrowerList() {
        System.out.println(borrower.getAllBorrowerList().toString());
    }

    private static void addBooks() {
        Book book = new Book();
        System.out.println("enter the authour name");
        String authourName = sc.next();
        book.setAuthorName(authourName);
        System.out.println("enter  book title");
        String title = sc.next();
        book.setTitle(title);
        System.out.println("enter ISBN");
        int isbn = sc.nextInt();
        book.setISBN(isbn);
        System.out.println("enter academic or not");
        boolean b = sc.nextBoolean();
        book.setIsAcademic(b);
        System.out.println("enter the stock");
        int stock = sc.nextInt();
        book.setTotalCount(stock);
        sc.nextLine();
        catalog.addBook(book);
        System.out.println("the book has been added");
        System.out.println(book.toString());
    }


   public static Book searchBook(){
       System.out.println("enter the book name that u want to search");
       String bookName=sc.next();
      Book book= catalog.searchBook(bookName);
      return book;
   }

    public static void deleteBook(){
        Book book=searchBook();
        if(book==null){
            System.out.println("the book not in the store..");
        }else{
            catalog.deleteBook(book);
            System.out.println("the book is deleted");
        }
    }
    public static  void borrowerList(){
        BorrowerFile borrowerFile=new BorrowerFile();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the book name that u want to rent");
        String bookName=sc.next();
        borrowerFile.setBookName(bookName);
        System.out.println("enter the first name...");
        String firstName=sc.next();
        borrowerFile.setFirstName(firstName);
        System.out.println("enter the last name...");
        String lastName=sc.next();
        borrowerFile.setLastName(lastName);
        System.out.println("enter ur email id...");
        String emailId=sc.next();
        borrowerFile.setEmail(emailId);
        System.out.println("enter no of rental days..");
        int days=sc.nextInt();
        Date date = new Date();
        String todayDate=date.toString();
        borrowerFile.setDate(todayDate);
        borrowerFile.setNunOfDaysLoan(days);
        borrower.addBorrower(borrowerFile);

    }
    public static void writeBookData(){
        catalog.saveBook();

    }

    }


