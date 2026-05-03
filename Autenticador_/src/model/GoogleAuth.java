package model;

import java.util.Scanner;
import service.Authentication;


public class GoogleAuth extends Authentication {
    
    private String email;
    

    @Override
        public void data() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu email:\n");
            email = sc.nextLine();

            sc.close();
        }

    @Override
        public boolean validateData() {
            if(this.email != null && !this.email.trim().isEmpty() && this.email.contains("@gmail.com")) {
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
