package model;

import com.opencsv.bean.CsvBindByName;

public class User {

    @CsvBindByName
    private long id;
    @CsvBindByName
    private String description;
    @CsvBindByName
    private String name;
    @CsvBindByName
    private int withdraw;
    @CsvBindByName(column = "credit")
    private int credit;
    @CsvBindByName
    private int age;
    
    

    public User() {
    }

    public User(long id,String description, String name, int withdraw, int credit, int age ) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.withdraw = withdraw;
        this.credit = credit;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
    	this.age = age;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", withdraw='" + withdraw + '\'' +
                ", credit='" + credit + '\'' +
                ", age=" + age +
                '}';
    }
}

