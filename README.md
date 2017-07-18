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

##### 使用方法二：泛型类
> 使用泛型类来继承泛型接口的作用就是让用户来定义接口所使用的变量类型，而不是像方法一那样，在类中写死。

```
class InfoImpl<T> implements Info<T>{   // 定义泛型接口的子类
    private T var ;             // 定义属性
    public InfoImpl(T var){     // 通过构造方法设置属性内容
        this.setVar(var) ;
    }
    public void setVar(T var){
        this.var = var ;
    }
    public T getVar(){
        return this.var ;
    }
}
//在这个类中，我们构造了一个泛型类InfoImpl<T>，然后把泛型变量T传给了Info<T>
//这说明接口和泛型类使用的都是同一个泛型变量。



//然后在使用时，就是构造一个泛型类的实例的过程，使用过程也不变。
 public static void main(String arsg[]){
        InfoImpl<String> i = new InfoImpl<String>("harvic");
        System.out.println(i.getVar()) ;
    }
```

##### 使用方法二：泛型类 扩展》多个泛型变量的类
```
class InfoImpl<T,K,U> implements Info<U>{   // 定义泛型接口的子类
     private U var ;
     private T x;
     private K y;
     public InfoImpl(U var){        // 通过构造方法设置属性内容
         this.setVar(var) ;
     }
     public void setVar(U var){
         this.var = var ;
     }
     public U getVar(){
         return this.var ;
     }
 }
```

```
public  void main(String arsg[]){
        InfoImpl<Integer,Double,String> i = new InfoImpl<Integer,Double,String>("harvic");
        System.out.println(i.getVar()) ;
    }
```

##### 单独在一个函数里使用泛型
```
public class StaticFans {
    //静态函数
    public static  <T> void StaticMethod(T a){
        Log.d("harvic","StaticMethod: "+a.toString());
    }
    //普通函数
    public  <T> void OtherMethod(T a){
        Log.d("harvic","OtherMethod: "+a.toString());
    }
}

//使用时
//静态方法
StaticFans.StaticMethod("adfdsa");//使用方法一
StaticFans.<String>StaticMethod("adfdsa");//使用方法二

//常规方法
StaticFans staticFans = new StaticFans();
staticFans.OtherMethod(new Integer(123));//使用方法一
staticFans.<Integer>OtherMethod(new Integer(123));//使用方法二

//函数会在内部根据传进去的参数来识别当前T的类别。
//但尽量不要使用这种隐式的传递方式，代码不利于阅读和维护。
//因为从外观根本看不出来你调用的是一个泛型函数。
//建议使用：方法二
```

##### 单独在一个函数里使用泛型 -- 返回值中存在泛型
```
public static <T> List<T> parseArray(String response,Class<T> object){
    List<T> modelList = JSON.parseArray(response, object);
    return modelList;
}
```