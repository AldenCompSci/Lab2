public class Lab2 {
    public static void main(String[] args) {
        //Elephant weight is average for adult asian male elephants
        // https://www.denverzoo.org/wp-content/uploads/2018/09/Asian-Elephant.pdf
        System.out.println("How many elephants would it take to balance the weight of the Eiffel Tower?");
        System.out.println("You would need " + ElephantTower(11500,22000000) + " elephants to balance out the Eiffel Tower on a scale.");

        //SpaghettiLength is in cm and EarthCircumference is in km
        System.out.println();
        System.out.println("How many strands of spaghetti would it take to wrap around the Earth?");
        System.out.println(SpaghettiEarth(25,40075));


    }

    public static double ElephantTower(double ElephantWeight, double TowerWeight) {
        //Note, variables ElephantWeight and TowerWeight use pounds for units
        double NumberOfElephants = TowerWeight/ElephantWeight;
        return NumberOfElephants;
    }

    public static double SpaghettiEarth(double SpaghettiLength, double EarthCircumference){
        double SpaghettiPerKilometer = 100000/SpaghettiLength;
        return EarthCircumference*SpaghettiPerKilometer;

    }
}
