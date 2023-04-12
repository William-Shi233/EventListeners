---
description: RaidTriggerEvent
---

# RaidTriggerEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.world.WorldEvent

            =>  org.bukkit.event.raid.RaidEvent

                =>  org.bukkit.event.raid.RaidTriggerEvent

### 类描述

> Called when a {@link Raid} is triggered (e.g: a player with Bad Omen effect
>
> enters a village).
>
>
> 
> 当一场袭击被引动时触发。比如有一个携带不祥之兆效果的玩家进入村庄时，其人会引发一场袭击。
>
>
> 
> 译注：目前仅有身怀不祥之兆的玩家进入村庄这一种引动袭击的途径。

### 方法列表

#### getPlayer

方法声明: public Player getPlayer()

方法签名: ()Lorg/bukkit/entity/Player;

> Returns the player who triggered the raid.
>
> @return triggering player
>
>
> 
> 该方法用于获取引动袭击的玩家。
>
> @return 引动袭击的玩家。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;