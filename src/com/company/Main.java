package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String userName,password,karar,newPassword;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınız = ");
        userName = scanner.nextLine();

        System.out.print("Şifrenizi giriniz = ");
        password = scanner.nextLine();

        if (userName.equals("mahmut")&&password.equals("12345")){
            System.out.println("Giriş başarılı");
            System.out.println("Patikaya hoşgeldiniz ...");
        }else if (userName.equals("mahmut")&&password!="12345"){
            System.out.println("Girilen şifre yanlıştır...");
            System.out.print("Şifrenizi sıfırlamak istermisiniz ? \n(evet)  (hayır)\n");
            Scanner giris = new Scanner(System.in);
            karar = giris.nextLine();
            switch (karar){
                case "evet":
                    System.out.println("Şifreniz sıfırlanıyor...");
                    System.out.print("Yeni şifrenizi giriniz = ");
                    Scanner yeni = new Scanner(System.in);
                    newPassword=yeni.nextLine();
                    if (newPassword.equals("12345")){
                        System.out.println("Girdiğiniz parola daha önce kullanılmış lütfen tekrar bir parola oluşturun...");
                    }else {
                        System.out.println("Şifre başarı ile değiştirildi...");
                    }
                    break;
                case "hayır":
                    System.out.println("Tekrar deneyin...");
                    break;
                default:
                    System.out.println("Geçerli bir ifade giriniz...");
            }
        }else {
            System.out.println("Geçerli parola veya kullanıcı adı girin.");
        }
    }
}
