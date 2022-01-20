package inheritance.task02;

public class MoldovanHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 120;
    }

    @Override
    public String getDescription() {
        return super.getDescription()
                + " Моя страна - Молдова."
                + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
