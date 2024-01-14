public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
      String string = "vOwEls ArE fUn"; 
       System.out.println(capVowelsLowRest(string)) ; 
    }

    public static String capVowelsLowRest (String string) {

        String newStr = "" ;
        char [] vowels = {'a','e','i','o','u'} ;
         
        for(int i = 0 ; i < string.length() ; i++){
            
            for(int j = 0 ; j < vowels.length ; j++ ){

                if(string.charAt(i) == vowels[j]){

                    newStr = newStr + (char) (string.charAt(i) - 32) ;
                }
            }

        if(string.charAt(i) > 65 && string.charAt(i) <= 91 && string.charAt(i) != 69 && string.charAt(i) != 73 && string.charAt(i) != 79 && string.charAt(i) != 85 ){

            newStr = newStr + (char) (string.charAt(i) + 32) ;
        }else if (string.charAt(i) != 97 && string.charAt(i) != 101 && string.charAt(i) != 105 && string.charAt(i) != 111 && string.charAt(i) != 107){
            newStr = newStr + string.charAt(i) ;
        }
        }

        return newStr;
    } 

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
