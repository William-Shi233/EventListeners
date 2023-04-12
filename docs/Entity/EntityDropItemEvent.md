---
description: EntityDropItemEvent
---

# EntityDropItemEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityDropItemEvent

### 类描述

> Thrown when an entity creates an item drop.
>
>
> 
> 当实体产生掉落物时触发。
>
>
> 
> 译注：所谓“掉落物”，固然可能是实体死亡时所产生，比如生物被凋零击杀，掉落凋零玫瑰。但此处所指的“掉落物”亦涵盖实体丢下物品堆的情况，比如猫给玩家带来礼物。

### 方法列表

#### getItemDrop

方法声明: public Item getItemDrop()

方法签名: ()Lorg/bukkit/entity/Item;

> Gets the Item created by the entity
>
> @return Item created by the entity
>
>
> 
> 该方法用于获取实体所生成的物品堆。
>
> @return 实体所生成的物品堆。

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