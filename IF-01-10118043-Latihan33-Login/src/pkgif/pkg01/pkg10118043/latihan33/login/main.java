/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan33.login;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class main {
    private static String usName;
    private static String passWord;               
    	public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);   
        System.out.print("Masukkan Username = ");
        usName = scanner.nextLine();
         
        System.out.print("Masukkan Password = ");
        passWord = scanner.nextLine();
         
         //proses
         User user = new User();
         user.pengecekanLogin(usName, passWord);}
         }
    

