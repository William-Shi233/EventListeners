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
>
>
> 
> 当玩家给实体剪毛时触发。
>
>
> 
> 译注：当玩家给羊剪毛时，固然会触发本事件。除此以外，当玩家用剪刀剪去哞菇身上的蘑菇、移除雪傀儡头顶的南瓜时，也会触发本事件。

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
>
>
> 
> 该方法用于获取被剪毛的实体。
>
> @return 被剪毛的实体。

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item used to shear the entity.
>
> @return the shears
>
>
> 
> 该方法用于获取剪毛时所使用的工具。
>
> @return 剪毛时所使用的工具。

#### getHand

方法声明: public EquipmentSlot getHand()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> Gets the hand used to shear the entity.
>
> @return the hand
>
>
> 
> 该方法用于获取剪毛时所使用的手，即主手或副手。
>
> @return 剪毛时所使用的手。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;