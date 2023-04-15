import OOP.Animal;
import OOP.Cat;
import OOP.Interface.Mammal;
import OOP.Interface.Predator;
import OOP.service.CatService;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal catOne = new Cat();
        Mammal catTwo = new Cat("Сиамский");
        Predator catThree = new Cat("Чеширский", "Иннокентий", 15, "Дымчатый");
        CatService catService = new CatService();
//        catService.gamingTheCat(cat);
//        catService.pettingTheCat((Cat) catOne);
//        catService.teaseTheCat((Cat) catTwo);
        catService.feed((Cat) catThree, 10);
    }
}