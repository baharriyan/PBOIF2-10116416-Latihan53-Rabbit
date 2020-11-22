/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rabbit;

/**
 *Nama  : Riyan Bahar
 *Kelas : PBO-02
 *NIM   : 10116416  
 *Deskripsi Program : program ini berisi tentang profil dari seekor binatang
 */
public class RabbitMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Rabbit rabbit = new Rabbit("Peter",false, "grass", 4, "grey" );
        System.out.println("Hello, His name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is Vegetarian? "
                +rabbit.isVegetarian());
        System.out.println(rabbit.getName()+" eats "+rabbit.getEats());
        System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()
                +" legs.");
        System.out.println(rabbit.getName()+" color is "+rabbit.getColor());
    }
}