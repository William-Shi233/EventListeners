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
> <br>
> 
> 当玩家修剪实体时触发。
> 
> <br>
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
> <br>
> 
> 该方法用于获取被涉事玩家修剪的实体。
> 
> @return 被涉事玩家修剪的实体。

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the item used to shear the entity.
> 
> @return the shears
> 
> <br>
> 
> 该方法用于获取修剪涉事实体时所使用的工具。
> 
> @return 涉事剪刀物品堆。

#### getHand

方法声明: public EquipmentSlot getHand()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> Gets the hand used to shear the entity.
> 
> @return the hand
> 
> <br>
> 
> 该方法用于获取修剪涉事实体时所使用的手。
> 
> @return 涉事的手。
> 
> <br>
> 
> 译注：一般而言，涉及玩家交互时，交互行为只与主副手有关，而与左右手无关。玩家以左手为主手，和以右手为主手进行交互时，没有除客户端画面显示以外的区别。如欲监听玩家设定主手，可参见 `PlayerChangedMainHandEvent` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;