---
description: PlayerDeathEvent
---

# PlayerDeathEvent

### 继承关系

    =>  org.bukkit.event.Event

        =>  org.bukkit.event.entity.EntityEvent

            =>  org.bukkit.event.entity.EntityDeathEvent

                =>  org.bukkit.event.entity.PlayerDeathEvent

### 类描述

> Thrown whenever a {@link Player} dies

### 方法列表

#### getEntity

方法声明: public Player getEntity()

方法签名: ()Lorg/bukkit/entity/Player;

#### setDeathMessage

方法声明: public void setDeathMessage(@Nullable String deathMessage)

方法签名: (Ljava/lang/String;)V

> Set the death message that will appear to everyone on the server.
>
> @param deathMessage Message to appear to other players on the server.

#### getDeathMessage

方法声明: public String getDeathMessage()

方法签名: ()Ljava/lang/String;

> Get the death message that will appear to everyone on the server.
>
> @return Message to appear to other players on the server.

#### getNewExp

方法声明: public int getNewExp()

方法签名: ()I

> Gets how much EXP the Player should have at respawn.
>
> <p>
>
> This does not indicate how much EXP should be dropped, please see
>
> {@link #getDroppedExp()} for that.
>
> @return New EXP of the respawned player

#### setNewExp

方法声明: public void setNewExp(int exp)

方法签名: (I)V

> Sets how much EXP the Player should have at respawn.
>
> <p>
>
> This does not indicate how much EXP should be dropped, please see
>
> {@link #setDroppedExp(int)} for that.
>
> @param exp New EXP of the respawned player

#### getNewLevel

方法声明: public int getNewLevel()

方法签名: ()I

> Gets the Level the Player should have at respawn.
>
> @return New Level of the respawned player

#### setNewLevel

方法声明: public void setNewLevel(int level)

方法签名: (I)V

> Sets the Level the Player should have at respawn.
>
> @param level New Level of the respawned player

#### getNewTotalExp

方法声明: public int getNewTotalExp()

方法签名: ()I

> Gets the Total EXP the Player should have at respawn.
>
> @return New Total EXP of the respawned player

#### setNewTotalExp

方法声明: public void setNewTotalExp(int totalExp)

方法签名: (I)V

> Sets the Total EXP the Player should have at respawn.
>
> @param totalExp New Total EXP of the respawned player

#### getKeepLevel

方法声明: public boolean getKeepLevel()

方法签名: ()Z

> Gets if the Player should keep all EXP at respawn.
>
> <p>
>
> This flag overrides other EXP settings
>
> @return True if Player should keep all pre-death exp

#### setKeepLevel

方法声明: public void setKeepLevel(boolean keepLevel)

方法签名: (Z)V

> Sets if the Player should keep all EXP at respawn.
>
> <p>
>
> This overrides all other EXP settings
>
> <p>
>
> <b>This doesn't prevent the EXP from dropping.
>
> {@link #setDroppedExp(int)} should be used stop the
>
> EXP from dropping.</b>
>
> @param keepLevel True to keep all current value levels

#### setKeepInventory

方法声明: public void setKeepInventory(boolean keepInventory)

方法签名: (Z)V

> Sets if the Player keeps inventory on death.
>
> <p>
>
> <b>This doesn't prevent the items from dropping.
>
> {@code getDrops().clear()} should be used stop the
>
> items from dropping.</b>
>
> @param keepInventory True to keep the inventory

#### getKeepInventory

方法声明: public boolean getKeepInventory()

方法签名: ()Z

> Gets if the Player keeps inventory on death.
>
> @return True if the player keeps inventory on death