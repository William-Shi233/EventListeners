---
description: SlimeSplitEvent
---

# SlimeSplitEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.SlimeSplitEvent

### 类描述

> Called when a Slime splits into smaller Slimes upon death
>
> 当史莱姆死亡，分裂出体型较小的史莱姆时触发。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public Slime getEntity()

方法签名: ()Lorg/bukkit/entity/Slime;

> 译注：无文档。该方法用于获取死亡的史莱姆。

#### getCount

方法声明: public int getCount()

方法签名: ()I

> Gets the amount of smaller slimes to spawn
>
> @return the amount of slimes to spawn
>
> 该方法用于获取将要生成的体型较小的史莱姆的数量。
>
> @return 将要生成的体型较小的史莱姆的数量。

#### setCount

方法声明: public void setCount(int count)

方法签名: (I)V

> Sets how many smaller slimes will spawn on the split
>
> @param count the amount of slimes to spawn
>
> 该方法用于设置将要生成的体型较小的史莱姆的数量。
>
> @param count 将要生成的体型较小的史莱姆的数量。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;