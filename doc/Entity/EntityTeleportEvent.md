---
description: EntityTeleportEvent
---

# EntityTeleportEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTeleportEvent

### 类描述

> Thrown when a non-player entity is teleported from one location to another.
>
> <br>
>
> This may be as a result of natural causes (Enderman, Shulker), pathfinding
>
> (Wolf), or commands (/teleport).
>
> 当某个非玩家实体自一个位置传送到另一个位置时触发。
>
> 本事件可能因实体固有的技能而触发（如末影人、潜影贝），因寻路系统而触发（如被驯服的狼传送到玩家身边），或由于指令而触发（ `/teleport` 指令）。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getFrom

方法声明: public Location getFrom()

方法签名: ()Lorg/bukkit/Location;

> Gets the location that this entity moved from
>
> @return Location this entity moved from
>
> 该方法用于获取传送前实体所处的位置。
>
> @return 传送前实体所处的位置。

#### setFrom

方法声明: public void setFrom(@NotNull Location from)

方法签名: (Lorg/bukkit/Location;)V

> Sets the location that this entity moved from
>
> @param from New location this entity moved from
>
> 该方法用于设置传送前实体所处的位置。
>
> @param 传送前实体所处的位置。

#### getTo

方法声明: public Location getTo()

方法签名: ()Lorg/bukkit/Location;

> Gets the location that this entity moved to
>
> @return Location the entity moved to
>
> 该方法用于获取传送后实体将到达的位置。
>
> @return 传送后实体将到达的位置。

#### setTo

方法声明: public void setTo(@Nullable Location to)

方法签名: (Lorg/bukkit/Location;)V

> Sets the location that this entity moved to
>
> @param to New Location this entity moved to
>
> 该方法用于设置传送后实体将到达的位置。
>
> @param 传送后实体将到达的位置。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;