/*import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1,s2,s3;

        x=sc.nextInt();
        sc.nextLine();
        s1=sc.nextLine();
        s2=sc.nextLine();
        s3=sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}

public class Main {

    public static void main(String[] args) {
        double x=3.0;
        double y=4.7;
        double z=3.9;

        double A = Math.sqrt(z);
        double B = Math.pow(y, 2);

        System.out.println(A);
        System.out.println(B);
    }
}*/

/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Que horas são?");
        int horas = sc.nextInt();

        sc.close();

        if(horas<12){
            System.out.println("Bom dia");
        }
        else if(horas<18){
                System.out.println("Boa tarde!");
            }
        else{
            System.out.println("Boa Noite!");
           }

        
    }
    
    
} */

/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Codigo do produto: ");
        int cod=sc.nextInt();
        System.out.println("Codigo do produto: ");
        int qtd=sc.nextInt();

        if(cod==1){
            double x = 4*qtd;
            System.out.printf("Total: %.2f R$",x);
        }
        else if(cod==2){
            double x = 4.5*qtd;
            System.out.printf("Total: %.2f R$",x);
        }
        else if(cod==3){
            double x = 5*qtd;
            System.out.printf("Total: %.2f R$",x);
        }
        else if(cod==4){
            double x = 2*qtd;
            System.out.printf("Total: %.2f R$",x);
        }
        else if(cod==5){
            double x = 1.5*qtd;
            System.out.printf("Total: %.2f R$",x);
        }
        sc.close();
}} */

/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Informe seu salário:");
        int salario=sc.nextInt();

        
        if(salario<2000){
            System.out.println("não precisa pagar imposto");
        }
        else if(salario>2000 && salario<3000){
           double imposto= 0.08*salario;
           System.out.printf("Imposto: %.2f", imposto);
        }
        else if(salario>3000 && salario<4500){
            double imposto= 0.18*(salario-3000)+80;
            System.out.println("Imposto:"+ imposto);
         }
         else if(salario>4500){
            double imposto= 0.28*(salario-4500)+((1500*0.18)+80);
            System.out.printf("Imposto: %.2f", imposto);
         }

    }
}*/

/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String dia;

        switch(x){
            case 1:
                dia="domingo";
                break;
            case 2:
                dia="segunda";
                break;
            case 3:
                dia="terça";
                break;
            case 4:
                dia="quarta";
                break;
            case 5:
                dia="Quinta";
                break;
            case 6:
                dia="Quinta";
                break;
            case 7:
                dia="Sexta";
                break;
            default:
                dia="valor inválido, coloque um número de 1 a 7";
                break;
            }
            System.out.println("Dia da semana:" + dia);       
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double preço=sc.nextInt();
        double desconto = (preço>30)?preço*0.2:preço*0.45;
        System.out.println(desconto);

        
    }

}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int soma=0;

        while(x!=0){
            soma+=x;
            x=sc.nextInt();

        }
        sc.close();
        System.out.println(soma);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int senha=sc.nextInt();
        
        while(senha!=2002){
            System.out.println("Essa não é a senha! Tente novamente");
            senha=sc.nextInt();
            
        }
        System.out.println("Acesso permitido!");
        sc.close();
    }
}*/

/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;

        x=sc.nextInt();
        y=sc.nextInt();
            while (x!=0 && y!=0) {
                if (x>0 && y>0) {
                    System.out.println("primeiro quadrante");
                    break;}
                else if (x>0 && y<0){
                    System.out.println("Segundo quadrante");
                    break;
                }
                else if (x<0 && y>0){
                    System.out.println("Terceiro quadrante");
                    break;
                }
                else if (x<0 && y<0){
                    System.out.println("Quarto quadrante");
                    break;
                }
                sc.close();
            }
            }
        
    }

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int comb, qtd1, qtd2, qtd3;

            qtd1=0;
            qtd2=0;
            qtd3=0;
            System.out.println("1-Alcool /n 2-Gasolina /n 3-Diesel /n 4- Fim");
            comb=sc.nextInt();

            while (comb!=4) {
                if (comb==1){
                    qtd1+=1;
                }
                else if (comb==2){
                    qtd2+=1;
                }
                else if (comb==3){
                    qtd3+=1;
                }
                
                comb=sc.nextInt();
                
            }
            System.out.println("Muito Obrigado");
            System.out.println("Alcool:"+qtd1);
            System.out.println("Gasolina:"+qtd2);
            System.out.println("Diesel:"+qtd3);
          

                
           sc.close();
            

        }
    }

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Numero de entradas:");
            int N=sc.nextInt();
            System.out.println("digite as entradas:");

            int soma=0;
            for (int i=0;i<N; i++){
                int x=sc.nextInt();
                soma = soma + x;

            }
            System.out.println("soma dos numeros é "+soma);
            
            sc.close();
        }
    }

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();

            for(int i=1; i<=x; i++){
                if (i%2!=0) {
                    System.out.println(i);
                }
            }
            sc.close();
        }
    }

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int N =sc.nextInt();

            int in=0;
            int out=0;


            for(int i=0;i<N;i++){
                int x=sc.nextInt();
                if (10<x && x<20){
                    in++;
                    
                }
                else{
                    out++;
                }
            }
            System.out.println(in+" in");
            System.out.println(out+" out");
            sc.close();
        }
    }

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            for(int i=0;i<n;i++){
                double x=sc.nextDouble();
                double y=sc.nextDouble();
                double z=sc.nextDouble();
                
                double media=((x*2)+(y*3)+(z*5))/10;
                System.out.println(media);
            }
            sc.close();
        }
    }

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            for(int i=0;i<n;i++){
                double x=sc.nextInt();
                double y=sc.nextInt();

                if (y==0){
                System.out.println("Divisao impossivel");
                }
                else
                {
                    double div=x/y;
                    System.out.printf("%.2f%n",div);
                }

            }sc.close();
        }
    }

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int fatorial=1;
            
            for(int i=1;i<=n;i++){
                fatorial=fatorial*i;
            }
            System.out.println(fatorial);
            sc.close();
        }
    }*/

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            for (int i=1;i<=n;i++){
                
                int mod=n%i;
                if (mod==0) {
                    System.out.println(i);
                }
            }
                sc.close();
            }
        }
    


