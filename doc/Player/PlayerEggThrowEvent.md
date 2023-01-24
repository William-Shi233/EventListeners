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
>
> 当玩家扔出鸡蛋时触发。扔出鸡蛋后可能生出小鸡。

### 方法列表

#### getEgg

方法声明: public Egg getEgg()

方法签名: ()Lorg/bukkit/entity/Egg;

> Gets the egg involved in this event.
>
> @return the egg involved in this event
>
> 该方法用于获取事件中被扔出的鸡蛋实体。
>
> @return 事件中被扔出的鸡蛋实体。

#### isHatching

方法声明: public boolean isHatching()

方法签名: ()Z

> Gets whether the egg is hatching or not. Will be what the server
>
> would've done without interaction.
>
> @return boolean Whether the egg is going to hatch or not
>
> 该方法用于获取是否将生成小鸡。该方法的返回值是未受干预情况下，服务端将会出现的自然状态。
>
> @return 是否将生成小鸡。
>
> 译注：与 `PlayerBedEnterEvent#getBedEnterResult` 方法不同，本方法的返回值可能会被 `setHatching` 方法修改。只有第一个处理事件的监听器才能获得未受干预情况下的“自然状态”。后续的监听器只能获得先前插件修改过后的状态。比如自然状态是不能生成小鸡，某一监听器通过调用 `setHatching(true)` 要求服务端生成小鸡，则后续的监听器调用 `isHatching` 方法就返回 `true` 。不能通过本方法获悉没有任何插件干涉情况下的结果。本方法返回的是已经被先前的监听器修改过后的结果。

#### setHatching

方法声明: public void setHatching(boolean hatching)

方法签名: (Z)V

> Sets whether the egg will hatch or not.
>
> @param hatching true if you want the egg to hatch, false if you want it
>
> not to
>
> 该方法用于设置是否将生成小鸡。
>
> @param 如欲生成小鸡，则传入 `true` ，否则传入 `false` 。

#### getHatchingType

方法声明: public EntityType getHatchingType()

方法签名: ()Lorg/bukkit/entity/EntityType;

> Get the type of the mob being hatched (EntityType.CHICKEN by default)
>
> @return The type of the mob being hatched by the egg
>
> 该方法用于获取将要生成的生物的种类（默认为 `EntityType.CHICKEN` ）。
>
> @return 将要生成的生物的种类。

#### setHatchingType

方法声明: public void setHatchingType(@NotNull EntityType hatchType)

方法签名: (Lorg/bukkit/entity/EntityType;)V

> Change the type of mob being hatched by the egg
>
> @param hatchType The type of the mob being hatched by the egg
>
> 该方法用于设置将要生成的生物的种类。
>
> @param 将要生成的生物的种类。

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
>
> 该方法用于获取将要生成的生物的数量。返回值有可能被插件通过 `setNumHatches` 方法修改。
>
> 在默认情况下，生成的生物数量应当遵从如下概率：
>
> <ul>
>
> <li>7/8 概率生成 0 个生物。
>
> <li>31/256（约为 1/8）概率生成 1 个生物。
>
> <li>1/256 概率生成 4 个生物。
>
> </ul>
>
> @return 将要生成的生物的数量。

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
>
> 该方法用于设置将要生成的生物的数量。
>
> `hatching` 字段会覆盖该数字。比如当 `isHatching` 方法返回 `false` 时，无论如何调用本方法，都不会生成任何生物。
>
> @param 将要生成的生物的数量。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;