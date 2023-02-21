package mediaEx;

import java.sql.SQLOutput;

abstract class Media {
    protected String title;
    protected String category;
    protected int year;
    protected boolean isCheckedOut;
    protected int timesCheckedOut;

    public Media(String title, String category, int year) {
        this.title = title;
        this.category = category;
        this.year = year;
        this.isCheckedOut = false;
        this.timesCheckedOut = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getYear() {
        return year;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public int getTimesCheckedOut() {
        return timesCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public void setTimesCheckedOut(int timesCheckedOut) {
        this.timesCheckedOut = timesCheckedOut;
    }

    public void incrementTimesCheckedOut() {
        this.timesCheckedOut++;
    }

    public abstract void printMedia();
}
