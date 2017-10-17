# 加入一个物品 #

从这章开始将会比较有趣

## 前置教程 ##

* [设立“框架”](/Document/FirstMod.md/)
* [建立工作环境](/Document/SetupEnvironment.md/)

[返回教程目录](../Readme.md)

## 代码部分 ##

完整代码在这里[Beginner_for_BeginItem.java](\Document\CodeExample\Beginner_for_BeginItem.java)
### 添加beginItem类 ###

* 导入库文件 `import net.minecraft.item.Item;`
* 建立**BeginItem**类，并且继承**Item** `public class BeginItem extends Item`
* 设置物品性质
	
	在这个mod里我们不需要加入其他性质。所以在刚刚生成的BeginItem类中什么都不用打。实际上物品可以设置多种性质，比如攻击力，恢复饥饿等等，也可以有更加复杂的设定，比如点火、放怪物、促进植物生长等等，这些功能在以后再探究。

### 注册新物品 ###

* 生成beginItem对象 `public static Item beginItem;`
* 给beginItem对象赋值 `beginItem = new BeginItem()`
	
	可以注意到在**preInit函数**之前，我们用上面的语句生成了一个beginItem对象，值得注意的是，beginItem是一个Item类的实例，而BeginItem是Item的一个子类，所以可以这样声明。
* 设置物品的UnlocalizedName，这个名字是此物品在游戏中注册的名字。
`beginItem = new BeginItem().setUnlocalizedName("beginItem")`

### 测试 ###

现在，激动人心的时刻就来临了！点击运行，等一会之后就会弹出minecraft的游戏界面。新建一个游戏，记住*打开作弊模式*。进入游戏后，按一下'/'键，会看到界面最下方出现一个命令输入框。之后输入`give Player... beginner:item.beginItem.name`。其中`Player...`是启动游戏时自动分配的ID，在Eclipse的命令行中可以找到，也可以直接按Tab键，命令框能自动联想玩家ID。

输入命令后，会发现得到了一块名字beginner:item.beginItem.name红黑板，叫这就是我们刚刚生成的物品。由于这个物品没有添加材质和名称，所以只拥有默认材质和UnlocalizedName。下面我们就给它添加材质和一个相对可读的名称。


## 添加材质，语言 ##

我们已经发现新生成的物品即没有一个漂亮的外观，名字也很奇怪，现在我们就要改变物品的外观，并且使玩家能看到一个正常的名字。首先我们要新建一堆文件夹，不要慌。

### Lang ###

* 在**resources**文件夹下新建文件夹**assets**，再在**assets**下新建一个以modid命名的文件夹，在教程里就是**beginner**，最后，在**beginner**文件夹下新建**lang**文件夹。最后的路径应该是这样：
`src\main\resources\assets\beginner\lang`

	实际上，可以直接在新建文件夹，也可以在Eclipse中建立，效果是一样的


* 在lang文件夹下创建**en_US.lang**文件，注意名字要起对。
* 在**en_US.lang**中输入 `item.beginItem.name=Beginitem`。

	等号左边是物品的UnlocalizedName，右边是玩家会看到的名字，大家可以根据爱好进行改动。添加语言时并不用对代码进行改动，大家也可以加入其它lang文件来加入其它语言版本。

### Texture ###
现在我们为新物品添加一个外观。

* 在刚刚的**beginner**文件夹下再创建textures\items这两层文件夹，完整路径如下： `\src\main\resources\assets\beginner\textures\items`
* 在items文件夹中添加16*16像素的png文件，在其中画出想画的物品，保存文件，在本教程中，这个文件被命名为beginItem.png。
* 最后，我们需要在代码中添加一行，严格来说也不是一行，而是在生成beginItem对象时增加一个性质， 这行代码可以把物品和图片关联起来。 `beginItem = new BeginItem().setUnlocalizedName("beginItem").setTextureName("beginner:beginItem");` 

	需要注意的是`setTexturName`中的string格式必须是*modid：texture文件名*，modid一般不会出错，容易出错的是文件名，一定要注意文件名一定要和items文件夹中png文件的文件名一模一样，不然是加载不出来的，只能看到那块令人失望的红黑板。。。

	另外，关于画图，有ps当然是最好的，我用的是paintnet，是一款比较轻量级的软件，大家可以去[官网下载]()，也可以从之前给的[百度云下载](https://pan.baidu.com/s/1dFhXk9z) 提取码：f5pw

### 再测试 ###
现在就可以重新运行MC了，打开刚刚的存档， 可以看到物品的名字也变成了比较友好的beginItem，红黑板也变成了可爱的剑。

## 下一步 ##
终于做出了一个有用的东西！但是现在
