#加入一个物品#
从这章开始将会比较有趣

##前置教程##
* [设立“框架”](/Document/FirstMod.md/)
* [建立工作环境](/Document/SetupEnvironment.md/)

[返回教程目录](../Readme.md)

##代码部分##
完整代码可以参看

###添加beginItem类###
* 导入库文件 `import net.minecraft.item.Item;`
* 建立**BeginItem**类，并且继承**Item** `public class BeginItem extends Item`
* 设置物品性质
	
	在这个mod里我们不需要加入其他性质。所以在刚刚生成的BeginItem类中什么都不用打。实际上物品可以设置多种性质，比如攻击力，恢复饥饿等等，也可以有更加复杂的设定，比如点火、放怪物、促进植物生长等等，这些功能在以后再探究。

###注册新物品###
* 生成beginItem对象 `public static Item beginItem;`
* 给beginItem对象赋值 `beginItem = new BeginItem()`
	
	可以注意到在**preInit函数**之前，我们用上面的语句生成了一个beginItem对象，值得注意的是，beginItem是一个Item类的实例，而BeginItem是Item的一个子类，所以可以这样声明。
* 设置物品的UnlocalizedName，这个名字是此物品在游戏中注册的名字。
`beginItem = new BeginItem().setUnlocalizedName("beginItem")`

###测试###
现在，激动人心的时刻就来临了！点击运行，等一会之后就会弹出minecraft的游戏界面。新建一个游戏，记住*打开作弊模式*。之后


##添加材质，语言##
我们已经发现新生成的物品即没有一个漂亮的外观，名字也很奇怪，现在我们就要改变物品的外观，并且使玩家能看到一个正常的名字。首先我们要新建一堆文件夹，不要慌。

###Lang###
* 在**resources**文件夹下新建文件夹**assets**，再在**assets**下新建一个以modid命名的文件夹，在教程里就是**beginner**，最后，在**beginner**文件夹下新建**lang**文件夹。最后的路径应该是这样：
`src\main\resources\assets\beginner\lang`

	实际上，可以直接在新建文件夹，也可以在Eclipse中建立，效果是一样的


* en_US.lang

###Texture###

##下一步##