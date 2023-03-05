/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulator;

import java.util.Scanner;

/**
 *
 * @author naffsisky
 */
public class Kalkulator {

    public static void main(String[] args) {
        Tambah tambah = new Tambah();
        Kurang kurang = new Kurang();
        Kali kali = new Kali();
        Bagi bagi = new Bagi();
        Modulus mod = new Modulus();
        Scanner input = new Scanner(System.in);

        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.println("5. Modulus");
        System.out.print("Masukan pilihan : ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1 -> {
                System.out.print("Masukan nilai a : ");
                tambah.a = input.nextInt();
                System.out.print("Masukan nilai b : ");
                tambah.b = input.nextInt();
                tambah.Total();
                System.out.println("Total : " + tambah.Total());
            }
            case 2 -> {
                System.out.print("Masukan nilai a : ");
                kurang.a = input.nextInt();
                System.out.print("Masukan nilai b : ");
                kurang.b = input.nextInt();
                kurang.Total();
                System.out.println("Total : " + kurang.Total());
            }
            case 3 -> {
                System.out.print("Masukan nilai a : ");
                kali.a = input.nextInt();
                System.out.print("Masukan nilai b : ");
                kali.b = input.nextInt();
                kali.Total();
                System.out.println("Total : " + kali.Total());
            }
            case 4 -> {
                System.out.print("Masukan nilai a : ");
                bagi.a = input.nextInt();
                System.out.print("Masukan nilai b : ");
                bagi.b = input.nextInt();
                bagi.Total();
                System.out.println("Total : " + bagi.Total());
            }
            case 5 -> {
                System.out.print("Masukan nilai a : ");
                mod.a = input.nextInt();
                System.out.print("Masukan nilai b : ");
                mod.b = input.nextInt();
                mod.Total();
                System.out.println("Total : " + mod.Total());
            }
            default -> System.out.println("Pilihan tidak ada!");
        }
    }
}
