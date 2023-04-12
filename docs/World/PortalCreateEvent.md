---
description: PortalCreateEvent
---

# PortalCreateEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.world.PortalCreateEvent

### 类描述

> Called when a portal is created
>
> 
>
> 当一个传送门被创建时触发。

### 方法列表

#### getBlocks

方法声明: public List<BlockState> getBlocks()

方法签名: ()Ljava/util/List;

> Gets an array list of all the blocks associated with the created portal
>
> @return array list of all the blocks associated with the created portal
>
> 
>
> 该方法用于获取一个 `ArrayList` ，其间存储有全部与传送门相关的方块。
>
> @return 一个 `ArrayList` ，其间存储有全部与传送门相关的方块。

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Returns the Entity that triggered this portal creation (if available)
>
> @return Entity involved in this event
>
> 
>
> 该方法返回触发了传送门创建的实体（如果能获取到）。
>
> @return 事件中的实体。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getReason

方法声明: public CreateReason getReason()

方法签名: ()Lorg/bukkit/event/world/PortalCreateEvent/CreateReason;

> Gets the reason for the portal's creation
>
> @return CreateReason for the portal's creation
>
> 
>
> 该方法用于获取传送门创建的原因。
>
> @return 传送门创建的原因。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: CreateReason

> An enum to specify the various reasons for a portal's creation
>
> 
>
> 用于确定传送门创建原因的枚举。

#### FIRE

> When the blocks inside a portal are created due to a portal frame
>
> being set on fire.
>
> 
>
> 由于传送门框架被点燃，传送门方块生成在了框架内部。
>
> 
>
> 译注：下界传送门（又称地狱门）被点燃。

#### NETHER_PAIR

> When a nether portal frame and portal is created at the exit of an
>
> entered nether portal.
>
> 
>
> 当玩家进入某个下界传送门时，在下界传送门的出口处生成一个下界传送门框架以及其内的传送门方块。
>
> 
>
> 译注：比如玩家在主世界进入下界传送门时，下界的对应位置会自动产生一个下界传送门。此时主世界的传送门是“入口”，下界的传送门是“出口”。

#### END_PLATFORM

> When the target end platform is created as a result of a player
>
> entering an end portal.
>
> 
>
> 目标末地平台由于玩家进入末地传送门而被创建。
>
> 
>
> 译注：指末地黑曜石平台因为玩家进入末地而被刷新。参见 `net.minecraft.server.v1_16_R3.WorldServer#a(WorldServer worldserver, Entity entity)` ，在该类第 `1816-1834` 行。
>
> 没有可以用于监听玩家放置末影之眼导致末地传送门生成的事件。本事件只能监听到末地黑曜石平台被更新。参见 [https://www.spigotmc.org/threads/end-portal-creation-event.560637/](https://www.spigotmc.org/threads/end-portal-creation-event.560637/) 中的讨论。