public class Burger extends Food{
    public String getSize() {
        return size;
    }

    public void setSize(String Size) {
        this.size = size;
    }

    private String size;
    public Burger(String size) {
        super("Бургер");
        this.size = size;
    }
    @Override
            /*public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Burger)) return false; // Шаг 2
            return size.equals(((Burger)arg0).size); // Шаг 3
        } else
            return false;
    }*/


    public void consume() {
        System.out.print(  this.toString()+  " съеден ");

    }
    @Override
    public String toString(){
        return "бургер размером  " + size;
    }
}