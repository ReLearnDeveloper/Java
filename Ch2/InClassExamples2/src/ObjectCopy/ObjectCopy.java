package ObjectCopy;

/**
 * This program uses the Stock class's copy method to create a copy of a Stock
 * object.
 */
public class ObjectCopy {

    public static void main(String[] args) {
        // Create a Stock object.
        Stock company1 = new Stock("XYZ", 9.62);

        // Declare a Stock variable
        Stock company2;
        // Make company2 reference a copy of the object
        // referenced by company1.
        company2 = company1.copy();

        Stock company3 = new Stock(company1);

        // Display the contents of both objects.
        System.out.println("Company 1:\n" + company1);
        System.out.println();
        System.out.println("Company 2:\n" + company2);
        System.out.println();
        System.out.println("Company 3:\n" + company3);

        System.out.println(".......");
        // Confirm that we actually have two objects.
        if ((company1 == company2) && (company1 == company3)) {
            System.out.println("The company1,company2, and company3 "
                    + "variables reference the same object.");
        } else {
            System.out.println("The company1, company2, and company3 "
                    + "variables reference different objects.");
        }

        if ((company1.equals(company2)) && (company1.equals(company3))) {
            System.out.println("The company1,company2, and company3 "
                    + "variables have the same content.");
        } else {
            System.out.println("The company1, company2, and company3 "
                    + "variables have different content.");
        }

    }
}
