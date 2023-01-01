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

### 方法列表

#### getCaught

方法声明: public Entity getCaught()

方法签名: ()Lorg/bukkit/entity/Entity;

> Gets the entity caught by the player.
>
> <p>
>
> If player has fished successfully, the result may be cast to {@link
>
> org.bukkit.entity.Item}.
>
> @return Entity caught by the player, Entity if fishing, and null if
>
> bobber has gotten stuck in the ground or nothing has been caught

#### getHook

方法声明: public FishHook getHook()

方法签名: ()Lorg/bukkit/entity/FishHook;

> Gets the fishing hook.
>
> @return the entity representing the fishing hook/bobber.

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
> <p>
>
> Note: This value has no default effect unless the event state is {@link
>
> State#CAUGHT_FISH}.
>
> @return the amount of experience to drop

#### setExpToDrop

方法声明: public void setExpToDrop(int amount)

方法签名: (I)V

> Sets the amount of experience received when fishing.
>
> <p>
>
> Note: This value has no default effect unless the event state is {@link
>
> State#CAUGHT_FISH}.
>
> @param amount the amount of experience to drop

#### getState

方法声明: public State getState()

方法签名: ()Lorg/bukkit/event/player/PlayerFishEvent/State;

> Gets the state of the fishing
>
> @return A State detailing the state of the fishing

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: State

> An enum to specify the state of the fishing

#### FISHING

> When a player is fishing, ie casting the line out.

#### CAUGHT_FISH

> When a player has successfully caught a fish and is reeling it in. In
>
> this instance, a "fish" is any item retrieved from water as a result
>
> of fishing, ie an item, but not necessarily a fish.

#### CAUGHT_ENTITY

> When a player has successfully caught an entity. This refers to any
>
> already spawned entity in the world that has been hooked directly by
>
> the rod.

#### IN_GROUND

> When a bobber is stuck in the ground.

#### FAILED_ATTEMPT

> When a player fails to catch a bite while fishing usually due to
>
> poor timing.

#### REEL_IN

> When a player reels in their hook without receiving any bites.

#### BITE

> Called when there is a bite on the hook and it is ready to be reeled
>
> in.