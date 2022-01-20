package inheritance.task02;

public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 180;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + " Моя страна - Украина."
                + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
