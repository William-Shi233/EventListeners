---
description: EntityExplodeEvent
---

# EntityExplodeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityExplodeEvent

### 类描述

> Called when an entity explodes
> 
> <br>
> 
> 当实体爆炸时触发。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### blockList

方法声明: public List<Block> blockList()

方法签名: ()Ljava/util/List;

> Returns the list of blocks that would have been removed or were removed
> 
> from the explosion event.
> 
> @return All blown-up blocks
> 
> <br>
> 
> 该方法用于获取一个列表，其间存储有全部受爆炸破坏的方块。
> 
> @return 全部受爆炸破坏的方块列表。

#### getLocation

方法声明: public Location getLocation()

方法签名: ()Lorg/bukkit/Location;

> Returns the location where the explosion happened.
> 
> It is not possible to get this value from the Entity as the Entity no
> 
> longer exists in the world.
> 
> @return The location of the explosion
> 
> <br>
> 
> 该方法用于获取爆炸发生的位置。
> 
> 无法通过涉事实体所在的位置来获得爆炸发生的位置。当本事件发生时，引发爆炸的实体已经不复存在。
> 
> @return 爆炸发生的位置。

#### getYield

方法声明: public float getYield()

方法签名: ()F

> Returns the percentage of blocks to drop from this explosion
> 
> @return The yield.
> 
> <br>
> 
> 该方法用于获取爆炸中被炸毁方块的掉落概率。
> 
> @return 被炸毁方块的掉落概率。

#### setYield

方法声明: public void setYield(float yield)

方法签名: (F)V

> Sets the percentage of blocks to drop from this explosion
> 
> @param yield The new yield percentage
> 
> <br>
> 
> 该方法用于设置爆炸中被炸毁方块的掉落概率。
> 
> @param yield 被炸毁方块的掉落概率。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;