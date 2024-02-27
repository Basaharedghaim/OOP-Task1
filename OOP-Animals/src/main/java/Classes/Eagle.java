package Classes;

import AbstractClasses.Animal;
import Interfaces.Birds;
import com.Models.Enums.Coverings;
import com.Models.Enums.Environment;
import com.Models.Enums.FoodType;

public class Eagle extends Animal implements Birds {
    public Eagle(String name, Coverings cover, FoodType foodType, Environment environment) {
        super(name, cover, foodType, environment);
    }

    public Eagle() {
        this.name="Eagle";
        this.cover=Coverings.HAIR;
        this.foodType=FoodType.MEAT;
        this.environment=Environment.LAND;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setCover(Coverings cover) {
        this.cover=cover;
    }

    @Override
    public void setFoodType(FoodType foodType) {
        this.foodType=foodType;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment=environment;
    }

    @Override
    public String getBreedingProcess() {
        return "The female usually lays a clutch of two eggs, " +
                "though she can lay as many as four." +
                " She incubates the eggs for about 40 days by sitting on the nest to keep them warm.";
    }

    @Override
    public String simulateAnimalMovement() {
        return
                "As they fly, Golden Eagles often hold their wings up in a slight “V.” A normal soaring speed is about 28-32 mph" +
                "; when they are hunting, they can glide at speeds up to 120 mph." +
                " When diving (or stooping) for prey, they reach speeds of 150 – 200 mph." +
                " They can also soar effortlessly for hours.";
    }

    @Override
    public String getSizeOfWings() {
        return "The wingspan of a bald eagle ranges from five and a half feet to eight feet. " +
                "Bald eagles are 28 to 40 inches in length";
    }

    @Override
    public double getLengthOfBeak() {
        return 6.83;
    }

    @Override
    public String usedFor() {
        return "Golden eagles can be trained to be highly effective falconry birds";
    }

    @Override
    public String simulateHunting() {
        return "An eagle's excellent eyesight is used while hunting when soaring high above the ground or from perches overlooking the water. " +
                "Once prey is located, they dive at a gradual incline and catch prey with their powerful talons inflicting a vice-like killing grip.";
    }
}
