# 《癸卯重修增廣箋註<事件監聽大典>》序

区区在 2017 年的 PVPIN 社区中，借由 Google Blockly 积木，首次接触到了 Bukkit API 的事件监听系统。彼时，愚才疏学浅、不通程序设计之道，尚未登堂、遑论入室。一次遇到 `event.setCancelled(true);` 语句，自知是取消事件，使之不再发生。想要修改该语句，欲覆盖他人操作之结果，令已被取消之事件在服务器内发生。怎料积木中惟有“取消事件”，却无“不取消事件”。一时窘然。承蒙 czm 前辈照拂，晓我以 `setCancelled(false);` ，我方知 `Cancellable` 接口之含义，第一次读懂了 JavaDoc 文档。此后我尝试使用 GYHHY 大佬所制的自定义监听积木，监听了 `SlimeSplitEvent` 。那时我才知道，PVPIN 自带的积木只囊括了几十个常用事件的监听器，对于全 Spigot API 甚至是全 Paper API 来说，实在是沧海一粟。故此，鄙人窃不自揆，想要将所有事件、事件类中所有内部枚举类、所有方法、所有字段，全部用积木表示出来，以便其他不懂得如何阅读 JavaDoc 的网友使用。

遂乃有《EventListeners——事件监听大典》，它是不才 2018 年在 PVPIN 社区利用 Google Blockly 编辑器所纂的一个小项目。拙作以事件监听器积木的形式列出了时为最新的 1.12.2 版本中所有事件的全限定名、触发时机，并对事件类所提供的方法作注。随着 PVPIN 的瓦解，该项目已经亡佚不存。现基于 1.16.5 版本的 Spigot API 对原作予以重修增广，以供诸君参考，请雅正。

该项目根目录为一个 Maven Project ，用于读取 Spigot API 的 JavaDoc 信息，并转换为可以被 GitBook 读取的 MarkDown 格式，再按照一个标准 `GitBook` 项目的文件结构进行输出。这些 JavaDoc 是 Spigot BuildTools 在构建服务端以后所留下的，为此，用户在运行本项目之前必须首先在本地运行 Spigot BuildTools 构建一个 1.16.5 或以上版本的服务端。此后在 `net.pvpin.eventlisteners.ClazzParser` 源代码中修改 `JAVADOC_DIR` 字段的值为本地 `BuildTools` 运行后得到的 `BuildTools/Spigot/Spigot-API/src/main/java/` 这一文件夹的路径，比如 `C:\\Users/williamshi/Documents/Code/Minecraft/BuildTools/Spigot/Spigot-API/src/main/java/` 即是鄙人本地计算机上的路径。其次，需要在 `net.pvpin.eventlisteners.Main` 中指定将用于存放 MarkDown 文件的目录路径。本项目中，这一文件夹为 `EventListeners/doc` 。同理，再次需要指定 `SUMMARY.md` 的路径以便输出，本项目中为 `EventListeners/doc/SUMMARY.md` 。

在恰当配置了路径并直接在 Java IDE 中运行 `net.pvpin.eventlisteners.Main` 类的 `main` 函数以后，`EventListeners/doc` 文件夹中即有一个完整的 GitBook 项目结构。此后再于 `EventListeners` 根目录新建一个 `.gitbook.yaml` 文件，将 `root` 配置项指定为 `./doc/` 文件夹，即可使 GitBook 项目和 Maven 项目结构并存且互不干扰。目前本项目即基于此结构加以修缮而成，如在 `SUMMARY.md` 中将页面分组等。

本项目主要以对 JavaDoc 的翻译为主，同时旁缀补缺，添加译注，以便读者查阅某事件在何时被触发。然而事件触发时机实在非我一人所能穷尽，尚需同道投稿，方能逐日臻至圆满。除此以外，对于某某行为需要通过何事件才能监听到的提问，比如“如何监听玩家跳跃”之类，亦对本项目之完善有所增益。还请各位斧正。William_Shi 顿首。