package com.company;

public class BST {

    private BST left, right;
    private Integer value;

    public BST(int value) {
        this.left = null;
        this.right = null;
        this.value = value;
    }

    public void insert(Integer val){

        if(val <= value){

            if(left == null){

                left = new BST(val);
            }else{
                left.insert(val);
            }
        }else{

            if(right == null){

                right = new BST(val);
            }else{
                right.insert(val);
            }
        }
    }

    public void printInOrder(){

        if(left != null){
            left.printInOrder();
        }
        System.out.println(value);
        if(right != null){
            right.printInOrder();
        }
    }

    public boolean findValue(int val){

        if(val == value){
            return true;
        }else {

            if(val <= value){

                if(left == null){
                    return false;
                }else{
                    return left.findValue(val);
                }
            }else{

                if(right == null){
                    return false;
                }else{
                    return right.findValue(val);
                }
            }
        }
    }
}
