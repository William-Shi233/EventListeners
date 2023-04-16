---
description: EntityExhaustionEvent
---

# EntityExhaustionEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityExhaustionEvent

### 类描述

> Called when a human entity experiences exhaustion.
> 
> An exhaustion level greater than 4.0 causes a decrease in saturation by 1.
> 
> <br>
> 
> 当玩家的饥饿等级增加时触发。
> 
> 如果饥饿等级累积至四或以上，则饱和度会减少一。
> 
> <br>
> 
> 译注：参见 `Minecraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Hunger#Exhaustion_level_increase](https://minecraft.fandom.com/wiki/Hunger#Exhaustion_level_increase) 可知，玩家在完成特定操作（如疾跑、如挖掘方块等）时，会累积饥饿等级（Hunger），该值一旦大于等于四，则自减四，并扣除一点饱和度（Saturation）。如果饱和度为零则扣除一点饥饿值（Food Level）。

### 方法列表

#### getExhaustionReason

方法声明: public ExhaustionReason getExhaustionReason()

方法签名: ()Lorg/bukkit/event/entity/EntityExhaustionEvent/ExhaustionReason;

> Gets the {@link ExhaustionReason} for this event
> 
> @return the exhaustion reason
> 
> <br>
> 
> 该方法用于获取饥饿等级增加的原因。
> 
> @return 一个 `ExhaustionReason` 枚举字段，用于确定饥饿等级增加的原因。

#### getExhaustion

方法声明: public float getExhaustion()

方法签名: ()F

> Get the amount of exhaustion to add to the player's current exhaustion.
> 
> @return amount of exhaustion
> 
> <br>
> 
> 该方法用于获取饥饿等级的增加量。
> 
> @return 饥饿等级的增加量。

#### setExhaustion

方法声明: public void setExhaustion(float exhaustion)

方法签名: (F)V

> Set the exhaustion to apply to the player.
> 
> The maximum exhaustion that a player can have is 40. No error will be
> 
> thrown if this limit is hit. This value may be negative, but there is
> 
> unknown behavior for when exhaustion is below 0.
> 
> @param exhaustion new exhaustion to add
> 
> <br>
> 
> 该方法用于设置饥饿等级的增加量。
> 
> 玩家所能拥有的最大饥饿等级是四十。但如果超出了这一上限，也不会抛出错误。饥饿等级可以被设为负值，但这样做后果未知。
> 
> @param exhaustion 饥饿等级的增加量。

#### getEntity

方法声明: public HumanEntity getEntity()

方法签名: ()Lorg/bukkit/entity/HumanEntity;

> 译注：无文档。该方法用于获取涉事玩家。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: ExhaustionReason

> The reason for why a PlayerExhaustionEvent takes place
> 
> <br>
> 
> 用于确定玩家饥饿等级增加的枚举。

#### BLOCK_MINED

> Player mines a block
> 
> <br>
> 
> 玩家挖掘了方块。

#### HUNGER_EFFECT

> Player has the hunger potion effect
> 
> <br>
> 
> 玩家拥有饥饿药水效果。

#### DAMAGED

> Player takes damage
> 
> <br>
> 
> 玩家受到伤害。

#### ATTACK

> Player attacks another entity
> 
> <br>
> 
> 玩家攻击某个实体。

#### JUMP_SPRINT

> Player is sprint jumping
> 
> <br>
> 
> 玩家在疾跑状态下跳跃。

#### JUMP

> Player jumps
> 
> <br>
> 
> 玩家跳跃。

#### SWIM

> Player swims one centimeter
> 
> <br>
> 
> 玩家游泳。

#### WALK_UNDERWATER

> Player walks underwater one centimeter
> 
> <br>
> 
> 玩家在水下行走。

#### WALK_ON_WATER

> Player moves on the surface of water one centimeter
> 
> <br>
> 
> 玩家漂浮在水面附近移动。

#### SPRINT

> Player sprints one centimeter
> 
> <br>
> 
> 玩家疾跑。

#### CROUCH

> Player crouches one centimeter (does not effect exhaustion, but fires
> 
> nonetheless)
> 
> <br>
> 
> 玩家潜行（潜行不会影响饥饿等级，但仍然致使本事件被触发）。

#### WALK

> Player walks one centimeter (does not effect exhaustion, but fires
> 
> nonetheless)
> 
> <br>
> 
> 玩家行走（行走不会影响饥饿等级，但仍然致使本事件被触发）。

#### REGEN

> Player regenerated health
> 
> <br>
> 
> 玩家回复血量。

#### UNKNOWN

> Unknown exhaustion reason
> 
> <br>
> 
> 未知原因。