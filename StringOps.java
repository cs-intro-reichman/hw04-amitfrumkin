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
      String string = "Hello World"; 
       /* System.out.println(capVowelsLowRest(string)) ; */
       System.out.println(camelCase(string)) ; 
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
        }else if (string.charAt(i) != 97 && string.charAt(i) != 101 && string.charAt(i) != 105 && string.charAt(i) != 111 && string.charAt(i) != 117){
            newStr = newStr + string.charAt(i) ;
        }
        }

        return newStr;
    } 

    public static String camelCase (String string) {

        String upToLow = "" ; 
         for(int i = 0 ; i < string.length() ; i++){
            if ( string.charAt(i) >= 65 && string.charAt(i) <= 90 ){
                upToLow = upToLow +  (char)(string.charAt(i) +32 ) ;
            }else{
                upToLow = upToLow + string.charAt(i) ; 
            }
         }

        String firstUpper = "" ;

        for(int i = 0 ; i < upToLow.length() ; i++){

            if (upToLow.charAt(i) == 32 && upToLow.charAt(i+1) >= 97 && upToLow.charAt(i+1) <= 122 ){
                firstUpper = firstUpper + (char)(upToLow.charAt(i+1) - 32);
                i++;  
            }else{
                firstUpper = firstUpper +  upToLow.charAt(i) ; 
            }
        }
         String noSpaces = "";

         for(int i = 0 ; i < firstUpper.length() ; i++){
            if (firstUpper.charAt(i) != 32){
                noSpaces = noSpaces + firstUpper.charAt(i);

            }
         }
       String firstLetter= "" ;

        if (noSpaces.charAt(0) >= 65 && noSpaces.charAt(0) <= 90){

            firstLetter = firstLetter + (char) (noSpaces.charAt(0) + 32 );
        }else {

            firstLetter = firstLetter + (char) (noSpaces.charAt(0));
        }

        String camelCase = firstLetter; 

        for(int i = 1 ; i < noSpaces.length() ; i++){

            camelCase = camelCase + noSpaces.charAt(i);

        }
        
        return camelCase;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
