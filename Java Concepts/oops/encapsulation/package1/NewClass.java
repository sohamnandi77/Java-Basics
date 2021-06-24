package oops.encapsulation.package1;

public class NewClass {
    
    private int age;
    private String name;

// getters and setters method
public int getAge() {
    return age;
}

public void setAge(int age) {
    if (age < 20){
    this.age = age;
}else {
    System.out.println("You are too old to be a student");
}
}
public String getName() {
    return name;
}

public void setAge(String name) {
    this.name = name;
}

    
}
