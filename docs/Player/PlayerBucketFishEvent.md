---
description: PlayerBucketFishEvent
---

# PlayerBucketFishEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerBucketEntityEvent

                =>  org.bukkit.event.player.PlayerBucketFishEvent

### 类描述

> This event is called whenever a player attempts to put a fish in a bucket.
>
> @deprecated Use the more generic {@link PlayerBucketEntityEvent}
> 
>
> 
> 当玩家用桶捕捉鱼时触发。
>
> @deprecated 本事件已过时。请使用 `PlayerBucketEntityEvent` 。

### 方法列表

#### getEntity

方法声明: public Fish getEntity()

方法签名: ()Lorg/bukkit/entity/Fish;

> Gets the fish involved with this event.
>
> @return The fish involved with this event
> 
>
> 
> 译注：请使用 `PlayerBucketEntityEvent` 。本事件已经过时。

#### getWaterBucket

方法声明: public ItemStack getWaterBucket()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the bucket used.
>
> This refers to the bucket clicked with, ie {@link Material#WATER_BUCKET}.
>
> @return The used bucket
>
> @deprecated Use {@link #getOriginalBucket()}
> 
>
> 
> 译注：请使用 `PlayerBucketEntityEvent` 。本事件已经过时。

#### getFishBucket

方法声明: public ItemStack getFishBucket()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the bucket that the fish will be put into.
>
> This refers to the bucket with the fish, ie
>
> {@link Material#PUFFERFISH_BUCKET}.
>
> @return The bucket that the fish will be put into
>
> @deprecated Use {@link #getEntityBucket()}
> 
>
> 
> 译注：请使用 `PlayerBucketEntityEvent` 。本事件已经过时。