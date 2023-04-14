---
description: PlayerLevelChangeEvent
---

# PlayerLevelChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.player.PlayerEvent

            =>  org.bukkit.event.player.PlayerLevelChangeEvent

### 类描述

> Called when a players level changes
> 
> <br>
> 
> 当玩家的经验等级变化时触发。
> 
> <br>
> 
> 译注：该事件所提供的信息很有限。在 `net.minecraft.server.v1_16_R3.EntityPlayer#playerTick()` 方法中，只要检测到上一刻的经验等级与现有经验等级不一致，就会触发本事件。因此本事件仅表明这一刻内玩家的经验等级与上一刻相比发生变化，但具体的升级、降级原因均不可知。

### 方法列表

#### getOldLevel

方法声明: public int getOldLevel()

方法签名: ()I

> Gets the old level of the player
> 
> @return The old level of the player
> 
> <br>
> 
> 该方法用于获取涉事玩家旧有的经验等级。
> 
> @return 涉事玩家旧有的经验等级。

#### getNewLevel

方法声明: public int getNewLevel()

方法签名: ()I

> Gets the new level of the player
> 
> @return The new (current) level of the player
> 
> <br>
> 
> 该方法用于获取涉事玩家的新经验等级。
> 
> @return 涉事玩家的新（当前）经验等级。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;