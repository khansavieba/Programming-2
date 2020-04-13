package com.vieba;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of book : ");
        int n = input.nextInt();

        Book[] myLibrary = new Book[n];

        for(int i= 0; i < myLibrary.length; i++){
            System.out.println("Book " + (i+1) + " Title : ");
            String bookTitle = input.next() + input.nextLine();
            System.out.println("Book "+(i+1) + " Price : ");
            double bookPrice =input.nextDouble();

            myLibrary[i] = new Book(bookTitle, bookPrice);
        }

        Book highestPrice = myLibrary[0];


        for (int i = 0; i < myLibrary.length; i++) {
            if (myLibrary[i].getPrice() > highestPrice.getPrice()) {
                highestPrice = myLibrary[i];
            }
        }

        System.out.println("\n***THE BOOK(S) WITH THE HIGHEST PRICE***");
        System.out.println(highestPrice.getTitle() + "\t\tRM" + highestPrice.getPrice() +"\n");

        System.out.println("***THE BOOK(S) CONTAINS KEYWORD \"Java\"***");
        for (int i = 0; i < myLibrary.length; i++) {
            String bookTitle = myLibrary[i].getTitle();

            if (bookTitle.contains("java") || bookTitle.contains("Java")) {
                System.out.println("-"+ bookTitle);
            }
        }
    }

}

class Book {
    private String title;      //book’s title
    private double price;      //book’s price
   
    public Book(String t, double p) {
      title = t;
      price = p;
    }
    public String getTitle() {
      return title;
    }
   
    public double getPrice() {
      return price;
    }
   }
   
   