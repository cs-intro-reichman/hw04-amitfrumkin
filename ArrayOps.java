public class ArrayOps {
    public static void main(String[] args) {
        
        int [] array =  {1, 3, 2} ; 
        int [] array1 =  {2, 2, 3, 7, 8, 3, 2} ; 
        int [] array2= {8, 2, 7, 7,3} ; 
        
        System.out.println(secondMaxValue(array)); //test secondMaxValue 
        /*System.out.println(containsTheSameElements(array1,array2));*/
        System.out.println(isSorted(array));
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
        
        maxCounter = 0;
        int secondMaxValue = 0 ; 
         for (int i = 0 ; i < array.length; i++){
           if(array[i] == maximum) {
            maxCounter++;
           }
         }
        if(maxCounter>1){
            secondMaxValue = maximum ;
        }else{
            secondMaxValue= maxValue(withoutMax) ; 
        }
        return secondMaxValue ;
    }

    /*public static int[] differntInts(int [] array){

        int[] freq = new int[10];
 
        for (int i = 0 ; i < array.length  ; i++){
            for (int j = 0 ; j < 10  ; j++){
                if(array[i] == j){
                   freq[j]++ ;  
                } 
            }

        }
        
        return freq ;
    }*/



    public static boolean containsTheSameElements(int [] array1,int [] array2) {

        boolean[] inArray1 = new boolean[10];
        boolean[] inArray2 = new boolean[10];

        for (int i = 0; i < array1.length; i++) {
            int num = array1[i];
            if (num >= 0 && num < 10) {
                inArray1[num] = true;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            int num = array2[i];
            if (num >= 0 && num < 10) {
               inArray2[num] = true;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (inArray1[i] != inArray2[i]) {
                return false;
            }
        }

        return true;
       
        
    }

    public static boolean isSorted(int [] array) {

        int increasingCounter = 0;
        int decreasingCounter = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i-1] <= array[i]){
                increasingCounter++;
            }else if(array[i]>= array[i]){
                decreasingCounter++;

            }
        }
        if(increasingCounter ==  (array.length - 1) || decreasingCounter == (array.length - 1) ) {
            return true;
        }
         
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

