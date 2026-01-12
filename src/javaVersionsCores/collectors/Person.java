package javaVersionsCores.collectors;

public class Person {
	private String name;
    private String city;
    private int age;
    private String department;
    
    public Person(String name, String city, int age, String department) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.department = department;
    }
    
    // Getters
    public String getName() { return name; }
    public String getCity() { return city; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }
    
    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}
