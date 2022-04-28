/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Scanner;

/**
 *
 * @author My Computer
 */
public class Student {
    private Scanner input = new Scanner(System.in);
    private String hoten;
    private int lop;
    public Student()
    {
        
    }
    public Student(String hoten, int lop) {
        this.hoten = hoten;
        this.lop = lop;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return "Student{" + "hoten=" + hoten + ", lop=" + lop + '}';
    }
    
}
