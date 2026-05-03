import java.util.Scanner;


public class App {

    public static void main(String args[]) {
        String option;
        int j = 1;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < j; i++) {
            System.out.println("\n--- Sistema de Autenticação Discord ---");
            System.out.println("Escolha como quer fazer login:");
            System.out.println("1 - Google\n2 - Login e Senha\n3 - QrCode");
            
            option = sc.nextLine();


            switch (option) {
                case "1":
                    GoogleAuth g = new GoogleAuth();
                    g.Authenticate();
                    break;
                case "2":
                    LoginPassword lp = new LoginPassword(); 
                    lp.Authenticate();
                    break;
                case "3":
                    QRCodeAuth qr = new QRCodeAuth();
                    qr.Authenticate();
                    break;
                default:
                    System.out.println("Tipo inválido");
                    j++;
                    break;
            }
        }
        sc.close();

    }
}