---
description: EntityExhaustionEvent
---

# EntityExhaustionEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityExhaustionEvent

### 类描述

> Called when a human entity experiences exhaustion.
>
> An exhaustion level greater than 4.0 causes a decrease in saturation by 1.

### 方法列表

#### getExhaustionReason

方法声明: public ExhaustionReason getExhaustionReason()

方法签名: ()Lorg/bukkit/event/entity/EntityExhaustionEvent/ExhaustionReason;

> Gets the {@link ExhaustionReason} for this event
>
> @return the exhaustion reason

#### getExhaustion

方法声明: public float getExhaustion()

方法签名: ()F

> Get the amount of exhaustion to add to the player's current exhaustion.
>
> @return amount of exhaustion

#### setExhaustion

方法声明: public void setExhaustion(float exhaustion)

方法签名: (F)V

> Set the exhaustion to apply to the player.
>
> The maximum exhaustion that a player can have is 40. No error will be
>
> thrown if this limit is hit. This value may be negative, but there is
>
> unknown behavior for when exhaustion is below 0.
>
> @param exhaustion new exhaustion to add

#### getEntity

方法声明: public HumanEntity getEntity()

方法签名: ()Lorg/bukkit/entity/HumanEntity;

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

### 枚举: ExhaustionReason

> The reason for why a PlayerExhaustionEvent takes place

#### BLOCK_MINED

> Player mines a block

#### HUNGER_EFFECT

> Player has the hunger potion effect

#### DAMAGED

> Player takes damage

#### ATTACK

> Player attacks another entity

#### JUMP_SPRINT

> Player is sprint jumping

#### JUMP

> Player jumps

#### SWIM

> Player swims one centimeter

#### WALK_UNDERWATER

> Player walks underwater one centimeter

#### WALK_ON_WATER

> Player moves on the surface of water one centimeter

#### SPRINT

> Player sprints one centimeter

#### CROUCH

> Player crouches one centimeter (does not effect exhaustion, but fires
>
> nonetheless)

#### WALK

> Player walks one centimeter (does not effect exhaustion, but fires
>
> nonetheless)

#### REGEN

> Player regenerated health

#### UNKNOWN

> Unknown exhaustion reasonOUCH

> > The reason for why a PlayerExhaustionEvent takes place

#### WALK

> > The reason for why a PlayerExhaustionEvent takes place

#### REGEN

> > The reason for why a PlayerExhaustionEvent takes place

#### UNKNOWN

> > The reason for why a PlayerExhaustionEvent takes place