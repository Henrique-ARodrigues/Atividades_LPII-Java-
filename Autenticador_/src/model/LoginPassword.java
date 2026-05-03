package model;

import java.util.Scanner;

import service.Authentication;

public class LoginPassword extends Authentication{

    private String login;
    private String password;


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
        public void data() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu login:\n");
            login = sc.nextLine();
            System.out.println("Digite sua senha:\n");
            password = sc.nextLine();

            sc.close();
        }

    @Override
        public boolean validateData() {
            if(this.password.length() > 8 && this.login.length() > 4) {
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
