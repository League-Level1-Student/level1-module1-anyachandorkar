
public class Person {
String name = "Anya";
String superpower = "invisibility";
public static void main(String[] args) {
	
}


public String getName() {
	return name;
}

public String getSuperpower() {
	return superpower;
}
public void setName(String name) {
this.name=name;
}
public void setSuperpower(String superpower) {
	this.superpower=superpower;
}
public String toString() {
	return name + " has mad " + superpower + " skills";
}
}
