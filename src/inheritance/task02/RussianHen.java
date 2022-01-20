package inheritance.task02;

public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 150;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + " Моя страна - Россия."
                + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
