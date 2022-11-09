public class Main {
    public static void main(String[] args) {
        Fox fox = new Fox();
        System.out.println("About fox:");
        fox.info();

        System.out.println("");

        Fish fish = new Fish();
        System.out.println("About fish:");
        fish.info();

        System.out.println("");

        Wolf wolf = new Wolf(0);
        System.out.println("About wolf:");
        wolf.info();
    }
}