---
description: PlayerShearEntityEvent
---

# PlayerShearEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerShearEntityEvent

### 类描述

> Called when a player shears an entity

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity the player is shearing
>
> @return the entity the player is shearing

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item used to shear the entity.
>
> @return the shears

#### getHand

方法声明: public EquipmentSlot getHand()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> Gets the hand used to shear the entity.
>
> @return the hand

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;