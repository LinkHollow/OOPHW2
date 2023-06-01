package HW2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик", 33);
        Cat cat2 = new Cat("Шион", 27);
        Cat cat3 = new Cat("Сэм", 25);
        Cat cat4 = new Cat("Инокентий", 40);
        Cat cat5 = new Cat("Мурзик", 48);
        Cat cat6 = new Cat();
        Cat cat7 = new Cat("Роза", 19);

        List<Cat> catArr = new ArrayList<>();
        catArr.add(cat1);
        catArr.add(cat2);
        catArr.add(cat3);
        catArr.add(cat4);
        catArr.add(cat5);
        catArr.add(cat6);
        catArr.add(cat7);

        Plate plate1 = new Plate(150);
        //Кормим котов
        for (Cat cat : catArr){
            plate1.eat(cat);
        }
        //Вывод голодных котов
        for (Cat cat : catArr){
            System.out.println(cat.getName() + " голодный? " + cat.getHungry());
        }

        plate1.addFood(150);


        //Кормим голодных
        for (Cat cat : catArr){
            if (cat.getHungry() == true){
                plate1.eat(cat);
            }
        }

    }

}