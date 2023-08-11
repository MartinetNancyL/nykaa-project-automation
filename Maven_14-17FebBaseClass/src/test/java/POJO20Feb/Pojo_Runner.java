package POJO20Feb;

public class Pojo_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pojo p1= new Pojo();
		p1.setAge(6);
		p1.setName("Sarah");
		
		String p1name= p1.getName();
		System.out.println("p1name" +p1name);
		
		System.out.println("p1age" +p1.getAge());
	}

}
