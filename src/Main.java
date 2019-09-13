public class Main {
    public static void main(String[] args) {
        System.out.println("Shitster 1.0");

        Shitster rasmusLort = new Shitster(); //instansierer et objekt af klassen Shitster
        rasmusLort.weight = 3;
        rasmusLort.healthy = false;
        rasmusLort.temp = 37;

        Shitster henrikLort = new Shitster();
        henrikLort.weight = 5;
        henrikLort.healthy = true;
        henrikLort.temp = 38.5;

        System.out.println("rasmus' afføring vejer: " + rasmusLort.weight + "kg");
        System.out.print("Rasmus' lort er ");
        rasmusLort.erDenSund();
        System.out.println("Rasmus' lort er " + rasmusLort.temp + "grader varm");

        System.out.println("You got forked");




    }
}
