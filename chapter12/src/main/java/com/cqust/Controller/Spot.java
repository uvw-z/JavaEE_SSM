package com.cqust.Controller;


public class Spot {
    private int x,y;
    Spot(int u,int v){
        setX(u);
        setY(v);
    }

    private void setX(int x1) {
        x=x1;
    }
    private void setY(int y1) {
        y = y1;
    }
    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
    static class Trans{
        void move(Spot p,int h,int k){
            p.setX(p.getX() + h);
            p.setY(p.getY() + k);
        }
    }
    static class Test{
        public static void main(String[] args) {
            Spot s=  new Spot(2,3);
            System.out.println("s坐标："+s.getX()+","+s.getY());
            Trans ts = new Trans();
            ts.move(s,4,5);
            System.out.println("s坐标："+s.getX()+ ","+s.getY());
        }
    }
}


//组件：Spot类、Trans类、Test类，Spot类的对象s，Trans类的对象ts，Spot类的对象p
////连接件：Test类中创建Spot类对象s、Trans类的对象ts，Trans类的move()方法的参数中有Spot类的对象p。Test类使用Spot类的对象s，调用了Spot类的getX()和getY();
////Test类使用Trans类的对象ts，调用了Trans类的move()方法，并把实参Spot类的对象s传递给了形参Spot类的对象p。