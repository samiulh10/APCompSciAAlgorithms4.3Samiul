public class Algorithms {
    public boolean secondStringInFirst(String x, String y) {
        int occurrence = x.indexOf(y);
        if (occurrence != - 1) return true;
        else if (occurrence == -1) return false;
        else return false;

    }
    public String reversedString(String x) {
        String result = "";
        for (int i = x.length(); i > 0; i--) {
            result += x.substring(i - 1, i);
        }
        return result;
    }
    public boolean palindromeOrNot(String x) {
        int front = 0;
        int back = x.length() - 1;
        while (front > back) {
            if (x.charAt(front) != x.charAt(back)) {
                return false;
            }
            front++;
            back++;

        }
        return true;
    }
    public int numberOfOccurrences(String x, String y) {
        int count = 0;
        for (int i = 0; i < x.length(); i++)
        {
            if (x.contains(y))
            {
                x = x.replaceFirst(y,"x");
                count++;
            }
        }

        return count;


    }
    }
