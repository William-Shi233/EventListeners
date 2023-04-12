---
description: PlayerFishEvent
---

# PlayerFishEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerFishEvent

### 类描述

> Thrown when a player is fishing
>
>
> 
> 当玩家钓鱼时触发。
>
>
> 
> 译注：不同于 `PlayerBucketEntityEvent` ，本事件在玩家使用钓鱼竿钓鱼时触发，而非用桶装入鱼时触发。而且在钓鱼过程中，本事件可能会触发很多次。
>
> 当玩家手持钓鱼竿甩出鱼漂时，无论鱼漂是否进入水中、是否钩住实体、是否接触到固体方块，都会立即触发一次本事件，`PlayerFishEvent.STATE` 为 `FISHING` 。
> 
> 当玩家甩出的鱼漂钩住实体时，不会触发本事件。当玩家甩出的鱼漂钩住了实体，且玩家右键收竿，将实体拉向自身时，将会触发本事件，`PlayerFishEvent.STATE` 为 `CAUGHT_ENTITY` 。
> 
> 当玩家甩出的鱼漂钩住固体方块时，不会触发本事件。当玩家甩出的鱼漂钩住了方块，且玩家右键收竿，将鱼漂收回时，将会触发本事件，`PlayerFishEvent.STATE` 为 `IN_GROUND` 。
> 
> 当玩家甩出的鱼漂无法钩住任何实体或方块，也无法接触水面时（比如从过高的高空甩出鱼漂时），在一段时间后鱼漂会被自动收回，不会触发本事件。如果鱼漂在空气中且玩家主动收竿，将会触发本事件，`PlayerFishEvent.STATE` 为 `REEL_IN` 。
> 
> 当鱼漂在水面上，且有鱼咬钩时，将会触发本事件，`PlayerFishEvent.STATE` 为 `BITE` 。每有鱼咬一次钩就触发一次本事件（玩家可能一直没有收竿，因此鱼多次咬钩又离开）。此后如果玩家没有及时收竿，让鱼游走了，将会触发本事件，`PlayerFishEvent.STATE` 为 `FAILED_ATTEMPT` 。每错过一次咬钩就触发一次本事件。当玩家及时右键钓鱼竿得到收获时，将会触发本事件，`PlayerFishEvent.STATE` 为 `CAUGHT_FISH` 。当玩家右键收回在水中的鱼漂且没有收获时（比如时间过短，没有鱼咬钩），将会触发本事件，`PlayerFishEvent.STATE` 为 `REEL_IN` 。
>
> 因此，一次钓鱼过程中，本事件可能会以如下顺序触发（使用 `PlayerFishEvent.STATE` 的字段表示）：
>
> FISHING -> BITE -> FAILED_ATTEMPT -> BITE -> CAUGHT_FISH （咬钩一次但错过了，第二次咬钩时钓上鱼）
>
> FISHING -> BITE -> FAILED_ATTEMPT -> REEL_IN （咬钩一次但错过了，随后收竿，没有收获）
> 
> FISHING -> REEL_IN （抛出鱼竿之后立刻收回）
> 
> FISHING -> IN_GROUND （鱼漂卡到方块里然后收回）
> 
> FISHING -> CAUGHT_ENTITY （鱼漂钩住生物然后收回）

### 方法列表

#### getCaught

方法声明: public Entity getCaught()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity caught by the player.
>
> If player has fished successfully, the result may be cast to {@link
>
> org.bukkit.entity.Item}.
>
> @return Entity caught by the player, Entity if fishing, and null if
>
> bobber has gotten stuck in the ground or nothing has been caught
>
>
> 
> 该方法用于获取玩家抓住的实体。
>
> 如果玩家并不是用鱼漂钩住实体，而是在水中钓鱼得到收获，那么会把钓上的物品堆转为物品实体，作为返回值。
>
> @return 玩家抓住的实体。如果鱼漂卡在方块里或没有钓上任何实体，则返回 `null` 。

#### getHook

方法声明: public FishHook getHook()

方法签名: ()Lorg/bukkit/entity/FishHook;

> Gets the fishing hook.
>
> @return the entity representing the fishing hook/bobber.
>
>
> 
> 该方法用于获取鱼漂实体。
>
> @return 鱼漂实体。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getExpToDrop

方法声明: public int getExpToDrop()

方法签名: ()I

> Gets the amount of experience received when fishing.
>
> Note: This value has no default effect unless the event state is {@link
>
> State#CAUGHT_FISH}.
>
> @return the amount of experience to drop
>
>
> 
> 该方法用于获取钓上鱼所奖励的经验值。
>
> 除非本事件的 `getState` 方法返回 `State#CAUGHT_FISH` ，否则这个值没有意义。
>
> @return 钓上鱼所奖励的经验值。

#### setExpToDrop

方法声明: public void setExpToDrop(int amount)

方法签名: (I)V

> Sets the amount of experience received when fishing.
>
> Note: This value has no default effect unless the event state is {@link
>
> State#CAUGHT_FISH}.
>
> @param amount the amount of experience to drop
>
>
> 
> 该方法用于设置钓上鱼所奖励的经验值。
>
> 除非本事件的 `getState` 方法返回 `State#CAUGHT_FISH` ，否则这个值没有意义。
>
> @param amount 钓上鱼所奖励的经验值。

#### getState

方法声明: public State getState()

方法签名: ()Lorg/bukkit/event/player/PlayerFishEvent/State;

> Gets the state of the fishing
>
> @return A State detailing the state of the fishing
>
>
> 
> 该方法用于获取钓鱼过程处于何阶段。
>
> @return 钓鱼过程所处的阶段。
>
>
> 
> 译注：见上。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: State

> An enum to specify the state of the fishing
> 
>
> 
> 用于确定钓鱼过程所处阶段的枚举。

#### FISHING

> When a player is fishing, ie casting the line out.
>
>
> 
> 玩家开始钓鱼，把鱼线抛出。

#### CAUGHT_FISH

> When a player has successfully caught a fish and is reeling it in. In
>
> this instance, a "fish" is any item retrieved from water as a result
>
> of fishing, ie an item, but not necessarily a fish.
>
>
> 
> 玩家成功钓上了鱼并收竿。所谓钓上了“鱼”，其实也包括玩家钓上了某个物品的情形，比如钓上宝藏，不一定是钓上了鱼。

#### CAUGHT_ENTITY

> When a player has successfully caught an entity. This refers to any
>
> already spawned entity in the world that has been hooked directly by
>
> the rod.
>
>
> 
> 玩家用鱼漂钩住了实体并收竿。所谓“实体”，必须比鱼漂更早生成（玩家抛竿的瞬间生成鱼漂实体），并被鱼漂直接钩住。

#### IN_GROUND

> When a bobber is stuck in the ground.
>
>
> 
> 鱼漂卡在了地面上。

#### FAILED_ATTEMPT

> When a player fails to catch a bite while fishing usually due to
>
> poor timing.
>
> 
>
> 玩家没能在鱼咬钩时尽早收竿，让鱼游走了。通常是由于玩家的时间判断能力差。

#### REEL_IN

> When a player reels in their hook without receiving any bites.
>
>
> 
> 在没有鱼咬钩的情况下，玩家收回了鱼钩。

#### BITE

> Called when there is a bite on the hook and it is ready to be reeled
>
> in.
>
> 
>
> 有鱼咬钩，可以收竿。