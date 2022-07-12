package com.company;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author QiaoWeiBo
 * @date 2022/7/12 11:09 PM
 */
public class PostOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode p = root;
        p.right = new TreeNode(2);
        p = root.right;
        p.left = new TreeNode(3);

        p = root;
        List<Integer> res = postorderTraversal(p);
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

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        TreeNode pre = null;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            if (node.right == pre || node.right == null) {
                res.add(node.val);
                pre = node;
                node = null;
            }
            else {
                stack.push(node);
                node = node.right;
            }
        }
        return res;
    }
}
