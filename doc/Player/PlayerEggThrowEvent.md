---
description: PlayerEggThrowEvent
---

# PlayerEggThrowEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerEggThrowEvent

### 类描述

> Called when a player throws an egg and it might hatch

### 方法列表

#### getEgg

方法声明: public Egg getEgg()

方法签名: ()Lorg/bukkit/entity/Egg;

> Gets the egg involved in this event.
>
> @return the egg involved in this event

#### isHatching

方法声明: public boolean isHatching()

方法签名: ()Z

> Gets whether the egg is hatching or not. Will be what the server
>
> would've done without interaction.
>
> @return boolean Whether the egg is going to hatch or not

#### setHatching

方法声明: public void setHatching(boolean hatching)

方法签名: (Z)V

> Sets whether the egg will hatch or not.
>
> @param hatching true if you want the egg to hatch, false if you want it
>
> not to

#### getHatchingType

方法声明: public EntityType getHatchingType()

方法签名: ()Lorg/bukkit/entity/EntityType;

> Get the type of the mob being hatched (EntityType.CHICKEN by default)
>
> @return The type of the mob being hatched by the egg

#### setHatchingType

方法声明: public void setHatchingType(@NotNull EntityType hatchType)

方法签名: (Lorg/bukkit/entity/EntityType;)V

> Change the type of mob being hatched by the egg
>
> @param hatchType The type of the mob being hatched by the egg

#### getNumHatches

方法声明: public byte getNumHatches()

方法签名: ()B

> Get the number of mob hatches from the egg. By default the number will
>
> be the number the server would've done
>
> <ul>
>
> <li>7/8 chance of being 0
>
> <li>31/256 ~= 1/8 chance to be 1
>
> <li>1/256 chance to be 4
>
> </ul>
>
> @return The number of mobs going to be hatched by the egg

#### setNumHatches

方法声明: public void setNumHatches(byte numHatches)

方法签名: (B)V

> Change the number of mobs coming out of the hatched egg
>
> <p>
>
> The boolean hatching will override this number. Ie. If hatching =
>
> false, this number will not matter
>
> @param numHatches The number of mobs coming out of the egg

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;