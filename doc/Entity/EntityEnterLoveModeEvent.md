---
description: EntityEnterLoveModeEvent
---

# EntityEnterLoveModeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityEnterLoveModeEvent

### 类描述

> Called when an entity enters love mode.
>
> <br>
>
> This can be cancelled but the item will still be consumed that was used to
>
> make the entity enter into love mode.
>
> 当实体进入繁衍状态时触发。
>
> 如果本事件被取消，被喂给实体用于使其进入繁衍状态的物品堆不会返还。

### 方法列表

#### getEntity

方法声明: public Animals getEntity()

方法签名: ()Lorg/bukkit/entity/Animals;

> Gets the animal that is entering love mode.
>
> @return The animal that is entering love mode
>
> 该方法用于获取进入繁衍状态的动物。
>
> @return 进入繁衍状态的动物。

#### getHumanEntity

方法声明: public HumanEntity getHumanEntity()

方法签名: ()Lorg/bukkit/entity/HumanEntity;

> Gets the Human Entity that caused the animal to enter love mode.
>
> @return The Human entity that caused the animal to enter love mode, or
>
> null if there wasn't one.
>
> 该方法用于获取让动物进入繁衍状态的玩家。
>
> @return 让动物进入繁衍状态的玩家。如果不存在则返回 `null` 。

#### getTicksInLove

方法声明: public int getTicksInLove()

方法签名: ()I

> Gets the amount of ticks that the animal will fall in love for.
>
> @return The amount of ticks that the animal will fall in love for
>
> 该方法用于获取动物发情的时长。
>
> @return 动物发情的时长。

#### setTicksInLove

方法声明: public void setTicksInLove(int ticksInLove)

方法签名: (I)V

> Sets the amount of ticks that the animal will fall in love for.
>
> @param ticksInLove The amount of ticks that the animal will fall in love
>
> for
>
> 该方法用于设置动物发情的时长。
>
> @param 动物发情的时长。

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