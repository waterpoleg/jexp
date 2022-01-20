package inheritance.task02;

public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 250;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + " Моя страна - Беларусь."
                + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
