---
description: EntityPotionEffectEvent
---

# EntityPotionEffectEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityPotionEffectEvent

### 类描述

> Called when a potion effect is modified on an entity.
>
> <p>
>
> If the event is cancelled, no change will be made on the entity.

### 方法列表

#### getOldEffect

方法声明: public PotionEffect getOldEffect()

方法签名: ()Lorg/bukkit/potion/PotionEffect;

> Gets the old potion effect of the changed type, which will be removed.
>
> @return The old potion effect or null if the entity did not have the
>
> changed effect type.

#### getNewEffect

方法声明: public PotionEffect getNewEffect()

方法签名: ()Lorg/bukkit/potion/PotionEffect;

> Gets new potion effect of the changed type to be applied.
>
> @return The new potion effect or null if the effect of the changed type
>
> will be removed.

#### getCause

方法声明: public Cause getCause()

方法签名: ()Lorg/bukkit/event/entity/EntityPotionEffectEvent/Cause;

> Gets the cause why the effect has changed.
>
> @return A Cause value why the effect has changed.

#### getAction

方法声明: public Action getAction()

方法签名: ()Lorg/bukkit/event/entity/EntityPotionEffectEvent/Action;

> Gets the action which will be performed on the potion effect type.
>
> @return An action to be performed on the potion effect type.

#### getModifiedType

方法声明: public PotionEffectType getModifiedType()

方法签名: ()Lorg/bukkit/potion/PotionEffectType;

> Gets the modified potion effect type.
>
> @return The effect type which will be modified on the entity.

#### isOverride

方法声明: public boolean isOverride()

方法签名: ()Z

> Returns if the new potion effect will override the old potion effect
>
> (Only applicable for the CHANGED Action).
>
> @return If the new effect will override the old one.

#### setOverride

方法声明: public void setOverride(boolean override)

方法签名: (Z)V

> Sets if the new potion effect will override the old potion effect (Only
>
> applicable for the CHANGED action).
>
> @param override If the new effect will override the old one.

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

### 枚举: Cause

> An enum to specify the cause why an effect was changed.

#### ADDED

> When the potion effect is added because the entity didn't have it's
>
> type.

#### CHANGED

> When the entity already had the potion effect type, but the effect is
>
> changed.

#### CLEARED

> When the effect is removed due to all effects being removed.

#### REMOVED

> When the potion effect type is completely removed.

#### AREA_EFFECT_CLOUD

> When the entity stands inside an area effect cloud.

#### ARROW

> When the entity is hit by an spectral or tipped arrow.

#### ATTACK

> When the entity is inflicted with a potion effect due to an entity
>
> attack (e.g. a cave spider or a shulker bullet).

#### AXOLOTL

> When an entity gets the effect from an axolotl.

#### BEACON

> When beacon effects get applied due to the entity being nearby.

#### COMMAND

> When a potion effect is changed due to the /effect command.

#### CONDUIT

> When the entity gets the effect from a conduit.

#### CONVERSION

> When a conversion from a villager zombie to a villager is started or
>
> finished.

#### DEATH

> When all effects are removed due to death (Note: This is called on
>
> respawn, so it's player only!)

#### DOLPHIN

> When the entity gets the effect from a dolphin.

#### EXPIRATION

> When the effect was removed due to expiration.

#### FOOD

> When an effect is inflicted due to food (e.g. when a player eats or a
>
> cookie is given to a parrot).

#### ILLUSION

> When an illusion illager makes himself disappear.

#### MILK

> When all effects are removed due to a bucket of milk.

#### PATROL_CAPTAIN

> When a player gets bad omen after killing a patrol captain.

#### PLUGIN

> When a potion effect is modified through the plugin methods.

#### POTION_DRINK

> When the entity drinks a potion.

#### POTION_SPLASH

> When the entity is inflicted with an effect due to a splash potion.

#### SPIDER_SPAWN

> When a spider gets effects when spawning on hard difficulty.

#### TOTEM

> When the entity gets effects from a totem item saving it's life.

#### TURTLE_HELMET

> When the entity gets water breathing by wearing a turtle helmet.

#### UNKNOWN

> When the Cause is missing.

#### VILLAGER_TRADE

> When a villager gets regeneration after a trade.

#### WITHER_ROSE

> When an entity comes in contact with a wither rose.