package lesson13;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if(age < 0){
            throw new AgeException("Возраст не может быть меньше 0!!!");
        }

        if(age > 150){
            throw new AgeException("Возраст не может быть больше 150!!!");
        }

        this.age = age;
    }
}
