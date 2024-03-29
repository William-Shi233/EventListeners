# 《癸卯重修增廣箋註<事件監聽大典>》序

事件监听，是 Bukkit 插件开发领域内最为重要的话题之一。开发者所编写的每一段代码，都需要执行的入口。通常，程序的起点是 main 函数，但插件不然。onLoad 和 onEnable 函数固然是插件运行的开端，但它们只会在刚加载时被调用一次。BukkitScheduler 任务调度器可以让代码定时、延时执行，但失之刻板，无法在特定情景下触发，只能一次次地循环。onCommand 方法的确能响应玩家的特定指令，但 Bukkit 框架中的指令系统过于简陋，令人不忍卒读。

因而事件系统是不可或缺的。通过监听事件，可以让一段代码在某个特定情景下被即时触发。事件对象内蕴许多与该情景有关的信息，而不像指令系统那样，留下解析的工作给用户。监听器仅在事件发生时被调用，不会像定时任务那样屡屡空转。如果能够恰当地运用事件监听器，即可在关键的节点附上插件的逻辑，使得种种波谲云诡的想法得到实现。

虽然如此，仍有许多开发者不懂得如何使用事件系统。也许这些开发者初入 Bukkit 插件开发领域不久，尚未掌握部分词汇术语。加以事件相关的 API 文档本身就质量欠佳，不乏舛错，益加俾人生疑。比如 PlayerToggleSprintEvent，把未来注为旧有，BlockPistonRetractEvent，将收回抄作推出。还有部分文档词不达意、句不成篇。未设计完的草稿，打上 @deprecated 记号就杂厕于过时文档之中（曾经的 EntityPlaceEvent）。过时的方法，经过更新后已经紧跟上最新版本了，却又不去掉过时标签（PlayerEditBookEvent）。如此种种，更让人无法分辨。

在 2017 年的 PVPIN 社区中，我借由 Google Blockly 积木，首次接触到了 Bukkit API 的事件系统。彼时，我只了解一些简单的 JavaScript 语法，仅会堆砌积木，不通程序设计的原理。一次遇到 `event.setCancelled(true);` 语句，自知是取消事件，使之不再发生。想要修改该语句，欲覆盖前人操作之结果，俾已被取消的事件在服务器内发生。怎料积木中惟有“取消事件”，却无“不取消事件”。一时窘然。承蒙 czm 前辈照拂，晓我以 `setCancelled(false);` ，我方知 Cancellable 接口之含义，第一次读懂了 JavaDoc 文档。此后我尝试使用 GYHHY 道席所制的自定义监听积木，监听了积木中所未囊括的 SlimeSplitEvent 。那时我才知道，PVPIN 自带的积木只囊括了几十个常用事件的监听器，对于全 Spigot API 甚至是全 Paper API 来说，实在是沧海一粟。故此，我不知天高地厚，欲将所有事件、所有方法全部用积木表示出来，以便其余不懂得如何阅读 JavaDoc 的用户使用。

遂乃有《EventListeners——事件监听大典》，它是不才 2018 年在 PVPIN 社区利用 Google Blockly 编辑器所纂的一个小项目。拙作以事件监听器积木的形式列出了时为最新的 1.12.2 版本中所有事件的全限定名、触发时机，并对事件类所提供的方法作注。随着 PVPIN 的瓦解，该项目已经亡佚不存。现基于 1.16.5 版本的 Spigot API 对原作予以重修增广。

本项目根目录为一个 Maven Project ，用于读取 Spigot API 的 JavaDoc 信息，并转换为可以被 GitBook 读取的 MarkDown 格式，再按照一个标准 GitBook 项目的文件结构进行输出。这些 JavaDoc 是 Spigot BuildTools 在构建服务端以后所留下的，为此，用户在运行本项目之前必须首先在本地运行 Spigot BuildTools 构建一个 1.16.5 或以上版本的服务端。此后在 `net.pvpin.eventlisteners.ClazzParser` 源代码中修改 `JAVADOC_DIR` 字段的值为本地 BuildTools 运行后得到的 `BuildTools/Spigot/Spigot-API/src/main/java/` 这一文件夹的路径，比如 `C:\\Users/williamshi/Documents/Code/Minecraft/BuildTools/Spigot/Spigot-API/src/main/java/` 即是鄙人本地计算机上的路径。其次，需要在 `net.pvpin.eventlisteners.Main` 中指定将用于存放 MarkDown 文件的目录路径。本项目中，这一文件夹为 `EventListeners/docs` 。同理，再次需要指定 SUMMARY.md 的路径以便输出，本项目中为 `EventListeners/SUMMARY.md` 。

在恰当配置了路径并直接在 Java IDE 中运行 `net.pvpin.eventlisteners.Main` 类的 main 函数以后，`EventListeners/` 文件夹中即有一个完整的 GitBook 项目结构。目前本项目即基于此结构加以修缮而成，并在 SUMMARY.md 中将页面重新分组。

区区窃不自揆，希望昭著文档之本意，刊正谬误，舍短取长。晦涩的言辞，加以注释，抽象的论述，辅以示例。屏退谬论，昌明各个事件的真正功用，是我所愿也！本项目主要以对 JavaDoc 的翻译为主，同时旁缀补缺，添加译注，以便读者查阅。然而事件细节实在非我一人所能穷尽，我自知才疏学浅，见识粗鄙，故而仅能抛砖引玉，尚要仰仗各位道席予以雅正。

如您发现翻译不确切、译注脱离实情等一应问题，烦请在 GitHub 项目（[https://github.com/William-Shi233/EventListeners](https://github.com/William-Shi233/EventListeners)）提出 Issue 或发送 Pull Request 斧正。如您有不刊之论愿意赐教，望您于 QQ 群 681811254 启沃为盼，诠才不胜屏营感激之至，顿首顿首。

# 進《癸卯重修增廣箋註<事件監聽大典>》表

PVPIN Studio 成员臣 William_Shi 跪奏，编辑《事件监听大典》告成，恭呈宸览，臣谨奉表恭进者。

伏惟“子入太庙每事问”，即云先进鸿才，未能生而知礼，后生晚辈，惟愿困而学之。文档汇一代宏才，集百年定论，或言方法功用，或语接口行为。架构可穷，坐看矿艺万里之世，细节尽备，探骊代码数句之章。倘闭户下帷，推敲终日，悉毁典籍，尽燔旧闻，固能管窥一斑，怎奈蹉跎岁月，所谓“思无益不如学”是也！然文档系英文所著，多有语言不通，加以汗漫无边，舛错间厕。或脱，或漏，或讹，或衍。别有抄袭通篇，不论方法之名，阔谈己观，未知高论所据。注疏同经典抵牾，文档与实情各异。未成之草稿，冠以过时之名，已订之文辞，杂于故纸之侧。是以臣与纂修诸同列开馆排辑，译文档为汉语，首尾既具，用为初稿，公慎讨论，辨析谬误。艰深之处，多为旁注，抽象之说，再添示例。伏愿参观文档，堪充旁征，有益于编程焉。

纂成文档十一卷，二百四十三篇，谨奉表随进以闻。

公元二千零二十三年，闰二月。

PVPIN Studio 成员 William_Shi

开列在事者职名：

监理：

PVPIN Studio 组长 Rain_Effect

银河系气功开发协会 组长 yumc

正总裁：

PVPIN Studio 成员 William_Shi

副总裁：

原任 PVPIN 社区成员 椎名淅雨

总纂：

PVPIN Studio 成员 HopeLight

协修：

PVPIN Studio 成员 Tao

校对：

原任 PVPIN 社区成员，今任 Alicorn Union 组长 青蛙的名单

PVPIN Studio 成员 Banaira

PVPIN Studio 成员 Eustia_Saint

PVPIN Studio 成员 Minamototennsai