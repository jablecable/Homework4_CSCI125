package HW;
public class PetDemo {

    public static void main (String [] args) {

        Pet jeff = new Pet ("Jeff", 11, 65.1 );
        Pet webster = new Pet ("Webster", 34, 47.2);
        Pet casey = new Pet ("Casey",7,39.2);
        Pet noel = new Pet ("Noel", 21, 58);
        Pet carnex = new Pet ("Carnex", 21, 84.4);
        Pet comparisons = new Pet();


        System.out.println("Lets say we have five pets:\n");
        jeff.writeOutput();
        webster.writeOutput();
        casey.writeOutput();
        noel.writeOutput();
        carnex.writeOutput();


        System.out.println ("The largest pet is: " + comparisons.largestPet(jeff, webster, casey, noel, carnex) + "\n");

        System.out.println ("The smallest pet is: " + comparisons.smallestPet(jeff, webster, casey, noel, carnex) + "\n");

        System.out.println("The youngest pet is: " + comparisons.youngestPet(jeff, webster, casey, noel, carnex) + "\n");

        System.out.println("The oldest pet is: " + comparisons.oldestPet(jeff, webster, casey, noel, carnex) + "\n");

        System.out.println("The average weight of the five pets: " +
                (float)(jeff.getWeight() + webster.getWeight() + casey.getWeight() + noel.getWeight() +
                        carnex.getWeight()) / (5) + " pounds \n");

        System.out.println("The average age of the five pets: " +
                (jeff.getAge() + webster.getAge() + casey.getAge() + noel.getAge() +
                        carnex.getAge()) / (5) + " years old ");

    }
}
