package POJO20Feb;

public class Pojo {

	private int age;
	private String name;
	//Source-> Generate Getters and Setters
	public int getAge() {
		System.out.println("GETTER AGE");
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("SETTER Age");
	}
	public String getName() {
		System.out.println("GETTER Name");
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("SETTER Name");
	}
}
