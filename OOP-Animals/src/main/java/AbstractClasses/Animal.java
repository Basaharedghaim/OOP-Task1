package AbstractClasses;

import com.Models.Enums.Coverings;
import com.Models.Enums.Environment;
import com.Models.Enums.FoodType;

abstract public class Animal {
     protected String name;
     protected Coverings cover;
     protected FoodType foodType;
     protected Environment environment;

    public Animal(String name, Coverings cover, FoodType foodType, Environment environment) {
        this.name = name;
        this.cover = cover;
        this.foodType = foodType;
        this.environment = environment;
    }

    public Animal() {
    }

    abstract public void setName(String name);

    abstract public void setCover(Coverings cover) ;

    abstract public void setFoodType(FoodType foodType) ;

    abstract public void setEnvironment(Environment environment) ;

    public String getName() {
        return name;
    }

    public Coverings getCover() {
        return cover;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public Environment getEnvironment() {
        return environment;
    }
     public abstract String getBreedingProcess();
     public abstract String simulateAnimalMovement();

}
