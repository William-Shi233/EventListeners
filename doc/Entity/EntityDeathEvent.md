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

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

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

#### getDrops

方法声明: public List<ItemStack> getDrops()

方法签名: ()Ljava/util/List;

> Gets all the items which will drop when the entity dies
>
> @return Items to drop when the entity dies

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;