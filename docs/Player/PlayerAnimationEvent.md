---
description: PlayerAnimationEvent
---

# PlayerAnimationEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerAnimationEvent

### 类描述

> Represents a player animation event
> 
> <br>
> 
> 当玩家播放动画时触发。
> 
> <br>
> 
> 译注：所谓“动画”，指的是手臂挥动动画。
> 
> 具体而言，游戏客户端内显示玩家手臂挥动时，即触发该事件。比如玩家按右键放置方块、按左键破坏方块等动作，都会触发该事件。破坏方块时如持续按住左键，则会以较高频率触发该事件。如果客户端没有显示挥手动作，则不触发该事件，比如空手右键空气时，客户端无挥手动画，则不触发该事件。另外，当玩家丢弃物品时，也有挥手动作，因此也会触发该事件。
> 
> 如果需要获得玩家交互的详细信息，请使用 `PlayerInteractEvent` 。

### 方法列表

#### getAnimationType

方法声明: public PlayerAnimationType getAnimationType()

方法签名: ()Lorg/bukkit/event/player/PlayerAnimationType;

> Get the type of this animation event
> 
> @return the animation type
> 
> <br>
> 
> 该方法用于获取涉事动画类型。
> 
> @return 涉事动画类型。
> 
> <br>
> 
> 译注：该枚举仅有两个字段，即主手和副手。
> 
> 本事件并不会记录玩家进行的是左键点击还是右键点击，只会区分主手和副手。左键单击一下方块和右键放置一个方块，仅自本事件所记录的信息来看，没有差别。请使用 `PlayerInteractEvent` 获得玩家交互的详细信息。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;