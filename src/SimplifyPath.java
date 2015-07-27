/**
 * Created by WangJQ on 2015/7/14.
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        if(path == null || path.length() == 0)
            return "";

        String res = "/";

        for(int i = 1; i < path.length(); i++) {
            switch(path.charAt(i)) {
                case '.':
                    if(path.charAt(i + 1) == '.' && i < path.length() - 1) {

                    }

                    break;
                case '/':

                    break;
                default:
                    res += path.charAt(i);
                    break;
            }
        }

        return res;
    }
}
