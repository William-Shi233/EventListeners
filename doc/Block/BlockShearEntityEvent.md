---
description: BlockShearEntityEvent
---

# BlockShearEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.block.BlockEvent

            =>  org.bukkit.event.block.BlockShearEntityEvent

### 类描述

> Event fired when a dispenser shears a nearby sheep.

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity that was sheared.
>
> @return the entity that was sheared.

#### getTool

方法声明: public ItemStack getTool()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item used to shear this sheep.
>
> @return the item used to shear this sheep.

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;