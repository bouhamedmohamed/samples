package palandrom;

public class Plandrom {
    public boolean checkPlandromString(String string) {
        if (string.length() < 2)
            return true;
        char begin = string.charAt(0);
        int lastIndex = string.length() - 1;
        char end = string.charAt(lastIndex);
        if(String.valueOf(begin).equals(String.valueOf(end)))
            return checkPlandromString(string.substring(1, lastIndex));
        return false;
    }


}
