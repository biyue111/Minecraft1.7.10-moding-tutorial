#建立工作环境#

##前置教程##
这明显是第一章，没有前置教程~~

[返回教程目录](Readme.md)

##软件下载##
首先，大家需要下载相关软件，括号中是w我是使用的版本，链接如下：

[Forge下载](http://files.minecraftforge.net/)（forge-1.7.10-10.13.4.1558-1.7.10-src）

[eclipse官网](https://eclipse.org/downloads/)（eclipse-inst-win64）

[Java下载](http://www.oracle.com/technetwork/java/javase/downloads/index.html)（jdk-8u91-windows-x64）

也可以直接从我网盘上下载：
[百度云下载](https://pan.baidu.com/s/1dFhXk9z)。其中也有一些其他的辅助工具，在之后的教程中会陆续提到。


##Java安装##
安装Java一般分为**安装JDK**和**设置环境变量**两步，非常简单。具体过程可以参看[链接](http://jingyan.baidu.com/article/e75aca85b29c3b142edac6a8.html)。

##安装Eclipse##
Eclipse是一款免费的程序开发管理软件，其功能很强大。下载之后选择安装**Eclipse IDE for Java Developers**（一般是第一项）。

##建立Forge##
* 将压缩包解压，可以看到以下内容：

* 在解压之后的文件夹里按住Shift点击右键，打开命令行，在其中输入命令：
`gradlew setupDecompWorkspace`

	之后自动安装forge以及反编译的代码，大概需要15分钟左右，中途安装失败了也不要害怕，看看错误提示是不是命令没输对或者Java没装好。如果都不是，有可能再试试就好了，实在不行就baidu，google一下。。。

* 安装完成后，输入：
`gradlew eclipse`

	系统会安装eclipse环境，大约需要5分钟。大功告成！

##启动Eclipse##
都安装好后，就可以打开Eclipse了，这时Eclipse会提示用户选择路径，选择之前解压好的forge文件夹里的eclipse文件夹即可，主要不要弄错文件夹，加粗强调一遍：
**forge/eclipse**。
打开之后，如果能在左侧看到一个**Minecraft**文件夹，说明之前的操作都没有什么问题。

展开后可以看到一大坨文件和文件夹，其中有两个比较重。一个是**src**文件夹，这是用来存放用户编写的mod的文件夹。另外一个是``,其中保存了反编译的minecraft的源代码。

##可以参考的其他教程##
其实forge中gradlew.bat文件有很多其他功能，能帮助用户更好的开发。可以参看下列资料：