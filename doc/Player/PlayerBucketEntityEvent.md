---
description: PlayerBucketEntityEvent
---

# PlayerBucketEntityEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerBucketEntityEvent

### 类描述

> This event is called whenever a player captures an entity in a bucket.

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the {@link Entity} being put into the bucket.
>
> @return The {@link Entity} being put into the bucket

#### getOriginalBucket

方法声明: public ItemStack getOriginalBucket()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the bucket used to capture the {@link Entity}.
>
> This refers to the bucket clicked with, eg {@link Material#WATER_BUCKET}.
>
> @return The used bucket

#### getEntityBucket

方法声明: public ItemStack getEntityBucket()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the bucket that the {@link Entity} will be put into.
>
> This refers to the bucket with the entity, eg
>
> {@link Material#PUFFERFISH_BUCKET}.
>
> @return The bucket that the {@link Entity} will be put into

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