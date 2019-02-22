/**
 * Class to describe Model
 * @author yukinagano
 */

public class Model {
    // attribute
    private static final String occupation = "Modeling";

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;


    // constructor
    // method overloading: methods with the same name, but different set of parameter.
    /**
     * Construction to create a instance
     * @param :no-arg constructor which does nothing
     */
    public Model() {

    }

    /**
     * Construction to create a instance
     * @param firstName
     * @param lastName
     * @param height
     * @param weightKg
     * @param canTravel
     * @param smokes
     */
    public Model(String firstName, String lastName, int height, double weightKg, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weightKg);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    /**
     * Construction to create a instance
     * @param firstName
     * @param lastName
     * @param height
     * @param weightKg
     */
    public Model(String firstName, String lastName, int height, int weightKg) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weightKg);

        setCanTravel(true);
        setSmokes(false);
    }


    // getter and setter

    // getters (accessors)
    /**
     * Getter for firstName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Getter for getLastName
     * @return getLastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Getter for getHeight
     * @return getHeight
     */
    public int getHeight() {
        return height;
    }

    /**
     * Getter for getHeightInFeetAndInches
     * @return getHeightInFeetAndInches
     */
    public String getHeightInFeetAndInches() {

        int feet = height / 12;
        int inches = height % 12;

        String footUnit = "";
        if (feet > 1) {
            footUnit = feet + " feet";
        } else if (feet == 1) {
            footUnit = feet + " foot";
//        } else {
//            return footUnit;
        }

        String inchUnit = "";
        if (inches > 1) {
            inchUnit = inches + " inches";
        } else if (inches == 1) {
            inchUnit = inches + " inch";
//        } else {
//            return inchUnit;
        }
        return footUnit + inchUnit;
    }

//        // "x feet y inch(es)"
//        String result = String.format("%d feet %d " + inch, feet, inches, foot);
//        return result;
//    }

    /**
     * Getter for getWeight
     * @return getWeight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Getter for Weight as Kgs
     * @return getWeightKg
     */
    public long getWeightKg() {
        return Math.round(weight * 0.45);
    }

    /**
     * Getter for isCanTravel
     * @return isCanTravel
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * Getter for isSmokes
     * @return isSmokes
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     * Getter for getOccupation
     * @return getOccupation
     */
    public static String getOccupation() {
        return occupation;
    }


    // setters (mutators)
    public final void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }
    public final void setFirstName(String firstName) {
        if((firstName!= null) && (firstName.length() >= 3) && (firstName.length() <= 20)) {
            this.firstName = firstName;
        }
    }
    public final void setLastName(String lastName) {
        if((lastName!= null) && (lastName.length() >= 3) && (lastName.length() <= 20)) {
            this.lastName = lastName;
        }
    }

    public final void setHeight(int inches) {
        if (inches >= 24 && inches <= 84) {
            this.height = inches;
        }
    }
    public final void setHeight(int feet, int inches) {
        int inInches = feet * 12 + inches;
            this.height = inInches;
    }

    public final void setWeight(double pounds) {
        if (pounds >= 80 && pounds <= 280) {
            this.weight = pounds;
        }
    }

    public final void setWeight(long kilograms) {
        double inPounds = kilograms * 2.205;
        if (inPounds >= 80 && inPounds <= 280) {
            this.weight = inPounds;
        }
    }

    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }


    // behaviors
    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
        if(canTravel == true){
            System.out.println("Does travel ");
        }else{
            System.out.println("Does not travel ");
        }
        if(smokes == true){
            System.out.println("Does smoke ");
        }else{
            System.out.println("Does not smoke ");
        }
    }
}
