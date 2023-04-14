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
> <br>
> 
> 当玩家与某物品或空气交互时触发。有时，同一次交互行为可能会两次触发本事件，主副手各一次。通过 `getHand()` 方法可确定玩家正使用哪只手进行交互。
> 
> 如果在原版游戏规则中，玩家本次交互动作的结果是什么都不会发生（比如玩家点击空气），那么本事件在被触发时即处于被取消状态。为免于歧义，有必要详细对这句话作解释。这句话指的是，当且仅当服务器推定玩家这次交互不会导致任何代码被执行时，本事件在被触发时才会处于被取消状态。如果玩家这次交互将会失败（比如玩家尝试在一个不合法的位置放置方块），本事件在被触发时不会处于被取消状态。
> 
> <br>
> 
> 译注：所谓“主副手各一次”，指玩家自认为自己在客户端按下了一次鼠标，进行了一次交互，但服务端触发了两次事件。在一次点击中，主手和副手都进行了交互，使得监听器被调用了两次。在部分情况下，可能同一次点击会触发交互事件两次以上。解决方法是设定一个间隔变量，连续两次触发之间的间隔过小时，不予执行任何代码。
> 
> ```
> Map<UUID, Long> intervals = new HashMap<>(256);
> 
> @EventHandler
> public void onInteract(PlayerInteractEvent event) {
>   var uuid = event.getPlayer().getUniqueId();
>   if (intervals.containsKey(uuid)) {
>     if (System.currentTimeMillis() - intervals.get(uuid) < 50) {
>       return;
>     }
>   }
>   intervals.put(uuid, System.currentTimeMillis());
>   // Do something.
> }
> ```
> 
> 不要轻易保存 `Player` 对象，以免使 JVM 在玩家下线后无法完成垃圾回收。使用 `UUID` 是最简单方便的。

### 方法列表

#### getAction

方法声明: public Action getAction()

方法签名: ()Lorg/bukkit/event/block/Action;

> Returns the action type
> 
> @return Action returns the type of interaction
> 
> <br>
> 
> 该方法用于获取交互时的动作种类。
> 
> @return 一个 `Action` 枚举字段，用于确定交互时的动作种类。
> 
> <br>
> 
> 译注：所谓“动作种类”，即通常所说的“左键点击空气”、“右键点击方块”等动作。

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
> <br>
> 
> @deprecated 该方法已过时。本事件有两个层面，各自之取消与否可用两个方法确定，分别为 `useInteractedBlock()` 方法和 `useItemInHand()` 方法。前者返回 `false` 时，后者也可能返回 `true` ，比如玩家在使用鞘翅滑翔时右键使用烟花火箭。用户应当分别使用这两个方法来确定本事件是否取消。
> 
> <br>
> 
> 译注：原文第一段为所有 `isCancelled` 方法共用的文档，不赘。
> 
> `useInteractedBlock()` 和 `useItemInHand()` 方法返回的是 `Event.Result` ，不是布尔值。`Event.Result` 所承载的含义比布尔值更精确。其枚举字段中，`ALLOW` 代表强行允许，`DENY` 代表强行禁止，而 `DEFAULT` 代表的是“按照原版游戏规则处理”。
> 
> 当玩家使用鞘翅滑翔时，对着空气右键使用烟花火箭，会消耗烟花火箭来推进己身，因而从“是否涉及手中物品”层面来看，玩家的确使用了手中物品，`useItemInHand()` 方法应当返回 `DEFAULT` ，也就是按原版游戏规则处理。原版游戏规则中，烟花火箭物品堆会被消耗，然后玩家加速。但是从“是否涉及被点击的方块”层面来看，玩家使用烟花火箭的过程不应该影响空气方块，所以 `useInteractedBlock()` 方法返回 `DENY` ，即强行禁止。
> 
> 请一并阅读 `setCancelled` 方法文档。

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

> Sets the cancellation state of this event. A canceled event will not be
> 
> executed in the server, but will still pass to other plugins
> 
> Canceling this event will prevent use of food (player won't lose the
> 
> food item), prevent bows/snowballs/eggs from firing, etc. (player won't
> 
> lose the ammo)
> 
> @param cancel true if you wish to cancel this event
> 
> <br>
> 
> 如果取消本事件，则玩家将无法食用任何物品（食物不会被消耗）、无法射箭、抛掷雪球、鸡蛋（抛射物不会被消耗）。
> 
> <br>
> 
> 译注：原文第一段为所有 `isCancelled` 方法共用的文档，不赘。
> 
> `useInteractedBlock()` 和 `useItemInHand()` 方法返回的是 `Event.Result` ，不是布尔值。`Event.Result` 所承载的含义比布尔值更精确。其枚举字段中，`ALLOW` 代表强行允许，`DENY` 代表强行禁止，而 `DEFAULT` 代表的是“按照原版游戏规则处理”。
> 
> 当玩家食用物品时（假设该物品不会给玩家施加药水效果），会消耗手中物品堆，增加饱食度。因而从“是否涉及手中物品”层面来看，玩家的确使用了手中物品，`useItemInHand()` 方法应当返回 `DEFAULT` ，也就是按原版游戏规则处理。原版游戏规则中，食物物品堆会被消耗，然后玩家饱食度增加。但是从“是否涉及被点击的方块”层面来看，玩家使用物品堆的过程不应该影响任何方块，所以 `useInteractedBlock()` 方法返回 `DENY` ，即强行禁止。
> 
> 请一并阅读 `isCancelled` 方法文档。

#### getItem

方法声明: public ItemStack getItem()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> Returns the item in hand represented by this event
> 
> @return ItemStack the item used
> 
> <br>
> 
> 该方法用于获取玩家触发事件时所持的物品堆。
> 
> @return 涉事物品堆。

#### getMaterial

方法声明: public Material getMaterial()

方法签名: ()Lorg/bukkit/Material;

> Convenience method. Returns the material of the item represented by
> 
> this event
> 
> @return Material the material of the item used
> 
> <br>
> 
> 该方法用于获取玩家触发事件时所持的物品堆的材质。该方法是 `getItem().getType()` 的简写。
> 
> @return 涉事物品堆的材质。

#### hasBlock

方法声明: public boolean hasBlock()

方法签名: ()Z

> Check if this event involved a block
> 
> @return boolean true if it did
> 
> <br>
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
> <br>
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
> <br>
> 
> 该方法用于获取事件是否因玩家放置方块而触发。该方法是 `getItem().getType().isBlock()` 的简写。
> 
> @return 如果玩家手中的物品堆为可放置的方块（即物品、方块共用同一材质）则返回 `true` 。

#### getClickedBlock

方法声明: public Block getClickedBlock()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the clicked block
> 
> @return Block returns the block clicked with this item.
> 
> <br>
> 
> 该方法用于获取玩家点击的方块。
> 
> @return 玩家手持涉事物品点击的方块。

#### getBlockFace

方法声明: public BlockFace getBlockFace()

方法签名: ()Lorg/bukkit/block/BlockFace;

> Returns the face of the block that was clicked
> 
> @return BlockFace returns the face of the block that was clicked
> 
> <br>
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
> <br>
> 
> 当有方块被点击时，可以利用该方法决定要采取的措施。尽管玩家点击任何方块都会触发本事件，但默认情况下，点击多数方块都不会发生任何事。
> 
> @return 要对方块采取的行为。
> 
> <br>
> 
> 译注：参见 `isCancelled()` 方法和 `setCancelled(boolean)` 方法。

#### setUseInteractedBlock

方法声明: public void setUseInteractedBlock(@NotNull Result useInteractedBlock)

方法签名: (Lorg/bukkit/event/Event/Result;)V

> @param useInteractedBlock the action to take with the interacted block
> 
> @param useInteractedBlock 要对方块采取的行为。
> 
> <br>
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
> <br>
> 
> 在玩家手持物品不为空时，该方法用于确定要采取何种行为。玩家手持方块或非方块的物品时，物品都有可能被使用、被消耗（对于方块而言，是放置方块，而对于非方块的物品而言，可能是打火石点火，抑或是唱片被播放）。如果本方法返回值为 `Result.DEFAULT` ，也有可能不对被点击的方块实行任何操作。
> 
> @return 要对手持物品采取的行为。
> 
> <br>
> 
> 译注：参见 `isCancelled()` 方法和 `setCancelled(boolean)` 方法。

#### setUseItemInHand

方法声明: public void setUseItemInHand(@NotNull Result useItemInHand)

方法签名: (Lorg/bukkit/event/Event/Result;)V

> @param useItemInHand the action to take with the item in hand
> 
> @param useItemInHand 要对手持物品采取的行为。
> 
> <br>
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
> <br>
> 
> 该方法用于获取交互时所使用的那一侧手。如果 `getAction()` 方法返回 `Action#PHYSICAL` 则本方法返回 `null` 。
> 
> @return 交互时所使用的那一侧手。本方法可能返回 `null` 。
> 
> <br>
> 
> 译注：一般而言，涉及玩家交互时，交互行为只与主副手有关，而与左右手无关。玩家以左手为主手，和以右手为主手进行交互时，没有除客户端画面显示以外的区别。如欲监听玩家设定主手，可参见 `PlayerChangedMainHandEvent` 。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;