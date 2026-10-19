public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(
                1, "Ноутбук", 75000, "Электроника");
        Product p2 = new Product(
                2, "Телефон", 50000, "Электроника");
        Product p3 = new Product(
                1, "Другой ноутбук", 80000, "Электроника");
        Product p4 = new Product(
                1, "Ноутбук", 75000, "Компьютеры");

        System.out.println("ТОВАРЫ:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("\nСРАВНЕНИЕ ТОВАРОВ:");
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
        System.out.println("p1.equals(p4): " + p1.equals(p4));

        Product[] basket1 = {p1, p2};
        Product[] basket2 = {p3, p2};
        Product[] basket3 = {p2, p1};
        Product[] basket4 = {
                new Product(1, "Ноутбук", 75000, "Электроника"),
                new Product(2, "Телефон", 50000, "Электроника")
        };

        Order o1 = new Order("Иван", basket1);
        Order o2 = new Order("Иван", basket2);
        Order o3 = new Order("Иван", basket3);
        Order o4 = new Order("Иван", basket4);
        Order o5 = new Order("Пётр", basket1);

        System.out.println("\nЗАКАЗЫ:");
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);

        System.out.println("\nСРАВНЕНИЕ ЗАКАЗОВ:");
        System.out.println("o1.equals(o2): " + o1.equals(o2));
        System.out.println("o1.equals(o3): " + o1.equals(o3));
        System.out.println("o1.equals(o4): " + o1.equals(o4));
        System.out.println("o1.equals(o5): " + o1.equals(o5));
    }
}