---
description: PlayerBucketEvent
---

# PlayerBucketEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerBucketEvent

### 类描述

> Called when a player interacts with a Bucket

### 方法列表

#### getBucket

方法声明: public Material getBucket()

方法签名: ()Lorg/bukkit/Material;

> Returns the bucket used in this event
>
> @return the used bucket

#### getItemStack

方法声明: public ItemStack getItemStack()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Get the resulting item in hand after the bucket event
>
> @return ItemStack hold in hand after the event.

#### setItemStack

方法声明: public void setItemStack(@Nullable ItemStack itemStack)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Set the item in hand after the event
>
> @param itemStack the new held ItemStack after the bucket event.

#### getBlock

方法声明: public final Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block involved in this event.
>
> @return The Block which block is involved in this event

#### getBlockClicked

方法声明: public Block getBlockClicked()

方法签名: ()Lorg/bukkit/block/Block;

> Return the block clicked
>
> @return the clicked block

#### getBlockFace

方法声明: public BlockFace getBlockFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Get the face on the clicked block
>
> @return the clicked face

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V