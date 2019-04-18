import static java.lang.System.out;

public class Main {

    public static void main(String[] args){

        out.println(firstNotRepeatingCharacter("abacabad"));

    }

    static char firstNotRepeatingCharacter(String s) {


        for (int i = 0; i < s.length(); i++){

            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return s.charAt(i);

        }

        return '_';
    }


}
