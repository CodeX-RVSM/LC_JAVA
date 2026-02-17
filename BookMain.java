package com.linkcode.Home;

import java.util.Scanner;

public class BookMain{
	static Scanner sc = new Scanner(System.in);
	static Book books[]=new Book[50];
	static int count;
	
	static {
		books[count++]=new Book("harry","jk rowling",100,300);
		books[count++]=new Book("artofwar","sam",200,500);
		books[count++]=new Book("ikigai","adkfbn",150,300);
		
	}
	
	public static void main(String[] args) {
		boolean flag=true;
		
		while(flag) {
			System.out.println("Book Management");
			System.out.println("1.Add Book ");
			System.out.println("2.Fint the book ");
			System.out.println("3.Update Book Details");
			System.out.println("4.Display All Books");
			System.out.println("5.Delete Book ");
			System.out.println("6.exit");
			System.out.println("Enter Your choice :");
			int ch=sc.nextInt();
			switch(ch) {
			case 1->addBook();
			case 2->findBookByName();
			case 3->updateBook();
			case 4->display();
			case 5->deleteBook();
			case 6->flag=false;
			default->System.out.println("Invalid choice");
			}
			
		}
	}
	private static void deleteBook() {
		sc.nextLine();
	    System.out.print("Enter Book Name to Delete : ");
	    String name = sc.nextLine();
	    
	    boolean found = false;
	    
	    for(int i =0;i<count;i++) {
	    	if(books[i].BookName.equalsIgnoreCase(name)) {
	    		for(int j=i;j<count-1;j++) {
	    			books[j]=books[j+1];
	    		}
	    		books[count-1]=null;
	    		count--;
	    		
	    		System.out.println("Book Deleted Successfully");
	    		found = true;
	    		break;
	    		
	    	}
	    }
	    if(!found) {
	    	System.out.println("Book Not Found   !!!!!!!!!!");
	    }
		
	}

	private static void addBook() {
		System.out.println("Enter Book Name : ");
		String name=sc.next();
		System.out.println("Enter Book Author :");
		sc.nextLine();
		String author=sc.nextLine();
		System.out.println("Enter no of Pages : ");
		int no=sc.nextInt();
		System.out.println("Enter Book Price : ");
		double price=sc.nextDouble();
		books[count++]=new Book(name,author,no,price);
		System.out.println("Book Added Successfully");
	}
	
	
	private static void findBookByName() {
		System.out.println("Enter Book Name :");
		String name =sc.next();
		boolean flag= true;
		for(int i=0;i<count;i++) {
			if(books[i].BookName.equalsIgnoreCase(name)) {
				System.out.println("Book Found");
				flag=false;
				System.out.println("----------------");
				books[i].displayInfo();
				System.out.println("----------------");
			}
		}
		if(flag) {
			System.out.println("Book Not Found");
		}
	}
	
	private static void display() {
		System.out.println("Book Details");
		System.out.println("---------------");
		for(int b=0;b<count;b++) {
			books[b].displayInfo();
			System.out.println("-------------------");
		}
	}
	


	private static void updateBook() {

	    sc.nextLine();
	    System.out.print("Enter Book Name to Update: ");
	    String name = sc.nextLine();
	    
	    boolean found = false;
	    
	    for(int i=0;i<count;i++) {
	    	if(books[i].BookName.equalsIgnoreCase(name)) {
	    		System.out.println("Book Found. Enter New Details");
	    		
	    		System.out.println("Enter New Author :");
	    		String author =sc.nextLine();
	    		
	    		System.out.println("Enter New Pages :");
	    		int pages = sc.nextInt();
	    		
	    		System.out.println("Enter New Price :");
	    		double price = sc.nextDouble();
	    		
	    		books[i].author=author;
	    		books[i].noOfPages=pages;
	    		books[i].price=price;
	    		
	    		System.out.println("Book Updated Successfully");
	    		found = true;
	    		break;
	    			
	    		
	    	}
	    	
	    }
	    if(!found) {
	    	System.out.println("Book Not Found");
	    }
	}
	
}





//package com.linkcode.Home;
//
//import java.util.Scanner;
//
//public class BookMain {
//	public static void main(String[] args) {
//		
//		
////		Book book1=new Book("harry Potter","J K rowing",500,1000);
////		Book book2=new Book("ikigai","abc",300,400);
////		Book book3=new Book("Shamchi AAi","Sane guruji",300,800);
////		book1.displayInfo();
////		book2.displayInfo();
////		book3.displayInfo();
//		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Book Management ");
//		System.out.println("How many book details you want to Add");
//		//non primative - String -4 , classes    Object , array
//		int n=sc.nextInt();
//		Book arr[]=new Book[n];
//		for(int i =0;i<n;i++) {
//			System.out.println("Enter  book Details :"+(i+1));
//			System.out.println("ENter Book Name :");
//			String name=sc.next();
//			System.out.println("Enter Book Author Name :");
//			String author=sc.next();
//			System.out.println("ENter Book Price :");
//			double price=sc.nextDouble();
//			System.out.println("Enter No OF pages :");
//			int no=sc.nextInt();
////			Book book=new Book(name, author,no,price);
////			arr[i]=book;
//			arr[i] =new Book(name,author, no,price);
//		}
//		
//		System.out.println("Book Details Added Successfully ");
//		System.out.println("----------Book Details ---------");
//		
////		for(int i=0;i<n;i++) {
////			System.out.println("Book name :"+arr[i].BookName);
////			System.out.println("Author :"+arr[i].author);
////			System.out.println("Price :"+arr[i].price);
////			System.out.println("No of Pages :"+arr[i].noOfPages);
////			System.out.println("-------------------");
////		}
//		
//		//advance For Loop
//		//Book is datatype 
//		for(Book a:arr) {
//		System.out.println("Book name :"+a.BookName);
//		System.out.println("Author :"+a.author);
//		System.out.println("Price :"+a.price);
//		System.out.println("No of Pages :"+a.noOfPages);
//		System.out.println("-------------------");
//		}
//		
////		
//	}
//}
