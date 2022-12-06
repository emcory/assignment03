import java.util.ArrayList;
import java.util.Collections;

public class Person{
    String name;
    int birth;
    int death;
    ArrayList<Person> marriages = new ArrayList<>();
    ArrayList<Person> children = new ArrayList<>();
    ArrayList<Person> parents = new ArrayList<>();
    ArrayList<Event> events = new ArrayList<>();

    //makes a person without a death date
    public void makeAlivePerson(String name, int birth) {
        this.name = name;
        this.birth = birth;
        this.death = 0;
    }

    //makes a person with a death date
    public void makeDeadPerson(String name, int birth, int death) {
        this.name = name;
        this.birth = birth;
        this.death = death;
    }

    //adds a marriage relationship between two people
    public static void addMarriage(Person partner1, Person partner2) {
        partner2.marriages.add(partner1);
        partner1.marriages.add(partner2);
    }

    //adds a parent/child relationship to three people
    public static void addChild(Person father, Person mother, Person child) {
        father.children.add(child);
        mother.children.add(child);
        child.parents.add(father);
        child.parents.add(mother);
    }

    //adds an event to the event list for a person
    public void addEvent(Event event) {
        this.events.add(event);
    }

    //prints all the events a person has
    public void printEvents() {
        //sorts events by yearj
        Collections.sort(events);

        for (int i = 0; i < this.events.size(); i++) {
            Event curr = this.events.get(i);
            System.out.print(curr.year + ": " + curr.event);
            if (i == this.events.size() - 1) {
                System.out.print("");
            } else {
                System.out.print("; ");
            }
        }
        System.out.print(". ");
    }

    //prints a person in the format given in the assignment example
    public void printPerson() {
        System.out.print(this.name + " (" + this.birth + "-");
        if (this.death == 0) {
            System.out.print("present); ");
        } else {
            System.out.print(this.death + "); ");
        }
        if (this.events.size() != 0) {
            printEvents();
        }
        if (this.marriages.size() != 0) {
            for (int i = 0; i < marriages.size(); i++) {
                System.out.print("married to " + marriages.get(i).name + " ");
            }
        }
        System.out.println();
    }
}
