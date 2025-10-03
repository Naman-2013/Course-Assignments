package BinarySearch.Assignment1;

class Tester {

    public static int searchCustomerId(int customerIds[], int customerIdToBeSearched) {
        int low = 0;
        int high = customerIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if customerIdToBeSearched is present at mid
            if (customerIds[mid] == customerIdToBeSearched) {
                return mid;
            }

            // If customerIdToBeSearched is greater, ignore the left half
            if (customerIds[mid] < customerIdToBeSearched) {
                low = mid + 1;
            } 
            // If customerIdToBeSearched is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return -1;
    }
    
    public static void main(String[] args) {
		int[] customerIds = { 80451, 80462, 80465, 80479, 80550, 80561, 80665, 80770 };
		int customerIdToBeSearched = 80462;

		int index = searchCustomerId(customerIds, customerIdToBeSearched);
		
		if (index == -1)
			System.out.println("Customer Id " + customerIdToBeSearched + " is not found!");
		else
			System.out.println("Customer Id " + customerIdToBeSearched + " is found at index position " + index+"!");
	}

}