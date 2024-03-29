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
> 
> <br>
> 
> 当类型为 `Spellcaster` 的生物释放咒语时触发。
> 
> <br>
> 
> 译注：所谓“类型为 `Spellcaster` 的生物”，目前仅有幻术师和唤魔者两种。

### 方法列表

#### getEntity

方法声明: public Spellcaster getEntity()

方法签名: ()Lorg/bukkit/entity/Spellcaster;

> 译注：无文档。该方法用于获取释放咒语的生物。

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
> 
> <br>
> 
> 该方法用于获取被释放的涉事咒语的类型。
> 
> 本方法是 `Spellcaster#getSpell()` 方法的简写。
> 
> @return 被释放的涉事咒语的类型。

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