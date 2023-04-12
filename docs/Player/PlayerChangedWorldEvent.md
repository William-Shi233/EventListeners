---
description: PlayerChangedWorldEvent
---

# PlayerChangedWorldEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerChangedWorldEvent

### 类描述

> Called when a player switches to another world.
> 
> <br>
> 
> 当玩家由原先所处的世界进入另一世界时触发。
> 
> <br>
> 
> 译注：本事件触发时玩家已经进入了另一个世界，因此本事件是不可取消的。
> 
> 本事件会在玩家进行传送后触发，代码位于 `net.minecraft.v1_16_R3.EntityPlayer#b(WorldServer worldserver, PlayerTeleportEvent.TeleportCause cause)` 方法。如欲取消传送，可监听 `PlayerTeleportEvent` 。
> 
> 如果玩家死亡地点和玩家重生点不在同一世界内，则本事件会在玩家重生后触发，代码位于 `net.minecraft.v1_16_R3.PlayerList#moveToWorld(EntityPlayer entityplayer, WorldServer worldserver, boolean flag, Location location, boolean avoidSuffocation)` 方法（参见该类第 `820` 行）。在本事件触发前，会触发 `PlayerRespawnEvent` ，但它也是不可取消的。

### 方法列表

#### getFrom

方法声明: public World getFrom()

方法签名: ()Lorg/bukkit/World;

> Gets the world the player is switching from.
> 
> @return  player's previous world
> 
> <br>
> 
> 该方法用于获取玩家原先所在的世界。
> 
> @return 玩家原先所在的世界。
> 
> <br>
> 
> 译注：没有 `getTo()` 方法，是因为本事件触发时玩家已经进入了另一个世界，直接通过玩家对象所在位置即可获知玩家进入的是何世界。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;