import java.util.*;

public class FeatureProductFE {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        while (q-- > 0) {
            String product = scan.nextLine();
            if(map.containsKey(product)){
                map.put(product, map.get(product)+1);
            }else{
                map.put(product, 1);
            }
//        map.put(product, map.getOrDefault(map.get(product), 0)+1);
        }

        String feturedProduct = findFeatureProduct(map);
        System.out.println(feturedProduct);
    }

    private static String findFeatureProduct(HashMap<String, Integer> map) {
        List list = new LinkedList(map.entrySet());
        int largestValue=0;
        String largestProduct = "";
        for(String product: map.keySet()){
            if(map.get(product)>largestValue){
                largestValue = map.get(product);
                largestProduct = product;
            }else if(map.get(product)==largestValue){
                if(product.compareToIgnoreCase(largestProduct)>0){
                    largestProduct = product;
                }
            }
        }
        return largestProduct;
    }
}