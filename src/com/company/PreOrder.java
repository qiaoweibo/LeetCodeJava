package com.company;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author QiaoWeiBo
 * @date 2022/7/10 8:46 PM
 */
public class PreOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode p = root;
        p.right = new TreeNode(2);
        p = root.right;
        p.left = new TreeNode(3);

        p = root;
        List<Integer> res = preorderTraversal(p);
        System.out.println(res);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }
}
