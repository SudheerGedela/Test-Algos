package alogos;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: algo-test
 * Package: alogos
 * <p>
 * User: vthalapu
 * Date: 3/11/18
 * Time: 4:41 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class MathTest {

    static public void main(String... args) {
        permutation();

    }

    static void permutation() {
        String s = "abbc";

        String b = "babcabbacaancbancacbb";

        int startSize = s.length();
        List<String> fourLengthStrings = new ArrayList<String>();
        for (int i = 0; startSize < b.length(); i++) {
            fourLengthStrings.add(b.substring(i, startSize));
            startSize++;
        }


        int matchesFound = 0;
        char[] sChar = s.toCharArray();
        sString:
        for(int i=0; i< fourLengthStrings.size(); i++){
            bString:
            for(int j =0 ; j< fourLengthStrings.get(j).length(); j++){
                char[]bChar = fourLengthStrings.get(j).toCharArray();
                if(sChar[i] == bChar[j]){
                    matchesFound++;
                }
                if(matchesFound == s.length()){
                    break bString;
                }
            }
        }

    }



}

