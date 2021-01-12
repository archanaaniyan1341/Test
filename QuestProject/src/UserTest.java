
public class UserTest {

	public static void main(String[] args) {
User u=new User();
u.setId(101);
u.setAddress("TVM");
u.setPin(656);
u.setUsername("quest");
System.out.println(u.getAddress());
System.out.println(u.getUsername());
System.out.println(u.getId());
System.out.println(u.getPin());
	}

}
