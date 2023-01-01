---
description: EntitySpellCastEvent
---

# EntitySpellCastEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntitySpellCastEvent

### 类描述

> Called when a {@link Spellcaster} casts a spell.

### 方法列表

#### getEntity

方法声明: public Spellcaster getEntity()

方法签名: ()Lorg/bukkit/entity/Spellcaster;

#### getSpell

方法声明: public Spellcaster.Spell getSpell()

方法签名: ()Lorg/bukkit/entity/Spellcaster/Spell;

> Get the spell to be cast in this event.
>
> This is a convenience method equivalent to
>
> {@link Spellcaster#getSpell()}.
>
> @return the spell to cast

#### setCancelled

方法声明: public void setCancelled(boolean cancelled)

方法签名: (Z)V

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;