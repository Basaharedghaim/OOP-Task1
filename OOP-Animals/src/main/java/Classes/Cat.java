package Classes;

import AbstractClasses.Animal;
import Interfaces.Mammal;
import com.Models.Enums.Coverings;
import com.Models.Enums.Environment;
import com.Models.Enums.FoodType;

public class Cat extends Animal implements Mammal {

    public Cat() {
        this.name="Cat";
        this.cover=Coverings.HAIR;
        this.environment=Environment.LAND;
        this.foodType=FoodType.MEAT;
    }

    public Cat(String name, Coverings cover, FoodType foodType, Environment environment) {
        super(name, cover, foodType, environment);
    }

    @Override
    public void setName(String name) {
        this.setName(name);
    }

    @Override
    public void setCover(Coverings cover) {
    this.setCover(cover);
    }

    @Override
    public void setFoodType(FoodType foodType) {
    this.setFoodType(foodType);
    }

    @Override
    public void setEnvironment(Environment environment) {
    this.setEnvironment(environment);
    }

    @Override
    public String getBreedingProcess() {
        return "Cat Gives Natural breeding after 63 days pregnancy";
    }

    @Override
    public String simulateAnimalMovement() {
        return "galloping, jumping";
    }

    @Override
    public int getLimbs() {
        return 4;
    }

    @Override
    public int getTeethNum() {
        return 30;
    }

    @Override
    public String viewRelationWithHuman() {
        return "cats do get attached to people";
    }

    @Override
    public String simulateSound() {
        return "Meow.\n" +
                "Distress call.\n" +
                "Purring.\n" +
                "Trill.\n" +
                "Hiss and spit.\n" +
                "Howl and yowl.\n" +
                "Snarl and growl";
    }

}
