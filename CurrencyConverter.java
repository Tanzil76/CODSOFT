import java.util.Scanner;
public class CurrencyConverter{
    // Conversion rates 
     static double usdToEurRate = 0.85;  
     static double eurToUsdRate = 1.18;  
     static double inrToUsdRate = 0.012;
     static double inrToEurRate = 0.011;
     static double usdToInrRate = 83.81;
     static double eurToInrRate = 93.94;
    // Formula to convert USD to EUR  
     static void convertUSDToEUR() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in USD: ");  
        double usdAmount = scanner.nextDouble();  
        double eurAmount = usdAmount * usdToEurRate;  
        System.out.println(usdAmount + " USD is equivalent to " + eurAmount + " EUR");  
    }  
    // Formula to convert EUR to USD  
     static void convertEURToUSD() {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the amount in EUR: ");  
        double eurAmount = scanner.nextDouble();  
        double usdAmount = eurAmount * eurToUsdRate;  
        System.out.println(eurAmount + " EUR is equivalent to " + usdAmount + " USD");  
    } 
     static void convertINRToUSD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in INR:");
        double inrAmount = sc.nextDouble();
        double usdAmount = inrAmount*inrToUsdRate;
        System.out.println(inrAmount+ "INR is equivalnet to:" +usdAmount+ "USD");
    }
     static void convertINRToEUR(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount in INR:");
        double inrAmount = sc.nextDouble();
        double eurAmount = inrAmount*inrToEurRate;
        System.out.println(inrAmount+ " INR is equivalent to:" +eurAmount+ "EUR");
    }
    static void convertUSDToINR(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in USD:");
        double usdAmount = sc.nextDouble();
        double inrAmount = usdAmount*usdToInrRate;
        System.out.println(usdAmount+ "USD is equivalnet to:" +inrAmount+ "INR");
    }
    static void convertEURToINR(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in EUR:");
        double eurAmount = sc.nextDouble();
        double inrAmount = eurAmount*eurToInrRate;
        System.out.println(eurAmount+ "EUR is equivalnet to:" +inrAmount+ "INR");
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Currency Converter:");

        while(true){
            System.out.println("\n Menu");
            System.out.println("1.CONVERT EUR TO USD");
            System.out.println("2.CONVERT USD TO EUR");
            System.out.println("3.CONVERT INR TO USD");
            System.out.println("4.CONVERT INR TO EUR");
            System.out.println("5.CONVERT USD TO INR");
            System.out.println("6.CONVERT EUR TO INR");
            System.out.println("7.QUIT");

            System.out.println("Enter Your Choice:");

            int choice = sc.nextInt();
             switch(choice){
                case 1:
                convertEURToUSD();
                break;

                case 2:
                convertUSDToEUR();
                break;
                      
                case 3:
                convertINRToUSD();
                break;

                case 4:
                convertINRToEUR();
                break;

                case 5:
                convertUSDToINR();
                break;

                case 6:
                convertEURToINR();
                break;

                case 7:
                System.out.println("Thanks for using the currency converter");
                //close the scanner.
                sc.close();
                return;
                default:
                System.out.println("Invalid choice.Please try again");
                 
             }

        }
    }
}
