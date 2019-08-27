package com.exampale.three;

/**
 * @author Ray.Ma
 * @date 2019/6/22 17:07
 */
public class CreateTree {
    int in[] = new int[10];
    int pre[] = new int[10];

    public Node create(int preL, int preR, int inL, int inR) {
        if (preL > preR) {
            return null;
        }
        Node root = new Node();
        root.value = pre[preL];
        int i;
        for (i = inL; i <= inR; i++) {
            if (in[i] == pre[preL]) {
                break;
            }
        }
        int countLeft = i - inL;
        root.left = create(preL + 1, preL + countLeft, inL, i - 1);
        root.right = create(preL + countLeft + 1, preR, i + 1, inR);
        return root;
    }
}
