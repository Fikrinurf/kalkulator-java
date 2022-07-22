import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Main{
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        char operator;
        float a, b, hasil;


        System.out.println("=====SELAMAT DATANG DI PROGRAM KALKULATOR SEDERHANA DI JAVA=====");
        System.out.println("Daftar Operatornya(+,-,*,/)");
        System.out.print("Masukan Angka Pertama: ");
        a = inputUser.nextFloat();
        System.out.print("Masukan Operator Aritmetika: ");
        operator = inputUser.next().charAt(0);
        System.out.print("Masukan Angka Kedua: ");
        b = inputUser.nextFloat();

        if (operator == '+'){
            hasil = pertambahan(a, b);
            System.out.println("Hasil Penjumlahan dari " + a + " + " + b + "= " + hasil);
        }else if (operator == '-'){
            hasil = pengurangan(a, b);
            System.out.println("Hasil Pengurangan dari " + a + " - " + b + "= " + hasil);
        }else if(operator == '*'){
            hasil = perkalian(a, b);
            System.out.println("Hasil Perkalian dari " + a + " x " + b + "= " + hasil);
        }else if(operator == '/'){
            hasil = pembagian(a, b);
            if (b == 0){
                System.out.println("jika di bagi dengan angka nol akan menghasilkan tak terhingga(infinty)");
            }else{
                System.out.println("Hasil Pembagian dari " + a + " / " + b + "= " + hasil);
            }
        }else{
            System.out.println("Operator tidak ditemukan.. Silahkan Periksa kembali");
        }


    }
    //functionnn

    static float pertambahan(float a, float b){
        float hasil;
        hasil = a + b;

    return hasil;
    }

    static float pengurangan(float a, float b){
        float hasil;
        hasil = a - b;
    
    return hasil;
    }

    static float perkalian(float a, float b){
        float hasil;
        hasil = a * b;

    return hasil;
    }

    static float pembagian(float a, float b){
        float hasil;
        hasil = a / b;

    return hasil;
    }
}
