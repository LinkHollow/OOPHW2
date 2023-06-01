package HW2;

public class Cat {
    private String name;
    private Integer foodPortions;
    private Boolean isHungry = true;
    public Boolean getHungry() {
        return isHungry;
    }

    public void setHungry(Boolean hungry) {
        isHungry = hungry;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFoodPortions() {
        return foodPortions;
    }

    public void setFoodPortions(Integer foodPortions) {
        this.foodPortions = foodPortions;
    }




    Cat(String name , Integer foodPortions){
        this.name = name;
        this.foodPortions = foodPortions;
    }

    Cat(){
        this.name = "Макс";
        this.foodPortions = 30;
    }

}
