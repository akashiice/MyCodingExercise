import java.util.HashMap;

public class HighSecurityStrings {
    public static void main(String[] args) {
        System.out.println(calculateWeight("aaaaa", 1));
    }
    public static int calculateWeight(String password, int weight){
        HashMap<Character, Integer> map = new HashMap<>();
        int initialWeight = weight;
        int total = 0;
        for (int i = 97; i< 97+26; i++){
            map.put((char) i, initialWeight);
            if(initialWeight >= 25){
                initialWeight = 0;
            }else{
                initialWeight++;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            total = total + map.get(password.charAt(i));
        }
        return  total;
    }
}

