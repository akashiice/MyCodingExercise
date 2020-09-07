import java.util.HashMap;

class Tree{
    public  static HashMap<Integer, Integer> map = new HashMap<>();
    public static int sum = 0;
    public void verticalSum(Node root) {
        verticalSumCalculate(root, 0);
        System.out.println(map);
    }

    public void verticalSumCalculate(Node root, int sum){
        map.put(count, root.data+sum);
        verticalSumLeft(root.left, count-1);
        verticalSumRight(root.right, count+1);
    }

    void verticalSumLeft(Node node, int count){
        if(node==null) return;
        if(map.containsKey(count)){
            map.put(count, map.get(count)+node.data);
        }else{
            map.put(count, node.data);
        }
        verticalSumLeft(node, count-1);
        verticalSumLeft(node.right, count+1);
    }

    void verticalSumRight(Node node, int count){
        if(node==null) return;
        if(map.containsKey(count)){
            map.put(count, map.get(count)+node.data);
        }else{
            map.put(count, node.data);
        }
        verticalSumLeft(node.right, count+1);
        verticalSumLeft(node.right, count-1);
    }
}
