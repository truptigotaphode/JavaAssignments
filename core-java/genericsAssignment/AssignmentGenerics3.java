package genericsAssignment;

public class AssignmentGenerics3 {
public static void main(String[] args) {
		
        Integer[] intArray = {10, 22, 63, 88, 90};
        String[] strArray = {"Tanu", "Kirti", "Usha", "Vivek","Trupti"};

        
        exchangeElements(intArray, 0, 4);
        exchangeElements(strArray, 2, 0);

        
        for (Integer num : intArray) {
            System.out.print(num + "\t");
        }
        System.out.println();

        for (String str : strArray) {
            System.out.print(str + "\t");
        }
    }
	
	
	
	public static <T> void exchangeElements(T[] array, int ind1, int ind2) {
        if (ind1 < 0 || ind1 >= array.length || ind2 < 0 || ind2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index values");
        }

        T temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

}
