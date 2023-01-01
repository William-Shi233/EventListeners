---
description: VillagerCareerChangeEvent
---

# VillagerCareerChangeEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.VillagerCareerChangeEvent

### 类描述

### 方法列表

#### getEntity

方法声明: public Villager getEntity()

方法签名: ()Lorg/bukkit/entity/Villager;

#### getProfession

方法声明: public Profession getProfession()

方法签名: ()Lorg/bukkit/entity/Villager/Profession;

> Gets the future profession of the villager.
>
> @return The profession the villager will change to

#### setProfession

方法声明: public void setProfession(@NotNull Profession profession)

方法签名: (Lorg/bukkit/entity/Villager/Profession;)V

> Sets the profession the villager will become from this event.
>
> @param profession new profession

#### getReason

方法声明: public ChangeReason getReason()

方法签名: ()Lorg/bukkit/event/entity/VillagerCareerChangeEvent/ChangeReason;

> Gets the reason for why the villager's career is changing.
>
> @return Reason for villager's profession changing

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(@NotNull boolean cancel)

方法签名: (Z)V

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: ChangeReason

> Reasons for the villager's profession changing.

#### LOSING_JOB

> Villager lost their job due to too little experience.

#### EMPLOYED

> Villager gained employment.ofession changing.