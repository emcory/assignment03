import java.util.ArrayList;

public class People {
    static ArrayList<Person> people = new ArrayList<>();

    //adds person to the people array
    public static void add(Person person_to_add) {
        people.add(person_to_add);
    }

    //recursively prints the family tree starting at a given person
    public static void printFamilyTree(Person person, int generation) {
        //prints the number of tabs per generation
        for (int i = 0; i < generation; i++) {
            System.out.print("     ");
        }
        person.printPerson();
        //check to see if that person has kids, if so increment generation
        if (person.children.size() != 0) {
            generation++;
        }
        //call family tree with each child until there are no children left
        for (int j = 0; j < person.children.size(); j++) {
            printFamilyTree(person.children.get(j), generation);
        }
    }
}
