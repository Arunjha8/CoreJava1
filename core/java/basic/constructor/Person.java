package core.java.basic.constructor;

public class Person {
private int id;
private String name;
private String address;

public Person() {
	System.out.println("zero parameter");
}
public Person(int id) {
	this();
	System.out.println("one parameter");
}
public Person(int id, String name) {
	this(id);
	System.out.println("Two parameter");
}
public Person(int id, String name, String address) {
	this.id = id;
	this.address = address;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
