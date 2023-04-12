---
description: EntityCombustEvent
---

# EntityCombustEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityCombustEvent

### 类描述

> Called when an entity combusts.
>
> If an Entity Combust event is cancelled, the entity will not combust.
>
>
> 
> 当实体燃烧时触发。
>
> 如果本事件被取消，则实体不会燃烧。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getDuration

方法声明: public int getDuration()

方法签名: ()I

> @return the amount of time (in seconds) the combustee should be alight
>
> for
>
> 
>
> （译注：该方法用于获取实体将持续燃烧的时长（以秒为单位）。此句缺漏。）
>
>
> 
> @return 实体将持续燃烧的时长（以秒为单位）。

#### setDuration

方法声明: public void setDuration(int duration)

方法签名: (I)V

> The number of seconds the combustee should be alight for.
>
> This value will only ever increase the combustion time, not decrease
>
> existing combustion times.
>
> @param duration the time in seconds to be alight for.
>
>
> 
> 该方法用于设置实体将持续燃烧的时长，以秒为单位。
>
> 只能通过本方法来增加实体燃烧的时间，无法使燃烧时间减少。
>
> @param duration 实体将持续燃烧的时长，以秒为单位。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;