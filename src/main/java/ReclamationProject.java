/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 * This code is used to find the longest substring that is included in both strings.
 */

public class ReclamationProject {

    /**
     *  @param initialString1 to input a string.
     *  @param initialString2 to input a different string.
     *  @return a String
     */

    public static String doIt(final String initialString1, final String initialString2) {
        String str1 = initialString1;
        String str2 = initialString2;
        if (initialString1.length() > initialString2.length()) {
            String temp = initialString1;
            str1 = initialString2;
            str2 = temp;
            }
        String r = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = str1.length() - i; j > 0; j--) {
                for (int k = 0; k < str2.length() - j; k++) {
                    if (str1.regionMatches(i, str2, k, j) && j > r.length()) {
                        r = str1.substring(i, i + j);
                    }
                }
            }
        }
        return r;
    }
}
