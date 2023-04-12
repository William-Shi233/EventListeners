---
description: EntityRegainHealthEvent
---

# EntityRegainHealthEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityRegainHealthEvent

### 类描述

> Stores data for health-regain events
>
>
> 
> 本事件存储了实体回复血量时的有关数据。
>
>
> 
> 译注：事件不是用来完成数据的持久化存储的。此处所谓“存储”意为事件的字段中含有一些与事件中回复血量的实体有关的信息，该事件从服务端底层得到这些信息，存储于一些字段中，再给插件进行读取。当插件处理完毕以后，事件对象应该被销毁。不能使用事件对象来对数据进行保存。

### 方法列表

#### getAmount

方法声明: public double getAmount()

方法签名: ()D

> Gets the amount of regained health
>
> @return The amount of health regained
>
>
> 
> 该方法用于获取实体回复生命值的量。
>
> @return 实体回复生命值的量。

#### setAmount

方法声明: public void setAmount(double amount)

方法签名: (D)V

> Sets the amount of regained health
>
> @param amount the amount of health the entity will regain
>
>
> 
> 该方法用于设置实体回复生命值的量。
>
> @param amount 实体回复生命值的量。

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getRegainReason

方法声明: public RegainReason getRegainReason()

方法签名: ()Lorg/bukkit/event/entity/EntityRegainHealthEvent/RegainReason;

> Gets the reason for why the entity is regaining health
>
> @return A RegainReason detailing the reason for the entity regaining
>
> health
>
> 
>
> 该方法用于获取实体回复血量的原因。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: RegainReason

> An enum to specify the type of health regaining that is occurring
>
>
> 
> 用于确定实体回复血量原因的枚举。

#### REGEN

> When a player regains health from regenerating due to Peaceful mode
>
> (difficulty=0)
>
>
> 
> 游戏难度为和平，因而玩家回血。
>
>
> 
> 译注：凋零每秒的自动回血效果也归入此字段。

#### SATIATED

> When a player regains health from regenerating due to their hunger
>
> being satisfied
>
>
> 
> 玩家饱食度与饱和度充足，因而回血。

#### EATING

> When a player regains health from eating consumables
>
>
> 
> 玩家服用食物或药剂，因而回血。
>
>
> 
> 译注：本字段主要适用于非玩家实体服用食物直接回血的情况，比如马吃草料、狼吃骨头。上述生物没有饱食度机制，吃下食物即直接回血。

#### ENDER_CRYSTAL

> When an ender dragon regains health from an ender crystal
>
>
> 
> 末影水晶为末影龙增加血量。

#### MAGIC

> When a player is healed by a potion or spell
>
>
> 
> 玩家被瞬时药水效果治愈。

#### MAGIC_REGEN

> When a player is healed over time by a potion or spell
>
>
> 
> 玩家拥有生命恢复等药水效果，随时间推移缓慢被治愈。

#### WITHER_SPAWN

> When a wither is filling its health during spawning
>
>
> 
> 凋零在被召唤的过程中血量自零开始不断增加。

#### WITHER

> When an entity is damaged by the Wither potion effect
>
>
> 
> 实体因凋零效果而受到伤害。

#### CUSTOM

> Any other reason not covered by the reasons above
>
>
> 
> 未被上述分类囊括的其他原因。