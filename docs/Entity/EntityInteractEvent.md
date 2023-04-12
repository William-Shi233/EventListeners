---
description: EntityInteractEvent
---

# EntityInteractEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityInteractEvent

### 类描述

> Called when an entity interacts with an object
>
>
> 
> 当实体与某物交互时触发。
>
>
> 
> 译注：交互包括僵尸破坏海龟蛋、实体触发压力板、绊线钩等。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getBlock

方法声明: public Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the involved block
>
> @return the block clicked with this item.
>
>
> 
> 该方法用于获取事件中被点击的方块。
>
> @return 事件中被实体用物品点击的方块。
>
>
> 
> 译注：所谓“用物品点击”，不准确。见上。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;