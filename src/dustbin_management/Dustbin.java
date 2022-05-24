/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dustbin_management;

/**
 *
 * @author Manish
 */

public class Dustbin {
    public int id;
    public String location;
    public double width;
    public double height;
    public int level;
    public String lastEmptyDate;
    public int moisture;

    public void setId(int n) {
        this.id = n;
    }

    public void setMoisture(int n) {
        this.moisture = n;
    }

    public void setLocation(String n) {
        this.location = n;
    }

    public void setWidth(double n) {
        this.width = n;
    }

    public void setHeight(double n) {
        this.height = n;
    }

    public void setLevel(int n) {
        this.level = n;
    }

    public void setLastEmptyDate(String n) {
        this.lastEmptyDate = n;
    }

    public void display() {
        System.out.println("DustbinLast Empty Date is: " + lastEmptyDate);
        System.out.println("Dustbin id is: " + id);
        System.out.println("Dustbin location is: " + location);
        System.out.println("Dustbin width is: " + width);
        System.out.println("Dustbin height is: " + height);
        System.out.println("Dustbin level is: " + level);
        System.out.println("Moisture is: " + moisture);
    }

}
