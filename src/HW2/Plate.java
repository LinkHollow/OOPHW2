package HW2;

public class Plate {
    private Integer value;


    public Integer getVolume() {
        return value;
    }
    public void setVolume(Integer value) {
        this.value = value;
    }

    Plate(Integer value){
        this.value = value;
        System.out.println("Тарелка полна " + this.value);
    }

    boolean eat(Cat cat){
        if (cat.getFoodPortions() <= this.value){
            System.out.println(String.format("Кот %s съел %d корма из тарелки. Теперь он сыт", cat.getName(), cat.getFoodPortions()));
            this.value -= cat.getFoodPortions();
            cat.setHungry(false);
            System.out.println("Осталось " + this.value);
            return true;
        }else{
            System.out.println("В тарелке не хватает еды :(");
            System.out.println(String.format("Кот %s все еще голодный :(", cat.getName()));
            return false;
        }
    }

    protected void addFood(Integer volume){
        this.value += volume - value;
        System.out.println("Тарелка снова полна " + this.value);
    }


}
