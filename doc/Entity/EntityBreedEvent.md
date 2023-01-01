---
description: EntityBreedEvent
---

# EntityBreedEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityBreedEvent

### 类描述

> Called when one Entity breeds with another Entity.

### 方法列表

#### getEntity

方法声明: public LivingEntity getEntity()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

#### getMother

方法声明: public LivingEntity getMother()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> Gets the parent creating this entity.
>
> @return The "birth" parent

#### getFather

方法声明: public LivingEntity getFather()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> Gets the other parent of the newly born entity.
>
> @return the other parent

#### getBreeder

方法声明: public LivingEntity getBreeder()

方法签名: ()Lorg/bukkit/entity/LivingEntity;

> Gets the Entity responsible for breeding. Breeder is null for spontaneous
>
> conception.
>
> @return The Entity who initiated breeding.

#### getBredWith

方法声明: public ItemStack getBredWith()

方法签名: ()Lorg/bukkit/inventory/ItemStack;

> The ItemStack that was used to initiate breeding, if present.
>
> @return ItemStack used to initiate breeding.

#### getExperience

方法声明: public int getExperience()

方法签名: ()I

> Get the amount of experience granted by breeding.
>
> @return experience amount

#### setExperience

方法声明: public void setExperience(int experience)

方法签名: (I)V

> Set the amount of experience granted by breeding.
>
> @param experience experience amount

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