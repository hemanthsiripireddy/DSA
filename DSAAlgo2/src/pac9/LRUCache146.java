package pac9;

import java.util.HashMap;
import java.util.Map;

public class LRUCache146 {
	class DlinkedList{
        public int key;
        public int value;
        DlinkedList pre;
        DlinkedList post;
    }
  private Map<Integer, DlinkedList> 
  cache = new HashMap<Integer, DlinkedList>();
  private int capacity;
  private int count;
 DlinkedList head,tail;
private DlinkedList popTail(){
    DlinkedList node=tail.pre;
    removeNode(tail.pre);
    return node;
}
    public void LRUCache(int capacity) {
        this.count=0;
        this.capacity=capacity;
         head=new DlinkedList();
        head.pre=null;
         tail=new DlinkedList();
        head.post=tail;
        tail.pre=head;
        tail.post=null;
        
        
    }
    private void removeNode(DlinkedList node){
        DlinkedList pre = node.pre;
  DlinkedList post = node.post;

  pre.post = post;
  post.pre = pre;
    }
    private void addNode(DlinkedList node){
        node.pre=head;
        node.post=head.post;
        head.post.pre=node;
        head.post=node;
        
    }
    private void moveToHead(DlinkedList node){
        this.removeNode(node);
        this.addNode(node);
    }
    
    public int get(int key) {
        DlinkedList node=cache.get(key);
        if(node==null)return -1;
        this.moveToHead(node);
        return node.value;

        
    }
    
    public void put(int key, int value) {
        DlinkedList node=cache.get(key);
        if(node==null){
            DlinkedList newNode=new DlinkedList();
            cache.put(key,newNode);
            newNode.key=key;
            newNode.value=value;
            addNode(newNode);
            count++;
            if(count>capacity){
                DlinkedList lastNode=popTail();
                this.cache.remove(lastNode.key);
                 count--;
            }
        }else{
            node.value=value;
            moveToHead(node);
        }
        
    }

}
