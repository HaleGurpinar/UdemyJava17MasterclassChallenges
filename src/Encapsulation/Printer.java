package Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel<=0 && tonerLevel>100 ){
            tonerLevel=-1;
        }else {
            this.tonerLevel = tonerLevel;
        }

        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
       int tempAmount= tonerAmount+ tonerLevel;
        if (tempAmount< 0 || tempAmount>100 ){
            return -1;
        }
        tonerAmount += tonerLevel;
        return tonerLevel;
    }

    public int printPages(int pages){

        if (duplex){
            int jobPages=pages%2==0 ? pages/2 : (pages/2)+1;
            pagesPrinted += jobPages;
            return jobPages;
        }else{
            pagesPrinted += pages;
            return pagesPrinted;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
