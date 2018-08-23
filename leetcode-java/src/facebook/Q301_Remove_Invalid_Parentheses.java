package facebook;

import java.util.*;

public class Q301_Remove_Invalid_Parentheses {

    public List<String> removeInvalidParentheses(String s) {
        char[] ss = s.toCharArray();
        int l = 0, r = 0;
        for (int i = 0; i < ss.length; i++) {
            if (ss[i] == '(') {
                l++;
            } else if (ss[i] == ')') {
                if (l > 0) l--;
                else r++;
            }
        }
        Set<String> result = new HashSet<>();
        dfs(result, ss, "", ss.length-l-r, 0, 0, 0);
        return new LinkedList<>(result);
    }

    private void dfs(Set<String> result, char[] ss, String str, int len, int l, int r, int pos) {
        if (str.length() == len && l == r) {
            result.add(str);
            return;
        }
        for (int i = pos; i < ss.length; i++) {
            if (ss[i] != '(' && ss[i] != ')') {
                dfs(result, ss, str+ss[i], len, l, r, i+1);
                continue;
            }
            if (l == r && ss[i] == '(') {
                dfs(result, ss, str+'(', len, l+1, r, i+1);
            }
            if (l > r) {
                if (ss[i] == ')') {
                    dfs(result, ss, str+')', len, l, r+1, i+1);
                } else {
                    dfs(result, ss, str+'(', len, l+1, r, i+1);
                }
            }
        }
    }

}