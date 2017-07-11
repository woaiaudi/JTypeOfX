# JTypeOfX
### Java泛型基础
- T一定是派生于Object类的
#### 泛型字母定义规范
- 必须是大写字母
- E — Element，常用在java Collection里，如：`List<E>`,`Iterator<E>`,`Set<E>`
- K,V — Key，Value，代表Map的键值对
- N — Number，数字
- T — Type，类型，如`String`，`Integer`等等


#### 优点
- 不用强制转换
- 编译时检查类型，非运行时检查

#### 定义变量
```
private T x ;
```

#### 作为返回值
```
public T getX(){
    return x ;
}
```

#### 作为参数
```
public void setX(T x){
    this.x = x ;
}
```

#### 使用泛型类
```
Point<String> p = new Point<String>();
Point<Float> p = new Point<Float>();
```

#### 多泛型变量定义
```
//定义时
class MorePoint<T,U,A,B,C>{
}

//使用时
MorePoint<Integer,String> morePoint = new MorePoint<Integer, String>();
        morePoint.setName("harvic");
```


#### 泛型接口定义及使用
```
interface Info<T>{        // 在接口上定义泛型
    public T getVar() ; // 定义抽象方法，抽象方法的返回值就是泛型类型
    public void setVar(T x);
}
```

##### 使用方法一：非泛型类
```
class InfoImpl implements Info<String>{   // 定义泛型接口的子类
    private String var ;                // 定义属性
    public InfoImpl(String var){        // 通过构造方法设置属性内容
        this.setVar(var) ;
    }
    @Override
    public void setVar(String var){
        this.var = var ;
    }
    @Override
    public String getVar(){
        return this.var ;
    }
}

public class GenericsDemo24{
    public  void main(String arsg[]){
        InfoImpl i = new InfoImpl("harvic");
        System.out.println(i.getVar()) ;
    }
};
```
