---
description: PlayerAdvancementDoneEvent
---

# PlayerAdvancementDoneEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerAdvancementDoneEvent

### 类描述

> Called when a player has completed all criteria in an advancement.
> 
> <br>
> 
> 当玩家符合一个进度下的所有准则时触发。
> 
> <br>
> 
> 译注：文档有误。所谓“所有准则”，与实情相异。
> 
> 与进度有关的信息可参见 [https://minecraft.fandom.com/wiki/Advancement](https://minecraft.fandom.com/wiki/Advancement) 页面。进度由 `JSON` 格式的文件所定义，具体格式参见 [https://minecraft.fandom.com/wiki/Advancement/JSON_format](https://minecraft.fandom.com/wiki/Advancement/JSON_format) 页面。
> 
> 在游戏客户端内对进度 ( `Advancement` ) 的描述是泛泛而谈的。想要达成进度，主要在于满足准则 ( `Criteria` ) 。比如“这上面的风景不错”挑战进度的描述是“利用潜影贝的攻击向上漂浮五十个方块”。但就准则而言，只要玩家拥有飘浮药水效果且在垂直方向上移动了五十个方块，即视为达成准则，相应地也就达成了进度。即使玩家所携带的飘浮药水效果并不来源于潜影贝的攻击，亦无妨。准则是精确、具体的。达成了准则，玩家也就达成了进度。
> 
> 一个进度下可能只有一条准则，就如上文的“这上面的风景不错”进度那样。自然，同一进度也可能下设很多准则。比如“怪物猎人”这一进度要求杀死任意一种敌对生物。在该进度下有数十准则，每一种准则的触发条件都要求玩家杀死一种不同的敌对生物。比如第一条准则要求玩家杀死一只烈焰人，第二条准则要求玩家杀死一只洞穴蜘蛛，等等。这些准则囊括了游戏中所有的敌对生物类型。玩家只要完成其中任意一条准则即视为达成进度。而“资深怪物猎人”挑战进度则要求玩家杀死每一种敌对生物。这一进度的每一条准则和“怪物猎人”进度的准则都一一对应，完全相同。只不过“资深怪物猎人”进度的触发条件是玩家满足了所有准则，而不是任意一条。由二者之间的区别可见，一个进度被玩家达成，实质上是玩家达成了该进度的 `JSON` 文件中 `Requirements` 项所规定的准则，不一定是全部准则。
> 
> 上文已经论证了本事件实际上是在玩家达成进度时触发的。达成进度不一定需要符合一个进度下的所有准则。本事件仅在达成进度时触发，与达成“全部准则”无关。具体而言，本事件在 `net.minecraft.server.v1_16_R3.AdvancementDataPlayer#grantCriteria` 方法中触发。该方法是在玩家达成一条准则后调用，但是只有在达成准则前 `advancementprogress.isDone()` 为 `false` 且达成准则后 `advancementprogress.isDone()` 为 `true` 时，才会触发事件（即达成这一准则以前进度处于未完成状态、达成这一准则后就符合进度达成条件了），否则只是给进度完成情况记上一笔。由此也可证明，不需要达成“所有”准则也可以触发本事件，关键在于达成符合要求的准则。

### 方法列表

#### getAdvancement

方法声明: public Advancement getAdvancement()

方法签名: ()Lorg/bukkit/advancement/Advancement;

> Get the advancement which has been completed.
> 
> @return completed advancement
> 
> <br>
> 
> 该方法用于获取被达成的进度。
> 
> @return 被达成的进度。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;