---
description: EntityTargetEvent
---

# EntityTargetEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTargetEvent

### 类描述

> Called when a creature targets or untargets another entity

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getReason

方法声明: public TargetReason getReason()

方法签名: ()Lorg/bukkit/event/entity/EntityTargetEvent/TargetReason;

> Returns the reason for the targeting
>
> @return The reason

#### getTarget

方法声明: public Entity getTarget()

方法签名: ()Lorg/bukkit/entity/Entity;

> Get the entity that this is targeting.
>
> <p>
>
> This will be null in the case that the event is called when the mob
>
> forgets its target.
>
> @return The entity

#### setTarget

方法声明: public void setTarget(@Nullable Entity target)

方法签名: (Lorg/bukkit/entity/Entity;)V

> Set the entity that you want the mob to target instead.
>
> <p>
>
> It is possible to be null, null will cause the entity to be
>
> target-less.
>
> <p>
>
> This is different from cancelling the event. Cancelling the event will
>
> cause the entity to keep an original target, while setting to be null
>
> will cause the entity to be reset.
>
> @param target The entity to target

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: TargetReason

> An enum to specify the reason for the targeting

#### TARGET_DIED

> When the entity's target has died, and so it no longer targets it

#### CLOSEST_PLAYER

> When the entity doesn't have a target, so it attacks the nearest
>
> player

#### TARGET_ATTACKED_ENTITY

> When the target attacks the entity, so entity targets it

#### PIG_ZOMBIE_TARGET

> When the target attacks a fellow pig zombie, so the whole group
>
> will target him with this reason.
>
> @deprecated obsoleted by {@link #TARGET_ATTACKED_NEARBY_ENTITY}

#### FORGOT_TARGET

> When the target is forgotten for whatever reason.

#### TARGET_ATTACKED_OWNER

> When the target attacks the owner of the entity, so the entity
>
> targets it.

#### OWNER_ATTACKED_TARGET

> When the owner of the entity attacks the target attacks, so the
>
> entity targets it.

#### RANDOM_TARGET

> When the entity has no target, so the entity randomly chooses one.

#### DEFEND_VILLAGE

> When an entity selects a target while defending a village.

#### TARGET_ATTACKED_NEARBY_ENTITY

> When the target attacks a nearby entity of the same type, so the entity targets it

#### REINFORCEMENT_TARGET

> When a zombie targeting an entity summons reinforcements, so the reinforcements target the same entity

#### COLLISION

> When an entity targets another entity after colliding with it.

#### CUSTOM

> For custom calls to the event.

#### CLOSEST_ENTITY

> When the entity doesn't have a target, so it attacks the nearest
>
> entity

#### FOLLOW_LEADER

> When a raiding entity selects the same target as one of its compatriots.

#### TEMPT

> When another entity tempts this entity by having a desired item such
>
> as wheat in it's hand.

#### UNKNOWN

> A currently unknown reason for the entity changing target.