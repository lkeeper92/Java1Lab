public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        Food[] products = new Food[20];

        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");


            switch (parts[0]) {
                case "Cheese" -> {breakfast[itemsSoFar] = new Cheese();
                    products[0]=new Cheese();}
                case "Apple" -> {breakfast[itemsSoFar] = new Apple(parts[1]);
                    products[1]=new Apple(parts[1]);}
                case "Burger" -> {breakfast[itemsSoFar] = new Burger(parts[1]);
                    products[2]=new Burger(parts[1]);}
            }
            itemsSoFar++;
        }
        countFood(breakfast, products[0]);
        countFood(breakfast, products[1]);
        countFood(breakfast, products[2]);

        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
                System.out.println();

            } else {
                break;
            }
        }
    }

    public static void countFood(Food[] foods, Food food) {
        int count = 0;
        for (Food f : foods) {
            if (f != null && f.equals(food)) {
                count++;
            }

        }
        System.out.println("There are " + count + " products of type " + food.getClass().getSimpleName() + " in the breakfast");
    }
}