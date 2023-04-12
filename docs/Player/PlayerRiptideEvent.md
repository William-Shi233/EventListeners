---
description: PlayerRiptideEvent
---

# PlayerRiptideEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerRiptideEvent

### 类描述

> This event is fired when the player activates the riptide enchantment, using
> 
> their trident to propel them through the air.
> 
> N.B. the riptide action is currently performed client side, so manipulating
> 
> the player in this event may have undesired effects.
> 
> <p>
> 
> 当玩家触发“激流”附魔效果，以三叉戟推进己身，翱翔天际时触发。
> 
> 注意，“激流”这一动作目前是纯粹的客户端行为，所以在本事件的监听器中对一个已经处于“激流”状态下的玩家进行各种操作可能导致不孚于期望的结果。
> 
> <p>
> 
> 译注：服务端会在玩家松开右键释放三叉戟时作检测，如果符合“激流”附魔的触发条件，则触发本事件，并播放“激流”音效。但是服务端并不能操纵客户端显示翻滚动画，也不能检测某个玩家是否处于“激流”状态。这一状态是客户端行为。翻滚动画不是服务端通过数据包告知客户端播放的，而是客户端自主决定播放的。玩家移动过程客户端也会先斩后奏，在计算并完成移动后告知服务端移动情况，不需要服务端通知客户端。所以当客户端认为玩家处于激流状态时，服务端如插手玩家事宜，则可能导致不可预见的结果。

### 方法列表

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item containing the used enchantment.
> 
> @return held enchanted item
> 
> <p>
> 
> 该方法用于获取含有“激流”附魔的三叉戟物品堆。
> 
> @return 含有“激流”附魔的物品堆。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;