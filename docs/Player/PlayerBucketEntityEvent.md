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
>
>
> 
> 当玩家用桶捕捉生物时触发。
>
>
> 
> 译注：参见 `MineCraft Wiki` 的相关页面 [https://minecraft.fandom.com/wiki/Bucket_of_aquatic_mob#History](https://minecraft.fandom.com/wiki/Bucket_of_aquatic_mob#History) 可知，自 `1.13` 起，玩家可以使用桶来捕鱼，于是 `Bukkit API` 中出现了 `PlayerBucketFishEvent` 。然而随着版本更迭，桶可用于抓捕美西螈、蝌蚪等生物，不再局限于鱼类。因此出现了本事件。出于版本向下兼容性（高版本服务端兼容基于低版本 `Bukkit API` 所编写的插件）考虑，`PlayerBucketFishEvent` 仍予以保留，但高版本插件应当尽可能使用本事件替代 `PlayerBucketFishEvent` 。

### 方法列表

#### getEntity

方法声明: public Entity getEntity()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the {@link Entity} being put into the bucket.
>
> @return The {@link Entity} being put into the bucket
>
>
> 
> 该方法用于获取将被装入桶里的实体。
>
> @return 将被装入桶里的实体。

#### getOriginalBucket

方法声明: public ItemStack getOriginalBucket()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Gets the bucket used to capture the {@link Entity}.
>
> This refers to the bucket clicked with, eg {@link Material#WATER_BUCKET}.
>
> @return The used bucket
>
>
> 
> 该方法用于获取捕捉实体时所持的桶。
>
> 本方法的返回值是指玩家点击实体时所使用的物品堆，比如材质为 `Material#WATER_BUCKET` 的水桶物品堆。
>
> @return 捕捉实体时所持的桶。

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
>
>
> 
> 该方法用于获取捕捉实体后所得的桶。
>
> 本方法的返回值是指装有被抓实体的物品堆，比如材质为 `Material#PUFFERFISH_BUCKET` 的河豚桶物品堆。
>
> @return 捕捉实体后所得的桶。

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