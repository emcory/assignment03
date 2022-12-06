import java.util.Scanner;

public class Main {

    //to use this code, look at the Cory family tree given and type in a name.
    //it will print down from that person until the current generation.
    public static void main(String[] args) {
        addCorys();

        //get command line input to find a family tree starting at a specific cory
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Cory first name: ");
        String name_to_find = s.nextLine();
        Person result = findCory(name_to_find);
        People.printFamilyTree(result, 0);
    }

    //loops through the people class and returns the Cory with
    //the first name that was passed to it
    public static Person findCory(String name) {
        Person res = new Person();
        for (int i = 0; i < People.people.size(); i++) {
            String[] name_split = People.people.get(i).name.split(" ");
            if(name.equalsIgnoreCase(name_split[0])) {
                res = People.people.get(i);
            }
        }
        return res;
    }

    //adds the cory family and fills the people class
    public static void addCorys() {
        //initting each person
        Person bruce = new Person();
        Person julie = new Person();
        Person emily = new Person();
        Person margaret = new Person();
        Person clarence = new Person();
        Person david = new Person();
        Person mary = new Person();
        Person michael = new Person();
        Person nicky = new Person();
        Person christian = new Person();
        Person vincent = new Person();
        Person pat = new Person();
        Person lillian = new Person();
        Person lisa = new Person();
        Person john = new Person();
        Person mina = new Person();
        Person dave = new Person();
        Person chris = new Person();
        Person powers = new Person();
        Person anais = new Person();
        Person chloe = new Person();
        Person stephen = new Person();
        Person marie = new Person();
        Person francis = new Person();
        Person ruth = new Person();
        Person frank = new Person();
        Person martha = new Person();
        Person alfred = new Person();
        Person ruthie = new Person();

        //making each person
        bruce.makeAlivePerson("Bruce Cory", 1968);
        julie.makeAlivePerson("Julie Cory", 1968);
        emily.makeAlivePerson("Emily Cory", 2002);
        margaret.makeAlivePerson("Margaret Cory", 1942);
        clarence.makeAlivePerson("Clarence Cory", 1940);
        david.makeAlivePerson("David Cory", 1966);
        mary.makeAlivePerson("Mary Cory", 1964);
        michael.makeAlivePerson("Michael Cory", 2002);
        nicky.makeAlivePerson("Nicky Cory", 2005);
        christian.makeAlivePerson("Christian Cory", 2003);
        vincent.makeAlivePerson("Vincent Flynn", 1939);
        pat.makeAlivePerson("Pat Flynn", 1940);
        lillian.makeAlivePerson("Lillian Lachicotte", 1941);
        mina.makeAlivePerson("Mina Flynn", 1975);
        john.makeAlivePerson("John Flynn", 1970);
        chloe.makeAlivePerson("Chloe Flynn", 2005);
        anais.makeAlivePerson("Anais Flynn", 2007);
        dave.makeAlivePerson("Dave Dykhoff", 1966);
        lisa.makeAlivePerson("Lisa Dykhoff", 1967);
        chris.makeAlivePerson("Chris Powers", 1992);
        stephen.makeDeadPerson("Stephen Flynn III", 1900, 1965);
        marie.makeDeadPerson("Marie Flynn", 1905, 1978);
        francis.makeDeadPerson("Francis Lachicotte III", 1908, 1956);
        ruth.makeDeadPerson("Ruth Lachicotte", 1910, 2004);
        frank.makeDeadPerson("Frank Cory", 1906, 1994);
        martha.makeDeadPerson("Martha Canby", 1906, 2004);
        alfred.makeDeadPerson("Alfred Groshens", 1897, 1974);
        ruthie.makeDeadPerson("Ruthie Groshens", 1920, 1999);
        powers.makeAlivePerson("Powers", 1965);

        //adding marriage relationships
        Person.addMarriage(lillian, vincent);
        Person.addMarriage(pat, vincent);
        Person.addMarriage(mary, david);
        Person.addMarriage(lisa, dave);
        Person.addMarriage(mina, john);
        Person.addMarriage(lisa, powers);
        Person.addMarriage(margaret, clarence);
        Person.addMarriage(julie, bruce);
        Person.addMarriage(ruth, francis);
        Person.addMarriage(stephen, marie);
        Person.addMarriage(martha, frank);
        Person.addMarriage(alfred, ruthie);

        //adding child/parent relationships
        Person.addChild(mary, david, nicky);
        Person.addChild(vincent, lillian, julie);
        Person.addChild(vincent, lillian, lisa);
        Person.addChild(vincent, lillian, john);
        Person.addChild(mary, david, michael);
        Person.addChild(mary, david, christian);
        Person.addChild(clarence, margaret, david);
        Person.addChild(clarence, margaret, bruce);
        Person.addChild(powers, lisa, chris);
        Person.addChild(bruce, julie, emily);
        Person.addChild(john, mina, chloe);
        Person.addChild(john, mina, anais);
        Person.addChild(stephen, marie, vincent);
        Person.addChild(francis, ruth, lillian);
        Person.addChild(martha, frank, clarence);
        Person.addChild(alfred, ruthie, margaret);

        //add events to bruce julie and emily
        Event julie1 = new Event();
        julie1.setEvent(2002, "Gave birth to Emily");
        julie.addEvent(julie1);
        Event julie2 = new Event();
        julie2.setEvent(1986, "Graduated high school");
        julie.addEvent(julie2);
        Event julie3 = new Event();
        julie3.setEvent(1990, "Graduated undergrad at SFSU");
        julie.addEvent(julie3);
        Event julie4 = new Event();
        julie4.setEvent(2007, "Got the family weiner dog Stretchy");
        julie.addEvent(julie4);
        Event julie5 = new Event();
        julie5.setEvent(1997, "Graduated school USD");
        julie.addEvent(julie5);
        Event bruce1 = new Event();
        bruce1.setEvent(1991, "Graduated from Iowa State University");
        bruce.addEvent(bruce1);
        Event bruce2 = new Event();
        bruce2.setEvent(1986, "Graduated from high school");
        bruce.addEvent(bruce2);
        Event bruce3 = new Event();
        bruce3.setEvent(1999, "Married to Julie");
        bruce.addEvent(bruce3);
        Event bruce4 = new Event();
        bruce4.setEvent(2001, "Started working at Nvidia");
        bruce.addEvent(bruce4);
        Event emily1 = new Event();
        emily1.setEvent(2020, "Graduated high school");
        emily.addEvent(emily1);
        Event emily2 = new Event();
        emily2.setEvent(2022, "Got her 1998 BMW 328i and Stinky the lizard");
        emily.addEvent(emily2);
        Event emily3 = new Event();
        emily3.setEvent(2018, "Joined a band playing guitar");
        emily.addEvent(emily3);
        Event lillianvince = new Event();
        lillianvince.setEvent(1983, "Divorced");
        lillian.addEvent(lillianvince);
        vincent.addEvent(lillianvince);

        //add all people to people class
        People.add(bruce);
        People.add(julie);
        People.add(emily);
        People.add(margaret);
        People.add(clarence);
        People.add(mary);
        People.add(david);
        People.add(michael);
        People.add(nicky);
        People.add(christian);
        People.add(vincent);
        People.add(pat);
        People.add(lillian);
        People.add(lisa);
        People.add(john);
        People.add(mina);
        People.add(dave);
        People.add(chris);
        People.add(powers);
        People.add(anais);
        People.add(chloe);
        People.add(stephen);
        People.add(marie);
        People.add(francis);
        People.add(ruth);
        People.add(frank);
        People.add(martha);
        People.add(alfred);
        People.add(ruthie);

    }
}

//make family tree to turn in
//add comments