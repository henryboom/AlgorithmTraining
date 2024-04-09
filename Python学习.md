## Python学习



尝试打破编程语言的 壁垒，熟悉一下py语法，直接上手使用

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

## 蓝桥杯常用知识点

datetime 库

```python
import datetime

#设置时间

start = datetime.date(1901,1,1)#不算这一天 是从1900，12，31开始的

end = datetime.date(2001,1,1)#到2000，12，31
start += datetime.timedelta(days=1)
#print(end-start)
#print(start.weekday())#返回周几,它使用datetime类对象，并以整数形式返回星期几，其中Monday是0，Sunday是6。它是一个实例方法，即，它适用于该类的实例。
#print(end.weekday())
#print(start.day)#返回几号
```

[数组切片](https://so.csdn.net/so/search?q=数组切片&spm=1001.2101.3001.7020)

```python
左边是闭区间，右边是开区间

s[i:j] 表示获取a[i]到a[j-1]


s[:-1]去掉最后一个字符

s[:-n]去掉最后n个字符

s[-2:]取最后两个字符

s[i:j:k]这种格式呢，i,j与上面的一样，但k表示步长，默认为1

s[::-1]是从最后一个元素到第一个元素复制一遍（反向）
```

数字格式化

```python
{：.2f} #保留小数点后两位



{：.0f}#不带小数



{：.2%}#百分比格式 25.00%



{:.0f}%#百分比格式 25%



#print ("{:.0f}%".format("25"))
```

collections Counter

```python
from collections import Counter

# 计数字符串中的字符
c = Counter()
for i in 'sfsadfsdjklgsdla':
    c[i] += 1
print(c)  # Counter({'s': 4, 'd': 3, 'f': 2, 'a': 2, 'l': 2, 'j': 1, 'k': 1, 'g': 1})

c2 = Counter('asfjslfjsdlfjgkls')
print(c2)  # Counter({'s': 4, 'd': 3, 'f': 2, 'a': 2, 'l': 2, 'j': 1, 'k': 1, 'g': 1})

# 计数列表中的元素
c = Counter(['red', 'blue', 'red', 'green', 'blue', 'blue'])
print(c)  # Counter({'blue': 3, 'red': 2, 'green': 1})

```

[进制转换](https://so.csdn.net/so/search?q=进制转换&spm=1001.2101.3001.7020)

```python
"""



bin(x)返回 2 进制字符串。



oct(x)返回 8 进制字符串。



hex(x)返回 16 进制字符串。



int(n, x) 将n转换为x进制的数



"""



2进制



bin(int(x, 8))



bin(int(x, 10))



bin(int(x, 16))



8进制



oct(int(x, 2))



-



oct(int(x, 10))



oct(int(x, 16))



10进制



int(x, 2)



int(x, 8)



-



int(x, 16)



16进制



hex(int(x, 2))



hex(int(x, 8))



hex(int(x, 10))



-



hex(num)表示将十进制的数转换为十六进制，转换完成后八进制数前有0x前缀，使用[2：]从第三位开始取值，从而去掉0x
```

[大小写转换](https://so.csdn.net/so/search?q=大小写转换&spm=1001.2101.3001.7020)

```python
#upper() 方法将字符串中的小写字母转为大写字母。



#lower()：所有字母小写



upper()方法语法：



str.upper()



str.lower()
```

对于一些矩阵的题目来说，往往从第二行开始计算

字符串转化为数字

```python
n = input()
int(i) for i in str(n)
```

sort和sorted

```python
list.sort(cmp=None, key=None, reverse=False)



#cmp -- 可选参数, 如果指定了该参数会使用该参数的方法进行排序。



#key -- 主要是用来进行比较的元素，只有一个参数，具体的函数的参数就是取自于可迭代对象中，指定可迭代对象中的一个元素来进行排序。



#reverse -- 排序规则，reverse = True 降序， reverse = False 升序（默认）。



sort 与 sorted 区别：



sort 是应用在 list 上的方法，sorted 可以对所有可迭代的对象进行排序操作。



list 的 sort 方法返回的是对已经存在的列表进行操作，无返回值，而内建函数 sorted 方法返回的是一个新的 list，而不是在原来的基础上进行的操作。
```

排列函数permutations

```python
# list.sort(cmp=None, key=None, reverse=False)
# cmp -- 可选参数, 如果指定了该参数会使用该参数的方法进行排序。
# key -- 主要是用来进行比较的元素，只有一个参数，具体的函数的参数就是取自于可迭代对象中，指定可迭代对象中的一个元素来进行排序。
# reverse -- 排序规则，reverse = True 降序， reverse = False 升序（默认）。

# sort 与 sorted 区别：

# sort 是应用在 list 上的方法，sorted 可以对所有可迭代的对象进行排序操作。
# list 的 sort 方法返回的是对已经存在的列表进行操作，无返回值，而内建函数 sorted 方法返回的是一个新的 list，而不是在原来的基础上进行的操作。

```

math

```python
from math import comb

comb(n, k)  # 返回不重复且无顺序地从 n 项中选择 k 项的方式总数

math.gcd(*integers)

gcd(a, b)  # 求a，b的最大公约数

a * b // gcd(a, b)  # 求a，b的最小公倍数

```

哈希表和字典

```python
enumerate(sequence, [start=0])  # 同时列出数据下标和数据

d = {key1: value1, key2: value2, key3: value3 }

print(d[key1])  # values1

del d[key2]  # 删除键key2

d.clear()  # 清空字典

del d  # 删除字典

len(dict)  # 计算字典元素个数，即键的总数。

str(dict)  # 输出字典，可以打印的字符串表示。

dict.get(key[, value])

print("key1 : ", d.get(key1))  # value1

d = {1: [1, 10, 199], 3: [2, 9, 16]}

d.items()

# 含义：返回字典中的键值对列表。

# d.items()返回包含键值对的元组列表。每个元组中的第一项是键，第二项是键的值。

# list(d.items()) =[(1, [1,10,199]), (3, [2,9,16])] 

for o in d.items():
    ids, ts_ = (i for i in o)  # ids是1,3...号, ts_是[1,10,199],[2,9,16]
    ts_ = sorted(ts_)
    print(ids, ts_)  # 1 [1,10,199]  3 [2,9,16]

d.keys()

# 含义：返回字典中的键列表。

d.values()

# 含义：返回字典中的值列表。

```

分数

Fraction分数模块

```python
#求1+1/2+1/4+1/8+⋯1/2**19的和



from fractions import Fraction#插入分数模块



sum = 1



for i in range(1,20):



#输入分数时，Fraction开头字母必须大写，否则会报错。



  sum+=Fraction(1,2**i)#表示1/2+......+1/2^19



print(sum)#1048575/524288
```

求n以内的质数

```python
m=[]

for i in range(1,n):

    if i>1:

        for j in range(2,i):

            if i%j==0:

                break

        else:

            m.append(i)
```

常见数据类型

```python
int,bool,str,list,tuple,dict,set,float,None

#哪些能转化成布尔值为False:空，None，0

#可变和不可变划分，可变的有哪些：list,set,dict

#可哈希和不可哈希，不可哈希的有哪些：list,set,dict

#字典的键/集合的元素，必须是可哈希类型
```



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

#### defaultdict 

`defaultdict` 和 `{}`（字典）的主要区别在于处理不存在的键时的行为。

1. **字典 `{}`：** 在使用字典时，如果访问了不存在的键，会抛出 KeyError 异常。

```python

my_dict = {}
print(my_dict['key'])  # KeyError: 'key' 不存在
```

1. **defaultdict：** `defaultdict` 是 `collections` 模块提供的一个类，它是字典的一个子类。与普通字典不同，当使用 `defaultdict` 时，如果访问了不存在的键，它会自动创建一个默认值，并返回该默认值。这个默认值的类型由你指定的工厂函数决定。

```python

from collections import defaultdict

my_defaultdict = defaultdict(int)  # 使用 int 作为默认值的工厂函数
print(my_defaultdict['key'])  # 输出: 0，因为 int() 的默认值为 0
```

因此，`defaultdict` 的一个主要优点是，在处理不存在的键时，不会引发 KeyError 异常，而是返回一个默认值。

## **datetime模块**

#### 获取当前日期和时间

```python
python
import datetime

# 获取当前日期和时间
now = datetime.datetime.now()
print("当前日期和时间:", now)

# 获取当前日期
today = datetime.date.today()
print("当前日期:", today)

# 获取当前时间
current_time = datetime.datetime.now().time()
print("当前时间:", current_time)
```

#### 格式化日期时间

```python
python
import datetime

# 获取当前日期和时间的字符串表示
now_str = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
print("当前日期和时间(格式化):", now_str)

# 获取当前日期的字符串表示
today_str = datetime.date.today().strftime("%Y-%m-%d")
print("当前日期(格式化):", today_str)

# 获取当前时间的字符串表示
current_time_str = datetime.datetime.now().time().strftime("%H:%M:%S")
print("当前时间(格式化):", current_time_str)
```

#### 解析日期时间字符串

```python
python
import datetime

# 解析日期时间字符串
date_str = "2023-01-15"
parsed_date = datetime.datetime.strptime(date_str, "%Y-%m-%d")
print("解析后的日期:", parsed_date)
```

#### 计算日期间隔

```python
import datetime

# 计算日期间隔
start_date = datetime.date(2023, 1, 1)
end_date = datetime.date(2023, 1, 15)
delta = end_date - start_date
print("日期间隔:", delta.days, "天")
```

#### 计算秒的时间戳

`timestamp()` 方法用于将一个 `datetime` 对象转换为 POSIX 时间戳（从1970年1月1日午夜（UTC）开始经过的秒数）。下面是一个示例：

```python
import datetime

# 创建一个 datetime 对象，表示当前时间
current_time = datetime.datetime.now()

# 将 datetime 对象转换为 POSIX 时间戳
timestamp = current_time.timestamp()
print("POSIX 时间戳:", timestamp)
```

### **calendar模块**

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



# 题目

## A+B问题

##### A+B

##### 输入

要求输入的两个整数在一行内完成

##### 输出

计算A+B的结果并输出结果

~~~
a,b=map(int,input().split())
print(a+b)	
~~~

## 杨辉三角形

 ![在这里插入图片描述](http://battle.wicp.io:9001/blog1/59825c2adabe402587e93d15ff1847b2.png)



暴力遍历会超时



标准答案

枚举顺序

    首先对于左半边杨辉三角来说，每行最大的数一定出现在该行末尾，同时它也是该数最早出现的位置
    因此我们不妨从第16斜行开始枚举，只要出现等于 n 的数直接返回位置即可
    对于查找，我们可以对每个斜行采用二分的方法查找n
    对于位置，我们可以在查找的时候确定，n所在行 r（不是斜行）和所在斜行 k ，然后通过等差公式 r*（r+1）/2 计算它之前数目的个数再加上 k+1

 <img src="http://battle.wicp.io:9001/blog1/20210513144244519.jpg" alt="在这里插入图片描述" style="zoom:80%;" />



~~~python
def C(a,b): # 计算组合值
    res=1
    tmp=a
    for j in range(1,1+b):
        res=res*tmp//j #累除取余j
        if res > n:
            return res  #大于n已无意义，且防止爆LL
        tmp = tmp -1
    return res

def check(k):
    # 二分该斜行,找到大于等于该值的第一个数
    # 左边界2k，右边界为max(l, n)取二者最大，避免右边界小于左边界
    l,r=k*2,max(1,n)
    while l<r :
        mid =l+r >>1
        # print(mid,k)
        if C(mid ,k)>=n:
            r=mid
        else:
            l=mid+1
    if C(r,k)!=n:
        return False
    print(r*(r+1)//2+k+1)
    return True

n=int(input())
if n==1:
    print(1)
else:
    k=16 # 从第16斜行枚举
    while not check(k):
        k=k-1

~~~

## Fibonacci数列

~~~
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。

当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。

输入格式
输入包含一个整数n。
输出格式
输出一行，包含一个整数，表示Fn除以10007的余数。
说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可，而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数，直接计算余数往往比先算出原数再取余简单。

样例输入
10
样例输出
55
样例输入
22
样例输出
7704
数据规模与约定
1 <= n <= 1,000,000

~~~

代码

~~~python
n= int(input())
f1=f2=f3=1
if n==1or n==2:
    print(1)
elif n>2:
    for i in range(3,n+1)#这里遍历到n,这里没有使用递归，因为考虑到计算余数
    	f3=(f1+f2)%10007
        f1 = f2
        f2 = f3
    print(f3)
~~~

## 圆的面积

~~~
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
给定圆的半径r，求圆的面积。
输入格式
输入包含一个整数r，表示圆的半径。
输出格式
输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。
说明：在本题中，输入是一个整数，但是输出是一个实数。

对于实数输出的问题，请一定看清楚实数输出的要求，比如本题中要求保留小数点后7位，则你的程序必须严格的输出7位小数，输出过多或者过少的小数位数都是不行的，都会被认为错误。

实数输出的问题如果没有特别说明，舍入都是按四舍五入进行。

样例输入
4
样例输出
50.2654825
数据规模与约定
1 <= r <= 10000。
提示
本题对精度要求较高，请注意π的值应该取较精确的值。你可以使用常量来表示π，比如PI=3.14159265358979323，也可以使用数学公式来求π，比如PI=atan(1.0)*4。

~~~

示例：

~~~
#圆的面积
r= int (input())
PI=3.1415926535
area =r**2*PI
print('%.7f'%area)#类似c 的格式语法

~~~

## 数列排序

~~~
资源限制
时间限制：1.0s   内存限制：512.0MB
问题描述
　　给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
输入格式
　　第一行为一个整数n。
　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
输出格式
　　输出一行，按从小到大的顺序输出排序后的数列。
样例输入
5
8 3 6 4 9
样例输出
3 4 6 8 9

~~~

示例：

~~~
#数列排序
#输入一个数字
n=int(input())
#接受空格分开的数字存入列表
list=list(map(int ,input().split()))
#sorted排序
list=sorted(list)
for i in range(len(list)):
    print(list[i],end =' ')
list=sorted(list,reverse=True)
for i in range(len(list)):
    print(list[i],end =' ')

~~~

## 序列求和

~~~
资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
求1+2+3+...+n的值。
输入格式
输入包括一个整数n。
输出格式
输出一行，包括一个整数，表示1+2+3+...+n的值。
样例输入
4
样例输出
10
样例输入
100
说明：有一些试题会给出多组样例输入输出以帮助你更好的做题。

一般在提交之前所有这些样例都需要测试通过才行，但这不代表这几组样例数据都正确了你的程序就是完全正确的，潜在的错误可能仍然导致你的得分较低。

样例输出
5050
数据规模与约定
1 <= n <= 1,000,000,000。
说明：请注意这里的数据规模。

本题直接的想法是直接使用一个循环来累加，然而，当数据规模很大时，这种“暴力”的方法往往会导致超时。此时你需要想想其他方法。你可以试一试，如果使用1000000000作为你的程序的输入，你的程序是不是能在规定的上面规定的时限内运行出来。

本题另一个要值得注意的地方是答案的大小不在你的语言默认的整型(int)范围内，如果使用整型来保存结果，会导致结果错误。

如果你使用C++或C语言而且准备使用printf输出结果，则你的格式字符串应该写成%I64d以输出long long类型的整数。
~~~

~~~
#序列求和
def sum():
    n=int (input())
    return n*(n+1)/2
s=int(sum())
print(s)

~~~

## 十六进制转八进制

~~~
资源限制
时间限制：1.0s   内存限制：512.0MB
问题描述
　　给定n个十六进制正整数，输出它们对应的八进制数。

输入格式
　　输入的第一行为一个正整数n （1<=n<=10）。
　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。

输出格式
　　输出n行，每行为输入对应的八进制正整数。

　　【注意】
　　输入的十六进制数不会有前导0，比如012A。
　　输出的八进制数也不能有前导0。

样例输入
　　2
　　39
　　123ABC

样例输出
　　71
　　4435274

　　【提示】
　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
~~~

## 十进制转十六进制

~~~
n=int(input())
print(format(n,'X'))#x的大小写决定输出的大小写
~~~

## 特殊回文数

~~~
资源限制
时间限制：1.0s   内存限制：512.0MB
问题描述
　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
输入格式
　　输入一行，包含一个正整数n。
输出格式
　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
样例输入
52
样例输出
899998
989989
998899
数据规模和约定
　　1<=n<=54。
~~~

~~~
#回文数字
#判断是否回文函数
def is_pal(num):
    num=str(num )#强转为字符串
    if num == num[-1::-1]:
        return True
    else:
        return False
def sum_num(num):
    sum = 0
    num = str(num)
    for i in range(len(num)):
        sum += int(num[i])
    return sum

if __name__ == '__main__':
    n = int(input())
    for num in range(10000, 1000000):
        if is_pal(num) and sum_num(num) == n:
            print(num)     

~~~

## 1的个数

~~~
'''
问题描述
　　输入正整数n，判断从1到n之中，数字1一共要出现几次。例如1123这个数，则出现了两次1。例如15，那么从1到15之中，一共出现了8个1。
输入格式
　　一个正整数n
输出格式
　　一个整数，表示1出现的资料
样例输入
15
样例输出
8
'''
~~~

~~~
n = int(input())
ans = 0
for i in range(1, n+1):
    strn = str(i)
    ans += strn.count('1')
print(ans)
~~~

## 最小公倍数

```
'''
问题描述
　　编写一函数lcm，求两个正整数的最小公倍数。
样例输入
一个满足题目要求的输入范例。
例：

3 5
样例输出
15
'''
```

~~~
# 最小公倍数 lcm = a*b/gcd(a,b)
# gcd为最大公约数

def gcd(a,b):
    #辗转相除，最后输出不是零 的那个数即为最小公约数
    while b!=0:
        c=a%b
        a=b
        b=c
    return a
if __name__ == '__main__':
    a, b=map(int ,input().split())
    lcm=a*b/gcd(max(a,b),min(a,b))
    print(int(lcm))

~~~

## 时间显示

<img src="http://battle.wicp.io:9001/blog1/b7d4f90136614f7dbdaa5a65dad72202.png" alt="在这里插入图片描述" style="zoom: 80%;" />



~~~
#输入时间戳，输出当前的 时分秒
#接受参数
n = int (input())
n=n/1000#取到的是秒数
H=n//(60*60)

M=(n-H*3600)//60#当前的分钟数，应该减去时

s=n%60

#格式化输出
if(H>24):
    H=H%24
print('%.2d:%.2d:%.2d'%(H,M,s))

~~~

## 双向排序

![在这里插入图片描述](http://battle.wicp.io:9001/blog1/2606dd5e64b64143be25f55d296e1020.png)

~~~
#传入参数n个整数m次操作
#暴力，超时60分
def sheng(num,x):
    a=sorted(num[x-1:])
    num[x-1:]=a
    return num
def jiang(num,x):
    b = sorted(num[:x],reverse=True)
    num[:x]=b
    return num
n,m=map(int,input().split())
num=[i+1 for i in range(n)]
for i in range(m):
    p,q=map(int,input().split())
    if p == 0:
        num = jiang(num,q)
    else:
        num = sheng(num,q)
for i in range(n):
    print(num[i],end=' ')

~~~



## 砝码称重

 ![ ](http://battle.wicp.io:9001/blog1/c5c3825cfdca4d8a8dbcc45a396e89ec.png)



~~~
#砝码称重

# 最多有101个砝码，每个砝码的重量上限为100000
N = 101
M = 100001

# 使用二维列表存储结果，初始化为0
a = [[0] * M for _ in range(N)]

# 空砝码，作为起点，当防止第一个砝码时 ，想减会锁定到这个标志位，表示放一个砝码的时候
a[0][0] = 1

# 输入砝码数量
n = int(input())
# 存储每个砝码的重量
#w = [0] * (n + 1)
w = [0] + list(map(int, input().split()))
# 总重量的上限，用于检测循环上限
sum_weight = sum(w)

#print(sum_weight)



#动态转移，依次加减砝码尝试，每一次复制上一次的已经存在砝码in的状态
for i in range(1,1+n):
    for j in range(sum_weight+1):
        a[i][j]=a[i-1][j]+a[i-1][abs(j-w[i])]+a[i-1][j+w[i]]
#结束，a[n]中存储了所有的结果，若a[n][i]中不为零即表示可以被称出来，
        #至于是哪几个我们不必记录
result =0
for i in range(1,sum_weight+1):
    if a[n][i]:
        result+=1
print(result)

~~~

## 回文日期

 ![在这里插入图片描述](http://battle.wicp.io:9001/blog1/7f245f1724d54e209c895623e928ed96.png)



~~~
import datetime
#本题要分别判断是否为回文和ABABBABA型所以并不能嵌套而是该写
#为多个函数
def is_valid_date(date_str, format='%Y%m%d'):
    try:
        datetime.datetime.strptime(date_str, format)
        return True
    except ValueError:
        return False

def is_huiwen(n):
    if n == n[-1::-1]:
        #print(f"{n} 是一个回文日期")
        return True
    else:
        return False
def is_ABBA(n):
    if n == n[-1::-1]:
        if  n[:2]==n[2:4] and n[0]!=n[1]:
            return True
        else:
            return False
    return False
# 首先判断是否为合法日期
n = input()
# 注意这里不需要使用 str() 将输入转换为字符串

#创建一个日期对象
date_obj = datetime.datetime.strptime(n, "%Y%m%d")
date_obj=date_obj+datetime.timedelta(days=1)
huiwen="a"
ABAB="b"
# 将 datetime 对象转换为字符串
#date_str = date_obj.strftime("%Y%m%d")
while True:
    #首先判断这个日期，有可能同时是两种
    if huiwen=="a" and ABAB=="b":
        if is_huiwen(date_obj.strftime("%Y%m%d")) and is_ABBA(date_obj.strftime("%Y%m%d")):
            huiwen=date_obj.strftime("%Y%m%d")
            ABAB=date_obj.strftime("%Y%m%d")
            print(date_obj.strftime("%Y%m%d"))
            print(date_obj.strftime("%Y%m%d"))
            break
    #判断只是为回文
    if huiwen=="a":
        if is_huiwen(date_obj.strftime("%Y%m%d")) and not is_ABBA(date_obj.strftime("%Y%m%d")):
            print(date_obj.strftime("%Y%m%d"))
            huiwen=date_obj.strftime("%Y%m%d")
    if ABAB=="b":
        if is_ABBA(date_obj.strftime("%Y%m%d")):
            print(date_obj.strftime("%Y%m%d"))
            ABAB=date_obj.strftime("%Y%m%d")
            break
    date_obj=date_obj+datetime.timedelta(days=1)
~~~

### 语法记忆

#将 datetime 对象转换为字符串

```
date_str = date_obj.strftime("%Y%m%d")
```

```
#创建一个日期对象
date_obj = datetime.datetime.strptime(n, "%Y%m%d")

date_obj=date_obj+datetime.timedelta(days=1)
```

使用 `datetime.datetime.strptime()`，如下所示：

```
import datetime

date_str = "20200230"  # 一个不合法的日期字符串
try:
    date_obj = datetime.datetime.strptime(date_str, "%Y%m%d")
    print("转换成功：", date_obj)
except ValueError:
    print("日期字符串不合法：", date_str)
```

在这里，我们首先导入 `datetime` 模块，然后通过 `datetime.datetime.strptime()` 方法来调用 `strptime` 方法，将字符串解析为日期时间对象。





## 对称迷宫

描述

wlxsq有一个N*N的网格迷宫，每一个网格都有一个字母编号。

他要从左上角(1,1)出发，走到右下角(n,n)，由于wlxsq很懒，所以他每次只会往右或者往下走一格。
 由于最后到终点的路径方案太多太多了，所以wlxsq想让你计算出所有不同的对称的路径个数。
 例如:N = 3
 ABA
 BBB
 ABA
 对称路径6条：有ABABA(2条)、ABBBA(4条)
 不同的对称路径有: 有ABABA、ABBBA

输入
 第一行输入一个数NN，表示迷宫的大小。
 接下来输入N*N的字母迷宫

输出
 输出对称路径的数量

样例
 3
 ABA
 BBB
 ABA

输出
 2

提示
 【评测用例规模与约定】
 对于40%40%的数据，2<=N<=112<=N<=11

对于100%100%的数据，2<=N<=182<=N<=18

### 思路

在这一种题一般先整体深搜一便保存所有路径，然后再判断是不是对称路径，然后再进行判重，但是这是一种完全暴力的方法，这样不仅会超时，还会爆内存，逼近最大的图是18路劲大概有2^18次方条。
 尽可能的优化它，于是有了第二种思路。
 搜索两遍，第一遍从1,1位置搜索，第二遍从n,n位置搜索，分别保存路径和末尾点，然后再比对末尾点是否相同，路径是否相同，这里的路劲也是一个非常庞大的数据，而且加上判重，优化不好也会超时。
 对于数字的判重可以用一个visit数组判断，对于路径呢，用map来判断。



两次递归都只递归一般的路径，也就是到n+1截止，最后将两个存好的字符串数组进行比较即可，第一次递归我们进行记录x的下标，

~~~
from collections import defaultdict

dx=[1,0,-1,0]
dy=[0,1,0,-1]

dic=defaultdict(int)
n=int(input())
#正向遍历
def dfs1(x,y,step,path):   
    if x+y==n-1:
        dic[path]=1
        vis[x][path]=1
        return
    
    for i in range(0,2):
        if x+dx[i]<n and x+dx[i]>=0 and y+dy[i]<n and y+dy[i]>=0 :
            dfs1(x+dx[i],y+dy[i],step+1,path+mp[x+dx[i]][y+dy[i]])
        
ans=int(0)
#反向遍历
def dfs2(x,y,step,path):
    global ans
    
    if x+y==n-1:
        if dic[path]==1 and vis[x][path]==1 :
            ans+=1
            dic[path]=0
        return
    
    for i in range(2,4):
        if x+dx[i]<n and x+dx[i]>=0 and y+dy[i]<n and y+dy[i]>=0 :
            dfs2(x+dx[i],y+dy[i],step+1,path+mp[x+dx[i]][y+dy[i]])      

mp=[str("") for i in range(n)]
vis=[defaultdict(int) for j in range(n)]
for i in range(0,n):
    mp[i]=input()

dfs1(0,0,1,""+mp[0][0])
dfs2(n-1,n-1,1,""+mp[n-1][n-1])
print(ans)

~~~

## 不同的非空子串

（1）一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成 的串。例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共 7 个。 注意在计算时，只算本质不同的串的个数。 请问，字符串0100110001010001 有多少个不同的非空子串？

~~~
##不同的字串
#创建字串
str ="0100110001010001"
sub =[]
for i in range(len(str)+1):
    for j in range(i+1,len(str)+1):
        if str[i:j] not in sub :
            sub.append(str[i:j])
print(len(sub))

~~~

##  2019 分解

把 2019 分解成 3 个各不相同的正整数之和，并且要求每个正整数都不包 含数字 2 和 4，一共有多少种不同的分解方法？ 注意交换 3 个整数的顺序被视为同一种方法，例如 1000+1001+18 和 1001+1000+18 被视为同一种。

~~~
#分解2019为三个正整数
#要求整数中不含有2和4,求解法个数
#定义一个检查函数，含有则直接返回False
tmp =0

def check(n):
    for i in str(n):
        if i =='2' or i== '4':
            return False
    return True
for i in range(1,2018):
    for j in range(i+1,2018):
        k=2019-i-j
        #这里设置k>j，是为了防止重复计算比如
        #已经计算了1 1 2017  当遍历到1 2017 1时已经不算 了
        if k>j and check(i) and check(j) and check(k):
            tmp=tmp+1
print(tmp)

~~~

## 年号字串

小明用字母 A 对应数字1，B 对应2，以此类推，用 Z 对应26。对于27以上的数字，小明用两位或更长位的字符串来对应，例如AA 对应 27，AB 对应28，AZ 对应52，LQ 对 329。

请问2019 对应的字符串是什么？

~~~
str1 ='ABCDEFGHIJKLMNOPQRSTUVWXYZ'

yu=[]
num =2019
while num >=26:
    yu.append(num%26)
    #int型除法，不留余数
    num =num//26
#while终止的时候，还有个位没有加上
yu.append(num)
print(yu)

for i in yu[::-1]:
    print(str1[i-1],end='')

    

~~~

## 报时助手

![在这里插入图片描述](http://battle.wicp.io:9001/blog1/202403081916334.png)

~~~
time={'0':'zero','1':'one','2':'two','3':'three','4':'four','5':'five'
      ,'6':'six','7':'sever','8':'eight','9':'nine','10':'ten',
      '11':'eleven','12':'twelve','13':'thirteen','14':'fourteen',
      '15':'fifteen','16':'sixteen','17':'seventeen','18':'eighteen',
      '19':'ninteen','20':'twenty','30':'thirty','40':'forty','50':'fifty'}
h,m=input().split()
hour=time[h]
if int(m)>20:
    a=int(m)//10*10   #表示十位数*10
    b=int(m)%10       #表示个位数
    c=time[str(a)]
    d=time[str(b)]
    print(hour,c,d,end='')
else:
    c=time[m]
    print(hour,c,end='')

~~~

## 质因数个数

  ![在这里插入图片描述](http://battle.wicp.io:9001/blog1/202403101648460.png)

~~~
#分解质数因子
#判断是否为质数
def zhishu(n):
	
~~~

## 矩阵拼接 

 <img src="http://battle.wicp.io:9001/blog1/202403101718869.png" alt="在这里插入图片描述" style="zoom:67%;" />

#### **输入格式**

输入包含多组数据。

第一行包含一个整数 T*T*, 代表数据组数。

以下 T*T* 行, 每行包含 6 个整数 a_{1}, b_{1}, a_{2}, b_{2}, a_{3}, b_{3}*a*1,*b*1,*a*2,*b*2,*a*3,*b*3, 其中 a_{1}, b_{1}*a*1,*b*1 是第一个矩 形的边长, a_{2}, b_{2}*a*2,*b*2 是第二个矩形的边长, a_{3}, b_{3}*a*3,*b*3 是第三个矩形的边长。

#### **输出格式**

对于每组数据, 输出一个整数代表答案

## 技能升级 【二分】

 ![在这里插入图片描述](http://battle.wicp.io:9001/blog1/202403101823855.png)

### 思路1(50分)【优先队列】

利用优先队列来模拟每次升级的操作。

~~~
import heapq as hq
n, m = map(int, input().split())
queue = []
for _ in range(n):
    a, b = map(int, input().split())
    queue.append([-a, b])
 
ans = 0
hq.heapify(queue)
while m:
    # print(queue)
    m -= 1
    a, b = hq.heappop(queue)
    ans += -a
    #当满足次数，也就是不够减的时候，不再加入队列
    if -a - b >= b:
        hq.heappush(queue, [a + b, b])
print(ans)

~~~

优先队列类似解O(nm)

~~~
def shengji(arr,n,summ):
    maxx=0
    manin=-1
    for i in range(0,n,1):
        if arr[i][0]>maxx:
            maxx=arr[i][0]
            maxin=i
    if maxx>0:
        summ+=maxx
        arr[maxin][0]-=arr[maxin][1]
    return summ

if __name__=='__main__':
    n,m=input().split()
    n=int(n)
    m=int(m)
    summ=0
    arr=[[0 for i in range(2)]for j in range(n)]
    for i in range(0,n,1):
        arr[i]=[int(i) for i in input().split()]
        arr[i][0]=int(arr[i][0])
        arr[i][1]=int(arr[i][1])
    for i in range(0,m,1):
        summ=shengji(arr,n,summ)
    print(summ)


~~~





### 思路2(100分)【二分】

二分所有的升级可能，例如本题例子：10,9,8,7,7,6,5,5,5,4,3,3,2,1,1
 设f(t) =  m，表示大于等于t的个数为m，当x<y时肯定满足f(x)>=f(y),  而f(x)>=m,时，x-1也满足，但x+1不一定满足。满足二分的情况，二分去找满足的t，找到t，我们再用等差数列去求每个技能大于等于t的和。同时记录大于等于t的个数，如果超过m，则减去超过的攻击力。

~~~
#include<cstdio>
#include<iostream>
#include<algorithm>
#include<cstring>
#include<map>
#include<queue>
#include<vector>
#include<cmath>
using namespace std;
const int N=1e5+10;
typedef long long ll;
ll a[N],b[N];
int n,m;
bool check(ll x)
{
	ll cnt=0;
	x++;//至少要等于x+1的攻击力才能使用该技能
	for(int i=1;i<=n;i++)
	{
		if(a[i]<x) continue;
		ll times=(a[i]-x)/b[i]+1;
		cnt+=times;
		if(cnt>m) return false;//剪枝 
	}
	return true;
}
int main()
{
	cin>>n>>m;
	for(int i=1;i<=n;i++)
		scanf("%lld%lld",&a[i],&b[i]);
	ll l=0,r=1e6;
	while(l<r)
	{
		ll mid=l+r>>1;//本次增加的攻击力是要大于mid的 
		if(check(mid))
			r=mid;
		else l=mid+1;
	}
	ll ans=0;
	int cnt=0;//使用增加攻击力大于l的技能次数 
	for(int i=1;i<=n;i++)
	{
		if(a[i]<=l) continue;
		ll times=(a[i]-(l+1))/b[i]+1;
		cnt+=times;
		ans+=(a[i]+a[i]-(times-1)*b[i])*times/2;
	} 
	ans+=(m-cnt)*l;
	printf("%lld\n",ans);
	return 0;
} 
~~~

## 因数平方和

 ![在这里插入图片描述](http://battle.wicp.io:9001/blog1/202403111309956.png)

### 简单暴力低分

~~~
def yinshu(i):
    fi=0
    for j in range(1,i//2+2,1):
        if i%j==0:
            m=i//j
            if m>=j:
                if m!=j:
                    a=j**2+m**2
                else:
                    a=j**2
                fi+=a
    return fi

if __name__=='__main__':
    n=int(input())
    gn=0
    for i in range(1,n+1,1):
        fi=yinshu(i)
        print(fi)
        gn+=fi
    #print(gn)
    da=gn%(10**9+7)
    print(da)

~~~

### 分块逆元

#### 思路

![image-20240311131057342](http://battle.wicp.io:9001/blog1/202403111311673.png)

我们在求i²的前缀和时要注意用[逆元](https://zhuanlan.zhihu.com/p/100587745)来求，不能去除以6，因为分子在进行取mod运算过后不一定是6的倍数。

### 代码

```python
# a * 6 % (10 ** 7) == 1

mod = 10 ** 9 + 7
inv6 = (mod + 1) // 6  # 6在1e9+7下的逆元
n = int(input())
res = 0  # 答案
r_sum = l_sum = 0
l = r = 1  # 块的左端点和右端点
while l <= n:
    r = n // (n // l)
    l_sum = r_sum
    r_sum = r * (r + 1) % mod * (2 * r + 1) % mod * inv6 % mod  # 这里就是在计算i²的前r项和
    cur_sum = (r_sum - l_sum + mod) % mod  # 由于是取余过后的结果所以r_sum不一定比l_sum大，所以要加上mod
    res = (res + (n // l) % mod * cur_sum % mod) % mod
    l = r + 1  # 更新为下一个块的左端点
print(res)
```

## 2023 100🏆

**【问题描述】**

​    请求出在 12345678 至 98765432 中，有多少个数中完全不包含 2023 。

​    完全不包含 2023 是指无论将这个数的哪些数位移除都不能得到 2023 。

​    例如 20322175，33220022 都完全不包含 2023，而 20230415，20193213 则 含有 2023 (后者取第 1, 2, 6, 8 个数位) 。

**【解析及代码】**

数据规模也才 1e9 左右，[暴力枚举](https://so.csdn.net/so/search?q=暴力枚举&spm=1001.2101.3001.7020)就完了

利用 re 库的正则表达式进行匹配，非常方便，答案：85959030

```python
import re
pat = re.compile(r'\d*'.join('2023'))
nums = range(12345678, 98765432 + 1)
print(sum(not re.search(pat, i) for i in map(str, nums)))
```

## 灭鼠先锋

### 题目描述

灭鼠先锋是一个老少咸宜的棋盘小游戏，由两人参与，轮流操作。

灭鼠先锋的棋盘有各种规格，本题中游戏在两行四列的棋盘上进行。游戏的规则为：两人轮流操作，每次可选择在棋盘的一个空位上放置一个棋子，或在同一行的连续两个空位上各放置一个棋子，放下棋子后使棋盘放满的一方输掉游戏。

小蓝和小乔一起玩游戏，小蓝先手，小乔后手。小蓝可以放置棋子的方法很多，通过旋转和翻转可以对应如下四种情况：

> XOOO XXOO OXOO OXXO
> OOOO OOOO OOOO OOOO

其中 O 表示棋盘上的一个方格为空，X 表示该方格已经放置了棋子。
 请问，对于以上四种情况，如果小蓝和小乔都是按照对自己最优的策略来玩游戏，小蓝是否能获胜。如果获胜，请用 V 表示，否则用 L 表示。请将四种情况的胜负结果按顺序连接在一起提交。

### 思路

1.首先看第二个棋盘，小乔下在第一行的第三四个，小蓝必输

2.其次看第四个棋盘，首先排除小乔第一步下在第一行，否则小蓝下次将下在第一行，第二行小乔先下必输。
 所以小乔第一步只能下在第二行，只有下面四种状态： （需要自己去枚举一下状态）
 第一种：下在第二行的第一个或第四个，枚举一下剩下的情况，是小蓝赢
 第二种：下在第二行的第二个或第三个。。。。。。是小蓝赢
 第三种：下在第一二个或第三四个。。。。是小蓝赢
 第四个：下在第二三个。。。是小蓝赢
 3.然后看第三个棋盘，我们已知，第四个是小蓝赢的情况，那小乔下一个棋（第一行第三列）和第四个棋盘一样，那么就是小乔赢，小乔输。
 4.最后来看第一个棋盘，小乔下在第一行第三个，有下面几种情况：
 第一种：小蓝下一个，则小乔下两个，此后小蓝必输
 第二种：小蓝下两个，则小乔下第二行的其中一个，则此后小蓝必输。

```python
print("LLLV")
```

## **大题3：消除游戏**

**问题描述：**在一个字符串 S 中，如果 S i = S i−1 且 S i , S i+1 ，则称 S i 和 S i+1 为边缘 字符。如果 S i , S i−1 且 S i = S i+1，则 S i−1 和 S i 也称为边缘字符。其它的字符 都不是边缘字符。 对于一个给定的串 S，一次操作可以一次性删除该串中的所有边缘字符 （操作后可能产生新的边缘字符）。 请问经过 2 64  次操作后，字符串 S 变成了怎样的字符串，如果结果为空则 输出 EMPTY。

![img](http://battle.wicp.io:9001/blog1/202403111431812.png)



~~~python
#消除游戏
strings=input()
need=''
list1=[0 for i in range(len(strings))]
#print(list1)
if len(strings)<=2:
    print(strings)
else:
    for j in range(1,2**18):
        if len(strings)==1:
            print(strings)
            break
        for i in range(len(strings)):
            #边缘特殊情况
            if i==0:
                if strings[i]==strings[i+1]:
                    list1[i]=1
            if i==len(strings)-1:
                if strings[i]==strings[i-1]:
                    list1[i]==1
            else:
            #print(strings[i-1],strings[i],strings[i+1])
                if strings[i]==strings[i-1] and strings[i]!=strings[i+1]:
                    list1[i]=list1[i+1]=1
                if strings[i]!=strings[i-1] and strings[i]==strings[i+1]:
                    list1[i]=list1[i-1]=1
        need=strings
        strings=""
        for i in range(len(list1)):
          if list1[i]==0:
            strings+=need[i]
        list1=[0 for i in range(len(strings))]
    if strings=="":
        print('EMPTY')
    else:
        if len(strings)>=2:
            print(strings)
~~~

## F:爬树的甲壳虫

 **问题描述：有一只甲壳虫想要爬上一颗高度为 n 的树，它一开始位于树根，高度为 0， 当它尝试从高度 i − 1 爬到高度为 i 的位置时有 Pi 的概率会掉回树根，求它从 树根爬到树顶时，经过的时间的期望值是多少**

 <img src="http://battle.wicp.io:9001/blog1/202403131014299.png" alt="img" style="zoom: 67%;" />

做不来，放弃

## **大题7：**扫描游戏

**问题描述：有一根围绕原点 O 顺时针旋转的棒  OA，初始时指向正上方（Y 轴正向）。 在平面中有若干物件，第 i 个物件的坐标为 (xi , yi) ，价值为 zi。当棒扫到某个  物件时，棒的长度会瞬间增长 zi，且物件瞬间消失（棒的顶端恰好碰到物件也 视为扫到），如果此时增长完的棒又额外碰到了其他物件，也按上述方式消去  （它和上述那个点视为同时消失）。 如果将物件按照消失的时间排序，则每个物件有一个排名，同时消失的物  件排名相同，请输出每个物件的排名，如果物件永远不会消失则输出 −1**

![img](https://img-blog.csdnimg.cn/8dd62f9739ba4b8a9944ace62e45bf9c.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAY29hc3Rfcw==,size_20,color_FFFFFF,t_70,g_se,x_16)

![img](https://img-blog.csdnimg.cn/bfefa308bac84caba5f534974c9afa8a.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAY29hc3Rfcw==,size_20,color_FFFFFF,t_70,g_se,x_16)

~~~
#
~~~

## 求和



![在这里插入图片描述](https://img-blog.csdnimg.cn/f8dc6667585a4f269e89a99ac16f9782.png?x-oss-process=image/watermark,type_d3F5LXplbmhlaQ,shadow_50,text_Q1NETiBAaGVzb3JjaGVu,size_20,color_FFFFFF,t_70,g_se,x_16)

**预计得分100%**

思路：维护一个前缀                                   s                         u                         m                              sum                  sum即可。

**总时间复杂度             O(n)**

参考代码：



~~~python
#每新增加一个数，就会跟旧的每一个数相乘再求和
#那么我们就维护一个sum存储n-1的和，和新加入的数相乘即可
def solve():
    n=int(input())
    a= list(map(int,input().split()))
    print(a)
    ans=0
    sum_val=0
    for i in range(n):
        ans+=sum_val*a[i]
        sum_val+=a[i]
    print(ans)
solve()

~~~



```cpp
#include <bits/stdc++.h>
using namespace std;

const int N = 2e5 + 5;

int a[N];

void solve()
{
    int n;
    scanf("%d", &n);
    long long ans = 0, sum = 0;
    for (int i = 1; i <= n; i++)
    {
        scanf("%d", &a[i]);
        ans += sum * a[i];
        sum += a[i];
    }
    cout << ans << endl;
}
int main()
{
    solve();
    return 0;
}
```

## 工作时长      

 ![image-20240315162240489](http://battle.wicp.io:9001/blog1/202403151622565.png)



文件查看https://labfile.oss.aliyuncs.com/courses/21074/records.txt



~~~
# 请在此输入您的代码
# 存储时间的列表
time_list=[]
# 这个模板代码要记住 很简单并不是很复杂
# 打开文件 "12.txt"，以只读方式读取，使用 "with" 语句保证文件在使用后自动关闭


#time_list[]
with open("12.txt","r") as f:
	for time in  f.readlines():
		time_list.append(time .strip())  #移除字符串首尾字符

#字符串转时间格式
tran_time =[]
for time in time_list:
	#对每一个字字符进行转换
	trans_time.append(datetime.strptinme(time,"%Y-%m-%d %H:%M:%S"))
#全部转换成秒
s_list=[]
for time in trans_time:
	s_list.append(time.timestamp())   #时间戳
#进行升序排序

s_list.sort()

sums=0

for i in range(1,521,2):
	sums+=(s_list[i]-s_list[i-1])
print(int (sums))


~~~



## 分糖果

### 问题描述

两种糖果分别有 99 个和 1616 个，要全部分给 77 个小朋友，每个小朋友得到的糖果总数最少为 22 个最多为 55 个，问有多少种不同的分法。糖果必须全部分完。

只要有其中一个小朋友在两种方案中分到的糖果不完全相同，这两种方案就算作不同的方案。

### 答案提交

这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。

### 运行限制

- 最大运行时间：1s 
- 最大运行内存: 256M

~~~
#n,m课糖果，depth个人
ans=0
def dfs(depth,n,m):
  if depth==7:
    if n==0 and m==0:
        ans+=1
    return
  # if n+m==0:
  #   return
  for i in range(n+1):
    for j in range(m+1):
      if 2<=i+j<=5 and i<=n and j<=m:
        dfs(depth+1,n-i,m-j)
dfs(0,9,16)
print(ans)
~~~

## 填充      

问题描述

有一个长度为 n 的 0101 串，其中有一些位置标记为 ?，这些位置上可以任意填充 0 或者 1，请问如何填充这些位置使得这个 01 串中出现互不重叠的 00 和 11 子串最多，输出子串个数。

输入格式

输入一行包含一个字符串。

输出格式

输出一行包含一个整数表示答案。

样例输入

```text
1110?0
```

样例输出

```text
2
```

样例说明

如果在问号处填 0 ，则最多出现一个 00 和一个 111000。

评测用例规模与约定

对于所有评测用例，1≤n≤106 



~~~
import os
import sys

s=input()
n=len(s)
judge=['00','11','0?','1?','?0','?1','??']
ans=0
i=1
while i<n:
  if s[i-1:i+1] in judge:
    ans+=1
    #步长为二应该不可重叠000，只算一次
    i+=2
  else:
    #这里是出现01和10的情况说明绝不会记录
    i+=1
print(ans)

~~~

~~~
import os
import sys

s=input()
n=len(s)
'''
judge=['00','11','0?','1?','?0','?1','??']
ans=0
i=1
while i<n:
  if s[i-1:i+1] in judge:
    ans+=1
    i+=2
  else:
    i+=1
print(ans)
'''
f=[0]*n
for i in range(1,n):
  if s[i]==s[i-1] or s[i]=='?' or s[i-1]=='?':
    f[i]=f[i-2]+1
  else:
    f[i]=f[i-1]
print(f[-1])

~~~



## 互质数的个数

~~~
/*<p>【问题描述】<br>不超过19000的正整数中，与19000互质的数的个数是多少？<br>
【答案提交】<br>这是一道结果填空的题，你只需要算出结果后提交即可。
本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。<br><br><br></p>*/ 
int gcd(int a,int b)
{
	return a%b?gcd(b,a%b):b;
}
#include<stdio.h>
int main()
{
	int n=0,m=0;
	for(int n=1;n<=19000;n++)
	{
		if(gcd(19000,n)==1&&19000%n!=0)
		{
			m++;
		}
	}
	printf("%d",m);
}


7199

~~~

## 2020C 跑步



datetime库的使用

```
from datetime import *
start=date(2000,1,1)
end=date(2020,10,2)
gap=timedelta(days=1)
#用于表示两个日期或时间之间的差异。它提供了一种方便的方式来进行日期和时间的加减运算，
# 并可以以天、秒、微秒等不同的单位来表示时间间隔。
ans=0
while start!=end:
    if start.weekday()==0 or start.day==1:
        ans+=2
    else:
        ans+=1
    start+=gap
print(ans)
```



## 阶乘的和



>思路 ： 考虑这个问题： 式: x! + y! + k!,(x < y < k) 的最大公因数是否一定是x！？ 假设不是x！，而是y！，则原式 = y! × \times ×( x !   y ! \frac {x!~}{y!} y!x!  + 1 + k ! y ! \frac {k!}{y!} y!k!)。易得， x !   y ! \frac {x!~}{y!} y!x!  为小数，1 + k ! y ! \frac {k!}{y!} y!k!为整数，所以y！一定不是最大公因数。最大公因数只能为x！。
>继续观察样例： 2！+ 2！+ 2！的最大公因数为 3！,显然（x + 1） × \times × x! = (x + 1) ! 。所以我们只需要不断更新最小的x！，最后无法变得更大的x！，就是答案。

 ![image-20240321143200956](http://battle.wicp.io:9001/blog1/202403211432017.png)

~~~
import os
import sys

from collections import defaultdict
import os
import sys

n = int(input())
a = list(map(int, input().split()))
a.sort()
Map = defaultdict(int)

for i in a:
    Map[i] += 1

m = a[0]  # 最开始一定可以合成
while True:
    x = Map[m]
    if x % (m + 1) == 0:
        Map[m + 1] += x // (m + 1)
        m += 1
    else:
        break

print(m)
~~~

### 语法

~~~python
#关于dict字典的使用
#默认的字典是无法搜索一个不存在的键值对的 
#尝试引入一个
from collections import defaultdict

Map= defaultdict(int)
#现在就可以随意使用了
~~~

## 求素数--埃拉托斯特尼筛法

埃拉托斯特尼筛法（sieve of Eratosthenes ）用来找出一定范围（n）内的所有[质数](https://so.csdn.net/so/search?q=质数&spm=1001.2101.3001.7020)。其方法是从 2 开始，在 sqrt(n) 以内，将每个质数的倍数剔除掉，剩下的就是所求范围的质数。例如找 100 以内的质数，先把 2 的倍数筛掉（保留  2），再把 3 的倍数筛掉（保留 3），如此重复下去，直到 7 的倍数被筛掉（因为下一个质数 11 已经大于sqrt(100)，剩下的就是  100 以内的质数。

![在这里插入图片描述](https://img-blog.csdnimg.cn/e38beccabf7846bab4a926b674efece8.gif#pic_center)

## 公因数匹配      

 ![image-20240322152853721](http://battle.wicp.io:9001/blog1/202403221528780.png)

利用埃拉托斯特尼筛法生成小于等于最大值的质数，然后遍历数组中的每个元素，找到其最小公因数的位置，更新结果。这样，就能在较短的时间内找到符合条件的索引。

```python
import math

def sieve_of_eratosthenes(limit):
    primes = []
    is_prime = [True] * (limit + 1)
    is_prime[0] = is_prime[1] = False

    for i in range(2, int(math.sqrt(limit)) + 1):
        if is_prime[i]:
            primes.append(i)
            for j in range(i * i, limit + 1, i):
                is_prime[j] = False

    return primes

def main():
    n = int(input())
    numbers = list(map(int, input().split()))

    max_number = max(numbers)
    primes = sieve_of_eratosthenes(max_number)

    pos = [0] * (max_number + 1)
    ansi, ansj = n + 1, -1

    for i, x in enumerate(numbers, start=1):
        l = n + 1

        for prime in primes:
            if prime > x:
                break
            if x % prime == 0:
                while x % prime == 0:
                    x //= prime
                if pos[prime]:
                    l = min(l, pos[prime])
                else:
                    pos[prime] = i

        if x > 1:
            if pos[x]:
                l = min(l, pos[x])
            else:
                pos[x] = i

        if l < ansi:
            ansi = l
            ansj = i

    print(ansi, ansj)

if __name__ == "__main__":
    main()
```

## 子树的大小

![image-20240324103856378](http://battle.wicp.io:9001/blog1/202403241038443.png)

k*m等于k节点的子树的倒数第二个孩子的编号

 ![image-20240324103756134](http://battle.wicp.io:9001/blog1/202403241037232.png)



这里包含了自己本身

~~~
import os
import sys

t = int(input())

for _ in range(t):
    # 第k个结点的子节点范围为[k*m-m+2,k*m+1]
    n,m,k = map(int,input().split())
    l=k   # 表示子节点的左端点 
    r=k   # 表示子节点的右端点
    ans = 1   # 记录总的结点的数量
    res = 1   # 记录每一层子结点的数量
    while r*m+1 <=n:  # 如果子节点最右端小于n  说明没到尽头
        res *= m      # 计算出这一层的所有子节点数目
        l = l*m-m+2   # 更新左端点
        r = r*m+1     # 更新右端点
        ans +=res     # 更新总端点数目
    l=l*m-m+2 # 最后一层最左端点
    ans+=max(0,n-l+1)  # 最后一层最右端点就是n，直接用n-l+1计算出这层的结点数量
    print(ans)

~~~



## 字符串的修改

时间限制：
1s

内存限制：
128MB

题目描述：
设A和B是两个字符串。我们要用最少的字符操作次数，将字符串A转换为字符串B。这里所说的字符操作共有三种：

    删除一个字符；
    插入一个字符；
    将一个字符改为另一个字符。

对任给的两个字符串 A 和 B，计算出将字符串 A 变换为字符串 B 所用的最少字符操作次数。

输入描述：
第一行为字符串 A；第二行为字符串 B；字符串 A 和 B 的长度均小于 200。

输出描述：
只有一个正整数，为最少字符操作次数。

样例输入：

    sfdxbqw
    gfdgw

样例输出：
~~~
4
~~~

### 思路

    求解两字符串的最长公共子序列，得到其长度 L；
    计算最少字符操作次数

本题思路的核心在于 **求解两个字符串的最长公共子序列。**
可以选择用循环暴力求解，但是时间复杂度过高，容易超时。因此我们这里可以选用时间复杂度更低的动态规划方法：

    dp[i][j] 表示 a[:i-1] 和 b[:j-1] 的最长公共子序列的长度 i>0, j>0，对应 dp 数组的大小为 dp[l1+1][l2+1]，l1 和 l2 为两个字符串的长度；
    i=0 或 j=0 表示空字符串，此时公共子序列长度都为 0，因此我们将 dp 数组都初始化为 0；
    状态转移具体见代码。

而对于计算最终结果，其计算方式为：max(l1, l2) - L。
因为，如果想将较长的字符串变为较短的字符串，除了最长公共子序列，其余字符都需要变化。

~~~
a = input()
b = input()
l1 = len(a)
l2 = len(b)
# dp数组,
# dp[i][j]表示a[:i-1]和b[:j-1]中最长公共子序列的长度(i>0, j>0)
# i=0 和 j=0 表示空字符串，初始化dp数组为全0
dp = [[0 for j in range(l2 + 1)] for i in range(l1 + 1)]

#有点类似于在进行串匹配
for i in range(1, l1+1):
    for j in range(1, l2+1):
        if a[i-1] == b[j-1]:
			# a的第i-1个字符和b的第j-1个字符相同
            dp[i][j] = dp[i-1][j-1] + 1
        else:
            dp[i][j] = max(dp[i-1][j], dp[i][j-1])
#如果不相等则存储当前最大的值，最后的dp数组中必然为最大子序列的长度
res = max(l1, l2) - dp[-1][-1]
print(res)

~~~



## 1007 素数对猜想

让我们定义dn为：dn=pn+1−pn，其中pi是第i个素数。显然有d1=1，且对于n>1有dn是偶数。“素数对猜想”认为“存在无穷多对相邻且差为2的素数”。

现给定任意正整数`N`(<105)，请计算不超过`N`的满足猜想的素数对的个数。

输入格式:

输入在一行给出正整数`N`。

输出格式:

在一行中输出不超过`N`的满足猜想的素数对的个数。

### 输入样例:

```in
20
```

### 输出样例:

```out
4
```

### 思路

首先肯定是需要是素数，那使用线性筛先把素数筛选出来，进行暴力比较差值为2的素数对

~~~
# 定义一个素数筛
def SieveOfEratosthenes(n):
    prime = [True for i in range(n + 1)]
    p = 2
    while (p * p <= n):
        if prime[p] == True:
            for i in range(p * 2, n + 1, p):
                prime[i] = False
        p += 1
    return prime


# 素数对猜想
def PrimePair(n):
    global count
    prime = SieveOfEratosthenes(n)
    for i in range(2, n - 1):
        if prime[i] and prime[i + 2]:
            # print(i, i + 2)
            # 设置一个变量进行计数
            count += 1


if __name__ == '__main__':
    # 输入一个整数
    n = int(input())
    # 设置一个变量进行计数
    count = 0
    # 调用函数
    PrimePair(n)
    # 输出结果
    print(count)

~~~

## 正则问题

### 题目描述：

考虑一种简单的正则表达式：
只由 x ( ) | 组成的正则表达式。
小明想求出这个正则表达式能接受的最长字符串的长度。

例如：((xx|xxx)x|(x|xx))xx 能接受的最长字符串是： xxxxxx，长度是 6。

输入描述：
一个由 x()| 组成的正则表达式。输入长度不超过 100，保证合法。

输出描述：
这个正则表达式能接受的最长字符串的长度。

样例输入：
((xx|xxx)x|(x|xx))xx

样例输出：
6

### 思路

dfs，进行递归寻找最优的结果

~~~

# 例如：((xx|xxx)x|(x|xx))xx 能接受的最长字符串是： xxxxxx，长度是 6。

#
# s = '((xx|xxx)x|(x|xx))xx'
# i = 0
# floor = 0
#
#
# def dfs():
#     global floor, i
#     print(f'此时: i = {i}')
#     floor += 1
#     print(f'进入一层，此时的层数为 {floor}')
#     res = 0
#     while i < len(s):
#         if s[i] == '(':
#             floor += 1
#             i += 1
#             res += dfs()
#             i += 1  # 跳过）,继续加下一个括号的内容
#         elif s[i] == ')':
#             floor -= 1
#             return res
#         elif s[i] == 'x':
#             i += 1
#             res += 1
#         elif s[i] == '|':
#             i += 1
#             res = max(res, dfs())
#     return res
#
#
# dfs()
s = list(input().strip())
i = 0


def dfs():
    global i
    res = 0
    while i < len(s):
        # 遇到 '('，递归调用函数，对接下的 'x' 计数
        if s[i] == '(':
            i += 1
            res += dfs()
            i += 1
        # 遇到 ')'，返回计数结果
        elif s[i] == ')':
            return res
        # 遇到 'x'，计数+1，索引后移
        elif s[i] == 'x':
            i += 1
            res += 1
        # 遇到 '|'，返回左右两边的较大值
        elif s[i] == '|':
            i += 1
            res = max(res, dfs())
    return res


print(dfs())

~~~



## 成绩统计

### 问题描述:

编写一个程序，建立一个字典，每个字典包含姓名、学号、英语成绩、数学成绩和C++成绩，并通过字典操作平均分最高的学生和平均分最低的学生并且输出。
输入格式：
输入n+1行，第一行输入一个正整数n，表示学生数量；接下来的n行每行输入5个数据，分别表示姓名、学号、英语成绩、数学成绩和C++成绩。注意成绩有可能会有小数。
输出格式：
输出两行，第一行输出平均成绩最高的学生姓名。第二行输出平均成绩最低的学生姓名。
样例输入
2
yx1 1 45 67 87
yx2 2 88 90 99
样例输出：
yx2
yx1

### 思路：

使用一个字典的数组，元素为字典，存储对应的列信息

~~~
list_dict = [{} for i in range(100)]
maxx, minn = 0, 301
maxs, mins = "", ""
summ = 0
num = int(input())
for i in range(0, num):
    list_dict[i]["xm"], list_dict[i]["xh"], list_dict[i]["yy"], list_dict[i]["sx"], list_dict[i]["cpp"] = input().split()
for j in range(0, num):
    summ = float(list_dict[j]["yy"]) + float(list_dict[j]["sx"]) + float(list_dict[j]["cpp"])
    if summ >= maxx:
        maxx = summ
        maxs = list_dict[j]["xm"]
    if summ < minn:
        minn = summ
        mins = list_dict[j]["xm"]
print(maxs)
print(mins)
~~~

## 大衍数列

中国古代文献中，曾记载过“大衍数列”, 主要用于解释中国传统文化中的太极衍生原理。
 它的前几项是：0、2、4、8、12、18、24、32、40、50 …
 其规律是：对偶数项，是序号平方再除2，奇数项，是序号平方减1再除2。
 以下的代码打印出了大衍数列的前 100 项。

~~~
for i in range(1, 101):
    if i % 2 == 0:
        print("%d " % int((i**2) / 2))
    else:
        print("%d " % int((i**2 - 1) / 2))
~~~

## 蚂蚁感冒

**题目描述：**
 长 `100` 厘米的细长直杆子上有 `n` 只蚂蚁。它们的头有的朝左，有的朝右。
 每只蚂蚁都只能沿着杆子向前爬，速度是 `1` 厘米/秒。
 当两只蚂蚁碰面时，它们会同时掉头往相反的方向爬行。
 这些蚂蚁中，有 `1` 只蚂蚁感冒了。并且在和其它蚂蚁碰面时，会把感冒传染给碰到的蚂蚁。
 请你计算，当所有蚂蚁都爬离杆子时，有多少只蚂蚁患上了感冒。

**输入描述：**
 第一行输入一个整数 `n(1 < n < 50)`, 表示蚂蚁的总数。
 接着的一行是n个用空格分开的整数 `Xi(-100 < Xi < 100)`, `Xi`的绝对值，表示蚂蚁离开杆子左边端点的距离。正值表示头朝右，负值表示头朝左，数据中不会出现 `0` 值，也不会出现两只蚂蚁占用同一位置。其中，第一个数据代表的蚂蚁感冒了。

**输出描述：**
 要求输出 `1` 个整数，表示最后感冒蚂蚁的数目。

**样例输入：**

```
5
-10 8 -20 12 25
12
```

**样例输出：**
 `3`

------

 **解题思路** 

 首先我们要计算两个值：`left` 和 `right`：
 `left` 表示第一只感冒蚂蚁的左侧, 头向右蚂蚁的数量
 `right` 表示第一只感冒蚂蚁的右侧, 头向左蚂蚁的数量

其次，我们经过分析得到，感冒要传染，只能通过**相遇**，而不能通过**追击**。

对于第一只感冒的蚂蚁，我们分为两种情况讨论：

- **头向左**
- - 若其**左侧**有**头向右**的蚂蚁，则左侧的 `left` 只蚂蚁会依次逐个传染；而第一只感冒蚂蚁会转头，会使右侧的 `right` 只蚂蚁依次逐个传染；
- - 若其**左侧**没有**头向右**的蚂蚁，则不会有蚂蚁传染。
- **头向右**
- - 若其**右侧**有**头向左**的蚂蚁，则右侧的 `right` 只蚂蚁会依次逐个传染；而第一只感冒蚂蚁会转头，会使左侧的 `left` 只蚂蚁依次逐个传染；
- - 若其**右侧**没有**头向左**的蚂蚁，则不会有蚂蚁传染。

~~~python
n = int(input())
dis = list(map(int, input().split()))

# k 为第一只感冒蚂蚁距离左边的距离
k = abs(dis[0])

# left  表示第一只感冒蚂蚁的左侧, 头向右蚂蚁的数量
# right 表示第一只感冒蚂蚁的右侧, 头向左蚂蚁的数量
left = right = 0

# 计算最终感冒蚂蚁
for i in dis[1:]:
    # 对于第一只感冒蚂蚁的左侧, 如果头向右
    if 0 < i < k:
        left += 1
    # 对于第一只感冒蚂蚁的右侧, 如果头向左
    if i < 0 and abs(i) > k:
        right += 1

# 如果第一只感冒的蚂蚁头向左, 且 left 不为 0
# 或 第一只感冒的蚂蚁头向右, 且 right 不为 0
if (dis[0] < 0 and left != 0) or (dis[0] > 0 and right != 0):
    print(left + right + 1)
else:
    print(1)

    # 这里有一个值得思考的点就是，这里直接算的是朝向感冒蚂蚁的蚂蚁直接算是感冒，不朝向的蚂蚁不计算，
    # 因为题目要求说了，相遇就会转向，那么我们想象成相遇就会擦肩而过，而感冒的会被感染，这样就能解释通了，无论怎么走，两个对向移动的蚂蚁都会感冒，而反向的蚂蚁直接就安全的出去 了

~~~

##  阶乘的和      

 ![image-20240409105643077](http://battle.wicp.io:9001/blog1/202404091056441.png)

### 思路

最小的 那个Ai肯定是公因子，但是要防止合成，也就是三个2！可以合成一个3!，这个时候因数最大就可以是3！了

样例也给出了提示，所以要考虑这种情况

~~~
import os
import sys

from collections import defaultdict
import os
import sys

n = int(input())
a = list(map(int, input().split()))
a.sort()
Map = defaultdict(int)

for i in a:
    Map[i] += 1

m = a[0]  # 最开始一定可以合成
while True:
    x = Map[m]
    if x % (m + 1) == 0:
        Map[m + 1] += x // (m + 1)
        m += 1
    else:
        break

print(m)


~~~

### 使用defaultdict

`defaultdict` 和 `{}`（字典）的主要区别在于处理不存在的键时的行为。

1. **字典 `{}`：** 在使用字典时，如果访问了不存在的键，会抛出 KeyError 异常。

```python

my_dict = {}
print(my_dict['key'])  # KeyError: 'key' 不存在
```

1. **defaultdict：** `defaultdict` 是 `collections` 模块提供的一个类，它是字典的一个子类。与普通字典不同，当使用 `defaultdict` 时，如果访问了不存在的键，它会自动创建一个默认值，并返回该默认值。这个默认值的类型由你指定的工厂函数决定。

```python

from collections import defaultdict

my_defaultdict = defaultdict(int)  # 使用 int 作为默认值的工厂函数
print(my_defaultdict['key'])  # 输出: 0，因为 int() 的默认值为 0
```

因此，`defaultdict` 的一个主要优点是，在处理不存在的键时，不会引发 KeyError 异常，而是返回一个默认值。

