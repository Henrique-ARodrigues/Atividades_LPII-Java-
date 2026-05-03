package model;

import java.util.Scanner;

import service.Authentication;


public class QRCodeAuth extends Authentication {

    private String qrCode;


    @Override
        public void data() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu QrCode:\n");
            System.out.println("Exemplo: 'QR1423'\n");
            qrCode = sc.nextLine();

            sc.close();
        }

    @Override
        public boolean validateData() {
            if(this.qrCode != null && !this.qrCode.trim().isEmpty() && this.qrCode.startsWith("QR")) {
           return true;
        }
        else {
            return false;
        }
            
        }

    
        public void userLogin() {
            if(validateData()) {
                login();
            }
            else {
                return;
            }
        }
    
}
