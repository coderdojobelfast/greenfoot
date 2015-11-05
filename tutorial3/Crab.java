import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move();
        eat();
    }    
    
    public void move() {
        move(1);
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    }
    
    public void eat() {
        Actor worm = getOneObjectAtOffset(0, 0, Worm.class);
        if (null != worm) {
            World world = getWorld();
            world.removeObject(worm);
        }
    }
}
