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
> 
> <br>
> 
> 当羊身上的羊毛被染色时触发。

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

> 译注：无文档。该方法用于获取涉事羊实体。

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player dyeing the sheep, if available.
> 
> @return player or null
> 
> <br>
> 
> 该方法用于获取给羊染色的玩家（如果能获取到）。
> 
> @return 可能返回给羊染色的玩家对象，也可能返回 `null` 。

#### getColor

方法声明: public DyeColor getColor()

方法签名: ()Lorg/bukkit/DyeColor;

> Gets the DyeColor the sheep is being dyed
> 
> @return the DyeColor the sheep is being dyed
> 
> <br>
> 
> 该方法用于获取涉事的羊将要被染上的颜色。
> 
> @return 涉事的羊将要被染上的颜色。

#### setColor

方法声明: public void setColor(@NotNull DyeColor color)

方法签名: (Lorg/bukkit/DyeColor;)V

> Sets the DyeColor the sheep is being dyed
> 
> @param color the DyeColor the sheep will be dyed
> 
> <br>
> 
> 该方法用于设置涉事的羊将要被染上的颜色。
> 
> @param color 涉事的羊将要被染上的颜色。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;