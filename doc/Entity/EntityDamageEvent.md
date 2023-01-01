---
description: EntityDamageEvent
---

# EntityDamageEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityDamageEvent

### 类描述

> Stores data for damage events

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getOriginalDamage

方法声明: public double getOriginalDamage(@NotNull DamageModifier type) throws IllegalArgumentException

方法签名: (Lorg/bukkit/event/entity/EntityDamageEvent/DamageModifier;)D

> Gets the original damage for the specified modifier, as defined at this
>
> event's construction.
>
> @param type the modifier
>
> @return the original damage
>
> @throws IllegalArgumentException if type is null

#### setDamage

方法声明: public void setDamage(@NotNull DamageModifier type, double damage) throws IllegalArgumentException, UnsupportedOperationException

方法签名: (Lorg/bukkit/event/entity/EntityDamageEvent/DamageModifier;D)V

> Sets the damage for the specified modifier.
>
> @param type the damage modifier
>
> @param damage the scalar value of the damage's modifier
>
> @throws IllegalArgumentException if type is null
>
> @throws UnsupportedOperationException if the caller does not support
>
> the particular DamageModifier, or to rephrase, when {@link
>
> #isApplicable(DamageModifier)} returns false
>
> @see #getFinalDamage()

#### getDamage

方法声明: public double getDamage(@NotNull DamageModifier type) throws IllegalArgumentException

方法签名: (Lorg/bukkit/event/entity/EntityDamageEvent/DamageModifier;)D

> Gets the damage change for some modifier
>
> @param type the damage modifier
>
> @return The raw amount of damage caused by the event
>
> @throws IllegalArgumentException if type is null
>
> @see DamageModifier#BASE

#### isApplicable

方法声明: public boolean isApplicable(@NotNull DamageModifier type) throws IllegalArgumentException

方法签名: (Lorg/bukkit/event/entity/EntityDamageEvent/DamageModifier;)Z

> This checks to see if a particular modifier is valid for this event's
>
> caller, such that, {@link #setDamage(DamageModifier, double)} will not
>
> throw an {@link UnsupportedOperationException}.
>
> <p>
>
> {@link DamageModifier#BASE} is always applicable.
>
> @param type the modifier
>
> @return true if the modifier is supported by the caller, false otherwise
>
> @throws IllegalArgumentException if type is null

#### getDamage

方法声明: public double getDamage()

方法签名: ()D

> Gets the raw amount of damage caused by the event
>
> @return The raw amount of damage caused by the event
>
> @see DamageModifier#BASE

#### getFinalDamage

方法声明: public final double getFinalDamage()

方法签名: ()D

> Gets the amount of damage caused by the event after all damage
>
> reduction is applied.
>
> @return the amount of damage caused by the event

#### setDamage

方法声明: public void setDamage(double damage)

方法签名: (D)V

> Sets the raw amount of damage caused by the event.
>
> <p>
>
> For compatibility this also recalculates the modifiers and scales
>
> them by the difference between the modifier for the previous damage
>
> value and the new one.
>
> @param damage The raw amount of damage caused by the event

#### getCause

方法声明: public DamageCause getCause()

方法签名: ()Lorg/bukkit/event/entity/EntityDamageEvent/DamageCause;

> Gets the cause of the damage.
>
> @return A DamageCause value detailing the cause of the damage.

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;

### 枚举: DamageCause

> An enum to specify the cause of the damage

#### BASE

> This represents the amount of damage being done, also known as the
>
> raw {@link EntityDamageEvent#getDamage()}.

#### HARD_HAT

> This represents the damage reduced by a wearing a helmet when hit
>
> by a falling block.

#### BLOCKING

> This represents  the damage reduction caused by blocking, only present for
>
> {@link Player Players}.

#### ARMOR

> This represents the damage reduction caused by wearing armor.

#### RESISTANCE

> This represents the damage reduction caused by the Resistance potion effect.

#### MAGIC

> This represents the damage reduction caused by the combination of:
>
> <ul>
>
> <li>
>
> Armor enchantments
>
> </li><li>
>
> Witch's potion resistance
>
> </li>
>
> </ul>

#### ABSORPTION

> This represents the damage reduction caused by the absorption potion
>
> effect.

#### CONTACT

> Damage caused when an entity contacts a block such as a Cactus,
>
> Dripstone (Stalagmite) or Berry Bush.
>
> <p>
>
> Damage: variable

#### ENTITY_ATTACK

> Damage caused when an entity attacks another entity.
>
> <p>
>
> Damage: variable

#### ENTITY_SWEEP_ATTACK

> Damage caused when an entity attacks another entity in a sweep attack.
>
> <p>
>
> Damage: variable

#### PROJECTILE

> Damage caused when attacked by a projectile.
>
> <p>
>
> Damage: variable

#### SUFFOCATION

> Damage caused by being put in a block
>
> <p>
>
> Damage: 1

#### FALL

> Damage caused when an entity falls a distance greater than 3 blocks
>
> <p>
>
> Damage: fall height - 3.0

#### FIRE

> Damage caused by direct exposure to fire
>
> <p>
>
> Damage: 1

#### FIRE_TICK

> Damage caused due to burns caused by fire
>
> <p>
>
> Damage: 1

#### MELTING

> Damage caused due to a snowman melting
>
> <p>
>
> Damage: 1

#### LAVA

> Damage caused by direct exposure to lava
>
> <p>
>
> Damage: 4

#### DROWNING

> Damage caused by running out of air while in water
>
> <p>
>
> Damage: 2

#### BLOCK_EXPLOSION

> Damage caused by being in the area when a block explodes.
>
> <p>
>
> Damage: variable

#### ENTITY_EXPLOSION

> Damage caused by being in the area when an entity, such as a
>
> Creeper, explodes.
>
> <p>
>
> Damage: variable

#### VOID

> Damage caused by falling into the void
>
> <p>
>
> Damage: 4 for players

#### LIGHTNING

> Damage caused by being struck by lightning
>
> <p>
>
> Damage: 5

#### SUICIDE

> Damage caused by committing suicide.
>
> <p>
>
> <b>Note:</b> This is currently only used by plugins, default commands
>
> like /minecraft:kill use {@link #VOID} to damage players.
>
> <p>
>
> Damage: variable

#### STARVATION

> Damage caused by starving due to having an empty hunger bar
>
> <p>
>
> Damage: 1

#### POISON

> Damage caused due to an ongoing poison effect
>
> <p>
>
> Damage: 1

#### MAGIC

> Damage caused by being hit by a damage potion or spell
>
> <p>
>
> Damage: variable

#### WITHER

> Damage caused by Wither potion effect

#### FALLING_BLOCK

> Damage caused by being hit by a falling block which deals damage
>
> <p>
>
> <b>Note:</b> Not every block deals damage
>
> <p>
>
> Damage: variable

#### THORNS

> Damage caused in retaliation to another attack by the Thorns
>
> enchantment.
>
> <p>
>
> Damage: 1-4 (Thorns)

#### DRAGON_BREATH

> Damage caused by a dragon breathing fire.
>
> <p>
>
> Damage: variable

#### CUSTOM

> Custom damage.
>
> <p>
>
> Damage: variable

#### FLY_INTO_WALL

> Damage caused when an entity runs into a wall.
>
> <p>
>
> Damage: variable

#### HOT_FLOOR

> Damage caused when an entity steps on {@link Material#MAGMA_BLOCK}.
>
> <p>
>
> Damage: 1

#### CRAMMING

> Damage caused when an entity is colliding with too many entities due
>
> to the maxEntityCramming game rule.
>
> <p>
>
> Damage: 6

#### DRYOUT

> Damage caused when an entity that should be in water is not.
>
> <p>
>
> Damage: 1

#### FREEZE

> Damage caused from freezing.
>
> <p>
>
> Damage: 1 or 5