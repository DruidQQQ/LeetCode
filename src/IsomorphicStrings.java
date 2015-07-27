import java.util.HashMap;

/**
 * Created by WangJQ on 2015/7/27.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        HashMap<Character, Character> mapS = new HashMap<Character, Character>();
        HashMap<Character, Character> mapT = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++) {
            if(mapS.get(s.charAt(i)) == null)
                mapS.put(s.charAt(i), t.charAt(i));
            else {
                if(mapS.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            if(mapT.get(t.charAt(i)) == null)
                mapT.put(t.charAt(i), s.charAt(i));
            else {
                if (mapT.get(t.charAt(i)) != s.charAt(i))
                    return false;
            }
        }

        return true;
    }
}
