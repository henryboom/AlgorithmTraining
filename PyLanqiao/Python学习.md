# Python学习

# 基础语法

### 变量赋值

Python 中的变量赋值不需要类型声明。

每个变量在内存中创建，都包括变量的标识，名称和数据这些信息。

每个变量在使用前都必须赋值，变量赋值以后该变量才会被创建。

```python
counter = 100 # 赋值整型变量
miles = 1000.0 # 浮点型
name = "John" # 字符串

print(counter,miles,name)
12345
100 1000.0 John
1
```

### 多变量赋值

```python
a, b, c = 1, 2, "john"
print(a,b,c)
12
1 2 john
```

## 标准数据类型

在内存中存储的数据可以有多种类型。

例如，一个人的年龄可以用数字来存储，他的名字可以用字符来存储。

Python 定义了一些标准类型，用于存储各种类型的数据。

Python有五个标准的数据类型：

不可变：Numbers（数字）
 String（字符串）
 List（列表）
 Tuple（元组）
 Dictionary（字典）

### 数字

数字数据类型用于存储数值。

他们是不可改变的数据类型，这意味着改变数字数据类型会分配一个新的对象。

当你指定一个值时，Number 对象就会被创建：

```python
var1 = 1
var2 = 10
12
del var1 # 删除单个或多个对象的引用
1
var1
1
---------------------------------------------------------------------------

NameError                                 Traceback (most recent call last)

~\AppData\Local\Temp/ipykernel_21312/2376987541.py in <module>
----> 1 var1


NameError: name 'var1' is not defined
123456789
```

Python支持四种不同的数字类型：

int（有符号整型）

long（长整型，也可以代表八进制和十六进制） 0122L

float（浮点型）

complex（复数） 4.53e-7j

### 字符串

[头下标:尾下标] 来截取相应的字符串，从 0 开始。

[头下标:尾下标] 获取的子字符串[头，尾)。

#### 访问字符串的值

```python
s = 'abcdef'
s[1:5]
12
'bcde'
1
```

#### 字符串连接

加号（+）是字符串连接运算符，星号（*）是重复操作。

```python
str = 'Hello World!'
 
print (str )          # 输出完整字符串
print (str[0])        # 输出字符串中的第一个字符
print (str[2:5] )     # 输出字符串中第三个至第六个之间的字符串
print (str[2:]  )     # 输出从第三个字符开始的字符串
print (str * 2 )      # 输出字符串两次
print (str + "TEST")  # 输出连接的字符串
12345678
Hello World!
H
llo
llo World!
Hello World!Hello World!
Hello World!TEST
123456
```

列表截取第三个参数:截取的步长

```python
letters='abcdefg'
letters[1:4:2]
12
'bd'
1
```

字符串逆序

 <img src="http://battle.wicp.io:9001/blog1/image-20240226192309803.png" alt="image-20240226192309803" style="zoom: 80%;" />

### 列表

List（列表）用 [ ] 标识，支持字符，数字，字符串甚至可以包含列表（即嵌套）。

```python
list = [ 'runoob', 786 , 2.23, 'john', 70.2 ]
tinylist = [123, 'john']
 
print (list  )             # 输出完整列表
print (list[0]  )          # 输出列表的第一个元素
print (list[1:3]  )        # 输出第二个至第三个元素 
print (list[2:]  )         # 输出从第三个开始至列表末尾的所有元素
print (tinylist * 2 )      # 输出列表两次
print (list + tinylist)    # 打印组合的列表

['runoob', 786, 2.23, 'john', 70.2]
runoob
[786, 2.23]
[2.23, 'john', 70.2]
[123, 'john', 123, 'john']
['runoob', 786, 2.23, 'john', 70.2, 123, 'john']
123456
```

### 元组

用 () 标识。内部元素用逗号隔开。

不能二次赋值，相当于只读列表。

```python
tuple = ( 'runoob', 786 , 2.23, 'john', 70.2 )
tinytuple = (123, 'john')
 
print (tuple   )            # 输出完整元组
print (tuple[0]   )         # 输出元组的第一个元素
print (tuple[1:3]  )        # 输出第二个至第四个（不包含）的元素 
print (tuple[2:]   )        # 输出从第三个开始至列表末尾的所有元素
print (tinytuple * 2   )    # 输出元组两次
print (tuple + tinytuple)   # 打印组合的元组
123456789
('runoob', 786, 2.23, 'john', 70.2)
runoob
(786, 2.23)
(2.23, 'john', 70.2)
(123, 'john', 123, 'john')
('runoob', 786, 2.23, 'john', 70.2, 123, 'john')
123456
```

### 字典

字典(dictionary)。列表是有序的对象集合，字典是无序的对象集合。

两者之间的区别在于：字典当中的元素是通过键来存取的，而不是通过偏移存取。

字典用"{ }"标识。字典由索引(key)和它对应的值value组成。

```python
dict = {}
dict['one'] = "This is one"
dict[2] = "This is two"
 
tinydict = {'name': 'runoob','code':6734, 'dept': 'sales'}
 

print (dict['one']  )        # 输出键为'one' 的值
print (dict[2])              # 输出键为 2 的值
print (tinydict )            # 输出完整的字典
print (tinydict.keys())      # 输出所有键
print (tinydict.values()   ) # 输出所有值
123456789101112
This is one
This is two
{'name': 'runoob', 'code': 6734, 'dept': 'sales'}
dict_keys(['name', 'code', 'dept'])
dict_values(['runoob', 6734, 'sales'])
12345
```

1. **列表（list）**：一个有序的可变序列，元素之间用逗号分隔，并且用方括号括起来。例如：`[1, 2, 3, 4, 5]`。
2. **元组（tuple）**：一个有序的不可变序列，元素之间用逗号分隔，并且用圆括号括起来。例如：`(1, 2, 3, 4, 5)`。
3. **字符串（str）**：一个有序的不可变序列，由字符组成，并且用单引号或双引号括起来。例如：`"hello"` 或 `'world'`。
4. **集合（set）**：一个无序的可变序列，元素之间用逗号分隔，并且用花括号括起来。例如：`{1, 2, 3, 4, 5}`。
5. **字典（dict）**：一个无序的可变序列，由键值对组成，并且用花括号括起来。例如：`{'a': 1, 'b': 2, 'c': 3}`。

### 数据类型转换

需要对数据内置的类型进行转换,数据类型作为函数名。

返回一个新的对象，表示转换的值。

函数 描述
 int(x [,base]) 将x转换为一个整数

long(x [,base] ) 将x转换为一个长整数

float(x) 将x转换到一个浮点数

complex(real [,imag]) 创建一个复数

str(x) 将对象 x 转换为字符串

repr(x) 将对象 x 转换为表达式字符串

eval(str) 用来计算在字符串中的有效Python表达式,并返回一个对象

tuple(s) 将序列 s 转换为一个元组

list(s) 将序列 s 转换为一个列表

set(s) 转换为可变集合

```
dict(d) 创建一个字典。d 必须是一个元组
```

 ![image-20240226213337419](http://battle.wicp.io:9001/blog1/image-20240226213337419.png)

frozenset(s) 转换为不可变集合

chr(x) 将一个整数转换为一个字符

unichr(x) 将一个整数转换为Unicode字符

ord(x) 将一个字符转换为它的整数值

hex(x) 将一个整数转换为一个十六进制字符串

oct(x) 将一个整数转换为一个八进制字符串



## 常用的内置函数

#### Python最常用的内置函数

内置函数就是不需要导包就可以直接使用的函数

1. 数学函数

abs() 函数：取绝对值

```python
print(abs(-10))

10

```

divmod() 函数 ：同时取商和余数

```python
print(divmod(7,2))

(3, 1)

```

sum() 函数 ：求和计算

```python
print(sum([1,2,3]))

6

```

round() 函数： 四舍五入

```python
print(round(5.1))
print(round(5.5))

5
6

```

pow() 函数 ：计算任意N次方值

```python
print(pow(2,3))
#也可以使用**
print(2**3)

8
8

```

min() 函数 ：获取最小值

```python
print(min(9,5,2,7))

2

```

max() 函数 ：获取最大值

```python
print(max(9,5,2,7))

9

```

1. 数据转换函数

hex() 函数： 十进制转换成十六进制

```python
print(hex(100))

0x64

```

oct() 函数： 十进制转换成八进制

```python
print(oct(100))

0o144

```

bin() 函数 ：十进制转换成二进制

```python
print(bin(100))

0b1100100

```

bool() 函数 ：将指定的参数转换成布尔类型

```python
print(bool(1))
print(bool(0))

True
False

```

ord() 函数 ：获取单个字符的ASCII数值

```python
print(ord('A'))

65

```

float() 函数 ：转换成浮点数

```python
print(float(10))

10.0

```

chr() 函数： 转换一个整数并返回所对应的字符

```python
print(chr(65))

A

```

list() 函数： 将可迭代对象转换为列表

```python
print(list(range(1,10)))

[1, 2, 3, 4, 5, 6, 7, 8, 9]

```

1. 对象创建函数

open()函数：打开文件并返回文件对象

```python
f1 = open('E:\Hello.txt','r')
print(f1.readline())

Hello Python

```

range()函数：创建一个可迭代对象,内容是指定范围内的连续整数

```python
for i in range(5):
	print(i)

0
1
2
3
4

```

set()函数：创建一个无序不重复元素集合

```python
set([1,2,1,1,3,4,4,6,5])

{1, 2, 3, 4, 5, 6}

```

1. 迭代器操作函数

all() 函数： 判断指定序列中的所有元素是否都为 True，则返回 True，如果有一个为 False，则返回 False。

```python
a = [1,2,0]
all(a)

False

```

any()函数： 判断指定序列中的所有元素是否都为 False，则返回 False，如果有一个为 True，则返回 True。

```python
a = [1,0,0]
any(a)

True

```

sorted() 函数： 对可迭代对象进行排序

```python
a = [3,1,4,2]
sorted(a)

[1, 2, 3, 4]

```

map()函数： 通过自定义函数实现对序列的元素映射操作并返回操作后的结果

```python
list(map(int,['1','2','3']))

[1, 2, 3]

```

1. 基本常用函数

format()函数： 格式化数据

```python
"{} {}".format("hello", "world")
print("{:.2f}".format(3.1415926));

'hello world'
3.14

```

input()函数： 接受用户输入并返回所输入的 string 类型数据

```python
s = input() #输入abc回车
print(s)

abc

```

len()函数： 返回一个对象的元素或项目个数

```python
len([1,2,3,4])

4

```

#### 二、python中字符串操作



~~~
s.swapcase() 将字符串中所有字母的大小写都反转
s.upper() 将字符串所有的字母都转换为大写
s.lower() 将字符串所有的字母都转换为小写
s.isdigit() 检查字符串中的字符是否都是数字
s.isnumeric() 检查字符串中的所有字符是否都是数字字符
s.capitalize() 返回字符串的副本，但将第一个字符大写
s.isalpha() 检查字符串中的所有字符是否都是字母
s.isalnum() 检查字符串中的字符是否都是字母或数
s.isspace() 检查字符串中的字符是否都是空白字符

~~~



返回 str 在 string 里面出现的次数，如果 beg 或者 end 指定则返回指定范围内 str 出现的次数

```python
string.count(str, beg=0, end=len(string))
```

以 encoding 指定的编码格式编码 string，如果出错默认报一个ValueError 的异常，除非 errors 指定的是’ignore’或者’replace’

```python
string.endswith(obj, beg=0, end=len(string))

```

检测 str 是否包含在 string 中，如果 beg 和 end 指定范围，则检查是否包含在指定范围内，如果是返回开始的索引值，否则返回-1

```python
string.find(str, beg=0, end=len(string))

```

跟find()方法一样，只不过如果str不在 string中会报一个异常.

```python
string.index(str, beg=0, end=len(string))

```

以 string 作为分隔符，将 seq 中所有的元素(的字符串表示)合并为一个新的字符串

```python
string.join(seq)

```

在 string 上执行 lstrip()和 rstrip()

```python
string.strip([obj])

```

转换 string 中的小写字母为大写

```python
string.upper()

```

转换 string 中所有大写字符为小写.

```python
string.lower()

```

翻转 string 中的大小写

```python
string.swapcase()

```

怎样将以下列表转化为整数？

```python
a=[1, 3, 5]
b=['4', '5', '6']

r1 = int("".join(map(str, a))) 
r2 = int("".join(map(str, b))) 

123
456

```

#### 三、python中math的使用

要使用math函数必须先导入math包，这里列举几个做题中常用的。

```python
import math  

```

1. 向上取整

```python
print(math.ceil(3.1))

4
```

1. 向下取整

```python
print(math.floor(3.1))

3
```

1. 乘方 开方

```python
print(math.pow(10,3))
print(math.pow(27,1/3))
1000.0
1.0
```

#### 四、正则表达式的基本使用

Python的正则表达式（Regular Expression ）的模块是 ‘re’,它能帮你非常方便的检查一个字符串是否与某种模式匹配，比如你要在一个字符串s=’Regular 123 Expression’ 中查找‘123’、‘456’,只要这样写：

```python
import re
s = 'Regular 123 Expression 456'
re.findall(r'\d+',s)
123
['123', '456']
1
```

- 是不是感觉自己写代码的技术又上升了一个档次，这里用到的函数 ”findall(rule , target [,flag] )”  是正则里面最常用的函数之一，作用就是在目标字符串target 中查找符合规则rule  的字符串，后面还可以跟一个规则选项flag用于控制正则表达式的匹配方式，如：是否区分大小写，多行匹配等等。返回结果结果是一个列表，中间存放的是符合规则的字符串。如果没有符合规则的字符串被找到，就返回一个空列表。
- **上面的参数 r’\d+’ 很多同学可能就有疑惑了，’\d+'是一个字符串相信大家都看得出来，那字符串前面加个r是什么意思呢？其实在正则表达式的字符串前面加上r表示这个是一个raw字符串，只以正则表达式的元字符进行解析，不用理会ASCII的特殊字符。**
- 比如，特殊符号“\b”在ASCII 字符中代表退格键，但同时“\b”也是一个正则表达式的特殊符号，代表“匹配一个单词边界”。
- 为了让re编译器把两个字符“\b”当成你想要表达的字符串，而不是一个退格键，你需要用另一个反斜线对它进行转义，即可以这样写：“\b”。
   但这样做会把问题复杂化，特别是当你的正则表达式字符串里有很多特殊字符时，就更容易令人困惑了。
- 看到这里，相信大家都看懂了吧。

在比赛中使用以下正则符基本满足大部分的情况了：

```
^：匹配字符串开头
" * " 匹配前面的子表达式零次或多次
" + " 匹配前面的子表达式一次或多次
" ？ " 匹配前面的子表达式零次或一次
" [abc]" ：方括号表示字符集合，例子表示一个字符串有一个 "a" 或 "b" 或 "c" 等价于 [z|b|c]
" [a-z]"： 表示一个字符串中存在一个 a 和 z 之间的所有字母
" [^a-z]" ：表示一个字符串中不应该出现 a 到 z 之间的任意一个字母
" [0-9]"： 表示一个字符串中存在一个 0 和 9 之间的所有数字
" \d " 匹配一个数字字符，等价[0-9]
" \D " 匹配一个非数字字符，等价[^0-9]
" \w" 匹配包括下划线的任何单词字符。等价于“[A-Za-z0-9_]”
" \W" 匹配任何非单词字符。等价于“[^A-Za-z0-9_]”

12345678910111213
```

#### 五、文件操作

蓝桥杯比赛中经常出现需要输入多行多列数据的题目，如果手动一个个输入也可以，就是太浪费时间，如果利用好文件操作的方法，做题就会得心应手。

例如：hello.txt文件含30 行 50 列字符,怎样把它读到列表里？

- 最基本的文件操作方式

```python
fp = open('E:\hello.txt','r')
res = []
s = fp.readlines()
for i in s:
    res.append(i.strip('\n')) #使用strip()去掉换行符，如果不去的话会把‘\n’也读进来
fp.close() #记得要关闭连接，养成良好习惯

print(res[:])
12345678
```

输出结果：
 ![在这里插入图片描述](C:\Users\Smith\Desktop\IStudy\LanQiao\image\202402201901561.png)

- 利用Python自身的字符串操作优势，两行搞定，推荐此方法。

```python
fp =  open('E:\hello.txt','r')

res = [s.strip('\n') for s in fp.readlines()]

fp.close()

print(res[:])
1234567
```

输出结果：
 ![在这里插入图片描述](C:\Users\Smith\Desktop\IStudy\LanQiao\image\202402201901999.png)

## 接受数据

 <img src="C:\Users\Smith\Desktop\IStudy\LanQiao\image\202402201943725.png" alt="image-20240220194332609" style="zoom:80%;" />

## 标准库

### statistics模块

~~~
1、statistics.mean()  求算术平均值
2、statistics.median() 计算数据的中位数，如果有两个中位数，则返回其平均值
   statistics.median_low() 数据中的低中位数
   statistics.median_high() 数据中的高中位数
3、statistics.mode()  计算众数
4、statistics.pvariance() 计算数据的总体方差

~~~

### **collections模块**

```python
1、collections.deque([])
        q = collections.deque([1, 2, 3, 4])
        q.rotate(1)
        print(q)  # [4, 1, 2, 3]
        q.rotate(1)
        print(q)  # [3, 4, 1, 2]
2、collections.Counter()
    >>> import collections
    >>> collections.Counter([1,2,3,1,2,3,1,2])
    Counter({1: 3, 2: 3, 3: 2})
12345678910
```

### **datetime模块**

```python
1、日期增加
>>> import datetime
>>> bt = datetime.date(2000,11,6)
>>> print(bt)
2000-11-06
>>> a = datetime.timedelta(days=100)
>>> a
datetime.timedelta(days=100) #weeks / hours
>>> b = a + bt
>>> b
datetime.date(2001, 2, 14)
1234567891011
```

主要用以下两个类

**datetime.dateime**：日期和时间表示的类，功能覆盖**date**和**time**类。

**datetime.timedelta**： 与时间间隔有关的类。

2、给定日期求星期

```python
bt.weekday()：返回weekday，如果是星期一，返回0；如果是星期2，返回1，以此类推；
bt.isoweekday()：返回weekday，如果是星期一，返回1；如果是星期2，返回2，以此类推；
12
```

3、标准化

```python
>>> bt.isoformat()
'2000-11-06'
12
```

4、返回公元公历开始到现在的天数

```python
>>> bt.toordinal()
730430
12
```

5、输出

```python
>>> bt.__format__('%Y/%m/%d')
'2000/11/06'
12
```

**calendar模块**

```python
    1、判断是否为闰年
    >>> import calendar
    >>> calendar.isleap(2022)
    False

   2、返回两年之间的闰年总数
    >>> calendar.leapdays(2000,2020)
1234567
```

### math 库：

提供数学相关的函数，如三角函数、指数函数、对数函数等。
 常用函数：math.sqrt()、math.pow()、math.sin()、math.cos()、math.tan()、math.exp()、math.log() 等。

math模块提供了各种数学函数和常数的实现。下面列举一些常用的函数和常数：

- **数学常数**

math.e：自然常数 e 的值，约等于 2.71828。

math.pi：圆周率 π 的值，约等于 3.14159。

- **常用数学函数**

math.sqrt(x)：返回 x 的平方根。

math.pow(x, y)：返回 x 的 y 次方。

math.exp(x)：返回 e 的 x 次方。

math.log(x, base=math.e)：返回 x 的对数。base 参数为对数的底数，默认为自然对数 e。

math.sin(x)、math.cos(x)、math.tan(x)：返回 x 的正弦、余弦和正切值。

math.asin(x)、math.acos(x)、math.atan(x)：返回 x 的反正弦、反余弦和反正切值。

- **数值运算函数**

math.ceil(x)：返回不小于 x 的最小整数。

math.floor(x)：返回不大于 x 的最大整数。

math.trunc(x)：返回 x 的整数部分。

math.modf(x)：返回 x 的小数部分和整数部分，以元组形式返回。

math.fabs(x)：返回 x 的绝对值。

math.factorial(x)：返回 x 的阶乘。

math.gcd(a, b)：返回 a 和 b 的最大公约数。

- **特殊函数**

math.erf(x)、math.erfc(x)：返回 x 的误差函数和余误差函数的值。

math.gamma(x)、math.lgamma(x)：返回 x 的伽马函数和它的自然对数。

除了以上列出的函数和常数，math模块还提供了很多其他有用的函数。在蓝桥杯Python组考试中，如果需要进行一些数学运算或计算，math模块是一个非常有用的工具。

### random 库：

提供随机数相关的函数，如生成随机整数、随机浮点数、随机序列等。
 常用函数：random.randint()、random.uniform()、random.choice()、random.shuffle() 等。

### datetime 库：

提供日期和时间相关的函数，如获取当前日期、时间差计算、日期格式化等。
 常用函数：datetime.datetime.now()、datetime.timedelta()、datetime.datetime.strftime() 等。

### os 库：

提供操作系统相关的函数，如文件和目录操作、进程管理等。
 常用函数：os.getcwd()、os.listdir()、os.path.join()、os.path.exists()、os.system() 等。

### sys 库：

提供与 Python 解释器相关的函数和变量，如获取命令行参数、获取系统版本等。
 常用函数：sys.argv[]、sys.version_info.major、sys.exit() 等。

### re 库：

提供正则表达式相关的函数，用于字符串匹配和替换等操作。
 常用函数：re.match()、re.search()、re.findall()、re.sub() 等。

re是Python中用于正则表达式操作的标准库，它提供了一系列函数和方法，用于对字符串进行正则匹配、替换等操作。下面简单介绍一下re模块中常用的函数和方法：

re.match(pattern, string[,  flags])：从字符串的开头开始匹配，如果字符串的开头能够匹配正则表达式，就返回匹配对象，否则返回None。其中，pattern是正则表达式，string是需要匹配的字符串，flags是可选的匹配标志。

re.search(pattern, string[,  flags])：在字符串中搜索正则表达式的第一个匹配结果，如果找到了匹配结果就返回匹配对象，否则返回None。其中，pattern是正则表达式，string是需要匹配的字符串，flags是可选的匹配标志。

re.findall(pattern, string[, flags])：搜索字符串中所有满足正则表达式的匹配结果，并以列表形式返回这些匹配结果。其中，pattern是正则表达式，string是需要匹配的字符串，flags是可选的匹配标志。

re.sub(pattern, repl, string[, count,  flags])：用repl替换字符串中所有满足正则表达式的匹配结果，并返回替换后的字符串。其中，pattern是正则表达式，repl是替换字符串，string是需要匹配的字符串，count是可选的替换次数，默认是0

### queue模块

如果需要使用更高级的队列和栈[数据结构](https://so.csdn.net/so/search?q=数据结构&spm=1001.2101.3001.7020)，可以使用Python标准库中的deque模块和queue模块，这两个模块提供了更多功能和性能更好的队列和栈实现方式。例如，使用deque模块中的deque类可以轻松实现双端队列。使用queue模块中的Queue类可以轻松实现线程安全的队列。

queue模块提供了多种队列实现方式，包括先进先出队列（FIFO）、后进先出队列（LIFO）和优先级队列。队列实现是线程安全的，因此适用于多线程编程。

下面以先进先出队列（FIFO）为例，介绍一下queue模块的使用方法：

首先需要导入queue模块：

```python
import queue
1
```

然后，创建一个FIFO队列对象：

```python
q = queue.Queue()
1
```

此时，可以使用put()方法向队列中添加元素，使用get()方法从队列中获取元素：

```python
q.put(1)
q.put(2)
q.put(3)
print(q.get())  # 输出1
print(q.get())  # 输出2
12345
```

注意，队列中元素的顺序是先进先出的，即第一个放入队列的元素会被第一个取出。如果队列为空，get()方法会阻塞，直到队列中有元素可取。

除了Queue类之外，queue模块还提供了LifoQueue类和PriorityQueue类，分别对应后进先出队列和优先级队列。它们的使用方法类似，只需要将Queue替换成相应的类名即可。

如果需要实现线程安全的队列，可以使用queue模块中的Queue类和LifoQueue类。如果需要实现线程安全的优先级队列，可以使用queue模块中的PriorityQueue类。

总之，queue模块提供了方便易用、线程安全的队列实现方式，对于蓝桥杯Python组考试来说是一个非常有用的工具。

### itertools

itertools模块提供了一些用于操作迭代器的工具函数。这些工具函数可以帮助我们高效地处理大量数据，并且通常是在内存中进行操作，因此对于处理大型数据集非常有用。

以下是itertools模块中一些常用的函数：

- itertools.permutations()
   此函数来生成一个序列的全排列。这个函数接受两个参数，第一个参数是需要排列的序列，第二个参数是排列的长度（可选，默认为序列的长度）。

下面是一个示例代码：

```python
import itertools
1
```

## 生成1~3的全排列

```permutations
for p in permutations:
    print(p)
12
```

输出结果：

```scss
(1, 2, 3)
(1, 3, 2)
(2, 1, 3)
(2, 3, 1)
(3, 1, 2)
(3, 2, 1)
123456
```

以上代码中，我们使用itertools.permutations()函数生成了1~3的全排列，并使用for循环依次输出每个排列。如果想生成指定长度的排列，可以在第二个参数中指定排列的长度，如下所示：

```python
import itertools

# 生成1~3的2个元素排列

permutations = itertools.permutations([1, 2, 3], 2)
for p in permutations:
    print(p)
1234567
```

输出结果：

```scss
(1, 2)
(1, 3)
(2, 1)
(2, 3)
(3, 1)
(3, 2)
123456
```

以上代码中，我们生成了1~3的2个元素排列，并使用for循环依次输出每个排列。

- itertools.count(start=0, step=1)
   这个函数返回一个无限迭代器，从 start 开始，以 step 为步长不断地生成整数。可以使用 itertools.islice() 函数来控制生成的元素个数。
- itertools.cycle(iterable)
   这个函数接受一个可迭代对象作为参数，并不断重复生成该对象中的元素。可以使用 itertools.islice() 函数来控制生成的元素个数。
- itertools.repeat(object, times=None)
   这个函数返回一个无限迭代器，不断重复生成指定的对象。如果指定了 times 参数，则迭代指定的次数。
- itertools.chain(*iterables)
   这个函数接受一些可迭代对象作为参数，返回一个迭代器，依次将它们中的元素连接在一起。
- itertools.compress(data, selectors)
   这个函数接受两个可迭代对象作为参数，data 和 selectors。它返回一个迭代器，依次返回 data 中与 selectors 中对应位置为 True 的元素。
- itertools.filterfalse(function or None, iterable)
   这个函数接受一个函数和一个可迭代对象作为参数，返回一个迭代器，依次返回 iterable 中不满足函数 function 的元素。
- itertools.groupby(iterable, key=None)
   这个函数接受一个可迭代对象和一个 key 函数作为参数，返回一个迭代器，将 iterable 中的元素按照 key 函数的结果进行分组。
- itertools.product(*iterables, repeat=1)
   这个函数接受一些可迭代对象作为参数，返回一个迭代器，依次返回它们中的元素的笛卡尔积。
- itertools.permutations(iterable, r=None)
   这个函数接受一个可迭代对象和一个整数 r 作为参数，返回一个迭代器，依次返回它们中的元素的 r 元排列。
- itertools.combinations(iterable, r)
   这个函数接受一个可迭代对象和一个整数 r 作为参数，返回一个迭代器，依次返回它们中的元素的 r 元组合。

### 动态规划

大致解法

> 1、定义数组元素的含义，清楚dp[i]的含义，表示的结果
>  2、找出数组元素之间的关系式，即动态转移方程，递推公式
>  3、找出初始值，例如第一个元素值

## 

## 字符串逆序

#### 要求

**输入**
 输入一个字符串，其长度不超过100
 **输出**
 将输入的字符串逆序输出，代码控制在一行

~~~
a = input()//python不需要分号
print(a[-1::-1])
print(a[::-1])
~~~

### 字符串复习

字符串的切片(slice)可以采用以下的格式：

```
string[start:stop:step]
```

其中各个参数的含义如下：

- `start`: 切片的起始索引，即开始取值的位置。
- `stop`: 切片的结束索引，即停止取值的位置（不包含该索引对应的值）。
- `step`: 指的是从 start 索引处的字符开始，每 step 个距离获取一个字符，直至 end 索引出的字符。step 默认值为 1，当省略该值时，最后一个冒号也可以省略。

这些参数都是可选的，如果不指定的话，Python 将会使用默认值：

- 如果 `start` 没有指定，则默认为字符串的开头。
- 如果 `stop` 没有指定，则默认为字符串的末尾。
- 如果 `step` 没有指定，则默认为 1。

这些参数的组合可以实现对字符串的各种切片操作，例如截取子串、逆序输出、跳跃取值等。

![image-20240220101940029](C:\Users\Smith\Desktop\IStudy\LanQiao\image\202402201019101.png)

![image-20240220101954994](C:\Users\Smith\Desktop\IStudy\LanQiao\image\202402201019064.png)

## [闰年判断](https://so.csdn.net/so/search?q=闰年判断&spm=1001.2101.3001.7020)

~~~
year = int(input("请输入年份:"))

if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
    print(year, "是闰年")
else:
    print(year, "不是闰年")

~~~



判断3月1日前一天是不是29号，这个方法需要导入datetime库来获取时间。

~~~
import datetime
year = int(input())
time=datetime.timedelta(days=1)#存储时间的变化量，这里等于1
dt=datetime.date(year=year,month=3,day=1)#设置时间是该年3月1日
res = dt-time#3月1日前一天
if res.day==29:
    print('yes')
else:
    print('no')

~~~

使用calendar模块

```python
1、判断是否为闰年
    >>> import calendar
    >>> calendar.isleap(2022)
    False

   2、返回两年之间的闰年总数
    >>> calendar.leapdays(2000,2020)
```

**注意：** 蓝桥杯不支持第三方库，只能使用python标准库。一些python常用的标准库有：time、datetime、math 、random、pip等

判断是否是标准库的最简单的方法是直接[import](http://c.biancheng.net/view/2397.html)你没有下载过的库，成功就表示是python自带的库。

#### datetime库的常用方法

`datetime` 库是 Python 中用于处理日期和时间的标准库，它提供了多个类和函数，用于创建、操作和格式化日期时间对象。以下是一些常见的 `datetime` 库的用法：

1. **创建日期时间对象：** 使用 `datetime` 类可以创建表示特定日期和时间的对象。例如：

```
python
import datetime

# 创建一个表示当前日期和时间的对象
now = datetime.datetime.now()

# 创建一个表示特定日期和时间的对象
specific_date = datetime.datetime(2023, 5, 17, 12, 30, 15)  # 年、月、日、时、分、秒
```

1. **获取日期时间的各个部分：** 可以使用 `year`、`month`、`day`、`hour`、`minute`、`second` 等属性获取日期时间对象的各个部分。

```
python
year = now.year
month = now.month
day = now.day
hour = now.hour
minute = now.minute
second = now.second
```

1. **日期时间格式化：** 可以使用 `strftime()` 方法将日期时间对象格式化为字符串。

```
python
formatted_date = now.strftime("%Y-%m-%d %H:%M:%S")
print(formatted_date)  # 输出如：2023-01-30 15:30:00
```

1. **字符串转换为日期时间对象：** 可以使用 `strptime()` 方法将字符串转换为日期时间对象。

```
python
date_str = "2023-05-17"
date_obj = datetime.datetime.strptime(date_str, "%Y-%m-%d")
```

1. **日期时间计算：** 可以使用 `timedelta` 类来进行日期时间的加减运算。

```
python
import datetime

# 创建一个时间差对象
time_delta = datetime.timedelta(days=5, hours=3, minutes=20)

# 在当前日期时间上加上时间差
future_date = datetime.datetime.now() + time_delta
```

这些只是 `datetime` 库的一部分用法，它还提供了更多功能，比如时区处理、日期时间比较等。

## [水仙花数](https://so.csdn.net/so/search?q=水仙花数&spm=1001.2101.3001.7020)

### 输入

输入一个三位数，若每一位的立方相加后等于该数，则称这个数为水仙花数

### 输出

如果该数是水仙花数则输出yes，否则输出no

~~~
import math

num = int(input("请输入一个三位数："))

# 提取百位、十位、个位数字
b = num // 100
s = (num // 10) % 10
g = num % 10

# 判断是否为水仙花数
if ((b**3) + (s**3) + (g**3)) == num:
    print('是水仙花数')
else:
    print('不是水仙花数')

~~~

### //和/运算符在py中是有区别的

在Python中，整数除法（使用`//`运算符）和浮点数除法（使用`/`运算符）是有区别的。

- 使用 `//` 运算符进行整数除法时，将会得到结果的整数部分，即向下取整。
- 使用 `/` 运算符进行浮点数除法时，将会得到精确的除法结果，即包含小数部分。

在你的情况下，`num` 是一个整数，所以推荐使用整数除法来提取百位数。使用整数除法可以保证得到的结果也是整数，而且更加精确。

如果你使用了浮点数除法 `num / 100`，得到的结果可能会是一个浮点数，可能会导致精度丢失或产生不必要的小数部分。因此，为了避免这些问题，通常建议在这种情况下使用整数除法 `num // 100`。





## A+B问题

## A+B

### 输入

要求输入的两个整数在一行内完成

### 输出

计算A+B的结果并输出结果

~~~
a,b=map(int,input().split())
print(a+b)	
~~~



