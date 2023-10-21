package SoftEng1_LabAss6_adapterPattern;
import java.util.Scanner;

public class TechnologyApp
{
    public static void printName()
    {
        System.out.println("SOFTWARE ENGINEERING 1");
        System.out.print("LABORATORY ASSIGNMENT 6 - ADAPTER PATTERN\n");
        System.out.print("RODRIGUEZ, BABYLENE G.\n");
        System.out.print("3-BSCS-1\n");
        System.out.println();
    }

    public static void main (String[] args)
    {
        printName();

        Laptop laptop = new Laptop();
        PowerOutlet laptopPowerOutlet = new LaptopAdapter (laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorPowerOutlet = new RefrigeratorAdapter (refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartphonePowerOutlet = new SmartphoneAdapter (smartphoneCharger);


        int option;
        while (true)
        {
            System.out.print("\nDEVICES\n");
            System.out.println("[1] Laptop");
            System.out.println("[2] Refrigerator");
            System.out.println("[3] Smartphone");
            System.out.println("[4] Exit Program");

            Scanner usersInput = new Scanner(System.in);
            System.out.print("\nSelect a Device: ");
            option = usersInput.nextInt();

            switch (option)
            {
                case 1:

                    System.out.print("\n\nChosen Device: LAPTOP\n");
                    System.out.println(laptopPowerOutlet.plugIn());
                    System.out.println();
                    break;

                case 2:

                    System.out.print("\n\nChosen Device: REFRIGERATOR\n");
                    System.out.println(refrigeratorPowerOutlet.plugIn());
                    System.out.println();
                    break;

                case 3:

                    System.out.print("\n\nChosen Device: SMARTPHONE\n");
                    System.out.println(smartphonePowerOutlet.plugIn());
                    System.out.println();
                    break;

                case 4:
                    System.out.println("\n\nEXITING PROGRAM...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("This is not a valid Option! Please Select Another");
                    break;
            }

        }

    }
}
