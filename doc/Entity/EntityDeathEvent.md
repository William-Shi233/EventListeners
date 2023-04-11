---
description: EntityDeathEvent
---

# EntityDeathEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityDeathEvent

### 类描述

> Thrown whenever a LivingEntity dies
>
> 当生物死亡时触发。

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> 译注：无文档。该方法用于获取死亡的实体。

#### getDroppedExp

方法声明: public int getDroppedExp()

方法签名: ()I

> Gets how much EXP should be dropped from this death.
>
> <p>
>
> This does not indicate how much EXP should be taken from the entity in
>
> question, merely how much should be created after its death.
>
> @return Amount of EXP to drop.
>
> 该方法用于获取实体死亡时所掉落的经验值。
>
> 本方法的返回值与实体死亡时失去的经验值无关，仅仅是指以经验球形态掉落的经验值总量。
>
> @return 实体死亡时所掉落的经验值。

#### setDroppedExp

方法声明: public void setDroppedExp(int exp)

方法签名: (I)V

> Sets how much EXP should be dropped from this death.
>
> <p>
>
> This does not indicate how much EXP should be taken from the entity in
>
> question, merely how much should be created after its death.
>
> @param exp Amount of EXP to drop.
>
> 该方法用于设置实体死亡时所掉落的经验值。
>
> 本方法不会影响实体死亡时失去的经验值，仅仅改变以经验球形态掉落的经验值总量。
>
> @param exp 实体死亡时所掉落的经验值。

#### getDrops

方法声明: public List<ItemStack> getDrops()

方法签名: ()Ljava/util/List;

> Gets all the items which will drop when the entity dies
>
> @return Items to drop when the entity dies
>
> 该方法用于获取一个列表，其间存储有实体死亡时产生的全部掉落物。
>
> @return 实体死亡时产生的全部掉落物列表。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;