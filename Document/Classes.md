##EntityChicken##
extends EntityAnimal

* `destPos` : float
* `field_152118_bv` : boolean
* `field_70884_g` : float
* `field_70886_e` : float
* `field_70888_h` : float
* `field_70889_i` : float
* `timeUntilNextEgg` : int

---
* EntityChicken(World)
* applyEntityAttributes()
* canDespawn()
* createChild(EntityAgeable)
* dropFewItems(boolean, int)
* fall(float)
* func_145780_a(int, int, int, Block)
* func_152116_bZ()
* func_152117_i(boolean)
* getDeathSound()
* getDropItem()
* getExperiencePoints(EntityPlayer)
* getHurtSound()
* getLivingSound()
* isAIEnabled()
* isBreedingItem(ItemStack)
* onLivingUpdate()
* readEntityFromNBT(NBTTagCompound)
* updateRiderPosition()
* writeEntityToNBT(NBTTagCompound)

##EntityAnimal##
extends EntityAgeable implements IAnimals

* breeding : int
* field_146084_br : EntityPlayer
* inLove : int

---
* EntityAnimal(World)
* attackEntity(Entity, float) 对于Animal，这个函数用来接近可交配的对象，或者拿着食物的玩家 
* attackEntityFrom(DamageSource, float)
* canDespawn()
* canMateWith(EntityAnimal)
* findPlayerToAttack()
* `func_146082_f(EntityPlayer)`
* `func_146083_cb()`
* getBlockPathWeight(int, int, int)
* getCanSpawnHere()
* getExperiencePoints(EntityPlayer)
* getTalkInterval()
* handleHealthUpdate(byte)
* interact(EntityPlayer)
* isBreedingItem(ItemStack)
* isInLove()
* onLivingUpdate()
* procreate(EntityAnimal)
* readEntityFromNBT(NBTTagCompound)
* resetInLove()
* updateAITick()
* writeEntityToNBT(NBTTagCompound)


##EntityAgeable##
extends EntityCreature

field_98056_d : float
field_98057_e : float
EntityAgeable(World)
addGrowth(int)
createChild(EntityAgeable)
entityInit()
getGrowingAge()
interact(EntityPlayer)
isChild()
onLivingUpdate()
readEntityFromNBT(NBTTagCompound)
setGrowingAge(int)
setScale(float)
setScaleForAge(boolean)
setSize(float, float)
writeEntityToNBT(NBTTagCompound)

##EntityCreature##
extends EntityLiving

field_110179_h : UUID
field_110181_i : AttributeModifier
<clinit>()
entityToAttack : Entity
field_110178_bs : EntityAIBase
field_110180_bt : boolean
fleeingTick : int
hasAttacked : boolean
homePosition : ChunkCoordinates
maximumHomeDistance : float
pathToEntity : PathEntity
EntityCreature(World)
attackEntity(Entity, float)
detachHome()
findPlayerToAttack()
func_110174_bM()
func_142017_o(float)
getBlockPathWeight(int, int, int)
getCanSpawnHere()
getEntityToAttack()
getHomePosition()
hasHome()
hasPath()
isMovementCeased()
isWithinHomeDistance(int, int, int)
isWithinHomeDistanceCurrentPosition()
setHomeArea(int, int, int, int)
setPathToEntity(PathEntity)
setTarget(Entity)
updateEntityActionState()
updateLeashedState()
updateWanderPath()