public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    public Basket() {
            increaseCount(1);
            items = "Список товаров:";
            this.limit = 1000000;
        }

    public Basket(int limit){
            this();
            this.limit = limit;
        }

    public Basket(String items, int totalPrice){
            this();
            this.items = this.items + items;
            this.totalPrice = totalPrice;
        }

    public static int getCount () {
        return count;
    }

    public static void increaseCount (int count){
        Basket.count = Basket.count + count;
    }

    public void add (String name,int price){
        add(name, price, 0, 1);
    }

    public void add(String name, int price, double weight){
        add(name, price, weight, 1);
        System.out.println();
    }

    public void add (String name,int price, double weight, int count){
        boolean error = false;

        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб. ";
        if (weight > 0){
            items += weight + " кг.";
        }

        totalPrice = totalPrice + count * price;
        totalWeight += weight * count;
    }

    public void clear () {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice () {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains (String name){
        return items.contains(name);
    }

    public void print (String title){
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("----------------------------------------------------");
            System.out.println("Сумма,(руб.) " + totalPrice + "; Итого вес,(кг.) " + totalWeight);
        }
    }
}
