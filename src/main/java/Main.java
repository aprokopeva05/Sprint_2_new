import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100); // Мясо: 5 кг по 100 руб/кг
        Apple redApple = new Apple(10, 50, Colour.RED); // Красные яблоки: 10 кг по 50 руб/кг
        Apple greenApple = new Apple(8, 60,Colour.GREEN); // Зеленые яблоки: 8 кг по 60 руб/кг
        Food[] products = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);
        double totalWithoutDiscount = cart.getTotalWithoutDiscount();
        System.out.println ("Общая сумма товаров без скидки:" + totalWithoutDiscount);
        double totalWithDiscount = cart.getTotalWithDiscount();
        System.out.println("Общая сумма товаров со скидкой: " + totalWithDiscount);
        double vegetarianTotal = cart.getVegetarianTotalWithoutDiscount();
        System.out.println("Сумма вегетарианских продуктов без скидки: " + vegetarianTotal);
    }
}