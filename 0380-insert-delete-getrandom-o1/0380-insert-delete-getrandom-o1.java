class RandomizedSet {
    private List<Integer> elements;
    private Map<Integer, Integer> index;
    private Random rand ;
    public RandomizedSet() {
        elements = new ArrayList<>();
        index = new HashMap<>();
        rand = new Random();
        
    }
    
    public boolean insert(int val) {
       
        if(index.containsKey(val)){
                return false;
            
        }
        else{

        elements.add(val);
        index.put(val , elements.size()-1);
        
        return true;
        }
    }
    
    public boolean remove(int val) {
        if(!index.containsKey(val)){
                return false;
            
        }
        else{

        int indexElem = index.get(val);
        int lastElem = elements.get(elements.size()-1);
         
         elements.set(indexElem , lastElem);
        index.put(lastElem , indexElem);
        elements.remove(elements.size()-1);
        index.remove(val);
        return true;
        }
       
        
        
    }
    
    public int getRandom() {
        int randNum = rand.nextInt(elements.size());
        return elements.get(randNum);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */