#制作第一个Mod#
第一个Mod并没有什么实际功能，主要是搭建起一个框架。感觉没啥可讲的也不是很有意思。下面主要讲了文件的关系，但是具体每个类的功能没具体介绍，因为自己也不是太懂，等之后用到了再说。可以点击[这里](https://github.com/biyue111/Minecraft1.7.10-moding-tutorial/tree/master/src/main/java/tutorial)的链接查看完整的code。

##前置教程##
* [建立工作环境](/Document/SetupEnvironment.md/)

[返回教程目录](Readme.md)

##建立文档##
* 在**src/main/java**文件夹下建立两个包**tutorial.beginner**和**tutorial.comm**

* 在**tutorial.beginner**中建立两个类，分别为**Beginner.java**和**Modcst.java**

	其中**Beginner.java**为mod的顶层文件，**Modsct.java**用来存放一些常量，比如之后马上要用到的modid，name，version等等。
* 在**tutorial.comm**中建立**ClientProxy**和**CommonProxy**两个类

* 最后整个mod就是这个样子：



##Modcst Class##
在**Modcst class**中定义三个字符串**MODID**，**NAME**，**VERSION**并且加禁止修改的修饰符，如下：

`public final static String MODID = "beginner";`

##CommonProxy Class & ClientProxy Class##
神马都不用写，建好就行。并且让**ClientProxy Class**继承**CommonProxy Class**

`public class ClientProxy extends CommonProxy`

##Beginner Class##
最重要的一个类，

###导入库文件###
首先导入minecraft自带的库。

* import cpw.mods.fml.common.Mod;
* import cpw.mods.fml.common.Mod.Instance;
* import cpw.mods.fml.common.Mod.EventHandler;
* import cpw.mods.fml.common.SidedProxy;
* import cpw.mods.fml.common.event.FMLInitializationEvent;
* import cpw.mods.fml.common.event.FMLPostInitializationEvent;
* import cpw.mods.fml.common.event.FMLPreInitializationEvent;

之后，再导入所需要的库文件

* import tutorial.beginner.Modcst;
* import tutorial.comm.ClientProxy;
* import tutorial.comm.CommonProxy;

###@Mod###
声明Mod的ID，名称，版本等信息
`@Mod(modid = Modcst.MODID, name = Modcst.NAME, version = Modcst.VERSION)`

###完成###
再加入**@Instance**，**@SidedProxy**，和三个**@EventHandler**即可。
其中**@SidedProxy**是用来声明客户端和服务端。

##导出mod##

##参考##
