package itis304.lab7;


import java.util.Arrays;

public class TreeSort {
    int[] array;
    Node root;
    private int[] sortArray;
    private int nowIndex;

    TreeSort(int[] array){
        this.array = array;
        root = new Node(array[0]);
    }
    public int[] sort() {
        sortArray = new int[array.length];
        nowIndex = 0;
        getValue(root);
        return sortArray;

    }

    public void getValue(Node elem){
        System.out.println(Arrays.toString(sortArray));
        if ((elem.left != null) && !elem.left.checked){
            getValue(elem.left);
        }
        else {
            if (nowIndex > 0 && sortArray[nowIndex - 1] <=  elem.value){
                sortArray[nowIndex] = elem.value;
                nowIndex += 1;
            }
            else if (nowIndex == 0){
                sortArray[nowIndex] = elem.value;
                nowIndex += 1;
            }
            System.out.println("Now current element: " + elem.value);
            if (elem.right != null && !elem.right.checked){
                getValue(elem.right);
            }
            else {
                if (elem != root){
                    elem.checked = true;
                    getValue(elem.parent);
                }
            }
        }
    }
    public  void createTree(){
        for(int i = 1; i < array.length; ++i){
           add(root, array[i]);
        }


    }
    public  void add(Node elem, int value){
        if (value > elem.value){
            if(elem.right == null){
                elem.right = new Node(value, elem);
            }
            else {
                add(elem.right, value);
            }
        }
        else{
            if(elem.left == null){
                elem.left = new Node(value, elem);
            }
            else {
                add(elem.left, value);
            }
        }
    }

}
