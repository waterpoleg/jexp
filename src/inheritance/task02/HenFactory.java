package inheritance.task02;

public class HenFactory {
    public Hen getHen(String country) {
        Hen hen = null;
        switch (country) {
            case "Россия" -> hen = new RussianHen();
            case "Украина" -> hen = new UkrainianHen();
            case "Молдова" -> hen = new MoldovanHen();
            case "Беларусь" -> hen = new BelarusianHen();
        }
        return hen;
    }

    public static void main(String[] args) {
        HenFactory hf = new HenFactory();
        Hen hen = hf.getHen("Беларусь");
        System.out.println(hen.getDescription());
    }
}
