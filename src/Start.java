/**
 * @author Drumstyle92
 * Class that contains the heart of the program.
 */
public class Start {
    /**
     *
     * @param args Main parameter.
     * Class that contains objects and parameters to be able at
     * the end to give as output the address and the number of floors of the houses.
     *
     */
    public static void main(String[] args){
House house1;
House house2;
System.out.println("-------------------------------House1--------------------------------------");
house1 = new House();
house1.address = " Via Verdi n 23 ";
house1.numberOfFloors = 2;
System.out.println(" Address: " + house1.address + " Number of floors: " + house1.numberOfFloors);
System.out.println("-------------------------------House1--------------------------------------");
house2 = new House();
house2.address = " Via Rossi grazie n 1 ";
house2.numberOfFloors = 3;
System.out.println(" Address: " + house2.address + " Number of floors: " + house2.numberOfFloors);
System.out.println("---------------------------------------------------------------------------");








    }
}
