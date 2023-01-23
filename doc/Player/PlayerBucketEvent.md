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
>
> 代表玩家手持桶进行交互时触发的事件。
>
> 译注：该事件未实现 `getHandlers` 和 `getHandlerList` 方法，无法直接监听。

### 方法列表

#### getBucket

方法声明: public Material getBucket()

方法签名: ()Lorg/bukkit/Material;

> Returns the bucket used in this event
>
> @return the used bucket
>
> 该方法用于获取桶的材质。
>
> @return 事件中桶的材质。

#### getItemStack

方法声明: public ItemStack getItemStack()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Get the resulting item in hand after the bucket event
>
> @return ItemStack hold in hand after the event.
>
> 该方法用于获取事件发生以后所生成的新物品堆，该物品堆将被放入玩家手中。
>
> @return 将要放入玩家手中的物品堆。

#### setItemStack

方法声明: public void setItemStack(@Nullable ItemStack itemStack)

方法签名: (Lorg/bukkit/inventory/ItemStack;)V

> Set the item in hand after the event
>
> @param itemStack the new held ItemStack after the bucket event.
> 
> 该方法用于设置事件发生以后所生成的新物品堆，该物品堆将被放入玩家手中。
>
> @param 将要放入玩家手中的物品堆。

#### getBlock

方法声明: public final Block getBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Gets the block involved in this event.
>
> @return The Block which block is involved in this event
>
> 该方法用于获取事件中的方块。
>
> @return 事件中的方块。
>
> 译注：就倒空桶事件而言，本方法返回将要填入水或岩浆的方块。就装满桶事件而言，本方法返回水源或岩浆源方块。如果是用桶获取奶，本方法返回产奶生物的位置所对应的方块对象。

#### getBlockClicked

方法声明: public Block getBlockClicked()

方法签名: ()Lorg/bukkit/block/Block;

> Return the block clicked
>
> @return the clicked block
> 
> 该方法用于获取事件中被点击的方块。
>
> @return 事件中被点击的方块。
>
> 译注：就倒空桶事件而言，本方法返回右键点击的方块。就装满桶事件而言，本方法返回水源或岩浆源方块。如果是用桶获取奶，本方法返回产奶生物的位置所对应的方块对象。

#### getBlockFace

方法声明: public BlockFace getBlockFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Get the face on the clicked block
>
> @return the clicked face
> 
> 该方法用于获取事件中被点击的方块面。
> 
> @return 事件中被点击的方块面。
>
> 译注：如果是用桶获取奶，本方法返回 `null` 。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V