##软件下载##
首先，大家需要下载相关软件，链接如下：

[Forge下载](http://files.minecraftforge.net/)

[eclipse官网](https://eclipse.org/downloads/)

[Java下载](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

也可以直接从我网盘上下载：



##Java安装##

##安装Eclipse##
* Eclipse是一款免费的程序开发管理软件，其功能很强大。下载之后选择安装**Eclipse IDE for Java Developers**（一般是第一项）。

##建立Forge##
* 将压缩包解压，可以看到以下内容：

* 在解压之后的文件夹里按住Shift点击右键，打开命令行，在其中输入命令：
`gradlew setupDecompWorkspace`

	之后自动安装forge以及反编译的代码，大概需要15分钟左右，中途安装失败了也不要害怕，看看错误提示是不是命令没输对或者Java没装好。如果都不是，有可能再试试就好了，实在不行就baidu，google一下。。。

* 安装完成后，输入：
`gradlew eclipse`

	系统会安装eclipse环境，大约需要5分钟。大功告成！

##启动Eclipse##
都安装好后，就可以打开Eclipse了，这时Eclipse会提示用户选择路径，选择之前解压好的forge文件夹里的eclipse文件夹即可
**forge/eclipse**。
打开之后，如果能在左侧看到一个**Minecraft**文件夹，说明之前的操作都没有什么问题。

展开后可以看到一大坨文件和文件夹，其中有两个比较重。一个是**src**文件夹，这是用来存放用户编写的mod的文件夹。另外一个是``,其中保存了反编译的minecraft的源代码。

##可以参考的其他教程##
其实forge中gradlew.bat文件有很多