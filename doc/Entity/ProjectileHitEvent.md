---
description: ProjectileHitEvent
---

# ProjectileHitEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.ProjectileHitEvent

### 类描述

> Called when a projectile hits an object

### 方法列表

#### getEntity

方法声明: public Projectile getEntity()

方法签名: ()Lorg/bukkit/entity/Projectile;

#### getHitBlock

方法声明: public Block getHitBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block that was hit, if it was a block that was hit.
>
> @return hit block or else null

#### getHitBlockFace

方法声明: public BlockFace getHitBlockFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Gets the block face that was hit, if it was a block that was hit and the
>
> face was provided in the vent.
>
> @return hit face or else null

#### getHitEntity

方法声明: public Entity getHitEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity that was hit, if it was an entity that was hit.
>
> @return hit entity or else null

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Whether to cancel the action that occurs when the projectile hits.
>
> In the case of an entity, it will not collide (unless it's a firework,
>
> then use {@link FireworkExplodeEvent}).
>
> <br>
>
> In the case of a block, some blocks (eg target block, bell) will not
>
> perform the action associated.
>
> <br>
>
> This does NOT prevent block collisions, and explosions will still occur
>
> unless their respective events are cancelled.
>
> @param cancel true if you wish to cancel this event

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;