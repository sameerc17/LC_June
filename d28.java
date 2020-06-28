Reconstruct Itinerary

class Solution {
List output = new ArrayList<>();

public List<String> findItinerary(List<List<String>> tickets) {
    HashMap<String, PriorityQueue<String>> orderedRoute = new HashMap<>();
    
    for(List<String> sourceDest: tickets){
        String key = sourceDest.get(0);
        if(orderedRoute.containsKey(key)){
            orderedRoute.get(key).offer(sourceDest.get(1));
        }else{
            PriorityQueue<String> pq = new PriorityQueue<String>();
            pq.offer(sourceDest.get(1));
            orderedRoute.put(key, pq);
        }
    }

    String prev = "JFK";
    dfs(orderedRoute, prev);
    
    return output;
}

private void dfs(HashMap<String, PriorityQueue<String>> orderedRoute, String from){
    
    if(orderedRoute.containsKey(from)){
        PriorityQueue<String> pq = orderedRoute.get(from);
        
        while(!pq.isEmpty()){
            dfs(orderedRoute, pq.remove());
        }
    }
    output.add(0, from);
}
}
