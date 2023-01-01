---
description: SheepDyeWoolEvent
---

# SheepDyeWoolEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.SheepDyeWoolEvent

### 类描述

> Called when a sheep's wool is dyed

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public Sheep getEntity()

方法签名: ()Lorg/bukkit/entity/Sheep;

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player dyeing the sheep, if available.
>
> @return player or null

#### getColor

方法声明: public DyeColor getColor()

方法签名: ()Lorg/bukkit/DyeColor;

> Gets the DyeColor the sheep is being dyed
>
> @return the DyeColor the sheep is being dyed

#### setColor

方法声明: public void setColor(@NotNull DyeColor color)

方法签名: (Lorg/bukkit/DyeColor;)V

> Sets the DyeColor the sheep is being dyed
>
> @param color the DyeColor the sheep will be dyed

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;