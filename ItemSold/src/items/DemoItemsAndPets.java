package items;
import java.util.*;
public class DemoItemsAndPets 
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int invoiceNumber;
        String description;
        double price;
        ItemSold item1 = new ItemSold();

        
        System.out.println("What is the invoice number of the item: ");
        invoiceNumber = input.nextInt();
        item1.setInvoiceNumber(invoiceNumber);
        System.out.println("What is the description of the item: \n");
        description = input.next();
        item1.setDescription(description);
        System.out.println("What is the price of the item: ");
        price = input.nextDouble();
        item1.setPrice(price);
        
        System.out.println("Pet/Item sold");
        System.out.println("Invoice number: " + item1.getInvoiceNumber());
        System.out.println("Description: " + item1.getDescription());
        System.out.println("Price: " + item1.getPrice());
        
        PetSold pet1 = new PetSold();
        System.out.println("Has the pet been vaccinated? 0 for Yes and 1 for No");
        int beenVaccinatedInput = input.nextInt();
        boolean beenVaccinated = (beenVaccinatedInput == 0) ? true : false;
        pet1.setBeenVaccinated(beenVaccinated);
        
        System.out.println("Has the pet been housebroken? 0 for Yes and 1 for No");
        int beenHousebrokenInput = input.nextInt();
        boolean beenHousebroken = (beenHousebrokenInput == 0) ? true: false;
        pet1.setBeenHousebroken(beenHousebroken);
        System.out.println("Has the pet been neutered? 0 for Yes and 1 for No");
        int beenNeuteredInput = input.nextInt();
        boolean beenNeutered = (beenNeuteredInput == 0) ? true: false;
        pet1.setBeenNeutered(beenNeutered);
        System.out.println("Pet sold");
        System.out.println("Has the pet been vaccinated? " + pet1.getBeenVaccinated());
        System.out.println("Has the pet been housebroken? " + pet1.getBeenHousebroken());
        System.out.println("Has the pet been neutered? " + pet1.getBeenNeutered());
        
    }
}
