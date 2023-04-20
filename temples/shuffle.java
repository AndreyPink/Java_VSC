package temples;



public class shuffle {

    public static void main(String[] args) {
        String str = "cba";
        int[] index = new int[] {3,2,1};
        char[] resultArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            resultArray[index[i]-1] = str.toCharArray()[i];  //str.charAt(i) //str.substring(i, i)
        }
        str = "";
        for (char c : resultArray) {
            str += c;
        }
        System.out.println(str);

    }
}

