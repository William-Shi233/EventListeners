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
>
> 当玩家死亡时触发。

### 方法列表

#### getEntity

方法声明: public Player getEntity()

方法签名: ()Lorg/bukkit/entity/Player;

> 译注：无文档。该方法用于获取死亡的玩家。

#### setDeathMessage

方法声明: public void setDeathMessage(@Nullable String deathMessage)

方法签名: (Ljava/lang/String;)V

> Set the death message that will appear to everyone on the server.
>
> @param deathMessage Message to appear to other players on the server.
>
> 该方法用于设置将要广播给全服玩家的死亡信息。
>
> @param 将要广播给全服玩家的死亡信息。
>
> 译注：比如“William_Shi experienced kinetic energy”。

#### getDeathMessage

方法声明: public String getDeathMessage()

方法签名: ()Ljava/lang/String;

> Get the death message that will appear to everyone on the server.
>
> @return Message to appear to other players on the server.
>
> 该方法用于获取将要广播给全服玩家的死亡信息。
>
> @return 将要广播给全服玩家的死亡信息。
>
> 译注：比如“William_Shi experienced kinetic energy”。

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
>
> 该方法用于获取玩家重生后将拥有的经验值。
>
> 本方法的返回值不是玩家将掉落的经验值数量。可以通过 `getDroppedExp()` 方法获取玩家将掉落的经验值数量。
>
> @return 玩家重生后将拥有的经验值。

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
>
> 该方法用于设置玩家重生后将拥有的经验值。
>
> 本方法不能用于改变玩家将掉落的经验值数量。可以通过 `setDroppedExp(int)` 方法改变玩家将掉落的经验值数量。
>
> @param 玩家重生后将拥有的经验值。

#### getNewLevel

方法声明: public int getNewLevel()

方法签名: ()I

> Gets the Level the Player should have at respawn.
>
> @return New Level of the respawned player
>
> 该方法用于获取玩家重生后将拥有的经验等级。
>
> @return 玩家重生后将拥有的经验等级。

#### setNewLevel

方法声明: public void setNewLevel(int level)

方法签名: (I)V

> Sets the Level the Player should have at respawn.
>
> @param level New Level of the respawned player
>
> 该方法用于设置玩家重生后将拥有的经验等级。
>
> @param 玩家重生后将拥有的经验等级。

#### getNewTotalExp

方法声明: public int getNewTotalExp()

方法签名: ()I

> Gets the Total EXP the Player should have at respawn.
>
> @return New Total EXP of the respawned player
>
> 该方法用于获取玩家重生后将拥有的经验值总量。
>
> @return 玩家重生后将拥有的经验值总量。

#### setNewTotalExp

方法声明: public void setNewTotalExp(int totalExp)

方法签名: (I)V

> Sets the Total EXP the Player should have at respawn.
>
> @param totalExp New Total EXP of the respawned player
>
> 该方法用于设置玩家重生后将拥有的经验值总量。
>
> @param 玩家重生后将拥有的经验值总量。

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
>
> 该方法用于获取玩家是否会在死亡后葆有全部经验值。
>
> 其他一切与经验有关的设置，都会被本项所覆盖。
>
> @return 如果玩家葆有全部经验值则返回 `true` 。

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
>
> 该方法用于设置玩家是否会在死亡后葆有全部经验值。
>
> 其他一切与经验有关的设置，都会被本项所覆盖。
>
> 使用本方法能保证玩家重生时的经验值与死亡前相等，并不能阻止死亡时掉落经验。要阻止掉落，请使用 `setDroppedExp(int)` 方法。
>
> @param 如果要令玩家葆有全部经验值，则传入 `true` 。

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
>
> 该方法用于设置玩家是否会在死亡后葆有物品栏内的物品。
>
> 使用本方法能保证玩家重生时的物品栏内容与死亡前相同，并不能阻止死亡时掉落物品。要阻止掉落，请使用 `getDrops().clear()` 方法。
>
> @param 如果要令玩家葆有物品栏内的物品，则传入 `true` 。

#### getKeepInventory

方法声明: public boolean getKeepInventory()

方法签名: ()Z

> Gets if the Player keeps inventory on death.
>
> @return True if the player keeps inventory on death
>
> 该方法用于获取玩家是否会在死亡后葆有物品栏内的物品。
> 
> @return 如果玩家葆有物品栏内的物品则返回 `true` 。