import java.util.ArrayList;
import java.util.Scanner; 

public class BookDB {

	public static void main(String[] args) {
	
		String userinput;
		
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<Book> books = new ArrayList<Book>(); 
		Book a = new Book("Java1001", "Head First java","Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50);
		books.add(a);
		Book b = new Book("Java1002", "Thinking in Java", "Bruce Eckel", "	Details about Java under the hood", 20.00); 
		books.add(b);
		Book c = new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 45.00); 
		books.add(c);
		Book d = new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50); 
		books.add(d);
		Book e = new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50); 
		books.add(e);
		Book f = new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75); 
		books.add(f); 
		
		
	System.out.println("Enter an SKU"); 
	userinput = keyboard.next(); 
	
	outputbook(userinput, keyboard, books);

} 

	
	public static void outputbook(String userinput, Scanner keyboard,  ArrayList <Book> books){

		for (Book book:books){  
			
			if (userinput.equals(book.getSku()))
			System.out.println(book.toString());
		}
	
	
	} 
}
	
		


