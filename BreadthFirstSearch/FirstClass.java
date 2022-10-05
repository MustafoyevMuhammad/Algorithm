package BreadthFirstSearch;

import java.util.*;

public class FirstClass {
    private static String s = "Jonny";
    private static boolean ok ;
    private static Map<String,Boolean> request;
    public static void main(String[] args) {
        Map<String, String[]> map = new HashMap<>();
        map.put("you",    new String[]{"Alice", "Bob", "Claire"});
        map.put("Bob",    new String[]{"Anuj", "Peggy"});
        map.put("Claire", new String[]{"Thom", "Jonny"});
        map.put("Alice",  new String[]{"Peggy"});
        map.put("Anuj",   null);
        map.put("Peggy",  null);
        map.put("Thom",   null);
        map.put("Jonny",  null);
        Queue<String> queue = new LinkedList<>();
        queue.addAll(List.of(map.get("you")));

        findBuyerWithQueue(map, queue);
    }

    private static void findBuyerWithQueue(Map<String, String[]> map, Queue<String> queue) {
        while(!queue.isEmpty()){
            String str = queue.poll();
            Scanner sc = new Scanner(System.in);
            request = new HashMap<>();
            boolean assortment = false;
            if(!request.containsKey(str)){
                System.out.print(str + ", do you buy?");
                assortment = sc.nextBoolean();
                request.put(str, assortment);
            }
            if(assortment){
                System.out.println("Mango need to " + str);
                break;
            }

            else{
                if(map.get(str) != null){
                    for (String s : map.get(str)) {
                        if(!queue.contains(s))
                            if(!request.containsKey(s))
                                queue.add(s);
                    }
                }
            }

        }
        if (queue.isEmpty()){
            System.out.println("unfortunately, anyone didn't bought");
            return;
        }
    }
}
