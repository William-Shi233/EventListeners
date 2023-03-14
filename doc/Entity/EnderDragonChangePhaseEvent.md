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
>
> 当末影龙的控制器切换了末影龙所处的行为状态时触发。
>
> 译注：所谓“控制器”，通俗而言即末影龙的 `AI` 。末影龙的行为状态有很多种，比如向玩家俯冲、悬停于传送门上方、绕主岛盘旋等。当末影龙的 `AI` 切换行为状态时，本事件会触发。

### 方法列表

#### getEntity

方法声明: public EnderDragon getEntity()

方法签名: ()Lorg/bukkit/entity/EnderDragon;

> 译注：无文档。该方法用于获取事件中的末影龙。

#### getCurrentPhase

方法声明: public EnderDragon.Phase getCurrentPhase()

方法签名: ()Lorg/bukkit/entity/EnderDragon/Phase;

> Gets the current phase that the dragon is in. This method will return null
>
> when a dragon is first spawned and hasn't yet been assigned a phase.
>
> @return the current dragon phase
>
> 该方法用于获取末影龙当前的行为状态。如果末影龙刚刚生成，还没有行为状态，则本方法返回 `null` 。
>
> @return 末影龙当前的行为状态。
>
> 译注：当末影龙刚刚生成时，还没有行为状态，即行为状态是 `null` 。此时要给末影龙施加一个悬停在传送门上空的行为状态作为其初始的行为状态，即新的行为状态是 `EnderDragon.Phase#HOVER` 。而赋予第一个行为状态的操作，同样也会触发本事件。

#### getNewPhase

方法声明: public EnderDragon.Phase getNewPhase()

方法签名: ()Lorg/bukkit/entity/EnderDragon/Phase;

> Gets the new phase that the dragon will switch to.
>
> @return the new dragon phase
>
> 该方法用于获取末影龙将要切换入的行为状态。
>
> @return 末影龙将要切换入的行为状态。

#### setNewPhase

方法声明: public void setNewPhase(@NotNull EnderDragon.Phase newPhase)

方法签名: (Lorg/bukkit/entity/EnderDragon/Phase;)V

> Sets the new phase for the ender dragon.
>
> @param newPhase the new dragon phase
>
> 该方法用于设置末影龙将要切换入的行为状态。
>
> @param 末影龙将要切换入的行为状态。

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