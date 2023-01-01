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

### 方法列表

#### getBlocks

方法声明: public List<BlockState> getBlocks()

方法签名: ()Ljava/util/List;

> Gets an array list of all the blocks associated with the created portal
>
> @return array list of all the blocks associated with the created portal

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Returns the Entity that triggered this portal creation (if available)
>
> @return Entity involved in this event

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

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: CreateReason

> An enum to specify the various reasons for a portal's creation

#### FIRE

> When the blocks inside a portal are created due to a portal frame
>
> being set on fire.

#### NETHER_PAIR

> When a nether portal frame and portal is created at the exit of an
>
> entered nether portal.

#### END_PLATFORM

> When the target end platform is created as a result of a player
>
> entering an end portal.