package com.exampale.three;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ray.Ma
 * @date 2019/6/22 16:22
 */
public class BFS {
    public static void bfs(int num){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(num);
        if (!queue.isEmpty()){
            Integer peek = queue.peek();
            Integer poll = queue.poll();
            boolean offer = queue.offer(1);
            System.out.println(peek);
            System.out.println(poll);
            System.out.println(offer);
        }
    }

    public static void main(String[] args) {
        bfs(0);
    }
}
