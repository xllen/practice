# String类

## 一、字符串

在上面学到的`char`类型，它只能表示**单个**字符，不能表示由多个字符连接而成的字符串。

在`java`中将字符串作为对象处理，可以通过`java.lang`包中的`String`类来创建字符串对象。**声明的字符串必须包含在一对双引号("")中**

## 二、创建字符串

1. `String(char a[])`

    用一个字符数组a创建`String`对象

        char a[] = {'g','o','o','d'};
        String s = new String(a);

2. `String(char a[], int offset, int length)`

    提取字符数组a中的一部分创建一个字符串对象，`offset`表示开始截取的位置，`length`表示截取的字符串长度。

        char a[] = {'g','o','o','d','b','o','y'};
        String s = new String(a,2,4);
        print: "odboy"

## 三、获取字符串信息

1. 获取字符串长度，包含字符串中的空格

        str.length();

2. 字符串查找

        str.indexOf(String s); //返回参数字符串s在指定字符串中首次出现的索引位置
        str.lastIndexOf(String s); //返回参数字符串s在指定字符串中最后一次出现的索引位置
        str.charAt(int index); //返回指定索引处的字符返回

## 四、字符串操作

1. 获取子字符串

        str.substring(int beginIndex);  //返回的是从指定索引值处开始截取直到字符串结尾的子串
        str.substring(int beginIndex,int endIndex);  //返回的是从指定索引值处开始截取到某一索引值位置结束的子串

2. 去除空格

        str.trim(); //返回字符串的副本，忽略前导空格和尾部空格

3. 字符串替换

        str.replace(char oldChar,char newChar); //返回一个新的字符串，若oldChar不在str中出现，则返回原字符串；若old出现多次，则全部替换

4. 判断字符串的开始结尾

        str.startsWith(String prefix); //判断当前字符串对象的前缀是否为参数指定的字符串。返回值为boolean类型。
        str.endsWith(String suffix); //判断当前字符串是否以给定的子字符串结束。返回值为boolean类型。

5. 判断字符串是否相等

        str.equals(String otherStr); //判断两个字符串是否有相同的字符和长度，返回boolean类型。区分大小写
        str.equalsIgnoreCase(String otherStr); //比较时忽略大小写

6. 字母大小写转换

        str.toLowerCase(); //将str中每个该进行小写转换字符都转换成等价的小写；若没有，则返回原字符串
        str.toUpperCase(); //将str中每个该进行大写转换字符都转换成等价的大写；若没有，则返回原字符串

7. 字符串分割

        str.split(String sign); //sign为分隔符；用给定的分割符将字符串进行拆分
        str.split(String sign,int limit); //用给定的分割符将字符串进行拆分，并限定拆分次数

## 五、格式化字符串

        str.formart(String formart, Object···args); //使用指定的格式字符串和参数返回一个格式化字符串，格式化后的新字符串使用本地默认的语言环境。

### 5.1 日期和时间字符串格式化

1. 日期格式化

        Date date = new Date(); //创建Date对象 date
        String s = String.formart("%te",date); //通过formart方法对date进行格式化

2. 时间格式化

### 5.2 字符串生成器

1. append(content)方法;
2. insert(int offset,arg)方法;
3. delete(int start,int end)