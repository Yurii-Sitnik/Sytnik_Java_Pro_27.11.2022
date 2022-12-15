public class Homework6 {
    public static void main(String[] args) {
        findSymbolOccurrence("Hello world, Java is a super", 'l');
        findWordPosition("Apollo", "Plain");
        stringReverse("Hello");
        System.out.println(isPalindrome("Ere"));
        System.out.println(isPalindrome("Allo"));
    }
    public static void findSymbolOccurrence(String str, char b) {
        int count = 0;
        char[] Arr = str.toCharArray();
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == b) count++;
        }
        System.out.println(count);
    }
    public static void findWordPosition(String source, String target) {
        int index = source.indexOf(target);
        System.out.println(index);
    }
    public static void stringReverse(String str) {
        String sb = new StringBuilder(str).reverse().toString();
        System.out.println(sb);
    }
    public static boolean isPalindrome(String str) {
        StringBuffer stringBuffer = new StringBuffer(str).reverse();
        String strRev = stringBuffer.toString();
        if (str.equalsIgnoreCase(strRev)) {
            return true;
        } else {
            return false;
        }
    }
}
