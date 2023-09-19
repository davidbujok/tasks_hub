package com.codeclan;

public class Printer {
    public int sheets;
    public int tonerVolume;

    public Printer(int sheets, int tonerVolume){
        this.sheets = sheets;
        this.tonerVolume = tonerVolume;
    }

    private void ReduceToner(int allPages){
        this.tonerVolume -= allPages;
    }
    public int Print(int pages, int copies){
        int allPages = pages * copies;
        if ((this.sheets - allPages) > 0) {
            this.sheets -= allPages;
            ReduceToner(allPages);
            return this.sheets;
        }
        return 0;
    }
}
