package Classes;

import AbstractClasses.Animal;
import Interfaces.Reptiles;
import com.Models.Enums.Coverings;
import com.Models.Enums.Environment;
import com.Models.Enums.FoodType;

public class Snake extends Animal implements Reptiles {
    public Snake(String name, Coverings cover, FoodType foodType, Environment environment) {
        super(name, cover, foodType, environment);
    }

    public Snake() {
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
        return "Snakes Lay Eggs";
    }

    @Override
    public String simulateAnimalMovement() {
        return "Snakes do not have limbs. " +
                "Instead, they have very flexible ribs, " +
                "vertebrae and also their body has layers of muscles beneath the skin. " +
                "These muscles contract and relax alternatively forming a wave-like motion. " +
                "This type of movement is called slithering.";
    }

    @Override
    public String displayUniqueBehavior() {

        return "Snakes react when cornered with a variety of defensive tactics that vary by species. " +
                "Defensive tactics include playing dead by exposing the belly, hissing, " +
                "opening the mouth in a menacing manner, coiling, emitting an odorous fluid from the vent, " +
                "striking, and biting.";
    }

    @Override
    public String regulateBodyTemperature() {
        return "Snakes temp is "+Reptiles.DEFAULT_BODY_TEMP;
    }
}
