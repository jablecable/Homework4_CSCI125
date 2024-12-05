package HW;

/**
 Class for basic pet data: name, age, and weight.
 */
public class Pet
{
    private String name;
    private int age; //in years
    private double weight; //in pounds

    public Pet ()   // default constructor
    {
        name = "No name yet.";
        age = 0;
        weight = 0;
    }


    public Pet (String initialName, int initialAge,
                double initialWeight)
    {
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0))
        {
            System.out.println ("Error: Negative age or weight.");
            System.exit (0);
        }
        else
        {
            age = initialAge;
            weight = initialWeight;
        }
    }


    public void setPet (String newName, int newAge,
                        double newWeight)
    {
        name = newName;
        if ((newAge < 0) || (newWeight < 0))
        {
            System.out.println ("Error: Negative age or weight.");
            System.exit (0);
        }
        else
        {
            age = newAge;
            weight = newWeight;
        }
    }


    public Pet (String initialName)
    {
        name = initialName;
        age = 0;
        weight = 0;
    }


    public void setName (String newName)
    {
        name = newName; //age and weight are unchanged.
    }


    public Pet (int initialAge)
    {
        name = "No name yet.";
        weight = 0;
        if (initialAge < 0)
        {
            System.out.println ("Error: Negative age.");
            System.exit (0);
        }
        else
            age = initialAge;
    }


    public void setAge (int newAge)
    {
        if (newAge < 0)
        {
            System.out.println ("Error: Negative age.");
            System.exit (0);
        }
        else
            age = newAge;
        //name and weight are unchanged.
    }


    public Pet (double initialWeight)
    {
        name = "No name yet";
        age = 0;
        if (initialWeight < 0)
        {
            System.out.println ("Error: Negative weight.");
            System.exit (0);
        }
        else
            weight = initialWeight;
    }


    public void setWeight (double newWeight)
    {
        if (newWeight < 0)
        {
            System.out.println ("Error: Negative weight.");
            System.exit (0);
        }
        else
            weight = newWeight; //name and age are unchanged.
    }


    public String getName ()
    {
        return name;
    }


    public int getAge ()
    {
        return age;
    }


    public double getWeight ()
    {
        return weight;
    }


    public void writeOutput ()
    {
        System.out.println ("Name: " + name);
        System.out.println ("Age: " + age + " years");
        System.out.println ("Weight: " + weight + " pounds\n");
    }


    public String ageOrWeightObjectEquivalency(double number, String method, Pet object1, Pet object2, Pet object3, Pet object4, Pet object5) {

        String petName = "";

        if (method.equals(".getWeight()")) {
            if (number == object1.getWeight()) {
                petName = object1.getName();
            } else if (number == object2.getWeight()) {
                petName = object2.getName();
            } else if (number == object3.getWeight()) {
                petName = object3.getName();
            } else if (number == object4.getWeight()) {
                petName = object4.getName();
            } else if (number == object5.getWeight()) {
                petName = object5.getName();
            }
        }
        else if (method.equals(".getAge()"))
        {
            if (number == object1.getAge()) {
                petName = object1.getName();
            } else if (number == object2.getAge()) {
                petName = object2.getName();
            } else if (number == object3.getAge()) {
                petName = object3.getName();
            } else if (number == object4.getAge()) {
                petName = object4.getName();
            } else if (number == object5.getAge()) {
                petName = object5.getName();
            }
        }
        return petName;
    }


    public String largestPet (Pet object1, Pet object2, Pet object3, Pet object4, Pet object5) {

        double largestPetWeight;

        largestPetWeight = Math.max(object1.getWeight(), Math.max(object2.getWeight(),
                Math.max(object3.getWeight(), Math.max(object4.getWeight(), object5.getWeight()))));

        return this.ageOrWeightObjectEquivalency(largestPetWeight,".getWeight()", object1, object2, object3, object4, object5);
    }



    public String smallestPet (Pet object1, Pet object2, Pet object3, Pet object4, Pet object5) {

        double smallestPetWeight;

        smallestPetWeight = Math.min(object1.getWeight(), Math.min(object2.getWeight(),
                Math.min(object3.getWeight(), Math.min(object4.getWeight(), object5.getWeight()))));


        return this.ageOrWeightObjectEquivalency(smallestPetWeight,".getWeight()", object1, object2, object3, object4, object5);
    }



    public String youngestPet (Pet object1, Pet object2, Pet object3, Pet object4, Pet object5) {

        int youngestPet;

        youngestPet = Math.min(object1.getAge(), Math.min(object2.getAge(),
                Math.min(object3.getAge(), Math.min(object4.getAge(), object5.getAge()))));

        return this.ageOrWeightObjectEquivalency(youngestPet, ".getAge()", object1, object2, object3, object4, object5);
    }

    public String oldestPet (Pet object1, Pet object2, Pet object3, Pet object4, Pet object5) {

        int oldestPet;

        oldestPet = Math.max(object1.getAge(), Math.max(object2.getAge(),
                Math.max(object3.getAge(), Math.max(object4.getAge(), object5.getAge()))));

        return this.ageOrWeightObjectEquivalency(oldestPet, ".getAge()", object1, object2, object3, object4, object5);
    }


}






