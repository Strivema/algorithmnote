package com.exampale.three;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ray.Ma
 * @date 2019/6/22 16:48
 */
public class LayerOrder {
    public static void layerOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node now = queue.peek();
            queue.remove();
            System.out.print(" "+now.value);
            if (now.left!=null){
                queue.add(now.left);
            }
            if (now.right!=null){
                queue.add(now.right);
            }
        }
    }
}

class Node{
    Node left;
    Node right;
    int value;
}
