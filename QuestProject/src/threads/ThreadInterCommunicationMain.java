package threads;

public class ThreadInterCommunicationMain {

	public static void main(String[] args) {
	Book book=new Book("My first book");
BookReader infyReader=new BookReader(book);
BookReader ustReader=new BookReader(book);
BookReader ibmReader=new BookReader(book);

Thread infyThread=new Thread(infyReader,"Infosys");
Thread ustThread=new Thread(ustReader,"UST");
Thread ibmThread=new Thread(ibmReader,"IBM");
infyThread.start();
ustThread.start();
ibmThread.start();
try {
	Thread.sleep(3000);
}catch(InterruptedException e) {
	e.printStackTrace();
}
BookWriter bookWriter =new BookWriter(book);
Thread bookWriterThread=new Thread(bookWriter );
bookWriterThread.start();
	}
	

}
