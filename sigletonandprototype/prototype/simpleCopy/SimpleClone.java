package sigletonandprototype.prototype.simpleCopy;
//原型模式：需要定制化非共享的信息时，需要各个用户之间持有自己单独但共型的对象，
// 共型的模板对象视为原型，依照原型创建具有相同属性和依赖的不同对象
//方式一：用反射去复制对象
//方式二：使用Java克隆(浅拷贝)
public class SimpleClone implements Cloneable{
    String name = new String();
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        SimpleClone obj = new SimpleClone();
        try {
            System.out.println(obj.name==((SimpleClone)obj.clone()).name);
            //true；浅克隆，克隆对象属性引用的简单复制（地址拷贝，不是新建属性对象），
            // 并没有达到独有内容的原型模式需求
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
