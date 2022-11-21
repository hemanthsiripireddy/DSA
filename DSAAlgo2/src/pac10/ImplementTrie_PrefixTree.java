package pac10;

public class ImplementTrie_PrefixTree {
Node node;
    
    public ImplementTrie_PrefixTree() {
        node=new Node();
        
    }
    
    public void insert(String word) {
        Node itrNode=node;
        for(int i=0;i<word.length();i++){
            if(!itrNode.map.containsKey(word.charAt(i))){
                if(i==word.length()-1)
                itrNode.map.put(word.charAt(i),new Pair<>(new Node(),true));
                else
                itrNode.map.put(word.charAt(i),new Pair<>(new Node(),false));
                


            }
            if(i==word.length()-1){
                Node pairNode=itrNode.map.get(word.charAt(i)).getKey();
                itrNode.map.put(word.charAt(i),new Pair<>(pairNode,true));
            }
         
            itrNode=itrNode.map.get(word.charAt(i)).getKey();
        }
        
    }
    
    public boolean search(String word) {
        Node itrNode=node;
        for(int i=0;i<word.length();i++){
            if(itrNode.map.containsKey(word.charAt(i))){
                 if(i==word.length()-1){
                    if(itrNode.map.get(word.charAt(i)).getValue())
                 return true;
                 else
             return false;
                 }
                itrNode=itrNode.map.get(word.charAt(i)).getKey();
            }
             
             else
             return false;
            
             
        }
        return true;
       
        
    }
    
    public boolean startsWith(String prefix) {
          Node itrNode=node;
        for(int i=0;i<prefix.length();i++){
            if(itrNode.map.containsKey(prefix.charAt(i)))
             itrNode=itrNode.map.get(prefix.charAt(i)).getKey();
             else
             return false;
        }
        return true;
        
    }

}
