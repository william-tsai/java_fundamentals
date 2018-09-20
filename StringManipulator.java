public class StringManipulator {
    public String trimAndConcat(String stringOne, String stringTwo) {
        return stringOne.trim() + stringTwo.trim();
    }
    public Integer getIndexOrNull(String aString, char aLetter) {
        if (aString.indexOf(aLetter) == -1) {
            return null;
        } else {
            return aString.indexOf(aLetter);
        }
    }
    public Integer getIndexOrNull(String stringOne, String stringTwo) {
        if (stringOne.indexOf(stringTwo) == -1) {
            return null;
        }
        return stringOne.indexOf(stringTwo);
    }
    public String concatSubstring(String stringOne, int startIndex, int endIndex, String stringTwo) {
        return stringOne.substring(startIndex, endIndex) + stringTwo;
    }
}