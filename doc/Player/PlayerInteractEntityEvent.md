---
description: PlayerInteractEntityEvent
---

# PlayerInteractEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerInteractEntityEvent

### 类描述

> Represents an event that is called when a player right clicks an entity.

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getRightClicked

方法声明: public Entity getRightClicked()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity that was right-clicked by the player.
>
> @return entity right clicked by player

#### getHand

方法声明: public EquipmentSlot getHand()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> The hand used to perform this interaction.
>
> @return the hand used to interact

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;