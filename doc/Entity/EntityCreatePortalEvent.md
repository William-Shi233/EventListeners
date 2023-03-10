---
description: EntityCreatePortalEvent
---

# EntityCreatePortalEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityCreatePortalEvent

### 类描述

> Thrown when a Living Entity creates a portal in a world.
>
> @deprecated Use {@link PortalCreateEvent}

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

#### getBlocks

方法声明: public List<BlockState> getBlocks()

方法签名: ()Ljava/util/List;

> Gets a list of all blocks associated with the portal.
>
> @return List of blocks that will be changed.

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getPortalType

方法声明: public PortalType getPortalType()

方法签名: ()Lorg/bukkit/PortalType;

> Gets the type of portal that is trying to be created.
>
> @return Type of portal.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;