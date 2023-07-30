package org.edu;
public class Education extends Medicine {
    public void ug() {
        System.out.println("Undergraduate Education");
    }
    public void pg() {
        System.out.println("Postgraduate Education");
    }
    public static void main(String[] args) {
        Education e = new Education();
        e.ug();
        e.pg();
        e.bA();
        e.BBA();
        e.bed();
        e.bsc();
        e.bE();
        e.bTech();
        e.dental();
        e.mbbs();
        e.physiyo();   
    }
}
