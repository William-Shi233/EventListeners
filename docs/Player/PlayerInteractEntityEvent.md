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
> 
> <br>
> 
> 当玩家右键实体时触发。
> 
> <br>
> 
> 译注：见 `PlayerInteractAtEntityEvent` 。在一般情况下，建议监听本事件而非 `PlayerInteractAtEntityEvent` 。

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
> 
> <br>
> 
> 该方法用于获取被玩家右键点击的实体。
> 
> @return 被玩家右键点击的实体。

#### getHand

方法声明: public EquipmentSlot getHand()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> The hand used to perform this interaction.
> 
> @return the hand used to interact
> 
> <br>
> 
> 该方法用于获取玩家点击时所使用的手。
> 
> @return 玩家点击时所使用的手。
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