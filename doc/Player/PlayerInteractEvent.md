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
>
> 当玩家与某物品或空气交互时触发。如果玩家的主副手都发生了交互，则本事件可能触发两次。通过 `getHand()` 方法可确定玩家正使用哪只手进行交互。
>
> 如果在原版中，玩家交互动作的结果是什么都不会发生（比如玩家点击空气），那么本事件在被触发时即处于被取消状态。这句话指的是，当且仅当服务器推定玩家这次交互不会导致任何代码被执行时，本事件在被触发时才会处于被取消状态。如果玩家这次交互将会失败（比如玩家尝试在一个不合法的位置放置方块），本事件在被触发时不会处于被取消状态。

### 方法列表

#### getAction

方法声明: public Action getAction()

方法签名: ()Lorg/bukkit/event/block/Action;

> Returns the action type
>
> @return Action returns the type of interaction
>
> 该方法用于获取交互时的动作种类。
>
> @return 交互时的动作种类。

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
>
> @deprecated 该方法已过时。本事件有两个层面，各自之取消与否可用两个方法确定，分别为 `useInteractedBlock()` 方法和 `useItemInHand()` 方法。前者返回 `false` 时，后者也可能返回 `true` ，比如玩家在使用鞘翅滑翔时右键使用烟花火箭。用户应当分别使用这两个方法来确定本事件是否取消。
>
> 译注：原文第一段为所有 `isCancelled` 方法共用的文档，不赘。
>
> 请一并阅读 `setCancelled` 方法文档。

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
>
> 如果取消本事件，则玩家将无法食用任何物品（食物不会被消耗）、无法射箭、抛掷雪球、鸡蛋（抛射物不会被消耗）。
>
> 译注：原文第一段为所有 `isCancelled` 方法共用的文档，不赘。
>
> 请一并阅读 `isCancelled` 方法文档。

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Returns the item in hand represented by this event
>
> @return ItemStack the item used
>
> 该方法用于获取玩家触发事件的那一侧手所持的物品堆。
>
> @return 玩家触发事件的那一侧手所持的物品堆。

#### getMaterial

方法声明: public Material getMaterial()

方法签名: ()Lorg/bukkit/Material;

> Convenience method. Returns the material of the item represented by
>
> this event
>
> @return Material the material of the item used
>
> 该方法用于获取玩家触发事件的那一侧手所持的物品堆的材质。该方法相当于 `getItem().getType()` ，不过更简便。
>
> @return 玩家触发事件的那一侧手所持的物品堆的材质。

#### hasBlock

方法声明: public boolean hasBlock()

方法签名: ()Z

> Check if this event involved a block
>
> @return boolean true if it did
>
> 该方法用于获取事件是否与方块有关。
>
> @return 如果事件与方块有关则返回 `true` 。

#### hasItem

方法声明: public boolean hasItem()

方法签名: ()Z

> Check if this event involved an item
>
> @return boolean true if it did
>
> 该方法用于获取事件是否与物品有关。
>
> @return 如果事件与物品有关则返回 `true` 。

#### isBlockInHand

方法声明: public boolean isBlockInHand()

方法签名: ()Z

> Convenience method to inform the user whether this was a block
>
> placement event.
>
> @return boolean true if the item in hand was a block
>
> 该方法用于获取事件是否因玩家放置方块而触发。
>
> @return 如果玩家手中的物品堆为可放置的方块（即物品、方块共用同一材质）则返回 `true` 。

#### getClickedBlock

方法声明: public Block getClickedBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the clicked block
>
> @return Block returns the block clicked with this item.
>
> 该方法用于获取玩家点击的方块。
>
> @return 玩家手持着物品点击的方块。

#### getBlockFace

方法声明: public BlockFace getBlockFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Returns the face of the block that was clicked
>
> @return BlockFace returns the face of the block that was clicked
>
> 该方法用于获取玩家点击的方块面。
>
> @return 被点击的方块面。

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
>
> 在事件中有方块被点击时，该方法用于确定要采取何种行为。尽管点击任何方块都会触发本事件，但大部分方块都没有点击后的默认行为。
>
> @return 要对方块采取的行为。

#### setUseInteractedBlock

方法声明: public void setUseInteractedBlock(@NotNull Result useInteractedBlock)

方法签名: (Lorg/bukkit/event/Event/Result;)V

> @param useInteractedBlock the action to take with the interacted block
>
> @param 要对方块采取的行为。
>
> 译注：参见 `useInteractedBlock()` 方法。

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
>
> 在玩家手持物品不为空时，该方法用于确定要采取何种行为。玩家手持方块或非方块的物品时，物品都有可能被使用、被消耗（对于方块而言，是放置方块，而对于非方块的物品而言，可能是打火石点火，抑或是唱片被播放）。如果本方法返回值为 `Result.DEFAULT` ，则也有可能不采取任何行为。
>
> @return 要对手持物品采取的行为。

#### setUseItemInHand

方法声明: public void setUseItemInHand(@NotNull Result useItemInHand)

方法签名: (Lorg/bukkit/event/Event/Result;)V

> @param useItemInHand the action to take with the item in hand
>
> @param 要对手持物品采取的行为。
>
> 译注：参见 `useItemInHand()` 方法。

#### getHand

方法声明: public EquipmentSlot getHand()

方法签名: ()Lorg/bukkit/inventory/EquipmentSlot;

> The hand used to perform this interaction. May be null in the case of
>
> {@link Action#PHYSICAL}.
>
> @return the hand used to interact. May be null.
>
> 该方法用于获取交互时所使用的那一侧手。如果 `getAction()` 方法返回 `Action#PHYSICAL` 则本方法返回 `null` 。
>
> @return 交互时所使用的那一侧手。本方法可能返回 `null` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;