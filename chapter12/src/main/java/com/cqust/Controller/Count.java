package com.cqust.Controller;

/**
 * @author yxt
 * @Description:
 * @date 2022/12/1 15:01
 */
public class Count {
        private int x;
        Count(int a){
            setC(a);
        }
        void setC(int a1){
            x=a1;
        }
        int getC(){
            return x;
        }
    }
    class Sum{
        int sum(Count p, Count q){
            return p.getC()+q.getC();
        }
    }
    class Test{
        public static void main(String args[]){
            Count c1 = new Count(2);
            Count c2 = new Count(3);
            System.out.println("c1的值:" + c1.getC());
            System.out.println("c2的值:" + c2.getC());
            Sum s = new Sum();
            System.out.println("相加后的值:" + s.sum(c1,c2));
        }
    }
