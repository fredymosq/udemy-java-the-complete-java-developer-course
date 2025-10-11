package encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        pagesPrinted = 0;
    }

    public int addTonner(int tonerAmount){

        int temAmount = tonerAmount + tonerLevel;
        if (temAmount > 100 || temAmount < 0){
            return -1;
        }
        tonerLevel += tonerAmount;

        return tonerLevel;
    }

    public int printPages(int pages){
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;

        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
