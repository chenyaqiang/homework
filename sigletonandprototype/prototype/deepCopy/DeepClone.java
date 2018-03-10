package sigletonandprototype.prototype.deepCopy;

import java.io.*;

//利用反序列化返回对象深拷贝实现原型模式
public class DeepClone implements Cloneable, Serializable {
    String name = new String();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getClone(this); //重写克隆方法
    }

    //序列化反序列化获取对象拷贝
    public Object getClone(DeepClone base) {

        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();  //用于装原对象持久字节信息的内存字节流
            ObjectOutputStream oo = new ObjectOutputStream(out);
            oo.writeObject(base);//将对象装进去(序列化)

            ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());//从内存字节流中取出
            ObjectInputStream oi = new ObjectInputStream(in);
            Object copy = oi.readObject();
            return copy;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    //测试
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepClone base =  new DeepClone();
        System.out.println(base.name==((DeepClone)base.clone()).name);
        //false ：深拷贝，拷贝对象的属性引用指向的是新创建属性的对像，
        // 达到了拷贝对象信息独有定制化的目的，正确实现原型模式
    }
}
