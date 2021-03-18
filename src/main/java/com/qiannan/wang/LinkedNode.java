package com.qiannan.wang;

import java.util.Comparator;

public class LinkedNode<T> {

    private CommonStruct.LinkedNode<T> root;
    private int size = 0 ;


    public void  push(T value){
        if(root == null) {
            root = new CommonStruct.LinkedNode<T>();
            root.value = value ;
        }else {
            CommonStruct.LinkedNode cur = new CommonStruct.LinkedNode();
            cur.value  = value ;
            cur.next = root ;
            root = cur ;
        }
        size ++ ;
    }

    public CommonStruct.LinkedNode pop(){
      if(root == null)
          return  null ;


      CommonStruct.LinkedNode cur = root ;
      root = cur.next ;
      cur.next = null ;
      size -- ;
      return  cur ;
    }

    public int size(){

        return  size ;
    }






    public static void main(String[] args) {
        Integer [] numbers = {1,2,3,7,6,3,2,6,234,4};

        LinkedNode<Integer> linkedNode = new LinkedNode<Integer>();

        for (int i = 0; i < numbers.length; i++) {

            linkedNode.push(numbers[i]);
        }

        linkedNode.print(linkedNode.root);

        System.out.println(linkedNode.size());

        linkedNode.print(linkedNode.pop());
        linkedNode.print(linkedNode.pop());
        linkedNode.print(linkedNode.pop());
       // linkedNode.put(numbers);
       // linkedNode.print(linkedNode.root);
      //  linkedNode.reverse();

        System.out.println(linkedNode.size());
        linkedNode.print();
//
//
//        linkedNode.delete(2, new Comparator<Integer>() {
//            public int compare(Integer o1, Integer o2) {
//                if(o1 == o2)
//                    return 0 ;
//                else
//                    return  -1 ;
//            }
//        });



    }


    private void delete(T value , Comparator<T> comparator){

        if(root ==  null){
            return ;
        }

        CommonStruct.LinkedNode<T> pre  = root ;
        CommonStruct.LinkedNode<T> next  = root.next ;

        while (true){
            if(pre ==null ||next == null){
                break;
            }
            if(comparator.compare(value,pre.value) == 0 ){

                pre = next;
                next = next.next;

            }else{
                if(comparator.compare(value,next.value) == 0){
                    pre.next = next.next;
                    next = next.next ;


                }
            }
            pre = next;
            next = next.next;



        }

        print(pre);










    }




    public void put(T[] t) {
        boolean start0 = true;
        if (root == null) {
            root = new CommonStruct.LinkedNode<T>();
            root.value = t[0];
            start0 = true;
        }
        CommonStruct.LinkedNode temp = root;
        int i = start0 ? 0 : 1;

        while (temp.next != null) {
            temp = temp.next;
        }

        for (; i < t.length; i++) {
            temp.next = new CommonStruct.LinkedNode();
            temp.next.value = t[i];
            temp = temp.next;
        }
    }

       public void print(){

        CommonStruct.LinkedNode temp = root;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp =temp.next;
        }
        System.out.println();


    }

    public void print(CommonStruct.LinkedNode<T> head){

        CommonStruct.LinkedNode temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp =temp.next;
        }
        System.out.println();


    }



    public void reverse(){
        CommonStruct.LinkedNode<T> pre = null ;
        CommonStruct.LinkedNode<T> current = root ;
        while (current != null){
            CommonStruct.LinkedNode<T> temp  = current.next ;
            current.next = pre ;
            pre = current ;
            current = temp;


        }
        print(pre);

    }

//链表实现  pop push size

}
