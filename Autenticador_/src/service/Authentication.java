package service;


public abstract class Authentication {

    
    public final void Authenticate() {
        data();
        if(validateData()) {
            login();
        }
        else {
            throw new IllegalArgumentException("Não foi possível conectar, verifique os dados!");
        }
    }


    

    // Methods to authenticate
    public abstract void data();
    public abstract boolean validateData();
    public void login() {
        System.out.println("Usuário logado com sucesso!");
    }

}