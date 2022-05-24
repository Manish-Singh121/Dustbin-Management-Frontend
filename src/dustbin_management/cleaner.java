/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dustbin_management;

/**
 *
 * @author Manish
 */

class Cred {

    public String username;
    public String password;

    // public void Cred(String username, String password)
    // {
    // this.username = username;
    // this.password = password;
    // }
    public void setUserName(String n) {
        this.username = n;
    }

    public void setPass(String i) {
        this.password = i;
    }
}

class Person extends Cred {

    public String name;
    public String email;
    public String phoneNumber;

    // public void Person(String usern,String pass,String name, String email, String
    // phoneNumber)
    // {
    // this.username = usern;
    // this.password = pass;
    // this.name = name;
    // this.email = email;
    // this.phoneNumber = phoneNumber;
    // }
    public void setName(String n) {
        this.name = n;
    }

    public void setEmail(String i) {
        this.email = i;
    }

    public void setPhoneNumber(String i) {
        this.phoneNumber = i;
    }

    public void display() {
        System.out.println("User password is: " + password + " and User username is: " + username);
        System.out.println(
                "User name is: " + name + " and User email is: " + email + " and User phoneNumber is: " + phoneNumber);
    }
}

public class cleaner extends Person {

    public String cleanerNumber;

    // public void cleaner(String usern,String pass,String name, String email, String
    // phoneNumber, String n)
    // {
    // this.username = usern;
    // this.password = pass;
    // this.name = name;
    // this.email = email;
    // this.phoneNumber = phoneNumber;
    // this.cleanerNumber = n;
    // }
    public void setcleanerNumber(String n) {
        this.cleanerNumber = n;
    }

    public void display() {
        System.out.println("cleaner number is: " + cleanerNumber);
        System.out.println("cleaner password is: " + password + " and cleaner username is: " + username);
        System.out.println(
                "cleaner name is: " + name + " and cleaner email is: " + email + " and cleaner phoneNumber is: " + phoneNumber);
    }
}