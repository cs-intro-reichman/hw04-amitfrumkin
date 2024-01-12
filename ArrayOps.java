public class ArrayOps {
    public static void main(String[] args) {
        
        int [] array = {1, -2, 3, -4, 5} ; 
        
        System.out.println(secondMaxValue(array)); //test secondMaxValue 
        
    }
    public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

    public static int sumnum (int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
    
    public static int findMissingInt (int [] array) {

        int missing = sumnum(array.length) - sum(array);        
       
        return missing ;
    }

    public static int maxValue (int [] array) {
        int max = array [0] ;
        for (int i = 0; i < array.length; i++){
            if(array[i]> max){
                max = array[i] ;
            }
        }

       
        return max ;
    }

    public static int secondMaxValue(int [] array) {    
        int maxCounter = 0 ;
        int maximum = maxValue(array);
        for (int i = 0; i < array.length; i++){
            if(array[i] == maximum){
                maxCounter ++;
            }
        }
        int n = array.length - maxCounter ; 
        int[] withoutMax = new int[n];
 
        int j = 0 ;
         for (int i = 0 ; i < array.length; i++) {
            if (array[i] != maximum) {
                withoutMax[j] = array[i];
                j++;
            }
        }
       
       
        int secondMaxValue = maxValue(withoutMax) ; 
        
        return secondMaxValue ;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}

/* while (i<array.length){
            while (j < n){
                if(array[i] != maximum){
                    withoutMax[j]= array[i] ;
                    j++ ; 
                }
            i++ ; 
            }
        }*/

