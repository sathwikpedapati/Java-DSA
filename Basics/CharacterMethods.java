public class CharacterMethods {
    public static void main(String[] args) {
     methods();
    }
    static void methods(){
        String s="sathwik90ABU90178bdhd  ";
        int lc=0;
        int dc=0;
        int ldc=0;
        int sc=0;
        int cc=0;
        int ws=0;
        for(int i=0;i<s.length();i++){
            // Is the Character is letter or not
            if(Character.isLetter(s.charAt(i))){
                lc++;
            }
            // Is Character is digit or not
            if(Character.isDigit(s.charAt(i))){
                // getting the numerical value of character
                System.out.println(Character.getNumericValue(s.charAt(i)));
                dc++;
            }
            // Is Character is letterordigit
            if(Character.isLetterOrDigit(s.charAt(i))){
                ldc++;
            }
            // Is Character is lowercase
            if(Character.isLowerCase(s.charAt(i))){
                // Changing into uppercase
                System.out.println(Character.toUpperCase(s.charAt(i)));
                sc++;
            }
            // Is Character is uppercase
            if(Character.isUpperCase(s.charAt(i))){
                // changing into lowercase
                System.out.println(Character.toLowerCase(s.charAt(i)));
                cc++;
            }
            if(Character.isWhitespace(s.charAt(i))){
                ws++;
            }
        }
        System.out.println(lc+" "+dc+" "+ldc+" "+sc+" "+cc+" "+ws);

    }
}
