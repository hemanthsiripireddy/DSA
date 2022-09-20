package pac2;

public class SumofPrefixScoresofStrings {
	class Node{
        Node[] node =new Node[26];
        int wordCount=0;
        boolean isTerminal =false;
    }
    public void insert(String word){
        int l=word.length();
        Node currentNode=root;
        for(int i=0;i<l;i++){
            int index=word.charAt(i)-'a';
            if(currentNode.node[index]==null){
                currentNode.node[index]=new Node();
                
            }
            currentNode=currentNode.node[index];
            currentNode.wordCount++;
        }
        currentNode.isTerminal=true;
        
    }
    public int getScore(String word){
        int l=word.length();
        int score=0;
        Node currentNode=root;
        for(int i=0;i<l;i++){
            int index=word.charAt(i)-'a';
            currentNode=currentNode.node[index];
          score+=  currentNode.wordCount;
            
        }
        return score;
            
    }
    
    Node root=new Node();
    public int[] sumPrefixScores(String[] words) {
        int n=words.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
          insert(words[i]);
        }
        for(int i=0;i<n;i++){
            arr[i]=getScore(words[i]);
        }
        return arr;
        
    }

}
