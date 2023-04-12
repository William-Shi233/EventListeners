---
description: PigZapEvent
---

# PigZapEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityTransformEvent

                =>  org.bukkit.event.entity.PigZapEvent

### 类描述

> Stores data for pigs being zapped
> 
> <br>
> 
> 本事件存储了被闪电击中的猪的有关数据。
> 
> <br>
> 
> 译注：事件不是用来完成数据的持久化存储的。此处所谓“存储”意为事件的字段中含有一些与事件中被击中的猪有关的信息，该事件从服务端底层得到这些信息，存储于一些字段中，再给插件进行读取。当插件处理完毕以后，事件对象应该被销毁。不能使用事件对象来对数据进行保存。
> 
> 参见 `MineCraft Wiki` 中的相关页面 [https://minecraft.fandom.com/wiki/Zombified_Piglin#Pigs](https://minecraft.fandom.com/wiki/Zombified_Piglin#Pigs) 可知，猪被闪电劈中以后会转变为僵尸猪灵。

### 方法列表

#### isCancelled

方法声明: public boolean isCancelled()

方法签名: ()Z

#### setCancelled

方法声明: public void setCancelled(boolean cancel)

方法签名: (Z)V

#### getEntity

方法声明: public Pig getEntity()

方法签名: ()Lorg/bukkit/entity/Pig;

> 译注：无文档。该方法用于获取被击中的猪。

#### getLightning

方法声明: public LightningStrike getLightning()

方法签名: ()Lorg/bukkit/entity/LightningStrike;

> Gets the bolt which is striking the pig.
> 
> @return lightning entity
> 
> <br>
> 
> 该方法用于获取击中了猪的闪电实体。
> 
> @return 击中了猪的闪电实体。

#### getPigZombie

方法声明: public PigZombie getPigZombie()

方法签名: ()Lorg/bukkit/entity/PigZombie;

> Gets the zombie pig that will replace the pig, provided the event is
> 
> not cancelled first.
> 
> @return resulting entity
> 
> @deprecated use {@link EntityTransformEvent#getTransformedEntity()}
> 
> <br>
> 
> 该方法用于获取事件未被取消时将会生成的僵尸猪灵。
> 
> @return 将会生成的僵尸猪灵。
> 
> @deprecated 该方法已过时。请使用 `EntityTransformEvent#getTransformedEntity()` 方法。

#### getHandlers

方法声明: public HandlerList getHandlers()

方法签名: ()Lorg/bukkit/event/HandlerList;

#### getHandlerList

方法声明: public static HandlerList getHandlerList()

方法签名: ()Lorg/bukkit/event/HandlerList;