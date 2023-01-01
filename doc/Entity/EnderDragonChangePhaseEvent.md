---
description: EnderDragonChangePhaseEvent
---

# EnderDragonChangePhaseEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EnderDragonChangePhaseEvent

### 类描述

> Called when an EnderDragon switches controller phase.

### 方法列表

#### getEntity

方法声明: public EnderDragon getEntity()

方法签名: ()Lorg/bukkit/entity/EnderDragon;

#### getCurrentPhase

方法声明: public EnderDragon.Phase getCurrentPhase()

方法签名: ()Lorg/bukkit/entity/EnderDragon/Phase;

> Gets the current phase that the dragon is in. This method will return null
>
> when a dragon is first spawned and hasn't yet been assigned a phase.
>
> @return the current dragon phase

#### getNewPhase

方法声明: public EnderDragon.Phase getNewPhase()

方法签名: ()Lorg/bukkit/entity/EnderDragon/Phase;

> Gets the new phase that the dragon will switch to.
>
> @return the new dragon phase

#### setNewPhase

方法声明: public void setNewPhase(@NotNull EnderDragon.Phase newPhase)

方法签名: (Lorg/bukkit/entity/EnderDragon/Phase;)V

> Sets the new phase for the ender dragon.
>
> @param newPhase the new dragon phase

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