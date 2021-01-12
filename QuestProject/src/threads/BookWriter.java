package threads;

public class BookWriter implements Runnable {
Book book;
public BookWriter(Book book) {
	super();
	this.book=book;
}
	@Override
	public void run() {
		synchronized(book) {
			System.out.println("Author is starting book"+book.getTitle());
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			book.setCompleted(true);
			System.out.println("Book has been completed now");
			book.notify();
			System.out.println("Notify one reader...");
			//book.notifyAll();
			//System.out.println("Notify all reader...");
		}
	}
}
