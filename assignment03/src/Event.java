public class Event implements Comparable<Event>{
    int year;
    String event;

    //sets an event for a person
    public void setEvent(int year, String event) {
        this.year = year;
        this.event = event;
    }

    //returns the year
    public int getYear() {
        return this.year;
    }

    //sorts by year
    @Override
    public int compareTo(Event e) {
        int compare_year = e.getYear();
        return this.year - compare_year;
    }

}
