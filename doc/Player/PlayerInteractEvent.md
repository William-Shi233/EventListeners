---
description: PlayerInteractEvent
---

# PlayerInteractEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerInteractEvent

### 类描述

> Represents an event that is called when a player interacts with an object or
>
> air, potentially fired once for each hand. The hand can be determined using
>
> {@link #getHand()}.
>
> <p>
>
> This event will fire as cancelled if the vanilla behavior is to do nothing
>
> (e.g interacting with air). For the purpose of avoiding doubt, this means
>
> that the event will only be in the cancelled state if it is fired as a result
>
> of some prediction made by the server where no subsequent code will run,
>
> rather than when the subsequent interaction activity (e.g. placing a block in
>
> an illegal position ({@link BlockCanBuildEvent}) will fail.

### 方法列表

#### getAction

方法声明: public Action getAction()

方法签名: ()Lorg/bukkit/event/block/Action;

> Returns the action type
>
> @return Action returns the type of interaction

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

> Gets the cancellation state of this event. Set to true if you want to
>
> prevent buckets from placing water and so forth
>
> @return boolean cancellation state
>
> @deprecated This event has two possible cancellation states, one for
>
> {@link #useInteractedBlock()} and one for {@link #useItemInHand()}. It is
>
> possible a call might have the former false, but the latter true, eg in
>
> the case of using a firework whilst gliding. Callers should check the
>
> relevant methods individually.

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Sets the cancellation state of this event. A canceled event will not be
>
> executed in the server, but will still pass to other plugins
>
> <p>
>
> Canceling this event will prevent use of food (player won't lose the
>
> food item), prevent bows/snowballs/eggs from firing, etc. (player won't
>
> lose the ammo)
>
> @param cancel true if you wish to cancel this event

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Returns the item in hand represented by this event
>
> @return ItemStack the item used

#### getMaterial

方法声明: public Material getMaterial()

方法签名: ()Lorg/bukkit/Material;

> Convenience method. Returns the material of the item represented by
>
> this event
>
> @return Material the material of the item used

#### hasBlock

方法声明: public boolean hasBlock()

方法签名: ()Z

> Check if this event involved a block
>
> @return boolean true if it did

#### hasItem

方法声明: public boolean hasItem()

方法签名: ()Z

> Check if this event involved an item
>
> @return boolean true if it did

#### isBlockInHand

方法声明: public boolean isBlockInHand()

方法签名: ()Z

> Convenience method to inform the user whether this was a block
>
> placement event.
>
> @return boolean true if the item in hand was a block

#### getClickedBlock

方法声明: public Block getClickedBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the clicked block
>
> @return Block returns the block clicked with this item.

#### getBlockFace

方法声明: public BlockFace getBlockFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Returns the face of the block that was clicked
>
> @return BlockFace returns the face of the block that was clicked

#### useInteractedBlock

方法声明: public Result useInteractedBlock()

方法签名: ()Lorg/bukkit/event/Event/Result;

> This controls the action to take with the block (if any) that was
>
> clicked on. This event gets processed for all blocks, but most don't
>
> have a default action
>
> @return the action to take with the interacted block

#### setUseInteractedBlock

方法声明: public void setUseInteractedBlock(@NotNull Result useInteractedBlock)

方法签名: (Lorg/bukkit/event/Event/Result;)V

> @param useInteractedBlock the action to take with the interacted block

#### useItemInHand

方法声明: public Result useItemInHand()

方法签名: ()Lorg/bukkit/event/Event/Result;

> This controls the action to take with the item the player is holding.
>
> This includes both blocks and items (such as flint and steel or
>
> records). When this is set to default, it will be allowed if no action
>
> is taken on the interacted block.
>
> @return the action to take with the item in hand

#### setUseItemInHand

方法声明: public void setUseItemInHand(@NotNull Result useItemInHand)

方法签名: (Lorg/bukkit/event/Event/Result;)V

> @param useItemInHand the action to take with the item in hand

#### getHand

方法声明: public EquipmentSlot getHand()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> The hand used to perform this interaction. May be null in the case of
>
> {@link Action#PHYSICAL}.
>
> @return the hand used to interact. May be null.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;