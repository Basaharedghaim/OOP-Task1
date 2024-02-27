import AbstractClasses.Animal;
import Classes.Cat;
import Classes.Eagle;
import Interfaces.Birds;
import Interfaces.Mammal;
import com.Models.Enums.Coverings;
import com.Models.Enums.Environment;
import com.Models.Enums.FoodType;

public class Main {
    public static void main(String[] args){
        Animal cat=  new Cat("Cat", Coverings.HAIR,FoodType.MEAT, Environment.LAND);
        System.out.println(cat.getBreedingProcess());
        System.out.println(cat.simulateAnimalMovement());
        System.out.println(cat.getFoodType());
        System.out.println(((Cat) cat).getTeethNum());
        Animal eagle=new Eagle();
        System.out.println("***********************");
        System.out.println(((Birds)eagle).getSizeOfWings());
        System.out.println(((Birds)eagle).getLengthOfBeak());


    }
}
