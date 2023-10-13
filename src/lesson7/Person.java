package lesson7;

public class Person {
    // обяъявление характеристик (поля класса), переменные класса
    private int age;
    private String name;
    private String surname;
    private String phoneNumber;
    private String adress;


    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }
// this - это Я, у меня.
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
