/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;
public class Kalkulator {

    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
    double bilPertama,bilKedua,hasil;
    
    System.out.print("Masukkan Angka Pertama:");
    bilPertama=baca.nextDouble();
    System.out.print("Masukkan angka kedua:");
    bilKedua=baca.nextDouble();
    System.out.print("Pilih Salah Satu Operasi:" + 
            "\n1. Penjumlahan"+"\n2. Pengurangan"+"\n3. Perkalian"+"\n4. Pembagian"+"\n5. Power"+
            "\n~Masukkan Pillihan Anda:");
   
    
    
    double masukkan=baca.nextDouble();
    double Penjumlahan = 1;
    double Pengurangan = 2;
    double Perkalian = 3;
    double Pembagian = 4;
    double Power = 5;
    
    
    if(masukkan == Penjumlahan){ 
        hasil = bilPertama + bilKedua;
        System.out.println(bilPertama+"+"+bilKedua+"="+hasil);
    }else if (masukkan == Pengurangan){hasil=bilPertama - bilKedua;
            System.out.println(bilPertama+"-"+bilKedua+"="+hasil);
            }else if (masukkan == Perkalian){hasil=bilPertama*bilKedua;
            System.out.println(bilPertama+"x"+bilKedua+"="+hasil);}
            else if (masukkan == Pembagian){
                hasil=bilPertama/bilKedua;
            System.out.println(bilPertama+":"+bilKedua+"="+hasil);
       
    
    
    
    }}}
    

