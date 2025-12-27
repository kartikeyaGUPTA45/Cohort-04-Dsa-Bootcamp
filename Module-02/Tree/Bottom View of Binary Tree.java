//Problem Link: https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1

//Code: 
/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Pair {
    Node node;
    int lvl;
    
    public Pair(Node node, int lvl) {
        this.node = node;
        this.lvl = lvl;
    }
}

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        if (root == null) {
            return ans;
        }
        
        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>(); // To store first node of every level
        
        q.add(new Pair(root, 0));
        int minLvl = 0;
        
        while(q.size() > 0) {
            Pair p = q.poll();
            Node node = p.node;
            int lvl = p.lvl;
            
            map.put(lvl, node);
            
            if (node.left != null) {
                minLvl = Math.min(minLvl, lvl-1);
                q.add(new Pair(node.left, lvl-1));
            }
            
            if (node.right != null) {
                q.add(new Pair(node.right, lvl+1));
            }
        }
        
        while(map.containsKey(minLvl)) {
            ans.add(map.get(minLvl).data);
            minLvl+=1;
        }
        
        return ans;
        
    }
}
