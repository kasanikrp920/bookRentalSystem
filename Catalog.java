package com.trimindtech.training.day08BookRental;

import java.util.*;

public class Catalog extends Book{
    public  ArrayList<Book> books1= new ArrayList<>();
    public Map<String,Book> bookMap=new HashMap<>();

    Scanner sc=new Scanner(System.in);

    public void addBook (Book book){
        books1.add(book);
        System.out.println("the book has been added");
        System.out.println("enter the book name again");
        String bookName=sc.next();
        bookMap.put(bookName,book);
    }
    public Map<String,Book> getAllBooks() {

        return bookMap;
    }

        public void deleteBook (Book b){
            String name=b.getTitle();
            bookMap.remove(name);

    }
   public  Book searchBook(String bookName){
       if(!bookMap.containsKey(bookName)){
           System.out.println("the book is not in the store");

       }else{
           Book book=bookMap.get(bookName);
           System.out.println("the book details are  \n"+book.toString());
           return book;
       }
       return null;
   }

   public void rentBook(){
         Book book =  BookRental.searchBook();
        if(book==null){
            System.out.println("the book not in the store");
        }else{
            System.out.println("enter the borrower details");
             BookRental.borrowerList();
            String bookName=book.getTitle();
            bookMap.remove(bookName);
            System.out.println("the book has been rented");
        }

   }
   public void returnBook(){
       BookRental.printBorrowerList();
       System.out.println("enter the no of days that u have rented  the book..");
       int days=sc.nextInt();
       LoanRate.setAmount(days);
       LoanRate.setOverdueAmount(days);
       System.out.println("amount = "+LoanRate.getAmount()+"  overdue amount = "+LoanRate.getOverdueAmount());
       System.out.println("the book is returned");
   }
   public void saveBook(){

        FileUtil f=new FileUtil("C:\\Users\\raghu\\Desktop\\savebook");
        f.writeLinesToFile(books1);

   }

   }




