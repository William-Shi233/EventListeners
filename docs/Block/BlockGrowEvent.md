---
description: BlockGrowEvent
---

# BlockGrowEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockGrowEvent

### 类描述

> Called when a block grows naturally in the world.
> 
> Examples:
> 
> <ul>
> 
> <li>Wheat
> 
> <li>Sugar Cane
> 
> <li>Cactus
> 
> <li>Watermelon
> 
> <li>Pumpkin
> 
> <li>Turtle Egg
> 
> </ul>
> 
> If a Block Grow event is cancelled, the block will not grow.
> 
> <br>
> 
> 当方块在世界中自然生长时触发。
> 
> 本事件触发的情景包括：
> 
> <ul>
> 
> <li>小麦生长。
> 
> <li>甘蔗生长。
> 
> <li>仙人掌生长。
> 
> <li>西瓜生长。
> 
> <li>南瓜生长。
> 
> <li>海龟蛋孵化。
> 
> </ul>
> 
> 如果本事件被取消，则涉事方块将不会生长。

### 方法列表

#### getNewState

方法声明: public BlockState getNewState()

方法签名: ()Lorg/bukkit/block/BlockState;

> Gets the state of the block where it will form or spread to.
> 
> @return The block state for this events block
> 
> <br>
> 
> 该方法用于获取涉事方块生长以后的新块状态。如果涉及到方块蔓延，则返回新生成的方块的块状态。
> 
> @return 涉事方块生长以后的新块状态。

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