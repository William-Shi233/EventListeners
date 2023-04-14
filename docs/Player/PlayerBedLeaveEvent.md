---
description: PlayerBedLeaveEvent
---

# PlayerBedLeaveEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerBedLeaveEvent

### 类描述

> This event is fired when the player is leaving a bed.
> 
> <br>
> 
> 当玩家从床上离开时触发。
> 
> <br>
> 
> 译注：本事件的 `shouldSetSpawnLocation()` 方法似乎在服务端底层没有调用，`setSpawnLocation(boolean)` 是否有意义尚存疑。
> 
> 与“玩家就寝重设重生点”有关的逻辑位于 `net.minecraft.server.v1_16_R3.EntityPlayer#getBedResult(BlockPosition blockposition, EnumDirection enumdirection)` 方法中，该方法会调用重设玩家出生点的 `setRespawnPosition(ResourceKey<World> resourcekey, @Nullable BlockPosition blockposition, float f, boolean flag, boolean flag1)` 方法。然而，`getBedResult(BlockPosition blockposition, EnumDirection enumdirection)` 方法似乎是在玩家尝试就寝时调用的，并非在玩家从床上离开时调用。从 `getBedResult(BlockPosition blockposition, EnumDirection enumdirection)` 方法的内容来看，只要玩家所在世界允许睡觉（不是下界、末地等）、床没有距离玩家过远、床没有被阻挡，玩家右键床的瞬间出生点就会被重设。在这之后才会判断时间是否为白天、床附近是否有怪物游荡。所以在游戏中，即使是白天，右键床也可以重设出生点，只不过不能就寝。

### 方法列表

#### getBed

方法声明: public Block getBed()

方法签名: ()Lorg/bukkit/block/Block;

> Returns the bed block involved in this event.
> 
> @return the bed block involved in this event
> 
> <br>
> 
> 该方法用于获取涉事床方块。
> 
> @return 涉事床方块。

#### shouldSetSpawnLocation

方法声明: public boolean shouldSetSpawnLocation()

方法签名: ()Z

> Get if this event should set the new spawn location for the
> 
> {@link Player}.
> 
> This does not remove any existing spawn location, only prevent it from
> 
> being changed (if true).
> 
> To change a {@link Player}'s spawn location, use
> 
> {@link Player#setBedSpawnLocation(Location)}.
> 
> @return true if the spawn location will be changed
> 
> <br>
> 
> 该方法用于获取本事件是否要重设玩家出生点。
> 
> 如果本方法返回 `true` ，并不会抹除现有的出生点，仅仅是防止出生点被重设。
> 
> 如欲重设一个玩家的出生点，可以使用 `Player#setBedSpawnLocation(Location)` 方法。
> 
> @return 如果出生点将会被重设，则本方法返回 `true` 。
> 
> <br>
> 
> 译注：见上。
> 
> 另外，假如本方法返回 `true` ，字面意思似乎是“应当重设出生点”，但文档却言该情况下会防止出生点被重设，不知所云。

#### setSpawnLocation

方法声明: public void setSpawnLocation(boolean setBedSpawn)

方法签名: (Z)V

> Set if this event should set the new spawn location for the
> 
> {@link Player}.
> 
> This will not remove any existing spawn location, only prevent it from
> 
> being changed (if true).
> 
> To change a {@link Player}'s spawn location, use
> 
> {@link Player#setBedSpawnLocation(Location)}.
> 
> @param setBedSpawn true to change the new spawn location
> 
> <br>
> 
> 该方法用于设置本事件是否要重设玩家出生点。
> 
> 如果本方法参数传入 `true` ，并不会抹除现有的出生点，仅仅是防止出生点被重设。
> 
> 如欲重设一个玩家的出生点，可以使用 `Player#setBedSpawnLocation(Location)` 方法。
> 
> @param setBedSpawn 如欲重设出生点，则传入 `true` 。
> 
> <br>
> 
> 译注：见上。
> 
> 另外，假如传入 `true` 作为参数，字面意思似乎是“应当重设出生点”，但文档却言该情况下会防止出生点被重设，不知所云。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;