package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Products;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Numero de produtos a serem cadastrados:");
        int n=sc.nextInt();
        Products[] vect = new Products[n];

        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("Nome do produto: ");
            String name=sc.nextLine();
            System.out.println("Preço do produto: ");
            double price=sc.nextDouble();
            vect[i]=new Products(name, price);
        }
        
        double sum=00.0;

        for(int i=0;i<n;i++){
            sum+=vect[i].getValue();
        }

        double avg=sum/n;
        System.out.println("avg price is: "+avg);
        sc.close();
        
    }
}
